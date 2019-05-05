<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>管理员管理</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">管理员:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="管理员">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
    <button  class="btn btn-default" title="注册管理员" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">管理员</div>
            <div class="modal-body">
                <form class="form-group">
                    <label>管理员账号</label>
                    <input class="form-control" placeholder="输入管理员账号可邮箱/手机号"  />
                    <label>密码</label>
                    <input class="form-control" placeholder="密码" />
                    <label>确认密码</label>
                    <input class="form-control" placeholder="确认密码" />

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit">确定</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>





<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>类型名称</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>不可用</td>
        <td width="150px">
            <a href="#" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="#" style="margin-right: 10px;" title="更改状态" data-dismiss="modal" data-toggle="modal" data-target="#drd"><span class="glyphicon glyphicon-cog"></span></a>
        </td>
    </tr>
</table>


<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">更改状态</div>
            <div class="modal-body">
                <form class="form-group">
                    <label>管理员账号:&nbsp;</label>
                    <span>sssss</span>
                    <div>
                        <form>
                            <input type="radio"  name="str"  value="0"/>启动
                            <input type="radio" name="str" value="1"/>不可用
                            <div class="modal-footer">
                                <button class="btn btn-success" type="submit">确定</button>
                                <button class="btn btn-success" data-dismiss="modal">取消</button>
                            </div>
                        </form>
                    </div>



                </form>
            </div>

        </div>
    </div>

</div>

</body>
</html>

