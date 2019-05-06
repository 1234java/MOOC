<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>企业用户管理</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<body>

<div class="form-group" style="width: 100%;text-align: center; margin-top: 20px;"">
<form class="form-inline" style="margin: 0px;display: inline;">
    <label for="exampleInputEmail1">机构用户名:</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="机构用户名">
    <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
</form>
<button  class="btn btn-default" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">机构注册</div>
            <div class="modal-body">
                <form class="form-group">
                    <div id="login2" class="left_form fl" >
                        <form>
                            <table class="table">
                                <tr>
                                    <td><lable>机构用户名:</lable></td>
                                    <td><input type="text" class="form-control" value="请输入机构用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入机构用户名';}"></td>
                                </tr>

                                <tr>
                                    <td>机构类型:</td>
                                    <td><select name="select" id="select_k1" class="xla_k">
                                        <option value="国营企业">国营企业</option>
                                        <option value="民营企业">民营企业</option>
                                        <option value="政府单位">政府单位</option>
                                        <option value="社会团体">社会团体</option>
                                        <option value="慈善机构">慈善机构</option>
                                    </select></td>
                                </tr>


                                <tr>
                                    <td><lable>办公所在地:</lable></td>
                                    <td><select name="select" id="form_lb_diqu" class="form_lb_diqu">
                                        <option value="国营企业">北京</option>
                                    </select><span style="margin:auto 5px;color:#808080;">省</span>
                                        <select name="select" id="form_lb_diqu" class="form_lb_diqu">
                                            <option value="国营企业">北京</option>
                                        </select><span style="margin:auto 5px;color:#808080;">市</span></td>
                                </tr>

                                <tr>
                                    <td><lable>联系人姓名:</lable></td>
                                    <td><input type="text" class="form_control_name" value="真实姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '真实姓名';}">
                                        <input type="radio" value="先生" name="men">先生
                                        <input type="radio" value="女士" name="women">女士</td>
                                </tr>

                                <tr>
                                    <td><lable>手机号:</lable></td>
                                    <td>	<input type="text" class="form-control" value="请输入手机号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入手机号';}">
                                    </td>
                                    <td></td>
                                </tr>

                                <tr>
                                    <td><lable>固定号码:</lable></td>
                                    <td>	<input type="text" class="form-control" value="选填" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>


                                <tr>
                                    <td><lable>邮箱:</lable></td>
                                    <td>	<input type="text" class="form-control" value="选填" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>



                                <tr>
                                    <td><lable>推荐人:</lable></td>
                                    <td>	<input type="text" class="form-control" value="选填" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>

                                <tr>
                                    <td><lable>密码:</lable></td>
                                    <td><input type="text" class="form-control" value="请输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入密码';}">
                                    </td>
                                </tr>
                                <tr>
                                    <td><lable>确认密码:</lable></td>
                                    <td>	<input type="text" class="form-control " value="请再次输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请再次输入密码';}">
                                    </td>
                                </tr>
                                <tr>

                                    <td colspan="3"><input type="checkbox" name="" value="" />
                                        <span>我已阅读并同意ppp在线的<a href=""><span style="color:#29A7E1;">《服务条款》</span></a> </span></td>
                                </tr>
                                <td colspan="3">
                                    <button class="btn btn-success" type="submit" >确定</button>
                                    <button class="btn btn-success"  data-dismiss="modal">取消</button>
                                </td>
                            </table>
                        </form>
                    </div>






                    <div class="modal-footer">

                    </div>

                </form>
            </div>

        </div>
    </div>

</div>


<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>机构名称</th>
        <th>机构类型 </th>
        <th>操作</th>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td width="150px">
            <a href="#" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="#" style="margin-right: 10px;" title="修改"><span class="glyphicon glyphicon-pencil"></span> </a>
            <a href="#" class="" title="查看用户"><span class="glyphicon glyphicon-search"></span> </a>
        </td>
    </tr>
</table>





</body>
</html>
