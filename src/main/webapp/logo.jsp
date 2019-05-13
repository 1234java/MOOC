<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/12
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<script type="text/javascript" href="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">

    function  mya() {
        alert("2")


            window.location.href="${ctx}/zking/zking.shtml";
            <%
            request.getSession().setAttribute("addr","add");
            %>
    }
</script>

<body>
用户名：<input type="text" name="name" id="name"><br>
密码：<input type="password" name="pwd" id="pwd"><br>

<button onclick="mya()">登录</button>
</body>
</html>
