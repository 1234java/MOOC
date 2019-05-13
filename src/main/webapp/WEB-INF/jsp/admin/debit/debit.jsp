<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>借贷审核</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <%--<link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />--%>
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<script type="text/javascript">
    function upstatus(index){
        alert(123)
        var url ="${ctx}/credit/user/borrowerLoad";
        alert(url)
        var Id ={'bId':index}
        $.ajax({
            url:url,
            type:"post",
            data:Id,
            dataType:"json",
            async: false,
            success: function(borrowerLoad) {
                alert(borrowerLoad.bId)
                alert(borrowerLoad.bUsername)
                alert(borrowerLoad.bMoney)
                $("#bId").val(borrowerLoad.bId)
                $("#bbId").val(borrowerLoad.bId)
                $("#bUsername").html(borrowerLoad.bUsername)
                $("#bMoney").html(borrowerLoad.bMoney)
                $("#bPhone").html(borrowerLoad.bPhone)
                $("#bHouse").html(borrowerLoad.bHouse)
                $("#bTotalValue").html(borrowerLoad.bTotalValue)
                $("#bDescribe").html(borrowerLoad.bDescribe)
            }
        })
    }

</script>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
<f:form class="form-inline" style="margin: 0px;display: inline;" action="${ctx}/credit/user/listBorrower" method="post" modelAttribute="borrower">
        <label for="exampleInputEmail1">申请人:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="申请人">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
</f:form>
</div>




<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>借款名称</th>
        <th>申请人</th>
        <th>借款金额</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
<c:forEach var="v" items="${listBorrower}">
    <tr>
        <td>${v.bId}</td>
        <td>${v.bName}</td>
        <td>${v.bUsername}</td>
        <td>${v.bMoney}</td>
        <td>
            <c:choose>
                <c:when test="${v.bStatus == 0}">
                    投资中
                </c:when>
                <c:when test="${v.bStatus == 1}">
                    履约中
                </c:when>
                <c:when test="${v.bStatus == 2}">
                    已还款
                </c:when>
                <c:when test="${v.bStatus == 3}">
                    通过
                </c:when>
                <c:otherwise>
                    未通过
                </c:otherwise>
            </c:choose>
        </td>
        <td width="150px">
            <a href="${ctx}/credit/user/DelBorrower?bId=${v.bId}&bStatus=${v.bStatus}" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="#" style="margin-right: 10px;" title="审核" data-dismiss="modal" data-toggle="modal" data-target="#drd" onclick="upstatus(${v.bId});"><span class="glyphicon glyphicon-cog"></span></a>
        </td>
    </tr>
</c:forEach>
</table>

<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">详情</div>
            <div class="modal-body">
                <form action="${ctx}/credit/user/BorrowerUpdate" method="post" class="form-group">
                    <table class="table">
                        <tr>
                            <td><label>申请人:</label></td>
                            <td id="bUsername">
                            </td>
                        </tr>
                        <tr>
                            <td><label>借款金额:</label> </td>
                            <td id="bMoney"></td>
                        </tr>
                        <tr>
                            <td><label>手机号码:</label> </td>
                            <td id="bPhone"></td>
                        </tr>
                        <tr>
                            <td><label>数量:</label> </td>
                            <td id="bHouse"></td>
                        </tr>
                        <tr>
                            <td><label>总价值:</label> </td>
                            <td id="bTotalValue"></td>
                        </tr>
                        <tr>
                            <td><label>借款描述:</label> </td>
                            <td>
                                <textarea id="bDescribe" name="bDescribe" cols="50" rows="10"> </textarea>
                            </td>
                        </tr>

                    </table>
                    <div class="modal-footer">
                        <input type="hidden" id="bId" name="bId"/>
                        <button class="btn btn-success" type="submit" name="aState" value="1">初审 审核成功</button>
                     </form>

                    <form action="${ctx}/credit/user/UpdatebStatus" method="post" class="form-group">
                    <input type="hidden" id="bbId" name="bId"/>
                        <br>
                    <button class="btn btn-success" type="submit" name="bStatus" value="0">审核失败</button>
                    <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </form>
                    </div>
             </div>



        </div>
    </div>

</div>


</body>
</html>
