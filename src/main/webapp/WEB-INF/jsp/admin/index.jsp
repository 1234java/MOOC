<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/3
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>理财借贷网站</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <link href="${ctx}/admin/css/adminStyle.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/admin/css/adminindex.css" rel="stylesheet" type="text/css" />

    <title>理财借贷管理系统</title>
    <script type="text/javascript" src="${ctx}/admin/js/jquery1.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function() {
                $(".div2").click(
                    function() {
                        $(this).next("div").slideToggle("slow").siblings(".div3:visible").slideUp("slow");
                    });
            });
        function openurl(url) {
            var rframe = parent.document.getElementById("rightFrame");
            rframe.src = url;
        }
    </script>

    <style>

    </style>
</head>
<body>

<div class="top1">
    <marquee scrollAmount=2 width=300>数据无价，请谨慎操作！</marquee>
</div>
<div class="top2">
    <div class="logo">
        <img src="${ctx}/admin/images/admin_logo.png" title="在哪儿" />
    </div>
    <div class="title" >
        <h3>理财借贷后台管理系统</h3>
    </div>
    <div class="fr top-link">
        <a href="admin_list.html" target="mainCont" title="DeathGhost"><i
                class="adminIcon"></i><span>管理员：DeathGhost</span></a>
    </div>
</div>
${ctx}
<div class="left">
    <div class="div1">
        <div class="left_top">
            <img src="${ctx}/admin/images/bbb_01.jpg"><img src="${ctx}/admin/images/bbb_02.jpg" id="2">
            <img src="${ctx}/admin/images/bbb_03.jpg"><img src="${ctx}/admin/images/bbb_04.jpg">
        </div>

        <div class="div2">
            <div class="spgl"></div>
            系统管理
        </div>
        <div class="div3">
            <li><a class="a" href="javascript:void(0);"
                   onClick="openurl('videoQuery.html');">系统字典</a></li>
            <li><a class="a" href="javascript:void(0);"
                   onClick="openurl('uservideoQuery.html');">管理后台用户</a></li>

        </div>
        <div class="div2">
            <div class="spgl"></div>
            用户账号管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('${ctx}/admin/userindex');">账号管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('userdocumentQuery.html');">用户文档列表</a></li>

            </ul>
        </div>
        <div class="div2">
            <div class="spgl"></div>
            用户认证管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('classQuery.html');">认证管理</a></li>

            </ul>
        </div>


        <div class="div2">
            <div class="gggl"></div>
            用户授信管理
        </div>
        <div class="div3">

            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('useredit.html');">用户借贷资料管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('deletecomment.html');">用户信用管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('useredit.html');">用户额度管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('useredit.html');">举报信息管理</a></li>

            </ul>

        </div>

        <div class="div2">
            <div class="gggl"></div>
            会员授信管理
        </div>
        <div class="div3">

            <ul>
                <li>
                    <a class="a" href="javascript:void(0);" onClick="openurl('${ctx}/credit/user/listUser');">会员信用管理</a>
                </li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('deletecomment.html');">会员额度管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('useredit.html');">举报信息管理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('useredit.html');">会员借贷资料管理</a></li>

            </ul>

        </div>

        <div class="div2">
            <div class="yhgl"></div>
            申请管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('studentQuery.html');">借贷申请处理</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('teacherQuery.html');">资金登记情况</a></li>
            </ul>
        </div>

        <div class="div2">
            <div class="pjgl"></div>
            借贷管理
        </div>
        <div class="div3">
            <ul>

                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('${ctx}/adminBorrowing/listBorrowingReviewStatus');">等待初审的借贷</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('afficheAdd.html');">还款中的借贷</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('afficheQuery.html');">发布新借贷</a></li>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('afficheAdd.html');">逾期的借款</a></li>
                <%--<li><a class="a" href="javascript:void(0);"--%>
                       <%--onClick="openurl('${ctx}/adminBorrowing/listBorrowingDetails');">借款明细</a></li>--%>


            </ul>
        </div>

        <div class="div2">
            <div class="pjgl"></div>
          评论管理
        </div>
        <div class="div3">
            <ul>
                <li><a class="a" href="javascript:void(0);"
                       onClick="openurl('afficheQuery.html');">评论删除</a></li>
            </ul>
        </div>

        <a class="a1" href="login.html"><div class="div2">
            <div class="tcht"></div>
            退出后台
        </div></a>
    </div>
</div>

<div class="right">
    <iframe id="rightFrame" name="rightFrame" width="100%" height="100%"
            scrolling="auto" marginheight="0" marginwidth="0" align="center"
            style="border: 0px solid #CCC; margin: 0; padding: 0;"></iframe>
</div>







</body>
</html>
