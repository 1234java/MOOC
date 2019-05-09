<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/6
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>认证</title>
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

    function df(inde) {
        if(inde == '0'){
            return "未认证";
        }else if(inde == '1'){

            return "认证成功";
        }else if(inde == '2'){

            return "认证失败";
        }
    }

    function show(){
        var url ="${ctx}/attestaion/list";
        // alert(url);
       // var h ={'iTypename':$("#exampleInputEmail1").val()}
        $.ajax({
            url:url,
            type:"post",
            data:"json",
            dataType:"json",
            async: false,
            success: function(msg) {
                 //alert(msg)
                var t="";
                for (var i =0; i<= msg.length;i++){
                    //alert(msg[i].iTypeid)
                    t+="<tr >";
                    t+="<td>"+msg[i].aId+"</td>";
                    t+="<td>"+msg[i].user.pUsername+"</td>";
                    t+="<td>"+msg[i].aName+"</td>";
                    t+="<td>"+df(msg[i].aState)+"</td>";
                    t+="<td width='150px'>";
                    t+="<a href='/system/investment/del?iTypeid="+msg[i].iTypeid+"' style='margin-right: 10px;' title='删除'>";
                    t+="<span class='glyphicon glyphicon-trash'></span>";
                    t+="</a>";
                    t+="<a href='javascript:sho('+msg[i].aId+');' onclick='sho("+msg[i].aId+")' style='margin-right: 10px;' title='认证' data-dismiss='modal' data-toggle='modal' data-target='#drd'>";
                    t+="<span class='glyphicon glyphicon-cog'></span>";
                    t+="</a>";
                    t+="</td>";
                    t+="</tr >";
                    //alert(t);
                    $("#tbody").html(t)
                }
            }

        })

    }


    function sho(index){
        var url ="${ctx}/attestaion/lod";
        // alert(url);
         var h ={'aId':index}
        $.ajax({
            url:url,
            type:"post",
            data:h,
            dataType:"json",
            async: false,
            success: function(msg) {

                alert(msg.aId)
             //   alert(msg.aName)
           // $("#user").html(msg.user.pUsername);
                $("#aId").val(msg.aId);
                $("#aId").html(msg.aId);
                $("#user").html(msg.user.pUsername);
                $("#pname").html(msg.aName);
                $("#psfz").html(msg.aSfz);
                $("#front").src='${ctx}'+msg.aFront;
                //alert('${ctx}'+msg.aFront);
               // $("#reverse").src='msg.aReverse';
                $("#reverse").attr('src','${ctx}'+msg.aReverse)
                $("#message").val( msg.aMessage)  ;
            }

        })

    }





</script>

<body>
<div class="form-group" style="width: 100%;text-align: center;margin-top: 10px;">
    <form class="form-inline" style="margin: 0px;display: inline;">
        <label for="exampleInputEmail1">用户账号:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="用户账号">
        <button type="submit" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></span> </button>
    </form>
</div>




<table class="table table-bordered table-hover table-responsive">
    <tr>
        <th>编号</th>
        <th>用户账号</th>
        <th>真实姓名</th>
        <th>状态</th>
        <th>操作</th>
    </tr>

    <tbody id="tbody"></tbody>
</table>


<div class="modal fade" data-backdrop="false" id="drd" tabindex="-1">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">认证身份</div>
            <div class="modal-body">
                <form class="form-group" action="${ctx}/attestaion/update">
                    <table class="table">
                        <tr>
                            <td><label>用户账号:</label> </td>
                            <td id="user">dddd</td>
                        </tr>
                        <tr>
                            <td><label>用户真实姓名:</label> </td>
                            <td id="pname">李江涛</td>
                        </tr>
                        <tr>
                            <td><label>身份证号码:</label> </td>
                            <td id="psfz">1111111111111111</td>
                        </tr>
                        <tr>
                            <td><label>身份证正面照:</label> </td>
                            <td><img id="front" src="${ctx}/admin/images/12.jpg"  style="width: 300px;height: 150px;"/></td>
                        </tr>
                        <tr>
                            <td><label>身份证反面照:</label> </td>
                            <td><img id="reverse" src="${ctx}/admin/images/12.jpg"   style="width: 300px;height: 150px;"/></td>
                        </tr>
                        <tr>
                            <td>失败原因：</td>
                            <td>
                                <input type="hidden" name="aId"  id="aId">
											<textarea cols="50" id="aMessage" rows="10">


											</textarea>

                            </td>


                        </tr>



                    </table>



                    <div class="modal-footer">
                        <button class="btn btn-success" type="submit" name="aState" id="stat" value="1">审核成功</button>
                        <button class="btn btn-success" type="submit" name="aState" value="2">审核失败</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>
</body>
</html>
