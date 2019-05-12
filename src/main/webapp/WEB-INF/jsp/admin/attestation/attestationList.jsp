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
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
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

    function df(inde) {
        if(inde == '0'){
            $("#stat").removeAttr("disabled");
            $("#sta").removeAttr("disabled");
            $("#aMessage").removeAttr("disabled");
            return "未认证";

        }else if(inde == '1'){
            $("#stat").attr({"disabled":"disabled"});
            $("#sta").attr({"disabled":"disabled"});
            $("#aMessage").attr({"disabled":"disabled"});
            return "认证成功";
        }else if(inde == '2'){
            $("#stat").removeAttr("disabled");
            $("#sta").removeAttr("disabled");
            $("#aMessage").removeAttr("disabled");
            return "认证失败";
        }
    }

    function show(obj){
        var url ="${ctx}/attestaion/list";
        // alert(url);
        var json ={'aName':$("#exampleInputEmail1").val(),"page":obj}
        $.ajax({
            url:url,
            type:"post",
            data:json,
            dataType:"json",
            async: false,
            success: function(msg) {
                 //alert(msg)
                ew(msg["pageBean"],'uu')
                var t="";
                for (var i =0; i<= msg["list"].length;i++){
                    //alert(msg[i].user.pUsername)
                    t+="<tr >";
                    t+="<td>"+(i+1)+"</td>";
                    t+="<td>"+msg["list"][i].user.pUsername+"</td>";
                    t+="<td>"+msg["list"][i].aName+"</td>";
                    t+="<td>"+df(msg["list"][i].aState)+"</td>";
                    t+="<td width='150px'>";
                    t+="<a href='${ctx}/attestaion/del?aId="+msg["list"][i].aId+"' style='margin-right: 10px;' title='删除'>";
                    t+="<span class='glyphicon glyphicon-trash'></span>";
                    t+="</a>";
                    t+="<a href='javascript:void(0);' onclick='sho("+msg["list"][i].aId+")' style='margin-right: 10px;' title='认证' data-dismiss='modal' data-toggle='modal' data-target='#drd'>";
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

               // alert(msg.aId)
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
        <label for="exampleInputEmail1">真实姓名:</label>
        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="真实姓名">
        <button type="button" onclick="show()" class="btn btn-default" title="搜索"><span class="glyphicon glyphicon-search"></span> </button>
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
<div id="uu" align="center"></div>

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
                        <button class="btn btn-success" type="submit" name="aState"  id="sta" value="2">审核失败</button>
                        <button class="btn btn-success" data-dismiss="modal">取消</button>
                    </div>

                </form>
            </div>

        </div>
    </div>

</div>
</body>
</html>
