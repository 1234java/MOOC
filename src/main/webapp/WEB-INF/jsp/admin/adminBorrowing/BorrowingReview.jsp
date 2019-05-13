<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/4 0004
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>


<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="description" content="Creating Modal Window with Twitter Bootstrap">
    <link href="${ctx}/admin/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/style.css"/>
    <script type="text/javascript" src="${ctx}/admin/js/jquery2.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/bootstrap.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/ckform.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/common.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/dropdown.js"></script>
    <link rel="stylesheet" href="${ctx}/admin/css/bootstrap.min.css">

    <link href="${ctx}/fonts/**">

    <style type="text/css">
        body {
            padding-bottom: 40px;
            background-color: #e9e7ef;
        }

        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<script type="text/javascript">


    //$(function () {
    // $("#btn1").click(function ()
    function mya(bId) {
        var userIdcard = bId;
        //alert(userIdcard)
        var li = document.getElementById("listStudent");
        $.ajax({
            url: "http://localhost:8080/MOOC/adminBorrowing/selectBorrower",
            type: "post",
            data: {bId: userIdcard},
            success: function (data) {
                //alert(data.length )
                for (var o = 0; o < data.length; o++) {
                    $("#table110 tr").remove();
                }
                $.each(data, function (index, res) {
                    for (var i = 0; i < res.borrowerTypeList.length; i++) {
                        for (var k = 0; k < res.conditionTypeList.length; k++) {
                            var str = " <tr><td><label>借款名称:</label></td><td>" + res.bName + "</td></tr>" +
                                "<tr><td><label>申请人:</label></td><td>" + res.bUsername + "</td></tr>"
                                +
                                "<tr><td><label>借款金额:</label></td><td>" + res.bMoney + "</td></tr>"
                                +
                                "<tr><td><label>借款利息率:</label></td><td>" + res.bRate + "%</td></tr>"
                                +
                                "<tr><td><label>借款期限:</label></td><td>" + res.bMoneyDeadline + "</td></tr>"

                                + "<tr><td><label>手机号码:</label></td><td>" + res.bPhone + "</td></tr>"
                                + "<tr><td><label>房屋:</label></td><td>" + res.bHouse + "</td></tr>"
                                + "<tr><td><label>总价值:</label></td><td>" + res.bTotalValue + "</td></tr>"
                                + "<tr><td><label>借款用途:</label></td><td>" + res.bUse + "</td></tr>"
                                + "<tr><td><label>借款描述:</label></td><td>" + res.bDescribe + "</td></tr>"
                                + "<tr><td><label>借款情况:</label></td><td>" + res.conditionTypeList[k].conditionTypeName + "</td></tr>"
                                + "<tr><td><label>借款类型:</label></td><td>" + res.borrowerTypeList[i].bTypeName + "</td></tr>"
                                + "<tr><td><label>已有投标数量:</label></td><td>" + res.bBidcount + "</td></tr>";
                        }
                    }
                    $(".form-group table").append(str);

                })

            },
            error: function () {
                alert("错误！")
            }
        })
    }

    // });
    //});


</script>
<f:form id="form1" cssClass="form-inline definewidth m20" action="${ctx}/adminBorrowing/listBorrowingDetails"
        modelAttribute="borrower" method="get">
    <font color="#33ccff"><strong>借款名称：</strong></font>
    <input type="text" name="bName" id="menuname" class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
    <input type="hidden" name="bStatus" value="1"/>
    <%--<button  type="button"  id="btn1" class="btn btn-primary">查询</button>&nbsp;&nbsp;--%>
    <button type="submit" class="btn btn-primary">查询</button>
    &nbsp;&nbsp;
</f:form>
<label id="UserError"></label>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>借款名称</th>
        <th>申请人</th>
        <th>借款类型</th>
        <th>借款期限</th>
        <th>状态</th>
        <th>详情</th>
    </tr>
    </thead>


    <c:forEach var="b" items="${borrowers}">
        <tr>
            <td>${b.bName}</td>
            <td>${b.bUsername}</td>
            <c:forEach var="c" items="${b.borrowerTypeList}">
                <td>${c.bTypeName}</td>
            </c:forEach>
            <td><fmt:formatDate value="${b.bMoneyDeadline}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
            <td>
                <c:if test="${b.bStatus==1}">
                    履约中

                </c:if>
                <c:if test="${b.bStatus==0}">
                    投资中

                </c:if>
                <c:if test="${b.bStatus==2}">
                    已还款

                </c:if>
                <c:if test="${b.bStatus==3}">
                    通过

                </c:if>
                <c:if test="${b.bStatus==4}">
                    未通过

                </c:if>
            </td>
            <td>
                <a class="btn btn-info" href="javascript:void(0);" onclick="mya('${b.bId}')" data-dismiss="modal"
                   data-toggle="modal"
                   data-target="#drdc">详情</a>
                <!-- Single button -->
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                        审核<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href="${ctx}/adminBorrowing/updateBorrowerReview?bId=${b.bId}&bStatus=1">履约中</a></li>
                        <li><a href="${ctx}/adminBorrowing/updateBorrowerReview?bId=${b.bId}&bStatus=3">通过</a></li>
                        <li><a href="${ctx}/adminBorrowing/updateBorrowerReview?bId=${b.bId}&bStatus=4">未通过</a></li>
                        <li role="separator" class="divider"></li>
                    </ul>
                </div>

            </td>
        </tr>
    </c:forEach>

</table>

<z:page pageBean="${pageBean}"/>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">详情</div>
            <div class="modal-body">
                <form class="form-group">
                    <table class="table" id="table110">

/*-- jka*/
                    </table>

                    <div class="modal-footer">
                        <button class="btn btn-success" data-dismiss="modal">返回</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>


</body>
</html>

<script src="${ctx}/admin/js/jquery.min.js"></script>
<script src="${ctx}/admin/js/bootstrap-tooltip.js"></script>
<script src="${ctx}/admin/js/bootstrap-popover.js"></script>
<script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
<script src="${ctx}/admin/js/bootstrap.min.js"></script>
<script>
    $(function () {
        $("#xiangqing").popover();
    });
</script>

