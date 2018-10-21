			var pickingBarCode;
			var pickingCode;
			var boxCode;
			var locationCode;
			var wp;
			var temporaryWp;
			var qty;
			var pbShort=new Array();//二级批次短拣
			var locShort=new Array();//库位短拣
			var collection;
			
			$("#boxCode").focus();
			
		$(document).ready(function(){
			
			$("#picking1").show();
			$("#picking2").hide();
			$("#picking3").hide();
			
			//集货库位条码扫描
			$("#collectionCode").keypress(function(evt){
				if (evt.keyCode === 13) {
					var key = $("#collectionCode").val() ;
					if(key!=""){
						$("#collectionCodeOk").trigger("click");	
					}else {
						play();
						$("#msg").text("请输入集货库位条码！");
					}
				}
			});
			
			$("#collectionCodeOk").click(function(){
				pickingBarCode = $("#collectionCode").val() ;
				if(pickingBarCode==""){
					play();
					$("#msg").text("请输入集货库位条码！");
					return false;
				}
				if(pickingBarCode!=collection){
					play();
					$("#msg").text("请输入正确的集货库位条码！");
					return false;
				}
				var postData = {
						"code":boxCode						
				}; 
				var flag=request($("body").attr("contextpath") + "/pda/collectionBox.do",postData);
				if(flag["flag"]=="success"){
					if(flag["msg"]!=null&&flag["msg"]!=""){
						//周转箱集齐
						pickingBarCode=flag["msg"];
						$("#pickingCode").text(pickingBarCode);
						toLocation();
					}else{
						//跳转到扫描周转箱页面
						//$("#collectionCode").val("") ;
						toPickingCode();
						
					}
				}else{
					play();
					if(flag["msg"]!=null&&flag["msg"]!=""){
						$("#msg").text(flag["msg"]);
					}else{
						$("#msg").text("系统异常！");
					}
					$("#collectionCode").val("") ;
				}
				
				
			})
			
			//货箱条码扫描
			$("#boxCode").keypress(function(evt){
				if (evt.keyCode === 13) {
					var key = $("#boxCode").val() ;
					if(key!=""){
						$("#boxCodeOk").trigger("click");	
					}else {
						play();
						$("#msg").text("请输入货箱条码！");
					}
				}
			});
			
			$("#boxCodeOk").click(function(){
				var key = $("#boxCode").val() ;
				if(key==""){
					play();
					$("#msg").text("请输入货箱条码！");
				}
				boxCode = $("#boxCode").val() ;
				var postData = {
						"code":boxCode					
				}; 
				//判断此货箱是否可用
				var flag=request($("body").attr("contextpath") + "/pda/checkCollectionBox.do",postData);
				if(flag["flag"]=="success"){
					if(flag["msg"]!=null&&flag["msg"]!=""){
						$("#zzx").text(boxCode);
						$("#collection").text(flag["msg"]);
						collection=flag["msg"];
						toBox();
					}else{
						$("#boxCode").val("") ;
						play();
						$("#msg").text("此周转箱无人工集货信息！");
						return false;
						
					}
				}else{
					play();
					$("#msg").text("系统异常！");
					 $("#boxCode").val("") ;
					return false;
				} 
				
				
			})
			
			//库位条码扫描
			$("#move").keypress(function(evt){
				if (evt.keyCode === 13) {
					var key = $("#move").val() ;
					if(key=="OK"){
						$("#moveOk").trigger("click");	
					}else {
						play();
						$("#msg").text("请输入确认条码！");
					}
				}
			});
			
			$("#moveOk").click(function(){
				var key = $("#move").val() ;
				if(key==""){
					play();
					$("#msg").text("请输入确认条码！");
				}else{
					var postData = {
							"barCode":pickingBarCode
					}; 
					var flag=request($("body").attr("contextpath") + "/pda/moveCollectionBox.do",postData);
					if(flag["flag"]=="success"){
						toPickingCode();
						$("#msg").text("此配货批周转箱已成功移走！");
					}else{
						play();
						$("#msg").text("系统异常！");
						$("#move").val("") ;
					}
				}
				
				
				
				
			})
			
		
			
		
		
			
		
			
			//返回
			$("#boxBack").click(function(){
				window.location.href=$("body").attr("contextpath")+"/pda/menu.do";
			})
			//货箱返回
			$("#collectionCodeBack").click(function(){
				toPickingCode();
			})
			//库位返回
			$("#moveBack").click(function(){
				toPickingCode();
			})
			//返回菜单
			$("#menu").click(function(){
				window.location.href=$("body").attr("contextpath")+"/pda/menu.do";
			})
			
			//退出登录
			$("#exit").click(function(){
				window.location.href=$("body").attr("contextpath")+"/pda/pdaExit.do";
			})
		});
		
		
		
		
		
		
		
		
		//到货箱扫描
		function toBox(){
			$("#picking1").hide();
			$("#picking2").show();
			$("#picking3").hide();
			$("#collectionCode").val("");
			$("#collectionCode").focus();
			$("#msg").text("");
		}
		
		//到库位扫描
		function toLocation(){
			$("#picking1").hide();
			$("#picking2").hide();
			$("#picking3").show();
			$("#move").val("");
			$("#move").focus();
			$("#msg").text("");
		}
		
		
		
		//到第一步
		function toPickingCode(){
			$("#picking1").show();
			$("#picking2").hide();
			$("#picking3").hide();
			$("#boxCode").focus();
			$("#boxCode").val("");
			$("#msg").text("");
			 clear();
		}
		
		
		//清空缓存数据
		function clear(){
			pickingCode=null;
			boxCode=null;
			locationCode=null;
			wp=null;
			temporaryWp=null;
			qty=null;
			pbShort=new Array();
			collection=null;
		}
		
		function request(url, data, args){
			url=url+'?version='+new Date();
			var _data, options = this._ajaxOptions(url, data, args);
			$.extend(options,{
				async : false,
				success : function(data, textStatus){
					_data = data;
				},
				error : function(XMLHttpRequest, textStatus, errorThrown){
					_data = {};
					var exception = {};
					exception["message"] = "Error occurs when fetching data from url:" + this.url;
					exception["cause"] = textStatus? textStatus : errorThrown;
					_data["exception"] = exception;
				}
			});
			$.ajax(options);
			//console.dir(_data);
			return _data;
		}
		
