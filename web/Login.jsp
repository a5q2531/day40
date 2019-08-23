<%--
  Created by IntelliJ IDEA.
  User: JLB
  Date: 2019/8/23
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <%if(request.getAttribute("flag")!=null){
     %>
    <p style="color: red">账号或密码错误</p>
    <%
    }%>
    <form action="/loginSer" method="post">
        <table>
            <tr>
                <td><label for="user-name-label">用户名</label></td>
                <td><input type="text" name="username" id="user-name-label"/></td>
            </tr>
            <tr>
                <td><label for="password-label">密码</label></td>
                <td><input type="password" name="password" id="password-label" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="登录" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
