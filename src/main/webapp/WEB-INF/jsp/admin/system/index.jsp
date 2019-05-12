<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/5
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />
    <script src="${ctx}/admin/js/jquery-1.7.2.min.js"></script>
    <script src="${ctx}/admin/js/jquery-3.3.1.min.js"></script>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <link href="${ctx}/fonts/**" >
</head>
<body>
<script type="text/javascript">
    $(function(){
        var rframe = document.getElementById("rightFrame");
        rframe.src = "${ctx}/admin/toorganizationtype";
    })

    function openurl(url) {
        var rframe = document.getElementById("rightFrame");
        rframe.src = url;
    }
</script>
<ul class=" nav nav-tabs  nav-justified" >
    <li class="active" ><a href="javascript:void(0);"
                           onClick="openurl('${ctx}/admin/toorganizationtype');">机构类型</a></li>
    <li  ><a href="javascript:void(0);"
             onClick="openurl('${ctx}/admin/toborrowtype');">借款类型</a></li>
   <%-- <li  ><a href="javascript:void(0);"
             onClick="openurl('${ctx}/admin/tocapitaltype');">资金类型</a></li>--%>
    <li  ><a href="javascript:void(0);"
             onClick="openurl('${ctx}/admin/toinvesttype');">投资类型</a></li>
</ul>
<div class="right">
    <iframe id="rightFrame" name="rightFrame" width="100%" height="100%"
            scrolling="auto" marginheight="0" marginwidth="0" align="center"
            style="border: 1px solid #CCC; margin: 0; padding: 0;"></iframe>
</div>

</body>
</html>


</body>
</html>
