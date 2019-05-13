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

<f:form action="${ctx}/credit/user/listBorrower" method="post" modelAttribute="borrower">
    借款名称:<f:input path="bName"></f:input>
         <input type="submit" value="查询">
</f:form>

<table width="100%" border="1">
    <tr style="text-align: center">
        <td>Id</td>
        <td>借款名称</td>
        <td>申请人</td>
        <td>借款金额</td>
        <td>借款利息率</td>
        <td>借款期限</td>
        <td>手机号码</td>
        <td>房屋 几套</td>
    </tr>
    <c:forEach var="v" items="${listBorrower}">
    <tr style="text-align: center">
        <td>${v.bId}</td>
        <td>${v.bName}</td>
        <td>${v.bUsername}</td>
        <td>${v.bMoney}</td>
        <td>${v.bRate}</td>
        <td>${v.bMoneyDeadline}</td>
        <td>${v.bPhone}</td>
        <td>${v.bHouse}</td>
    </tr>
    <tr style="text-align: center">
        <td>总价值</td>
        <td>借款用途</td>
        <td>借款描述</td>
        <td>借款情况</td>
        <td>借款类型</td>
        <td>已有投标数量</td>
        <td>操作</td>
    </tr>
        <tr style="text-align: center">
            <td>${v.bTotalValue}</td>
            <td>${v.bUse}</td>
            <td>${v.bDescribe}</td>
            <td>${v.bCondition}</td>
            <td>${v.bBorrowerType}</td>
            <td>${v.bBidcount}</td>
            <td>
                <a style="text-decoration:none" href="${ctx}/credit/user/borrowerLoad?bId=${v.bId}">修改状态</a>
                <a style="text-decoration:none" href="${ctx}/credit/user/DelBorrower?bId=${v.bId}&bStatus=${v.bStatus}">删除</a>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
