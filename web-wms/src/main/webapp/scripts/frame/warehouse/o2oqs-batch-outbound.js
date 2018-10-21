$j.extend(loxia.regional['zh-CN'],{
	INPUT_WEIGHT : "请输入货物重量",
	NUMBER_RULE : "货物不是一个合法的数字或精度要求不符合要求",
	WEIGHT_LAGGER : "货物重量不得超过150KG",
	
	SKUNAME : "商品名称",
	JMCODE : "商品编码",
	KEYPROPERTIES : "扩展属性",
	BARCODE : "条形码",
	QUANTITY : "计划执行数量",
	COMPLETEQUANTITY : "已执行数量",
	ORDER_DETAIL : "作业单相关明细",
	
	NO_ORDER : "该作业单不存在或已经出库",
	INPUT_TRACKINGNO : "请输入快递单号",
	OUTBOUND : "出库成功",
	ORDER_CANCELED : "出库失败: 作业单含有未出库包裹",
	OUTBOUND_ERROR : "出库失败: 执行出库异常"
});

function i18(msg, args){
	return loxia.getLocaleMsg(msg,args);
}

//checkmaster 
function doExecute(value,obj){
	if(value == ""){
		//showOutBoundInfo(i18("INPUT_WEIGHT"));
		return i18("INPUT_WEIGHT");//请输入货物重量
	}
	if(!/^[0-9]*\.{0,1}[0-9]*$/.test(value)){
		//showOutBoundInfo(i18("NUMBER_RULE"));
		return i18("NUMBER_RULE");//不是一个合法的数字或精度要求不符合要求
	}
	value = parseFloat(value);
	if(value == 0){
		//showOutBoundInfo(i18("INPUT_WEIGHT"));
		return i18("INPUT_WEIGHT");//请输入货物重量
	}else if(value > 150){
		//showOutBoundInfo(i18("WEIGHT_LAGGER"));
		return i18("WEIGHT_LAGGER");//货物重量不得超过150KG
	}	
	//errObj = "#goodsWeigth";
	return loxia.SUCCESS;
}



function clearWeight(){
	if($j("#autoWeigth").attr("clear") != "true"){
		$j("#autoWeigth").attr("clear","true");
		//关秤
		appletStop();
		//清除单号
		$j("#staDiv").attr("trackingNo","");
		$j("#plbatchno").html("");
		$j("#shopId").html("");
		$j("#lpcode").html("");
		$j("#staDiv").attr("");
		$j("#staDiv").attr("staCode","");
		$j("#billsId").val("");
		//$j("#billsId").focus();
		$j("#goodsWeigth").val("");
		//$j("#tbl-billView tr[id]").remove();
		//$j("#executeOutbound").addClass("hidden");
		//清除重量
		$j("#autoWeigth").val("");
		loxia.byId("goodsWeigth").val("").state(null);
		$j("#wrapStuff").val("");
	}
}

function startWeight(){
	if($j("#autoWeigth").attr("clear") === "true"){
		$j("#autoWeigth").attr("clear","false");
		//开秤
		appletStart();
	}
}

