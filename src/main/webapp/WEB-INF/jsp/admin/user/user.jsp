<%@ taglib prefix="u" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>用户管理</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <script class="resources library" src="${ctx}/js/area.js" type="text/javascript"></script>


    <link href="${ctx}/fonts/**" >
</head>
<body>

<div class="form-group" style="width: 100%;text-align: center; margin-top: 20px;">
    <form class="form-inline" style="margin: 0px;display: inline;" action="${ctx}/admin/user/listUser" method="post" modelAttribute="user">
        <label for="exampleInputEmail1">用户名:</label>
        <input  name="pUsername" class="form-control" id="exampleInputEmail1" placeholder="用户名">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></span></button>
    </form>
    <button  class="btn btn-default" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>


<script type="text/javascript">
    function mya(index){
        var url ="${ctx}/admin/user/Load";
        // alert(url);
        var json ={'pUserid':index};
        //alert(h.iTypename);
        //alert(h);
        $.ajax({
            url:url,
            type:"post",
            data:json,
            dataType:"json",
            async: false,
            success: function(msg) {
                // alert(msg);
                // alert(msg.pUsername);
                $("#pUserid").val(msg.pUserid);
                $("#pUsername").val(msg.pUsername);
                $("#pPassword").val(msg.pPassword);
                $("#pInvite").val(msg.pInvite);
                if(msg.pVip=='0'){
                    $("#pVip").val( msg.pVip="普通用户");
                }else if(msg.pVip=='1'){
                    $("#pVip").val(msg.pVip="vip");
                }

                $("#pCapital").val(msg.pCapital);
                $("#pUsable").val(msg.pUsable);
                $("#pCredit").val(msg.pCredit);
                $("#pVip1").val(msg.pVip);

                $("#pUserid1").val(msg.pUserid);
                $("#pUsername1").val(msg.pUsername);
                $("#pPassword1").val(msg.pPassword);
                $("#pInvite1").val(msg.pInvite);
                // if(msg.pVip=='0'){
                //     $("#pVip1").val( msg.pVip="普通用户");
                // }else if(msg.pVip=='1'){
                //     $("#pVip1").val(msg.pVip="vip");
                // }
                $("#pCapital1").val(msg.pCapital);
                $("#pUsable1").val(msg.pUsable);
                $("#pCredit1").val(msg.pCredit);
            }

        })

    }

</script>





<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1" >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <div class="form_main_grjg_xx">
                    <span id="form_main_gr" class="btn btn-danger  " >增加</span>
                </div>
            </div>

            <div class="modal-body" >
                <div id="login1"    class="left_form fl" style="text-align: center;">
                    <form action="${ctx}/admin/user/Add" method="post">
                        <table class="table">
                            <tr>
                                <td><label>用户名:</label></td>
                                <td>
                                    <input type="text" class="form-control"  name="pUsername" value="请输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户名';}">
                                </td>
                            </tr>
                            <tr>
                                <td><label>密码:</label></td>
                                <td>
                                    <input type="password" class="form-control" style="padding-left: 50px;" name="pPassword" value="请输入密码" onfocus="this.value = '';"
                                           onblur="if (this.value == '') {this.value = '请输入密码';}">
                                </td>
                            </tr>
                            <tr>
                                <td>邀请人:</td>
                                <td> <input type="text" class="form-control " name="pInvite" value="邀请人" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邀请人';}">
                                </td>
                            </tr>

                            <tr>
                                <td>资金:</td>
                                <td><input type="text" class="chcode " name="pCapital" value="资金" onfocus="this.value ='';" onblur="if (this.value == '') {this.value = '资金';}">
                                   </td>
                            </tr>

                            <tr>
                                <td>可用资金:</td>
                                <td><input type="text" class="form-control " name="pUsable" value="可用资金" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '可用资金';}">
                                </td>
                            </tr>

                            <tr>
                                <td>信用值:</td>
                                <td><input type="text" class="form-control " name="pCredit" value="信用值" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '信用值';}">
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


            <div class="modal-footer">
            </div>

        </div>

    </div>

</div>


