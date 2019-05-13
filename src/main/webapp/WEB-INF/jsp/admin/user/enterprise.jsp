<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>企业用户管理</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
   <%-- <link rel="stylesheet" href="${ctx}/admin/css/bootstrap.min.css">--%>
    <link href="${ctx}/admin/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/style.css"/>
    <script type="text/javascript" src="${ctx}/admin/js/jquery2.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/bootstrap.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/ckform.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/common.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/dropdown.js"></script>
    <script src="${ctx}/js/area.js" type="text/javascript"></script>


    <link href="${ctx}/fonts/**">
</head>
<body>

<script type="text/javascript">
    var Gid = document.getElementById;
    var showArea = function () {
        Gid('show').innerHTML = "<h3>省" + Gid('s_province').value + " - 市" +
            Gid('s_city').value + " - 县/区" +
            Gid('s_county').value + "</h3>"
    }
</script>

<div class="form-group" style="width: 100%;text-align: center; margin-top: 20px;">
    <f:form class="form-inline" action="${ctx}/admin/listorganization" modelAttribute="organization" method="get"
            style="margin: 0px;display: inline;">
        <label id="oOrganization" >机构用户名:</label>
        <input type="text" class="form-control"  name="oOrganization" placeholder="机构用户名">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></span></button>
    </f:form>
    <button onclick="Loadtype()" class="btn btn-default" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>机构名称</th>
        <th>机构类型</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${organization}" var="o">
        <tr>
            <td>${o.oOid}</td>
            <td>${o.oOrganization}</td>
            <c:forEach items="${o.institutionalTypeList}" var="i">
                <c:if test="${i.iTypeid==1}">
                    <td>${i.iTypename}</td>
                </c:if>
                <c:if test="${i.iTypeid==2}">
                    <td>${i.iTypename}</td>
                </c:if>
                <c:if test="${i.iTypeid==3}">
                    <td>${i.iTypename}</td>
                </c:if>
                <c:if test="${i.iTypeid==4}">
                    <td>${i.iTypename}</td>
                </c:if>
                <c:if test="${i.iTypeid==5}">
                    <td>${i.iTypename}</td>
                </c:if>
                <c:if test="${i.iTypeid==6}">
                    <td>${i.iTypename}</td>
                </c:if>

            </c:forEach>
            <td width="150px">
                <a href="javascript:void(0);" onclick="del('${o.oOid}')" style="margin-right: 10px;" title="删除"><span
                        class="glyphicon glyphicon-trash"></span></a>
                <a href="javascript:void(0);"  data-dismiss="modal"
                   data-toggle="modal" onclick="mya('${o.oOid}')"
                   data-target="#drdc" style="margin-right: 10px;" title="修改"><span class="glyphicon glyphicon-pencil"></span>
                </a>
                <a href="javascript:void(0);" onclick="myorg('${o.oOid}')" data-dismiss="modal"
                   data-toggle="modal" data-target="#dr" class="" title="查看用户"><span class="glyphicon glyphicon-search"></span> </a>
            </td>
        </tr>

    </c:forEach>
</table>

<script type="text/javascript">

    function mya(index){
        alert(index)
        var url ="http://localhost:8080/MOOC/admin/load";

        var json ={"oOid":index};
        alert(json)
      $.ajax({
          url:url,
          type: "post",
          data: json,
          dataType:"json",
          success: function (data) {
             // $("#select_k1 option").remove();
              var str="";
              //if(data.institutionalTypeList.length !=0){
                 // $("#select_k1 option").remove();
              //}
              for (var o = 0; o < data.institutionalTypeList.length; o++) {
                  $("#select_k1 option").remove();
              }
              //else{
              for(var i=0;i< data.institutionalTypeList.length;i++){
                      $("#oname").val(data.oOrganization);
                      $("#oLinkman").val(data.oLinkman);
                      if(data.oSex== '男'){
                          $("input[type=radio][name=oSex][value='男']").attr("checked",'checked');
                      }else if(data.oSex== '女'){
                          $("input[type=radio][name=oSex][value='女']").attr("checked",'checked');

                      }
                      $("#oOid").val(data.oOid);
                      $("#oPhone").val(data.oPhone);
                      $("#oFixedNumber").val(data.oFixedNumber);
                      $("#oEmail").val(data.oEmail);
                      $("#oInvite").val(data.oInvite);
                      $("#oPassword").val(data.oPassword);

                     str += "<option  value=" + data.institutionalTypeList[i].iTypeid + ">" + data.institutionalTypeList[i].iTypename + "</option>";
                  }

              $("#select_k1").append(str);
              //}
          }

      })

    }

    function myb(){
        var url ="http://localhost:8080/MOOC/admin/update";
        var s_province=$("#s_province").val();
        var s_city=$("#s_city").val();
        var addr=s_province+s_city;
        var json ={"oOid":$("#oOid").val(),
            "oOrganization":$("#oname").val(),
            "oPassword":$("#oPassword").val(),
            "oLinkman":$("#oLinkman").val(),
            "oPhone":$("#oPhone").val(),
            "oFixedNumber":$("#oFixedNumber").val(),
            "oEmail":$("#oEmail").val(),
            "oInvite":$("#oInvite").val(),
            "oSex":$('input[name=oSex][checked]').val(),
            "oAddress":addr
        };



        $.ajax({
            url:url,
            type: "get",
            data: json,
            dataType:"json",
            success: function (data) {
                if(data.status==1){
                    alert(data.message);
                    window.location.href="http://localhost:8080/MOOC/admin/listorganization";
                }
                else {//如果验证失败,则 显示错误信息
                    alert(data.message);
                    window.location.href="http://localhost:8080/MOOC/admin/listorganization";
                }
            }

        })

    }
