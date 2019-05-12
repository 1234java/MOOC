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
    <script src="${ctx}/admin/js/PagBean.js"></script>
</head>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">管理员:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="管理员">
        <button type="button" onclick="show()" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
    <button  class="btn btn-default" title="注册管理员" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">管理员</div>
            <div class="modal-body">
                <form class="form-group" action="${ctx}/system/root/add">
                    <label>管理员账号</label>
                    <input class="form-control" name="rName" placeholder="输入管理员账号可邮箱/手机号"  />
                    <label>密码</label>
                    <input class="form-control" type="password" name="rPassword" placeholder="密码" />
                    <label>确认密码</label>
                    <input class="form-control"   placeholder="确认密码" />

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit">确定</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>



<script type="text/javascript">
    $(function () {
        show();
    })

    function  sh(index) {
        if(index=='0'){
            return "可用"
        }else if(index == '1'){
            return "不可用"
        }
    }

    function  load(index) {
        var url ="${ctx}/system/root/load";
       // alert(url)
        var json ={'rId':index}
        $.ajax({
            url:url,
            type:"post",
            data:json,
            dataType:"json",
            async: false,
            success: function(msg) {
                 //alert(msg);
                // alert(msg.length);
            $("#rName").html(msg.rName);
            // language=JQuery-CSS
                $("#rId").val(msg.rId)
                if(msg.rStatus ==0){
                $("input[type=radio][name=rStatus][value='0']").attr("checked",'checked');
                }else if(msg.rStatus ==1){
                    $("input[type=radio][name=rStatus][value='1']").attr("checked",'checked');
                }

            }
        })
    }

    function  su() {
        var url ="${ctx}/system/root/update";
        //alert(url)
        var json ={'rId':$("#rId").val(),'rStatus':$("input:radio:checked").val()}
        //alert(json)
       // alert($("#rId").val())
       // alert($("input:radio:checked").val())
    $.ajax({
            url:url,
            type:"post",
            data:json,
            dataType:"json",
            async: false,
            success: function(msg) {
               // alert(msg);
           // window.location.reload();
        if(msg==1){
            window.location.reload();

        }
            }
        })

    }
    function show(obj) {
        var url ="${ctx}/system/root/list";
       // alert(url);
        var json ={'rName':$("#exampleInputEmail1").val(),"page":obj}
        $.ajax({
            url:url,
            type:"post",
            data:json,
            dataType:"json",
            async: false,
            success: function(msg) {
           // alert(msg);
                ew(msg["pageBean"],'uu')
               // alert(msg.length);
                var t ="";
                for (var i = 0; i <= msg["list"].length ; i++) {
                  //  alert(msg[i].rName);
                    t +="<tr>";
                    t +="<td>"+(i+1)+"</td>";
                    t +="<td>"+ msg["list"][i].rName+"</td>";
                    t +="<td>"+sh( msg["list"][i].rStatus)+"</td>";
                    t +=" <td width='150px'>";
                    t +="  <a href='${ctx}/system/root/del?rId="+ msg["list"][i].rId+"' style='margin-right: 10px;'  title='删除'>";
                    t +="<span class='glyphicon glyphicon-trash'></span>";
                    t +="</a>";
                    t +=" <a href='javascript:void(0);' style='margin-right: 10px;'  onclick='load("+msg["list"][i].rId+")' title='更改状态' data-dismiss='modal' data-toggle='modal' data-target='#drd'>";
                    t +="<span class='glyphicon glyphicon-cog'></span>";
                    t +="</a>";
                    t +="</td>";
                    t +="</tr>";
                 // alert(t)
                    $("#tbody").html(t);
                }
            }
        })
    }
</script>

<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>类型名称</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    <tbody id="tbody"></tbody>


</table>
<div id="uu" align="center"></div>

<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">更改状态</div>
            <div class="modal-body">
                <form class="form-group">
                    <label>管理员账号:&nbsp;</label>
                    <span id="rName">sssss</span>
                    <div>
                        <form  id="s">
                            <input type="radio"  name="rStatus"  value="0"/>启动
                            <input type="radio" name="rStatus" value="1"/>不可用
                            <div class="modal-footer">
                                <input type="hidden"  id="rId" name="rId"  value="0"/>
                                <button class="btn btn-success" type="button" onclick="su()">确定</button>
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

