<%--
  Created by IntelliJ IDEA.
  User: JLB
  Date: 2019/8/23
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%if(request.getAttribute("user")==null){
%>
登录失败
<%
}else {
%>
登录成功
<%
    }
%>
</body>
</html>