</script>
<z:page pageBean="${pageBean}"/>








<div class="modal fade" data-backdrop="false" id="dr" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">详情</div>
            <div class="modal-body">
                <form class="form-group">
                    <table class="table" id="table110">


                    </table>

                    <div class="modal-footer">
                        <button class="btn btn-success" data-dismiss="modal">返回</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>





<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">机构注册</div>
            <div class="modal-body">
               <f:form class="form-group"   id="dh"  method="get">
                    <div id="login2" class="left_form fl">
                            <table class="table">
                                <tr>
                                    <td>
                                        <lable>机构用户名:</lable>
                                    </td>
                                    <td>
                                        <input type="hidden" id="oOid" >
                                        <input type="text" id="oname" name="oOrganization" class="form-control" value="请输入机构用户名"
                                               onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '请输入机构用户名';}"></td>
                                </tr>

                                <tr>
                                    <td>机构类型:</td>
                                    <td><select name="oInstitutionalType" id="select_k1"  class="xla_k">
                                            <option  value="0">---类型---</option>
                                            <%--<option value="3">民营企业</option>--%>
                                            <%--<option value="4">政府单位</option>--%>
                                            <%--<option value="5">社会团体</option>--%>
                                            <%--<option value="6">慈善机构</option>--%>
                                    </select></td>
                                </tr>


                                <tr>
                                    <td>
                                        <lable>办公所在地:</lable>
                                    </td>
                                    <td>
                                        <div class="info">
                                            <div>
                                                <select id="s_province" name="s_province"></select>
                                                <select id="s_city" name="s_city"></select>
                                                <script class="resources library" src="${ctx}/js/area.js"
                                                        type="text/javascript"></script>

                                                <script type="text/javascript">
                                                    _init_area();
                                                </script>
                                            </div>
                                            <div id="show"></div>
                                        </div>

                                    </td>
                                </tr>

                                <tr>
                                    <td>
                                        <lable>联系人姓名:</lable>
                                    </td>
                                    <td><input type="text"  class="form_control_name" id="oLinkman" name="oLinkman" value="真实姓名"
                                               onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '真实姓名';}">
                                        <input type="radio"  value="男" name="oSex">先生
                                        <input type="radio"  value="女" name="oSex">女士
                                    </td>
                                </tr>

                                <tr>
                                    <td>
                                        <lable>手机号:</lable>
                                    </td>
                                    <td><input type="text" class="form-control" id="oPhone" name="oPhone" value="请输入手机号"
                                               onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '请输入手机号';}">
                                    </td>
                                    <td></td>
                                </tr>

                                <tr>
                                    <td>
                                        <lable>固定号码:</lable>
                                    </td>
                                    <td><input type="text" class="form-control" id="oFixedNumber" name="oFixedNumber" value="选填" onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>


                                <tr>
                                    <td>
                                        <lable>邮箱:</lable>
                                    </td>
                                    <td><input type="text" class="form-control" id="oEmail" name="oEmail" value="选填" onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>


                                <tr>
                                    <td>
                                        <lable>推荐人:</lable>
                                    </td>
                                    <td><input type="text" class="form-control" id="oInvite" name="oInvite" value="选填" onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '选填';}">
                                    </td>

                                </tr>

                                <tr>
                                    <td>
                                        <lable>密码:</lable>
                                    </td>
                                    <td><input type="password" class="form-control" id="oPassword" name="oPassword" value="请输入密码" onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '请输入密码';}">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <lable>确认密码:</lable>
                                    </td>
                                    <td><input type="password" class="form-control " name="password"   value="请再次输入密码"
                                               onfocus="this.value = '';"
                                               onblur="if (this.value == '') {this.value = '请再次输入密码';}">
                                    </td>
                                </tr>
                                <tr>

                                    <td colspan="3"><input type="checkbox" name="" value=""/>
                                        <span>我已阅读并同意ppp在线的<a href=""><span
                                                style="color:#29A7E1;">《服务条款》</span></a> </span></td>
                                </tr>
                                <td colspan="3">

                                    <button class="btn btn-success" onclick="myb()">修改</button>
                                    <button class="btn btn-success" id="but2"  onclick="sub('${ctx}/admin/addenterpise')" type="button" >确定</button>
                                    <button class="btn btn-success" data-dismiss="modal">取消</button>
                                </td>
                            </table>
                    </div>


                    <div class="modal-footer">

                    </div>
                </f:form>
            </div>

        </div>
    </div>

