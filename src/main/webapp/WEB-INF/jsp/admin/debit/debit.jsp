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
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">申请人:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="申请人">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
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
    <tr>
        <td>1</td>
        <td>2sss</td>
        <td>2sss</td>
        <td>100</td>
        <td>投资中</td>
        <td width="150px">
            <a href="#" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="#" style="margin-right: 10px;" title="审核" data-dismiss="modal" data-toggle="modal" data-target="#drd"><span class="glyphicon glyphicon-cog"></span></a>
        </td>
    </tr>
</table>

<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">详情</div>
            <div class="modal-body">
                <form class="form-group">
                    <table class="table">
                        <tr>
                            <td><label>申请人:</label> </td>
                            <td>ss</td>
                        </tr>
                        <tr>
                            <td><label>借款金额:</label> </td>
                            <td><input type="text" class="form-control" /> </td>
                        </tr>
                        <tr>
                            <td><label>借款期限:</label> </td>
                            <td>ss</td>
                        </tr>
                        <tr>
                            <td><label>手机号码:</label> </td>
                            <td>ss</td>
                        </tr>
                        <tr>
                            <td><label>数量:</label> </td>
                            <td>50</td>
                        </tr>
                        <tr>
                            <td><label>总价值:</label> </td>
                            <td>500000</td>
                        </tr>
                        <tr>
                            <td><label>借款描述:</label> </td>

                            <td>
                                <textarea cols="50" rows="10"> </textarea>

                            </td>
                        </tr>

                    </table>

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit" name="aState" value="1">初审 审核成功</button>
                        <button class="btn btn-success" type="submit" name="aState" value="0">审核失败</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>







</body>
</html>