function addBarCodeFanht(){
	var varCode = jQuery.trim($j("#wrapStuff").val());
	if(($j("#wrapStuff").val() == ''||$j("#wrapStuff").val() == null) && $j("#barCode_tab tbody tr").length > 0){
		$j("#goodsWeigth").focus();
	}
	if(varCode != ""){
		// 判断是否为耗材
		var result = loxia.syncXhrPost(loxia.getTimeUrl(window.$j("body").attr("contextpath")+"/getSkuTypeByBarCode.json?barCode="+varCode));
		if (!result || result.value != 1){
			$j("#wrapStuff").val("");
			jumbo.showMsg("该包材不存在或为非耗材!");
			return;
		}
		var isAdd = false;
		$j("#barCode_tab tbody tr").each(function (i,tag){
			if(varCode == $j(tag).find("td:eq(1) :input").val()){
				var index = $j(tag).index;
				$j(tag).find("td:eq(2) :input").val(parseInt($j(tag).find("td:eq(2) :input").val())+1);
				isAdd = true;
			}
		});
		if(isAdd == false){
			$j("button[action=add]").click();
			var length = $j("#barCode_tab tbody tr").length-1;
			$j("#barCode_tab tbody tr:eq("+length+") td:eq(1) :input").val(varCode);
			$j("#barCode_tab tbody tr:eq("+length+") td:eq(2) :input").val(1);
		}
	}
	if($j("#barCode_tab tbody tr").length > 0){
		$j("#wrapStuff").val("");
		//$j("#goodsWeigth").focus();
		var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
		// true  自动称
		if(isManualWeighing != 'true'){
			$j("#confirmWeightInput").focus();
		}else {
			$j("#goodsWeigth").focus();	
		}
	}else {
		//showOutBoundInfo("包材条码不能为空");
		showErrorInfoDialog("包材条码不能为空");
		//errorTipOK("包材条码不能为空");
		//errObjs.push("#wrapStuff");
		if(whichWidgetIsError("#wrapStuff")){
			errObjs.push("#wrapStuff");
		}
		//errObj = "#wrapStuff";
	}
}

var rswh = null;
var errObjs = [];
var c_success = 0, c_failed = 0;
var success_transMap = {},failed_transMap = {};
var lineNo;
//供应商编号 fanht
var selTrans;
//已出库的快递单主键，出库交接用
var packageIds = new Array();
//已出库的所有快递单号，出库交接检查用
var transNoList = new Array();
//记录未交接单
handoverCount = 0;

//根据已出库未交接，初始化页面fanht
function initOutBoundPack(){
	//初始化未交接参数
	packageIds = new Array();
	transNoList = new Array();
	handoverCount = 0;
	$j("#handoverCount").html(handoverCount);
	
	var rs = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/initOutBoundPack.json");
	if(rs && rs.result=="success"){
		if(rs.initBean.length>0){
			var data = rs.initBean;
			 for(var d in data){
				 packageIds.push(data[d].packageId);
				 transNoList.push(data[d].trackingNo)
			 }
			 //初始化供应商
			$j("#selTrans").val(data[0].lpcode);
			selTrans = data[0].lpcode;
			handoverCount = rs.initBean.length;
			$j("#handoverCount").html(handoverCount);
		}
	}
}

