<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>

<!--借款类型-->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>借款类型</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">类别:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="类别名">
        <button type="button" onclick="show()" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
    <button  class="btn btn-default" title="添加类别" data-dismiss="modal" data-toggle="modal" data-target="#drdc"><span class="glyphicon glyphicon-plus"></span></button>
</div>

<script type="text/javascript">

    $(function(){

        show();

    })
    function show(){
        var url ="${ctx}/system/borrowertypelist";
        //alert(url);
        var h ={'bTypeName':$("#exampleInputEmail1").val()}
        $.ajax({
            url:url,
            type:"post",
            data:h,
            dataType:"json",
            async: false,
            success: function(msg) {
                var s=eval(msg);

                var t="";
                for (var i=0; i<= s.length;i++ ){
                    t+="<tr >";
                    t+="<td>"+s[i].bTypeId+"</td>";
                    t+="<td>"+s[i].bTypeName+"</td>";
                    t+="<td width='150px'>";
                    t+="<a href='${ctx}/system/del?bTypeId="+s[i].bTypeId+"' onclick='s()' style='margin-right: 10px;' title='删除'>";
                    t+="<span class='glyphicon glyphicon-trash'></span>";
                    t+="</a>";
                    t+="</td>";
                    t+="</tr >";
                $("#tbody").html(t)

                }
            }

        })

    }








</script>
<div class="modal fade" data-backdrop="false" id="drdc" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">类型</div>
            <div class="modal-body">
                <form class="form-group" action="${ctx}/system/add">
                    <label>类型名</label>
                    <input class="form-control"  name="bTypeName"/>

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit">确定</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>





<table class="table table-bordered table-hover table-responsive" id="tab">
    <tr>
        <th>编号</th>
        <th>类型名称</th>
        <th>操作</th>
    </tr>
    <tbody id="tbody">


    </tbody>


</table>





</body>
</html>

