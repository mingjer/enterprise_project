<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@include file="/common/meta.jsp"%>

<script type="text/javascript">
<!--
$j(document).ready(function (){
	 window.parent.loxia.unlockPage();
    if($j("#result").val()=="success"){
    	window.parent.showMsg("导入覆盖区域成功");
        window.parent.importReturn(true);
    }else{
    	window.parent.showMsg("导入失败：" + $j("#msg").val());
    	window.parent.importReturn(false);
    }    
});
-->
</script>
</head>
<body style="background-color: #f2f2f2;" contextpath="<%=request.getContextPath() %>">
<input type="hidden" name="result" value="<s:property value="#request.result"/>" id="result" />
<input type="hidden" name="msg" value="<s:property value="#request.msg"/>" id="msg" />
</body>
</html>