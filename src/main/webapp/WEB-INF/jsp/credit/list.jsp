<%--
  Created by IntelliJ IDEA.
  User: hyyd
  Date: 2019/5/5
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="/common/head.jsp"%>
    <%@taglib prefix="t" uri="http://www.springframework.org/tags" %>
    <title>会员信用管理</title>
</head>
<body>

<f:form action="${ctx}/credit/user/listUser" method="post" modelAttribute="user">
    书名:<f:input path="pUsername"></f:input>
         <input type="submit" value="查询">
</f:form>

<table width="100%" border="1">
    <tr style="text-align: center">
        <td>Id</td>
        <td>用户名</td>
        <td>推荐人</td>
        <td>状态</td>
        <td>Vip等级</td>
        <td>资金</td>
        <td>可用资金</td>
        <td>信用</td>
        <td>操作</td>
    </tr>
    <c:forEach var="v" items="${listUser}">
        <tr style="text-align: center">
            <td>${v.pUserid}</td>
            <td>${v.pUsername}</td>
            <td>${v.pInvite}</td>
            <td>${v.pStatus}</td>
            <td>${v.pVip}</td>
            <td><fmt:formatNumber value="${v.pCapital}"></fmt:formatNumber></td>
            <td><fmt:formatNumber value="${v.pUsable}"></fmt:formatNumber></td>
            <td>${v.pCredit}</td>
            <td>
                <a style="text-decoration:none" href="${ctx}/credit/user/Load?pUserid=${v.pUserid}">修改信用度</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
