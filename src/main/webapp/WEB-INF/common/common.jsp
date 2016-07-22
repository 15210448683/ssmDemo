<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
    request.setAttribute("domain", request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort());
%>

<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<%-- Sets initial viewport load and disables zooming --%>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
<%-- 禁止缩放 --%>
<meta name="format-detection" content="telephone=no">
<%-- Makes your prototype chrome-less once bookmarked to your phone's home screen --%>
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>  
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<script type="text/javascript" src="${path}/js/jquery.js"></script>
<script type="text/javascript">var _path = '<%=path %>'; var readyCallback, completeCallback;</script>



