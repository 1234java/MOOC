<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>评论管理</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<script type="text/javascript">

    $(function(){

        show();
    })


    function s(time) {
         var dat =new Date(time);
         var year =dat.getFullYear();
         month =dat.getMonth();
         day =dat.getDate()
        hour =dat.getHours();
         min =dat.getMinutes();
         sec=dat.getSeconds();
         var newTime=year+'-'+month+'-'+day+'-'+hour+':'+min+':'+sec;
         return newTime;
    }
    function show(){
        var url ="${ctx}/comment/list";
        //alert(url);
        var h ={'dContent':$("#exampleInputEmail1").val()}
        //alert(h.iTypename);
        //alert(h);
        $.ajax({
            url:url,
            type:"post",
            data:h,
            dataType:"json",
            async: false,
            success: function(msg) {
                //alert(msg);
                var t="";
                for (var i =0; i<= msg.length;i++){
                    //alert(msg[i].iTypeid)
                    t+="<tr >";
                    t+="<td>"+msg[i].dId+"</td>";
                    t+="<td>"+msg[i].user.pUsername+"</td>";
                    t+="<td>"+msg[i].dContent+"</td>";
                    t+="<td>"+s(msg[i].dTime)+"</td>";
                    t+="<td width='150px'>";
                    t+="<a href='${ctx}/comment/del?dId="+msg[i].dId+"'  style='margin-right: 10px;' title='删除'>";
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
        <label for="exampleInputEmail1">评论内容:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="评论内容">
        <button type="button" onclick="show()" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></button>
    </form>
</div>




<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>用户账号</th>
        <th>评论内容</th>
        <th>评论时间</th>
        <th>操作</th>
    </tr>

    <tbody id="tbody">


    </tbody>

</table>

<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">详情</div>
            <div class="modal-body">
                <form class="form-group">
                    <table class="table">
                        <tr>
                            <td><label>用户账号:</label> </td>
                            <td>dddd</td>
                        </tr>
                        <tr>
                            <td><label>详情:</label> </td>
                            <td>
                                <textarea cols="50" rows="10"> </textarea>

                            </td>
                        </tr>

                    </table>

                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit">确认</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>

</body>
</html>