$j(document).ready(function (){
//	loxia.byId("autoWeigth").setEnable(false);
	//初始化未交接单，check
	$j("#billsId").focus();
	var result = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/initOutBoundPackCheck.json");
	if(result && result.result == "error"){
		//jumbo.showMsg(result.message);
		showErrorInfoDialog(result.message);
		//errorTipOK(result.message);
		//锁定页面
		$j("#staDiv").addClass("hidden");
		return;
	}
	
	//init tranports 
	//var result = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/getTransportator.json");
	var result = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/findPlatformList.json");
	for(var idx in result){
		$j("<option value='" + result[idx].code + "'>"+ result[idx].name +"</option>").appendTo($j("#selTrans,#selTrans-tabs2"));
	}
	
	//根据已出库未交接，初始化页面fanht
	initOutBoundPack();
	//物流供应商必须选择 fanht
	$j("#selTrans").change( function () {
		if(handoverCount!=0){
			//jumbo.showMsg("该供应商还有订单未交接，不能更换供应商");
			showErrorInfoDialog("该供应商还有订单未交接，不能更换供应商");
			//errorTipOK("该供应商还有订单未交接，不能更换供应商");
			$j("#selTrans").val(selTrans);
			return;
		}
		selTrans = $j("#selTrans option:selected").val();
	} ); 
	
	$j("#outbound_dialog").dialog({title: "出库确认信息", modal:true, autoOpen: false, width: 700, height: 300});
	$j("#outbound_result_dialog").dialog({title: "出库结果信息", modal:true, autoOpen: false, width: 600, height: 250});
	$j("#show_error_dialog").dialog({title: "出库信息", modal:true, autoOpen: false, width: 600, height: 300});
	$j("#weight_input_dialog").dialog({title: "重量确认", modal:true, autoOpen: false, width: 500, height: 200});
	
	$j("#dialog_error_ok").dialog({title: "错误信息", modal:true, autoOpen: false, width: 400});
	$j("#closeBtn").click(function(){
		$j("#dialog_error_ok").dialog("close");
	});
	
	
	$j("#autoWeigth").css("color","black");
	$j("button[action=add]").addClass("hidden");
	var baseUrl = $j("body").attr("contextpath");
	//loadTableData("");
	
	// var rswh = loxia.syncXhrPost(loxia.getTimeUrl(baseUrl + "/findwarehousebaseinfo.json"));
	rswh = loxia.syncXhrPost(loxia.getTimeUrl(baseUrl + "/findwarehousebaseinfo.json"));
	if(rswh && rswh.warehouse){
		if (rswh.warehouse.isNeedWrapStuff){
			$j("#p1").removeClass("hidden");
			$j("#p2").removeClass("hidden");
			$j("#p_tr").removeClass("hidden");
		}else{
			$j("#p1").addClass("hidden");
			$j("#p2").addClass("hidden");
			$j("#p_tr").addClass("hidden");
		}
	}

	$j("#billsId").keydown(function(event){
		if(event.keyCode == 13){
			var code = $j("#billsId").val().trim();
			if(code == ""){
				jumbo.showMsg("请输入快递单号再按回车键！");
				return;
			}
			var postData = {};
			postData["trackingNo"]=code;
			var rs = loxia.syncXhrPost(baseUrl + "/findpickinglistpackagebytrackingno.json",postData);
			clearWeight();
			if(rs && rs.result=="success"){
				$j("#billsId").val(code);
				$j("#plbatchno").html(rs.plp["plCode"]);
				$j("#staDiv").attr("trackingNo",code);
				$j("#staDiv").attr("plpId",rs.plp["id"]);
				$j("#staDiv").attr("plId",rs.plp["plId"]);
				$j("#goodsWeigth").attr("isManualWeighing",rs.plp["isManualWeighing"]);
				//$j("#executeOutbound").removeClass("hidden");
				var lpcode = rs.plp["lpcode"];
				var trasportName =loxia.syncXhr($j("body").attr("contextpath")+"/json/getTrasport.do",{"optionKey":lpcode});
				var value = trasportName.value.split(":")[1];

				//快递面单供应商验证 fanht
				var trasCode = trasportName.value.split(":")[2];

				$j("#lpcode").html(value);
				if (rswh.warehouse.isNeedWrapStuff){
					$j("#wrapStuff").focus();
				}else {
					var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
					// true  自动称
					if(isManualWeighing != 'true'){
						$j("#confirmWeightInput").focus();
					}else {
						$j("#goodsWeigth").focus();	
					}
				}
				//open weight interface
				startWeight();
			}else{
				jumbo.showMsg(i18("NO_ORDER"));//该作业单不存在或已经出库
				$j("#billsId").attr("value","");
				if(whichWidgetIsError("#billsId")){
					errObjs.push("#billsId");
				}
				$j("#staDiv").attr("trackingNo","");
				$j("#lpcode").html("");
				$j("#staDiv").attr("plId","");
				$j("#staDiv").attr("plpId","");
				$j("#goodsWeigth").attr("isManualWeighing","");
			}
		}
	});
	
	$j("#goodsWeigth").keyup(function(event){
		var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
		var key = event.keyCode;
		if(key != 13 && key != 8 && isManualWeighing != 'true'){
			$j("#goodsWeigth").val("");
		}
	});
	
	
	$j("#wrapStuff").keydown(function(event){
			if(event.keyCode == 13){
				event.preventDefault();
				if ($j("#wrapStuff").val() != null){
					addBarCodeFanht();
				}else{
					$j("#wrapStuff").focus();
				}
			}
		}); 
	
	$j("#confirmWeightInput").keydown(function(event){
			var errorArray = validateData();
			//alert("confirmWeightInput  errorArray:  " + errorArray.toString());
			if(event.keyCode == 13){
				if ($j("#confirmWeightInput").val().toUpperCase() == BARCODE_CONFIRM){
					$j("#goodsWeigth").val($j("#autoWeigth").val());
					openOutBoundDialog();
					/*
					if(errorArray == null || errorArray.length == 0){
						$j("#executeOutbound").trigger("click");	
					}
					closeDialog1(errObjs);
					*/				
				}else if($j("#confirmWeightInput").val() != "" ) {
					showWeightInputErrDialog("输入重量确认条码不正确，请重新输入.");
					$j("#confirmWeightInput").val("");
					//$j("#confirmWeightInput").focus();
				}else if($j("#confirmValue").val() == "" ) {
					showWeightInputErrDialog("请输入重量确认条码.");
					$j("#confirmWeightInput").val("");
					//$j("#confirmWeightInput").focus();
				}
			}
	});
	
	$j("#goodsWeigth").keydown(function(event){
		if(event.keyCode == 13){
			event.preventDefault();
			
			var value = $j("#goodsWeigth").val();
			if(value == ""){
				//showOutBoundInfo(i18("INPUT_WEIGHT"));
				showErrorInfoDialog(i18("INPUT_WEIGHT"));
				//errorTipOK(i18("INPUT_WEIGHT"));
				if(whichWidgetIsError("#goodsWeigth")){
					errObjs.push("#goodsWeigth");
				}
				//errObjs.push("#goodsWeigth");
				return;
			}
			if(!/^[0-9]*\.{0,1}[0-9]*$/.test(value)){
				//showOutBoundInfo(i18("NUMBER_RULE"));
				showErrorInfoDialog(i18("NUMBER_RULE"));
				//errorTipOK(i18("NUMBER_RULE"));
				if(whichWidgetIsError("#goodsWeigth")){
					errObjs.push("#goodsWeigth");
				}
				return;
			}
			value = parseFloat(value);
			if(value == 0){
				//showOutBoundInfo(i18("INPUT_WEIGHT"));
				showErrorInfoDialog(i18("INPUT_WEIGHT"));
				//errorTipOK(i18("INPUT_WEIGHT"));
				if(whichWidgetIsError("#goodsWeigth")){
					errObjs.push("#goodsWeigth");
				}
				return;
			}else if(value > 150){
				//showOutBoundInfo(i18("WEIGHT_LAGGER"));
				showErrorInfoDialog(i18("WEIGHT_LAGGER"));
				//errorTipOK(i18("WEIGHT_LAGGER"));
				if(whichWidgetIsError("#goodsWeigth")){
					errObjs.push("#goodsWeigth");
				}
				return;
			}	
			
			if(loxia.byId("goodsWeigth").state() === true && loxia.byId("goodsWeigth").val() != null){
				//$j("#executeOutbound").trigger("click");
				openOutBoundDialog();
			}else if($j("#goodsWeigth").val() != ""){
				loxia.byId("goodsWeigth").check();
				if(loxia.byId("goodsWeigth").state() === true && loxia.byId("goodsWeigth").val() != null)
					openOutBoundDialog();
					//$j("#executeOutbound").trigger("click");
			}else{
				loxia.byId("goodsWeigth").val($j("#autoWeigth").val());
			}
		}
	});

	
	$j("#executeOutbound").click(function(){
		    var trs = "";
		    $j("#rsSuccess").html('<tr><td width="240px">相关单据号 </td><td>消息 </td></tr>');
			$j("#showOutBoundMsg").html("");
			var value = $j("#goodsWeigth").val();
			var barcode,qty;
			var transNo = $j("#staDiv").attr("trackingNo");
			var postData={};
			$j("#barCode_tab tbody:eq(0) tr").each(function (i,tag){ 
				barcode = $j(tag).find("td:eq(1) input").val();
				qty = $j(tag).find("td:eq(2) input").val();
				postData["saddlines[" + i + "].sku.barCode"] = barcode;
				postData["saddlines[" + i + "].quantity"] =  qty;
			});
			postData["trackingNo"]= transNo;
			postData["weight"]=value;
			postData["plpId"]=$j("#staDiv").attr("plpId");
			//出库&插入中间表
			var rs = loxia.syncXhrPost(baseUrl + "/o2oqsoutbound.json",postData);
			var t=false;
			var outboundResult = [];
			if(rs){
				if(rs["result"] == "success"){
					$j("#confirmInputSpan").removeClass("hidden");
					$j("#confirmResultValue").removeClass("hidden");
					$j("#confirmResultValue").val("");
					var staCodeList = rs["staCodeList"];
					
					$j.each(staCodeList,function(n,value) {  
			            trs += "<tr><td>" + value + "</td><td>"+i18("OUTBOUND")+"</td></tr>";  
			        }); 
					$j(trs).appendTo($j("#rsSuccess"));//出库
					$j("#plbatchno").html("");
				}else if(rs["result"] == "error"){
					$j("#confirmInputSpan").addClass("hidden");
					$j("#confirmResultValue").addClass("hidden");
					$j("#confirmResultValue").val("--");
					if(rs["message"]){
						outboundResult.push(rs["message"]+ "<br/>");
					}
				}
			}
			if (outboundResult.length > 0){
				$j("#outbound_result_dialog").dialog("open");
				$j("#showOutBoundMsg").html(outboundResult.toString());
				$j("#confirmResultValue").focus();	
			} 
			$j("#billsId").focus();
			$j("#goodsWeigth").blur();
			$j("#barCode_tab tbody:eq(0) tr").remove();
			clearWeight();
	});
	
	//供应商选择 fanht
	//$j("#billsId").focus();
	$j("#selTrans").focus();
	
	clearWeight();
	
	restart();
	
	// dialog 1
	$j("#confirmOutBound").click(function(){
		var errorArray = validateData();
		if(errorArray == null || errorArray.length == 0){
			$j("#executeOutbound").trigger("click");	
		}
		$j("#confirmValue").val("");
		$j("#outbound_dialog").dialog("close"); 
		errObjs = [];
		$j("#billsId").focus();
	});
	
	$j("#confirmClose").click(function(){
		// clearData();
		/*$j(errObj).val("")
		$j("#confirmValue").val("");
		$j("#outbound_dialog").dialog("close"); 
		$j(errObj).focus();*/
		//closeDialog1();
		var errorArray = validateData();
		closeDialog1(errObjs);
	});
	
	$j("#confirmValue").keydown(function(event){
	//$j("#confirmValue").keyup(function(event){
		var value = $j("#confirmValue").val().toUpperCase();
		var errorArray = validateData();
		if(event.keyCode == 13){
			if (value == BARCODE_CONFIRM){
				if(errorArray == null || errorArray.length == 0){
					$j("#executeOutbound").trigger("click");	
				}
				closeDialog1(errObjs);
				errObjs = [];
				$j("#billsId").focus();
			}else if(value != "" ) {
				$j("#confirmValue").val("");
				$j("#showError").html("输入的确认条码不正确，请重新输入.");
			}else if(value == "" ) {
				$j("#confirmValue").val("");
				$j("#showError").html("请输入确认条码.");
			}
		}
	});
	
	// dialog 2
	$j("#confirmResultClose").click(function(){
		$j("#confirmResultValue").val(""); 
		$j("#outbound_result_dialog").dialog("close"); 
		$j("#billsId").focus();
		$j("#confirmWeightInput").val("");
	});
	$j("#confirmResultValue").keydown(function(event){
//$j("#confirmResultValue").keyup(function(event){
		var value = $j("#confirmResultValue").val().toUpperCase();
		if(event.keyCode == 13){
			if (value == BARCODE_CONFIRM){
				$j("#confirmResultValue").val("");
				$j("#outbound_result_dialog").dialog("close");
				$j("#billsId").focus();
				$j("#confirmWeightInput").val("");
			}else if(value != "" ) {
				$j("#confirmResultValue").val("");
				$j("#showOutBoundMsg").html("输入的确认条码不正确，请重新输入.");
			} else if(value == "" ) {
				$j("#confirmResultValue").val("");
				$j("#showOutBoundMsg").html("请输入确认条码.");
			} 
		}
	});
	
	// 错误提示信息  dialog 4
	$j("#confirmErrorInfoClose").click(function(){
		$j("#confirmErrorInfoValue").val(""); 
		$j("#confirmWeightInput").val(""); 
		$j("#show_error_dialog").dialog("close");
		//========================== 
		var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
		if(hasThisWidget("#goodsWeigth")){
			// true  自动称
			if(isManualWeighing != 'true'){
				$j("#confirmWeightInput").focus();	
			}else {
				$j("#goodsWeigth").focus();	
			}
		}else {
			$j(errObjs[0]).focus();		
		}
		// ============
		//$j(errObjs[0]).focus();
		$j(errObjs[0]).val("")
		errObjs.length = 0;
	});
	$j("#confirmErrorInfoValue").keydown(function(event){
		var value = $j("#confirmErrorInfoValue").val().toUpperCase();
		if(event.keyCode == 13){
			if (value == BARCODE_CONFIRM){
				$j("#confirmErrorInfoValue").val("");
				$j("#confirmWeightInput").val(""); 
				$j("#show_error_dialog").dialog("close");
				$j("#billsId").focus();	
				//========================== 
				var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
				if(hasThisWidget("#goodsWeigth")){
					// true  自动称
					if(isManualWeighing != 'true'){
						$j("#confirmWeightInput").focus();	
					}else {
						$j("#goodsWeigth").focus();	
					}
				}else {
					$j(errObjs[0]).focus();		
				}
				$j(errObjs[0]).val("")				
				errObjs.length = 0;
			}else if(value != "" ) {
				$j("#confirmErrorInfoValue").val("");
				$j("#showErrorInfo").html("输入的确认条码不正确，请重新输入.");
			} else if(value == "" ) {
				$j("#confirmErrorInfoValue").val("");
				$j("#showErrorInfo").html("请输入确认条码.");
			} 
		}
	});
	
	// dialog 3 自动称重 确认条码
	$j("#confirmWeightInfoClose").click(function(){
		$j("#confirmWeightInfoValue").val(""); 
		$j("#weight_input_dialog").dialog("close"); 
		$j("#confirmWeightInput").val("");
		$j("#confirmWeightInput").focus();
	});
	$j("#confirmWeightInfoValue").keydown(function(event){
		var value = $j("#confirmWeightInfoValue").val().toUpperCase();
		if(event.keyCode == 13){
			if (value == BARCODE_CONFIRM){
				$j("#confirmWeightInfoValue").val(""); 
				$j("#weight_input_dialog").dialog("close"); 
				$j("#confirmWeightInput").val("");
				$j("#confirmWeightInput").focus();
			}else if(value != "" ) {
				$j("#confirmWeightInfoValue").val("");
				$j("#showWeightInfo").html("输入的确认条码不正确，请重新输入.");
			}else if(value == "" ) {
				$j("#confirmWeightInfoValue").val("");
				$j("#showWeightInfo").html("请输入确认条码.");
			}
		}
	});
	
	
	$j("#restWeight").click(function(){
		restart();
	});
	
	var date = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/json/getWarehouseInfo.json");
	if(date.isMqInvoice){
		lineNo = jumbo.getAssemblyLineNo();
	}
	
});

