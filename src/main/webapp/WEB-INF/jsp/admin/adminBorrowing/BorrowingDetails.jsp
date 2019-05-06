<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/4 0004
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta name="description" content="Creating Modal Window with Twitter Bootstrap">
    <link href="${ctx}/admin/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/style.css" />
    <script type="text/javascript" src="${ctx}/admin/js/jquery2.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/jquery2.sorted.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/bootstrap.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/ckform.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/common.js"></script>
    <script type="text/javascript" src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
            background-color:#e9e7ef;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body onload="mya()">
<script type="text/javascript">



    $(function (){
        alert("李江涛傻狗");
     $("#btn1").click(function() {
            var userIdcard = $("#menuname").val();
            alert(userIdcard)
            var li=document.getElementById("listStudent");
            $.ajax({
                url:"http://localhost:8080/MOOC/adminBorrowing/listBorrowingDetails",
                type:"post",
                data:{bName:userIdcard},
                success:function (data) {
                    alert("!!!")
                    for(var o=0;o<data.length;o++){
                        $("#list2").remove();
                    }
                    $.each(data,function (index,res) {
                        alert(res.borrowerTypeList.length);

                            for(var i=0;i<res.borrowerTypeList.length ;i++){
                            var str="<tr id='list2'> <td>"+res.bName+"</td>"+
                                "<td>"+res.bUsername+"</td>"
                                +
                                "<td>"+res.borrowerTypeList[i].bTypeName+"</td>"
                                +
                                "<td>"+res.bMoneyDeadline+"</td>"
                                +
                                "<td>投资中</td>"

                                +"<td><a href=''>详情</a></td></tr>";
                            }
                            $("thead").append(str);

                    })

                },
                error:function () {
                    alert("错误！")
                }
            })

       });
    });


</script>
<f:form id="form1" cssClass="form-inline definewidth m20" action=""   method="get">
    <font color="#33ccff"><strong>借款名称：</strong></font>
    <input type="text" name="bName" id="menuname"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
    <button  type="button"  id="btn1" class="btn btn-primary">查询</button>&nbsp;&nbsp;
</f:form>
<label id="UserError"></label>
<table class="table table-bordered table-hover definewidth m10">
    <thead >
    <tr>
        <th>借款名称</th>
        <th>申请人</th>
        <th>借款类型</th>
        <th>借款期限</th>
        <th>状态</th>
        <th>详情</th>
    </tr>
    </thead>

    <%--<c:forEach var="b" items="${borrower}">--%>
        <%--<tr>--%>
            <%--<td>${b.bName}</td>--%>
            <%--<td>${b.bUsername}</td>--%>
            <%--<c:forEach var="c" items="${b.borrowerTypeList}">--%>
                <%--<td>${c.bTypeName}</td>--%>
            <%--</c:forEach>--%>
            <%--<td>${b.bMoneyDeadline}</td>--%>
            <%--<c:if test="${b.bStatus}==0">--%>
                <%--<td>未处理</td>--%>
            <%--</c:if>--%>
            <%--<td><a href="">详情</a></td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>



</table>

</body>
</html>
<script src="${ctx}/admin/js/jquery.min.js"></script>
<script src="${ctx}/admin/js/bootstrap-tooltip.js"></script>
<script src="${ctx}/admin/js/bootstrap-popover.js"></script>
<script>
    $(function ()
    { $("#xiangqing").popover();
    });
</script>

