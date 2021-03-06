<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<%@ include file="yuriy.jsp" %>
	<!-- css -->
	<link rel="stylesheet" href="${root}css/jquery-ui.main.css">
	<link rel="stylesheet" href="${root}css/jquery.mobile-1.3.2.min.css">
	<link rel="stylesheet" href="${root}css/ui-dialog.css">
	<!-- js -->
	<script src="${root }js/jquery-1.8.3.min.js"></script>
	<script src="${root }js/jquery.mobile-1.3.2.min.js"></script>
	<script src="${root }js/jquery.min.js"></script>
	<script src="${root }js/jquery-ui.min.js"></script>
	<script src="${root}js/dialog.js"></script>
	<script src="${root}js/dialog-min.js"></script>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>宝尊电商-新增地址信息</title>
		<style type="text/css">
			textarea.ui-input-text { min-height: 90px; };
		</style>
		<style type="text/css">
			.opendiv {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: 75px;
				margin-top: -203px;
				width: 125px;
				height: 120px;
				border:1px;
				border-color:blue;
				text-align: center;
				padding-top: 20px;
				solid:#F00;
			}
			.main {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: -150px;
				margin-top: -250px;
				width: 200px;
				height: 200px;
				border:1px;
				text-align: center;
				padding-top: 20px;
				solid:#F00;
			}
			.main2 {
				z-index: 920;
				position: absolute;
				left: 50%;
				top: 45%;
				margin-left: 260px;
				margin-top: -250px;
				width: 100px;
				height: 140px;
				border:1px;
				text-align: center;
				solid:#F00;
			}
			</style>
	</head>

	<body>
		<div data-role="page" id="pageone" style="vertical-align:middle;" align="center">
			<div data-role="header" data-theme="b">
				<div style="height: 60px;">
					<div style="display: inline;float: left;"><h3>&nbsp;&nbsp;[Visitor information management system]访客信息管理系统</h3></div>
					<div style="display: inline;float: right;margin-right: 10px;"><img alt="log" src="${root}img/baozun.png" style="height: 60px;width: 160px;"></div>
					<div style="display: inline;float: right;margin-right: 10px;margin-top: 25px;">欢迎,${session_user.name}｜<a href="javascript:void();" onclick="out_login();">[退出]</a></div>
				</div>
			</div>
			<div style="width: 1200px;height: 400px;margin-top: 20px;" id="bodys" name="bodys">
				<form id="fillform">
					<table width="100%">
						<tr height="35px;">
							<td width="15%">地址编码:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(address no)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<input id="addressCode" name="addressCode" type="text" tabindex="1" value="${addressInfor.addressCode}" readonly="readonly"/>
									</div>
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">地址名称:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(address name)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
							 		<div class="ui-block-a" style="width: 300px;">
										<input id="addressName" name="addressName"  tabindex="2" type="text" value="${addressInfor.addressName}"/>
									</div>
								
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="35px;">
							<td width="15%">打印机名称:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Printer address)</span></td>
							<td width="40%">
							 	<div class="ui-grid-a">
									<div  class="ui-block-a" style="width: 300px;">
										<input id="printerIp" name="printerIp"  tabindex="3" type="text" value="${addressInfor.printerIp}"/>
									</div>
					                <div class="ui-block-b" style="width: 100px;margin-top: 20px;margin-left: 10px;">
					                    <span style="color: red;">*</span>
				                    </div>
							 	</div>
							</td>
						</tr>
						<tr height="100px;">
							<td width="15%">备注:<br><span style="font: 黑体;font-size: 10px;color: #B8B8B8;">(Remark)</td>
							<td width="40%">
								<div style="width: 300px;">
									<textarea id="remark" name="remark" rows="6" cols="" tabindex="9" style="resize:none">${addressInfor.remark}</textarea>
								</div>
							</td>
						</tr>
						<tr height="100px;" align="center">
							<td colspan="2" align="right">
							</td>
							<td colspan="7" align="left">
							</td>
						</tr>
						<tr height="35px;" align="center">
							<td colspan="9" align="center">
								<div style="width: 750px;height: 30px;">
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input type="button"  tabindex="11" onclick="updateApplyInfor();" value="保存并关闭" />
									</div>
									<div style="width: 200px;margin-right: 40px;display: inline;float: right;">
										<input  type="button" tabindex="12"  value="重置" onclick="resetInfor()"/>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
			<div data-role="footer"  data-theme="b" data-position="fixed">
			    <div data-role="navbar" data-iconpos="left">
			      <ul>
			        <li><a href="javascript.void();" onclick="main_list();" data-icon="home">主&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
			        <li><a href="javascript.void();" onclick="address()" data-icon="check">地&nbsp;&nbsp;&nbsp;&nbsp;址</a></li>
			        <li><a href="javascript.void();" onclick="sign()" data-icon="check">签&nbsp;&nbsp;&nbsp;&nbsp;入</a></li>
			        <li><a href="javascript.void();" onclick="sign_out();" data-icon="info">签&nbsp;&nbsp;&nbsp;&nbsp;出</a></li>
			        <li><a href="javascript.void();" onclick="detailed_list()" data-icon="info">查&nbsp;看&nbsp;记&nbsp;录</a></li>
			      </ul>
			    </div>
			</div>
		</div>
		<input type="hidden" id="DataId" value="${addressInfor.id}" /> <!-- 保存老数据id -->
	</body>
	<script type="text/javascript">
	/** 返回访客信息的各主页  **/
	function sign() {
		window.location.href="${root}control/mainController/sign.do";
	}
	function address() {
		window.location.href="${root}control/addressControl/addressList.do";
	}
	function sign_out() {
		window.location.href="${root}control/mainController/sign_out.do";
	}
	function detailed_list() {
		window.location.href="${root}control/mainController/detailed_list.do";
	}
	function main_list() {
		window.location.href="${root}control/mainController/main_list.do";
	}
	function out_login() {
		window.location.href="${root}control/userController/outLogin.do";
	}
	/** 重置信息 **/
	function resetInfor() {
		var id = $("#DataId").val();
		window.location.href="${root}control/addressControl/updatePage.do?id="+id;
	}
	
	/** 验证地址信息字段  **/
	function validate() {
		
		var addressName = $("#addressName").val();
		if(addressName == null || addressName == ""){
			showModal("地址名称不能为空", null);
			return false;
		}
		if(addressName.length > 50){
			showModal("地址名称不能超过50", null);
			return false;
		}
		
		var printerIp = $("#printerIp").val();
		/* var pattern = /^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/;
		
		if(!printerIp.match(pattern)){
			showModal("打印机名称支持数字和小数点且参照ip地址输入！", null);
			return false;
		} */
		if(printerIp == null || printerIp == ""){
			showModal("打印机名称不能为空", null);
			return false;
		}
		if(printerIp.length > 50){
			showModal("打印机名称不能超过50", null);
			return false;
		}
		return true;		
	}
	
	/*保存的方法 */
	function updateApplyInfor() {
		if(!validate()){ //验证所填入的信息
			return;
		}
		$.ajax({
			url : "${root}control/addressControl/updateAddressInfor.do",
			type : "POST",
			dataType : "json",
			data : $.param({
				"id" : $("#DataId").val()
			}) + "&" + $("#fillform").serialize(),
			success : function(data) {
				if (data.msg == 'success') {
					showModal("保存成功！",function(){
						window.location.href="${root}control/addressControl/addressList.do";
					});
				}
				if(data.msg == 'error'){
					showModal("保存失败！",null);
				}
			}
		});
	}
	
	function showModal(content,ofunc) {
		if(ofunc == null || ofunc == ""){
			var ofunc = function(){};
		}
		var d = dialog({
			title : '提示',
			content : content,
			lock : true,
			ok : ofunc
		});
		d.showModal();
	}
	</script>
</html>