function existsInFailedMap(code){
	var flag = false;
	for(var index in failed_transMap){
		if (failed_transMap[code]){
			flag = true;
			break;
		}
	}
	return flag;
}

function hasThisWidget(widget){
	var flag = false;
	for(var index in errObjs){
		if (errObjs[index] == widget){flag = true; break; }
	}
	return flag;
}

function openOutBoundDialog(){
	$j("#showError").html("");
	$j("#showOutBoundTable").removeClass("hidden");
	
	$j("#outbound_dialog").dialog("open");
	$j("#confirmValue").focus();
	
	var transportNo = $j("#billsId").val();
	var weight_ = $j("#autoWeigth").val() == "" ? $j("#goodsWeigth").val():$j("#autoWeigth").val();
	$j("#transportNo").html(transportNo);
	$j("#weight_").html(weight_);
	$j("#transportName").html($j("#lpcode").html());
	$j("#relativePickingListCode").html($j("#plbatchno").html());
	//$j("#shopName").html($j("#shopId").html());
	
	var errorArray = validateData();
	if(errorArray != null && errorArray.length > 0){
		$j("#confirmOutBound").addClass("hidden");
		$j("#confirmClose").removeClass("hidden");
		$j("#showOutBoundTable").addClass("hidden");
		$j("#showError").html(errorArray.toString());
		return;
	}else {
		$j("#confirmOutBound").removeClass("hidden");
		$j("#showOutBoundTable").removeClass("hidden");
		$j("#confirmClose").addClass("hidden");
	}
}