<div class="modal fade" data-backdrop="false" id="drdc1" tabindex="-1" >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <div class="form_main_grjg_xx">
                    <span id="form_main_gr1" class="btn btn-danger  " >修改</span>
                </div>
            </div>

            <div class="modal-body" >
                <div id="login11"    class="left_form fl" style="text-align: center;">
                    <form action="${ctx}/admin/user/Update" method="post" >
                        <table class="table">
                            <tr>
                                <td>
                                    <input type="hidden" class="form-control"  id="pUserid" name="pUserid" >
                                </td>
                            </tr>

                            <tr>
                                <td><label>用户名:</label></td>
                                <td>
                                    <input type="text" class="form-control" id="pUsername"  name="pUsername" >
                                </td>
                            </tr>
                            <tr>
                                <td><label>密码:</label></td>
                                <td>
                                    <input type="password" class="form-control" style="padding-left: 50px;" id="pPassword" name="pPassword" >
                                </td>
                            </tr>
                            <tr>
                                <td>邀请人:</td>
                                <td> <input type="text" class="form-control " id="pInvite" name="pInvite" >
                                </td>
                            </tr>

                            <tr>
                                <td>资金:</td>
                                <td><input type="text" class="chcode " id="pCapital" name="pCapital" >
                                </td>
                            </tr>

                            <tr>
                                <td>可用资金:</td>
                                <td><input type="text" class="form-control " id="pUsable" name="pUsable" >
                                </td>
                            </tr>

                            <tr>
                                <td>信用值:</td>
                                <td><input type="text" class="form-control " id="pCredit" name="pCredit" >
                                </td>
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


            <div class="modal-footer">
            </div>

        </div>

    </div>

</div>



<div class="modal fade" data-backdrop="false" id="moda2" tabindex="-1" >
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <div class="form_main_grjg_xx">
                    <span id="form_main_gr2" class="btn btn-danger  " >明细</span>
                </div>
            </div>

            <div class="modal-body" >
                <div id="login12"    class="left_form fl" style="text-align: center;">

                    <form>
                        <table class="table">

                            <tr>
                                <td>
                                    <input type="hidden"  class="form-control" name="pUserid" id="pUserid1">
                                </td>
                            </tr>
                            <tr>
                                <td><label>用户名:</label></td>
                                <td>
                                    <input type="text" disabled="disabled" class="form-control  " name="pUsername" id="pUsername1"  >
                                </td>
                            </tr>


                            <tr>
                                <td>邀请人:</td>
                                <td><input type="text" disabled="disabled" name="pInvite" class="form-control " id="pInvite1"  >
                                </td>
                            </tr>


                            <tr>
                                <td>用户类型:</td>

                                <td><input type="text" disabled="disabled" class="form-control " id="pVip1" name="pVip"  >

                                </td>
                            </tr>


                            <tr>
                                <td>资金:</td>
                                <td><input type="text" disabled="disabled" class="form-control " name="pCapital" id="pCapital1"  >
                                </td>
                            </tr>

                            <tr>
                                <td>可用资金:</td>
                                <td><input type="text" disabled="disabled" class="form-control " name="pUsable" id="pUsable1"  >
                                </td>
                            </tr>

                            <tr>
                                <td>信用值:</td>
                                <td><input type="text"  disabled="disabled" class="form-control " name="pCredit" id="pCredit1"  >
                                </td>
                            </tr>

                            <tr>
                                <td colspan="3">
                                    <button class="btn btn-success"  data-dismiss="modal">退出</button>
                                </td>
                            </tr>
                        </table>
                    </form>

                </div>
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
<c:forEach var="u" items="${listUser}" varStatus="status" >
    <tr>
        <td>${status.index+1}</td>
        <td>${u.pUsername}</td>

        <u:if test="${u.pStatus==0}">
        <td>可编辑</td>
        <td width="150px">
            <a href="${ctx}/admin/user/Del?pUserid=${u.pUserid}" modelAttribute="user" style="margin-right: 10px;" title="删除"><span class="glyphicon glyphicon-trash"></span></a>
            <a href="javascript:void(0);" style="margin-right: 10px;" title="修改"  onclick="mya('${u.pUserid}')" data-dismiss="modal" data-toggle="modal" data-target="#drdc1"><span class="glyphicon glyphicon-pencil"></span> </a>
            <a href="javascript:void(0);" style="margin-right: 10px;" title="查看用户"  onclick="mya('${u.pUserid}')" data-dismiss="modal" data-toggle="modal" data-target="#moda2"><span class="glyphicon glyphicon-search"></span> </a>
        </td>
    </u:if>
        <u:if test="${u.pStatus==1}">
            <td>不可编辑</td>
            <td width="150px">
                <a href="javascript:void(0);" style="margin-right: 10px;" title="查看用户"  onclick="mya('${u.pUserid}')" data-dismiss="modal" data-toggle="modal" data-target="#moda2"><span class="glyphicon glyphicon-search"></span> </a>
            </td>
        </u:if>

    </tr>
</c:forEach>
</table>





</body>
</html>
