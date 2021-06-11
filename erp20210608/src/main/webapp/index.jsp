<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
	<meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
	<meta name="viewport" content="user-scalable=1, initial-scale=0.1, width=device-width, target-densitydpi=device-dpi" />
<%@ include file="header.jsp" %>
	<title>SI를 위한 경량 ERP 솔루션</title>
</head>
<body style="margin:0;border:none;-ms-touch-action:none;" onload="oninitframework()">
	<script type="text/javascript">
		function oninitframework()
		{
			var screeninfo = [
            {"id":"Desktop_screen","type":"desktop","themeid":"theme::default","xadl":"App_Desktop.xadl.js"}
			];

			nexacro._initHTMLSysEvent(window, document);			
			nexacro._initEnvironment(screeninfo);
            nexacro._prepareManagerFrame(onloadframework);
		}
		function onloadframework()
		{
			nexacro._loadADL();
		}
		function onfinalframework()
		{
			
		}
	</script>
</body>
</html>