</div>

<script type="text/javascript">

    function sub(url){
        alert(url);
        $("#but2").action=url;
        $("#but2").submit();
    }


    function del(oid){
        alert(oid);
        $.ajax({
            url:"http://localhost:8080/MOOC/admin/delenterpise",
            type: "post",
            data: {oOid:oid},
            success: function (data) {
                if(data.status==1){
                    alert(data.message);
                    window.location.href="http://localhost:8080/MOOC/admin/listorganization";
                }
                else {//如果验证失败,则 显示错误信息
                    alert(data.message);
                    window.location.href="http://localhost:8080/MOOC/admin/listorganization";
                }
            }
        })


    }

    function Loadtype(){
        //alert("方法进入了");
        var iTypename = "";
        //$("#s_province").val("");
        //$("#s_city").val("");
        $("#oname").val("");
        $("#oLinkman").val("");
        $("#oOid").val("");
        $("#oPhone").val("");
        $("#oFixedNumber").val("");
        $("#oEmail").val("");
        $("#oInvite").val("");
        $("#oPassword").val("");

        $.ajax({
            url: "http://localhost:8080/MOOC/admin/listType",
            type: "post",
            data: {iTypename: iTypename},
            success: function (data) {
                //alert(data.length);
               // for (var o = 0; o < data.length; o++) {
                 $("#select_k1 option").remove();
                //}
                $.each(data, function (index, res) {
                    var str = "<option value=" + res.iTypeid + ">" + res.iTypename + "</option>";
                    $("#select_k1").append(str);
                })
            },
            error: function () {
                alert("错误！")
            }

        })
    }



    function myorg(oid){
        $.ajax({
            url:"http://localhost:8080/MOOC/admin/selectOrganization",
            type: "post",
            data: {oOid:oid},
            success: function (data) {
                //for (var o = 0; o < data.length; o++) {
                //$("#table110 tr").remove();
                // }
                $.each(data,function(index, org){
                    var str ="";
                    for(var i=0;i< org.institutionalTypeList.length;i++){
                        str += " <tr><td><label>机构用户名:</label></td><td>" + org.oOrganization + "</td></tr>";
                        str += "<tr><td><label>密码:</label></td><td>" + org.oPassword + "</td></tr>";
                        str += "<tr><td><label>机构类型:</label></td><td><select  id='select_k1'  class='xla_k'><option  value="+org.institutionalTypeList[i].iTypeid+">" +org.institutionalTypeList[i].iTypename + "</option></select></td></tr>";

                        str += "<tr><td><label>地址:</label></td><td>" + org.oAddress + "</td></tr>";

                        str +=  "<tr><td><label>联系人姓名:</label></td><td>" + org.oLinkman + "</td></tr>";

                        str += "<tr><td><label>性别:</label></td><td>" + org.oSex + "</td></tr>";
                        str += "<tr><td><label>手机号码:</label></td><td>" + org.oPhone + "</td></tr>";
                        str +="<tr><td><label>固定号码:</label></td><td>" + org.oFixedNumber + "</td></tr>";
                        str += "<tr><td><label>邮箱:</label></td><td>" + org.oEmail + "</td></tr>";
                        str += "<tr><td><label>推荐人:</label></td><td>" + org.oInvite + "</td></tr>";
                    }
                    $("#table110").html(str);
               })
            },
            error: function () {
                alert("错误！")
            }
        });

    }


</script>

<script src="${ctx}/admin/js/jquery.min.js"></script>
<script src="${ctx}/admin/js/bootstrap-tooltip.js"></script>
<script src="${ctx}/admin/js/bootstrap-popover.js"></script>
<script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
<script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
<script src="${ctx}/admin/js/bootstrap.min.js"></script>

</body>
</html>