function showOutBoundInfo(msg){
	$j("#showError").html("");
	$j("#showOutBoundTable").addClass("hidden");
	$j("#outbound_dialog").dialog("open");
	$j("#showError").html(msg);
	$j("#confirmOutBound").addClass("hidden");
	$j("#confirmClose").removeClass("hidden");
	$j("#confirmValue").focus();
}

// show_error_dialog 显示错误信息dialog
function showErrorInfoDialog(msg){
	$j("#showErrorInfo").html("");
	$j("#show_error_dialog").dialog("open");
	$j("#showErrorInfo").html(msg);
	$j("#confirmErrorInfoValue").focus();
	$j("#confirmErrorInfoValue").val("");
}

function errorTipOK(text) {
	$j("#error_text_ok").html("<font style='text-align:center;font-size:36px' color='red'>"+ text +"</font>");
	$j("#dialog_error_ok").dialog("open");
}

// confirmWeightInput
function showWeightInputErrDialog(msg){
	$j("#showWeightInfo").html("");
	$j("#weight_input_dialog").dialog("open");
	$j("#showWeightInfo").html(msg);
	$j("#confirmWeightInfoValue").focus();
}

function clearData(){
	$j("#billsId").val("");
	$j("#wrapStuff").val("");
	$j("#goodsWeigth").val("");
}

