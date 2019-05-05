<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户管理</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<script type="text/javascript">
    function a(n){
        if(n=="0"){
            document.getElementById("login1").style.display="none";

            document.getElementById("login2").style.display="";
            $("form_main_jg").style.className="active";

        }

        if(n=="1"){
            document.getElementById("login2").style.display="none";

            document.getElementById("login1").style.display="";
            $("form_main_jg").style.className="active";

        }

    }

</script>

<body>

<div class="form-group" style="width: 100%;text-align: center;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">用户名:</label>
        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="用户名">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></span> </button>
    </form>
    <button  class="btn btn-default" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1" >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <div class="form_main_grjg_xx">
                    <span id="form_main_gr" class="btn btn-danger  " onclick="a(1)" style="background-color: #009DDE;">个人注册</span>
                    <span id="form_main_jg" onclick="a(0)" class="btn btn-danger">机构注册</span>
                </div>
            </div>

            <div class="modal-body" >
                <div id="login1"    class="left_form fl" style="text-align: center;">
                    <form>
                        <table class="table">
                            <tr>
                                <td><label>手机/邮箱:</label></td>
                                <td>
                                    <input type="text" class="form-control" value="请输入手机/邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入手机/邮箱';}">
                                </td>
                            </tr>
                            <tr>
                                <td><label>密码:</label></td>
                                <td>
                                    <input type="text" class="form-control" style="padding-left: 50px;" value="请输入密码" onfocus="this.value = '';"
                                           onblur="if (this.value == '') {this.value = '请输入密码';}">
                                </td>
                            </tr>
                            <tr>
                                <td>确认密码:</td>
                                <td> <input type="text" class="form-control " value="请再次输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请再次输入密码';}">
                                </td>
                            </tr>

                            <tr>
                                <td>图片验证码:</td>
                                <td><input type="text" class="chcode " value="请输入右边的验证码" onfocus="this.value ='';" onblur="if (this.value == '') {this.value = '请输入右边的验证码';}">
                                    <span>45665</span></td>
                            </tr>

                            <tr>
                                <td>邀请码:</td>
                                <td><input type="text" class="form-control " value="选填" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="3"><input type="checkbox" name="" value="" />
                                    <span>我已阅读并同意ppp在线的<a href=""><span style="color:#29A7E1;">《服务条款》</span></a> </span>
                            </tr>
                            <tr>
                                <td colspan="3">
                                    <button class="btn btn-success" type="submit" >确定</button>
                                    <button class="btn btn-success"  data-dismiss="modal">取消</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>


            <div id="login2" class="left_form fl" style="display:none;text-align: center" >
                <form>
                    <table class="table" style="text-align: center">
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

        </div>





    </div>

</div>


<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>操作</th>
    </tr>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td width="150px">
            <a href="#" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="#" style="margin-right: 10px;" title="修改"><span class="glyphicon glyphicon-pencil"></a>
            <a href="#" class="" title="查看用户"><span class="glyphicon glyphicon-search"> </a>
        </td>
    </tr>
</table>





</body>
</html>
