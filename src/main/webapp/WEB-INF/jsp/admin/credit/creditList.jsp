<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>信用</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <%--<link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />--%>
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<script type="text/javascript">
    function theId(index){
        var url ="${ctx}/credit/user/Load";
        var Id ={'pUserid':index}
        $.ajax({
            url:url,
            type:"post",
            data:Id,
            dataType:"json",
            async: false,
            success: function(user1) {
               /* alert(user1.pUserid)
                alert(user1.pUsername)*/
                $("#pUserid").val(user1.pUserid)
                $("#pUsername").html(user1.pUsername)
                $("#pCredit").val(user1.pCredit)
            }
        })
    }

</script>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
<f:form class="form-inline" style="margin: 0px;display: inline;" action="${ctx}/credit/user/listUser" method="post" modelAttribute="user">
        <label for="exampleInputEmail1">用户账号:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="pUsername" placeholder="用户账号">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
</f:form>
</div>




<table class="table table-bordered table-hover table-responsive">

    <tr>
        <th>编号</th>
        <th>用户账号</th>
        <th>信用度</th>
        <th>操作</th>
    </tr>
<c:forEach var="v" items="${listUser}">
    <tr>
        <td id="userid">${v.pUserid}</td>
        <td>${v.pUsername}</td>
        <th>${v.pCredit}</th>
        <td width="150px">
            <a href="#" style="margin-right: 10px;"   title="修改信用度" onclick="theId(${v.pUserid});"  data-dismiss="modal" data-toggle="modal" data-target="#drd"><span class="glyphicon glyphicon-pencil"></span></a>
        </td>
    </tr>
</c:forEach>
</table>

<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">信用修改</div>
            <div class="modal-body">
                <form action="${ctx}/credit/user/Update" method="post" class="form-group">
                    <table class="table">
                        <tr>
                            <td><label>用户账号:</label> </td>
                            <input type="hidden" id="pUserid" name="pUserid"/>
                            <td id="pUsername"></td>
                        </tr>
                        <tr>
                            <td><label>信用度:</label> </td>
                            <td><input type="text" class="form-control" id="pCredit"  name="pCredit" /></td>
                        </tr>

                    </table>

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit">确认修改</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>

</body>
</html>