function clearDataExcludeBills(){
	$j("#wrapStuff").val("");
	$j("#goodsWeigth").val("");
}
function closeDialog1(objs){
	$j("#confirmValue").val("");
	$j("#confirmWeightInput").val(""); 
	$j("#outbound_dialog").dialog("close");
	$j(errObjs[0]).val("");
	//========================== 
	var isManualWeighing = $j("#goodsWeigth").attr("isManualWeighing");
	if(hasThisWidget("#goodsWeigth")){
		// true  自动称
		if(isManualWeighing != 'true'){
			$j("#confirmWeightInput").focus();	
		}else {
			$j("#goodsWeigth").focus();	
		}
	}else {
		$j(errObjs[0]).focus();		
	}
	errObjs.length = 0;
}


function validateData(){
	var errors = [], canAdd = true;
	if(rswh && rswh.warehouse){
		if (rswh.warehouse.isNeedWrapStuff){
			if(!$j("#barCode_tab tbody:eq(0) tr").length > 0){
				if(whichWidgetIsError("#wrapStuff")){
					errObjs.push("#wrapStuff");
				}
				errors.push("请输入包材编码<br/>");
			}
		}
	}
	var weight = $j.trim($j("#goodsWeigth").val());
	var msg = doExecute($j("#goodsWeigth").val());
	if (msg && msg != 'success'){
		errors.push(msg);
		if(whichWidgetIsError("#goodsWeigth")){
			errObjs.push("#goodsWeigth");
		}
	}
	if(!$j.trim($j("#billsId").val())) {
		if(whichWidgetIsError("#billsId")){
			errObjs.push("#billsId");
		}
		errors.push("请输入快递单号<br/>");
	}
	return errors;
}

function whichWidgetIsError(widget){
	var canAdd = true;
	for(var index in errObjs){
		if (errObjs[index] == widget){canAdd = false; break; }
	}
	return canAdd;
}
 