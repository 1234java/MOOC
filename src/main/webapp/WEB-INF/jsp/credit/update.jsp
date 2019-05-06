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



<table width="100%" border="1">
    <tr style="text-align: center">
        <td>Id</td>
        <f:form action="${ctx}/credit/user/Update" method="post" modelAttribute="user">
        <td><input readonly="readonly" type="text" name="pUserid" value="${user1.pUserid}"/></td>
        <td>用户名</td>
        <td><input disabled="disabled" type="text" name="pUsername" value="${user1.pUsername}"/></td>
        <td>推荐人</td>
        <td><input disabled="disabled" type="text" name="pInvite" value="${user1.pInvite}"/></td>
    </tr>
    <tr style="text-align: center">
        <td>状态</td>
        <td><input disabled="disabled" type="text" name="pStatus" value="${user1.pStatus}"/></td>
        <td>Vip等级</td>
        <td><input disabled="disabled" type="text" name="pVip" value="${user1.pVip}"/></td>
        <td>资金</td>
        <td><input disabled="disabled" type="text" name="pCapital" value="${user1.pCapital}"/></td>
    </tr>
    <tr style="text-align: center">
        <td>可用资金</td>
        <td><input disabled="disabled" type="text" name="pUsable" value="${user1.pUsable}"/></td>
        <td>信用</td>

        <td><input type="text" name="pCredit" value="${user1.pCredit}"/></td>
    </tr>
</table>
            <input style="float: right" type="submit" value="修改">
</f:form>
</body>
</html>
