<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>后台登录页面</title>

    <link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>
<div class="wrapper">


    <div class="container">
        <h1>MOOC 后台管理</h1>
        <div style="color: red">${message}</div>
        <form class="form" method="post">
            <input type="text" name="username" placeholder="Username">
            <input type="password" name="password" placeholder="Password"><br>
            <button type="submit" id="login-button" >
                <strong>登陆</strong></button>

        </form>
    </div>

    <ul class="bg-bubbles">
        <li></li>
        <li></li>

    </ul>

</div>
</body>
</html>
