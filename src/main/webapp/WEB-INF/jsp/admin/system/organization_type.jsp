<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>

<!-- 机构类型-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>机构类型</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
  <%--  <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />--%>
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
    <script src="${ctx}/admin/js/PagBean.js"></script>
</head>
<script type="text/javascript">

    $(function(){

        show();
    })

    function show(obj){
        var url ="${ctx}/system/institutional/institutionaltylelist";
        //alert(url);
        var h ={'iTypename':$("#exampleInputEmail1").val(),"page":obj}
        //alert(h.iTypename);
        //alert(h);
        $.ajax({
            url:url,
            type:"post",
            data:h,
            dataType:"json",
            async: false,
            success: function(msg) {
                ew(msg["pageBean"],'uu')
                var t="";
                for (var i =0; i<= msg["list"].length;i++){
                    //alert(msg[i].iTypeid)
                    t+="<tr >"
                    t+="<td>"+msg["list"][i].iTypeid+"</td>";
                    t+="<td>"+msg["list"][i].iTypename+"</td>";
                    t+="<td width='150px'>";
                    t+="<a href='${ctx}/system/institutional/del?iTypeid="+msg["list"][i].iTypeid+"' onclick='s()' style='margin-right: 10px;' title='删除'>";
                    t+="<span class='glyphicon glyphicon-trash'></span>";
                    t+="</a>";
                    t+="</td>";
                    t+="</tr >";
                    //alert(t);
                    $("#tbody").html(t)
                }





            }

        })

    }

</script>

<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">类别:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="类别名">
        <button type="button" onclick="show()" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
    <button  class="btn btn-default" title="添加类别" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">类型</div>
            <div class="modal-body">
                <form class="form-group" action="${ctx}/system/institutional/add">
                    <label>类型名</label>
                    <input class="form-control"  name="iTypename"/>

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
        <th>操作</th>
    </tr>
    <tbody id="tbody">


    </tbody>


</table>

<div id="uu" align="center"></div>



</body>
</html>
