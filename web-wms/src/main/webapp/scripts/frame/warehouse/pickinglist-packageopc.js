$j.extend(loxia.regional['zh-CN'],{
	APPLY_FORM_SELECT : "请选择作业申请单",
	CODE : "作业单号",
	STATUS : "状态",
	REFSLIPCODE : "相关单据号",
	INTTYPE : "作业类型名称",
	SHOPID : "相关店铺",
	LPCODE : "物流服务商简称",
	ISNEEDINVOICE : "是否需要发票",
	CREATETIME : "创建时间",
	STVTOTAL : "计划执行总件数",
	COUNT_SEARCH : "待出库列表",
	
	SKUNAME : "商品名称",
	BARCODE : "条形码",
	JMCODE : "商品编码",
	KEYPROPERTIES : "扩展属性",
	QUANTITY : "计划执行量",
	DETAIL_INFO : "详细信息",
//	TITLENAME:"秒杀商品【商品名称|条码|件数/商品名称|条码|件数....】",
//	KINDS:"种类数",
	STATOTALSKUQTY:"作业单商品总数",
	SKUQTY:"作业单商品种类数",
	SKU1BARCODE:"SKU1条码",
	SKU1QTY:"SKU1数量",
	SKU2BARCODE:"SKU2条码",
	SKU2QTY:"SKU2数量",
	SKU3BARCODE:"SKU3条码",
	SKU3QTY:"SKU3数量",
	PACKAGESKULIST:"套装组合商品列表"
});
function i18(msg,args){
	return loxia.getLocaleMsg(msg,args);
}
var customizationShopMap = {};//当前仓库定制打印模版店铺集合
$j(document).ready(function(){
	$j("#showSkuDialog").dialog({title: "套装组合商品查询", modal:true, autoOpen: false, width: 840});
	initShopQuery("shopId","innerShopCode");//初始化查询条件，根据当前登录用户及所选仓库初始化店铺选择列表
	//创建商品列表
	$j("#tbl_sku_query_dialog").jqGrid({
		mtype:"POST",
		loadonce:false,
		datatype: "json",
		colNames: ["ID",i18("STATOTALSKUQTY"),i18("SKUQTY"),i18("SKU1BARCODE"),i18("SKU1QTY"),i18("SKU2BARCODE"),i18("SKU2QTY"),i18("SKU3BARCODE"),i18("SKU3QTY"),"skusName"],
		colModel: [ 
		           {name: "id", index: "id", hidden: true},
		           {name: "staTotalSkuQty", index:"staTotalSkuQty", width: 100, resizable: true},
		           {name: "SKUQTY", index:"SKUQTY", width: 100, resizable: true},
		           {name: "skus1BarCode", index:"skus1BarCode", width: 100, resizable: true},
		           {name: "skus1Qty", index:"skus1Qty", width: 80, resizable: true},
		           {name: "skus2BarCode", index:"skus2BarCode", width: 100, resizable: true},
		           {name: "skus2Qty", index:"skus2Qty", width: 80, resizable: true},
		           {name: "skus3BarCode", index:"skus3BarCode", width: 100, resizable: true},
		           {name: "skus3Qty", index:"skus3Qty", width: 80, resizable: true},
		           {name: "skusName", index:"skusName",hidden:true}
		           ],
		caption: i18("PACKAGESKULIST"),
		rowNum: jumbo.getPageSize(),
		rowList:jumbo.getPageSizeList(),
	   	sortname: 'id',
	    pager: '#tbl_sku_query_dialog_pager',
		sortorder: "desc", 
		height:'auto',
		viewrecords: true,
   		rownumbers:true,
		jsonReader: { repeatitems : false, id: "0" }
	});
	//根据查询条件进行查询，得到查询结果,可以进行店铺选择一系列操作
	$j("#selTransopc").val($j("#selTrans").val());
	$j("#btnSearchShop").click(function(){
		var whouid=$j("#selTrans").val();
		if(whouid==""){
			jumbo.showMsg("请选择仓库！");
			return;
		}
		setWhOuid(whouid);
		$j("#shopQueryDialog").dialog("open");
	});
	//仓库下拉值改变事件
	$j("#selTrans").change(function(){
		$j("#showShopList").html("");
		var postData={};
		postData["ou.id"]=$j("#selTrans").val();
		//根据当前用户选择的仓库，查询其中所有的定制打印模版的店铺
		var rs = loxia.syncXhrPost($j("body").attr("contextpath") + "/customiztationtemplshopopc.json",postData);
		var customizationShopArray = null;
		if(rs && rs.returnVal){
			customizationShopArray = rs.returnVal;
			for (var i in customizationShopArray){
				customizationShopMap[customizationShopArray[i]] = customizationShopArray[i]; 
			}
		}
	});
	//根据运营中心仓库查询
	var result = loxia.syncXhrPost($j("body").attr("contextpath")+"/selectbyopc.json");
	for(var idx in result.warelist){
		$j("<option value='" + result.warelist[idx].id + "'>"+ result.warelist[idx].name +"</option>").appendTo($j("#selTrans"));
	}
	$j("#btnSkuSelectConfirm").click(function(){
		var id = $j('#tbl_sku_query_dialog').jqGrid('getGridParam','selrow');
		var data=$j("#tbl_sku_query_dialog").jqGrid("getRowData",id);
		$j("#skuName").val(data["skusName"]);
		$j("#packageSkuId").val(data["id"]);
		$j("#showSkuDialog").dialog("close");
	});
	$j("#btnSkuSelectClose").click(function(){
		$j("#showSkuDialog").dialog("close");
	});
	$j("#skuSelect").click(function(){
		var postData={};
		postData["ou.id"]=$j("#selTrans").val();
		$j("#tbl_sku_query_dialog").jqGrid('setGridParam',{
			url:loxia.getTimeUrl($j("body").attr("contextpath") + "/selectallpackageskuopc.json"),
			postData:postData
		}).trigger("reloadGrid");
		$j("#showSkuDialog").dialog("open");
	});
	//初始化物流商信息
	var result = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/json/getTransportator.do");
	for(var idx in result){
		$j("<option value='" + result[idx].code + "'>"+ result[idx].name +"</option>").appendTo($j("#selLpcode"));
	}
	//初始化商品分类
	var result = loxia.syncXhrPost(window.$j("body").attr("contextpath")+"/json/findCategories.do");
	for(var idx in result){
		$j("<option value='" + result[idx].id + "'>" + result[idx].skuCategoriesName+"</option>").appendTo($j("#categoryId"));
	}
	var trasportName =loxia.syncXhr($j("body").attr("contextpath")+"/json/getTrasportName.do");
	var trueOrFalse=loxia.syncXhr($j("body").attr("contextpath") + "/json/formateroptions.do",{"categoryCode":"trueOrFalse"});
	var staStatus=loxia.syncXhr($j("body").attr("contextpath") + "/json/formateroptions.do",{"categoryCode":"whSTAStatus"});
	//初始化列表
	$j("#tbl-staList-query").jqGrid({
		datatype: "json",
		colNames: ["ID",i18("CODE"),i18("REFSLIPCODE"),i18("SHOPID"),i18("LPCODE"),i18("STATUS"),i18("CREATETIME"),i18("ISNEEDINVOICE"),i18("STVTOTAL")],
		colModel: [{name: "id", index: "id", hidden: true},		         
		           {name: "code", index: "code", width: 120,formatter:"linkFmatter",formatoptions:{onclick:"showStaLine"}, resizable: true},
		           {name: "refSlipCode", index: "refSlipCode",width: 120, resizable: true},
		           {name: "shopId", index: "shopId", width: 100, resizable: true},
		           {name: "lpcode", index: "lpcode", width: 80, resizable: true,formatter:'select',editoptions:trasportName},
		           {name: "intStatus", index: "intStatus", width: 60, resizable: true,formatter:'select',editoptions:staStatus},
		           {name: "createTime", index: "createTime", width: 120, resizable: true},
		           {name: "isNeedInvoice", index: "isNeedInvoice",  width: 80, resizable: true,formatter:'select',editoptions:trueOrFalse},
		           {name: "stvTotal", index: "stvTotal", width: 90, resizable: true}],
		caption: i18("COUNT_SEARCH"),//待出库列表
	   	sortname: 'id',
	   	pager:"#pager_query",
	    rowNum: jumbo.getPageSize(),
		rowList:jumbo.getPageSizeList(),
	   	height:"auto",
	    multiselect: false,
	    rownumbers:true,
	    viewrecords: true,
		sortorder: "desc", 
		jsonReader: { repeatitems : false, id: "0" }
	});
	$j("#tbl_detail_list").jqGrid({
		datatype: "json",
		colNames: ["ID",i18("SKUNAME"),i18("BARCODE"),i18("JMCODE"),i18("KEYPROPERTIES"),i18("QUANTITY")],
		colModel: [
		           {name: "id", index: "id", hidden: true},		         
				   {name: "skuName", index: "skuName", width: 120, resizable: true},
		           {name: "barCode", index: "barCode",width: 120, resizable: true},
		           {name: "jmcode", index: "jmcode", width: 100, resizable: true},
		           {name: "keyProperties", index: "keyProperties", width: 100, resizable: true},
		           {name: "quantity", index: "quantity", width: 120, resizable: true}],
		caption: i18("DETAIL_INFO"),//详细信息
		rowNum: jumbo.getPageSize(),
	    rowList:jumbo.getPageSizeList(),
	    pager:"#pager",
		height:"auto",
   		sortname: 'id',
     	multiselect: false,
		sortorder: "desc", 
		jsonReader: { repeatitems : false, id: "0" }
	});
	//查询按钮功能
	$j("#btn-query").click(function(){
		var postData = loxia._ajaxFormToObj("query-form");
		postData["shoplist"] = $j("#postshopInput").val();
		//postData["sta.isSedKill"]=true;
		postData["sta.pickingType"]="SKU_PACKAGE";
		var cenid=$j("#selTrans").val();
		if(cenid==""){
			jumbo.showMsg("请选择仓库！");
			return;
		}
		postData["ou.id"]=cenid;
		$j("#tbl-staList-query").jqGrid('setGridParam',{
			url:window.$j("body").attr("contextpath")+"/json/findStaForPickingByModel.do",
			postData:postData,
			page:1
		}).trigger("reloadGrid");
	});
	//重置按钮功能
	$j("#reset").click(function(){
		$j("#filterTable input").val("");
		$j("#selIsNeedInvoice option:first").attr("selected",true);
		$j("#selCity option:first").attr("selected",true);
		$j("#selLpcode option:first").attr("selected",true);
		$j("#selIsSpPg option:first").attr("selected",true);
		$j("#categoryId option:first").attr("selected",true);
		$j("#status option:first").attr("selected",true);
		$j("#skuQty option:first").attr("selected",true);
		$j("#selTrans option:first").attr("selected",true);
		$j("#postshopInput").val("");
		$j("#showShopList").html("");
	});
	//返回按钮功能
	$j("#back").click(function(){
		$j("#staInfo").removeClass("hidden");
		$j("#staLineInfo").addClass("hidden");
	});
	//自动生成配货批
	$j("#autoConfirm").click(function(){
		if($j("#selIsNeedInvoice").val() == ""){
			if(!confirm("确定不选择是否需要发票将继续操作!")){
				return;
			}
		}
		if($j("#selLpcode").val() == ""){
			jumbo.showMsg("请选择物流商！");
			return;
		}
		if($j("#skus").val() == ""){
			jumbo.showMsg("请选择商品列表信息！");
			return;
		}
		if(!loxia.byId("autoSize").check() || !loxia.byId("plCount").check()){
			jumbo.showMsg("请填写正确数量！");
			return;
		}
		if($j("#autoSize").val()<0||$j("#plCount").val()<0){
			jumbo.showMsg("请填写正确数量！");
			return;
		}
		if($j("#plCount").val()!=""){
			if($j("#autoSize").val()==""){
				jumbo.showMsg("请选择每批创建单据数量！");
				return;
			}
		}
		if(!checkMultiCompanyShop()){
			return ;
		}
		 
		var postData = loxia._ajaxFormToObj("query-form");
		postData["limit"] = $j("#autoSize").val();
		postData["plCount"] = $j("#plCount").val();
		postData["shoplist"] = $j("#postshopInput").val();
		//postData["sta.isSedKill"]=true;
		postData["sta.pickingType"]="SKU_PACKAGE";
		postData['pickingList.checkMode']="PICKING_PACKAGE";
		var cenid=$j("#selTrans").val();
		if(cenid==""){
			jumbo.showMsg("请选择仓库！");
			return;
		}
		postData["ou.id"]=cenid;
		var result = loxia.syncXhrPost($j("body").attr("contextpath") + "/autogenerdispatchList.json",postData);
		if(result&&result.result){//成功后更新原始查询条件列表
			var postData1 = loxia._ajaxFormToObj("query-form");
			postData1["shoplist"] = $j("#postshopInput").val();
			//postData1["sta.isSedKill"]=true;
			postData1["sta.pickingType"]="SKU_PACKAGE";
			var cenid2=$j("#selTrans").val();
			postData1["ou.id"]=cenid2;
			$j("#tbl-staList-query").jqGrid('setGridParam',{
				url:window.$j("body").attr("contextpath")+"/json/findStaForPickingByModel.do",
				postData:postData1,
				page:1
			}).trigger("reloadGrid");
			if(result&&result.result=='error'){
				jumbo.showMsg(result.message);
			}
		}
	});
});
//作业单明细
function showStaLine(tag){
	var tr = $j(tag).parents("tr");
	var id = tr.attr("id");
	$j("#staInfo").addClass("hidden");
	$j("#staLineInfo").removeClass("hidden");
	var sta=$j("#tbl-staList-query").jqGrid("getRowData",id);
	$j("#s_code").html(sta["code"]);
	$j("#s_createTime").html(sta["createTime"]);
	$j("#s_slipCode").html(sta["refSlipCode"]);
	$j("#s_owner").html(sta["shopId"]);
	$j("#s_status").html(tr.find("td[aria-describedby$='intStatus']").html());
	$j("#s_type").html("类型");
	$j("#s_trans").html(tr.find("td[aria-describedby$='lpcode']").html());
	$j("#s_inv").html(tr.find("td[aria-describedby$='isNeedInvoice']").html());
	var postData = {};
	postData["sta.id"] = id;
	$j("#tbl_detail_list").jqGrid('setGridParam',
			{url:window.$j("body").attr("contextpath")+"/findPickingStaLine.json",
			postData:postData,page:1}
		).trigger("reloadGrid");
}
function checkMultiCompanyShop(){
	var shoplist = $j("#postshopInput").val();
	var postData={};
	postData["ou.id"]=$j("#selTrans").val();
	var result = loxia.syncXhrPost($j("body").attr("contextpath") + "/warehosueisrelateshopforprintopc.json",postData);
	// error 需要选择店铺 ，success 不是必须选择店铺
	if(result && result.result && result.result=='error'){
		if (shoplist==""){
			jumbo.showMsg("当前仓库装箱清单打印为店铺定制，配货前请选择店铺...");
			return false;
		}
	}
	var flag = 0,index=0;
	var s = shoplist.split("|");
	var iteration = [];
	for(var i in s){
		if (customizationShopMap[s[i]]){
			flag++;
			iteration[index++] = customizationShopMap[s[i]];
		}
	}
	if (s.length > 1 && flag > 0){
		jumbo.showMsg("以下定制店铺不能多选 ： " + iteration);
		return false;
	}
	return true;
}