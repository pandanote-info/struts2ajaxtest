<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="hello.message"/></title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/main.js"></script>
</head>

<body>
<h2><s:property value="message"/></h2>

<h3>Ajax test</h3>
<ul>
    <li>
        <s:a href="javascript:void(0);" onclick="ajax(); return false;">Ajax</s:a>
    </li>
</ul>
<div id="response"></div>
</body>
</html>
