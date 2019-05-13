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
        <form action="${ctx}/credit/user/BorrowerUpdate" method="post" modelAttribute="borrower">
        <td><input readonly="readonly" type="text" name="bId" value="${borrowerLoad.bId}"/></td>
        <td>借款名称</td>
        <td><input disabled="disabled" type="text" name="bName" value="${borrowerLoad.bName}"/></td>
        <td>申请人</td>
        <td><input readonly="readonly" type="text" name="bUsername" value="${borrowerLoad.bUsername}"/></td>
        <td>借款金额</td>
        <td><input readonly="readonly" type="text" name="bMoney" value="${borrowerLoad.bMoney}"/></td>
    </tr>
    <tr style="text-align: center">
        <td>借款利息率</td>
        <td><input readonly="readonly" type="text" name="bRate" value="${borrowerLoad.bRate}"/></td>
        <td>借款期限</td>
        <td><input readonly="readonly" type="text" name="bMoneyDeadline" value="${borrowerLoad.bMoneyDeadline}"/></td>
        <td>手机号码</td>
        <td><input readonly="readonly" type="text" name="bPhone" value="${borrowerLoad.bPhone}"/></td>
        <td>房屋</td>
        <td><input readonly="readonly" type="text" name="bHouse" value="${borrowerLoad.bHouse}"/></td>
    </tr>
    <tr style="text-align: center">
        <td>总价值</td>
        <td><input readonly="readonly" type="text" name="bTotalValue" value="${borrowerLoad.bTotalValue}"/></td>
        <td>借款用途</td>
        <td><input readonly="readonly" type="text" name="bUse" value="${borrowerLoad.bUse}"/></td>
        <td>借款描述</td>
        <td><input readonly="readonly" type="text" name="bDescribe" value="${borrowerLoad.bDescribe}"/></td>
        <td>借款情况</td>
        <td><input readonly="readonly" type="text" name="bCondition" value="${borrowerLoad.bCondition}"/></td>
    </tr>
    <tr style="text-align: center">
        <td>借款类型</td>
        <td><input readonly="readonly" type="text" name="bBorrowerType" value="${borrowerLoad.bBorrowerType}"/></td>
        <td>已有投标数量</td>
        <td><input readonly="readonly" type="text" name="bBidcount" value="${borrowerLoad.bBidcount}"/></td>
        <td>状态</td>
        <td><input  type="text" name="bStatus" value="${borrowerLoad.bStatus}"/></td>
    </tr>
</table>

            <input type="submit" name="bStatus" value="通过"/>
</form>
<form action="${ctx}/credit/user/UpdatebStatus" method="post">
    <input readonly="readonly" type="hidden" name="bId" value="${borrowerLoad.bId}"/>
            <button type="submit" name="bStatus"/>未通过
</form>



</body>
</html>
