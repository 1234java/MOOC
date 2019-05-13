<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/12
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>公告列表</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/css/styles.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/style.css">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <%--<link rel="stylesheet" type="text/css" href="${ctx}/admin/css/bootstrap.min.css" />--%>
    <script src="${ctx}/admin/js/bootstrap.min.js"></script>
    <!-- <link rel="stylesheet/less" type="text/css" href="css/style.less" /> -->
    <script type="text/javascript" src="${ctx}/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${ctx}/js/all.js"></script>
    <script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
    <!--[if IE 6]>
    <script src="${ctx}/js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input,span, p');
    </script>
    <![endif]-->
</head>
<body>
<!-- header start -->
<div class="zxcf_top_wper">
    <!-- header start -->
    <div id="gy_top_wper">
        <div class="gy_top px1000 clearfix">
            <div class="gy_top_l fl"><img src="images/service_pic.png" alt=""><span style="color:#999999;padding-left:10px;">在线客服:</span><img style="padding-left:10px;" src="images/service_photo.png" alt=""><span style="color: #5DB9E9;padding-left:10px;">客服热线：400-660-8612</span></div>
            <div class="gy_top_r fr clearfix">
                <%=request.getSession().getAttribute("addr")%>
                <a href="">登录</a><span>|</span>
                <a href="register.html">注册</a><span>|</span>
                <a href="serveguide.html">新手指导</a><span>|</span>
                <a href="">帮助</a>
            </div>
        </div>
    </div>
    <!-- end top -->

    <div id="gy_nav_wper">
        <div class="gy_nav px1000 clearfix">
            <div class="gy_nav_l fl"><img src="images/gy_logo.png" alt=""></div>
            <ul class="gy_nav_c fr clearfix">
                <li class="gy_nav_c_ts" style="z-index:1000;">
                    <a href="invest.html"> 我要投资</a>
                    <ul class="gycf_perinfo">
                        <div class="gy_nav_c_cp"><img src="images/gy_down_cpr.png"></div>
                        <div class="gycf_perinfo_pic">
                            <img src="images/gy_cp_footer_wper_xiala_bor.png"></div>
                        <li><a href="">PPP信投</a></li>
                        <li><a href="">政府（存量）债</a></li>
                        <li><a href="">新手专享</a></li>
                        <li><a href="">新手专享</a></li>
                    </ul>
                </li>
                <li><a href="${ctx}/zking/jsp">我要借款</a></li>
                <li><a href="activity.html">活动专区</a></li>
                <li><a href="">业务模式</a></li>
                <li><a href="safety.html">安全保障</a></li>
                <li><a href="aboutus.html">关于我们</a></li>
            </ul>
        </div>
    </div>
<!-- end  -->
<div class="notic_con_wper">
    <div class="notic_con px1000">
        <div class="notic_section clearfix">
            <div class="notic_sec_l fl">
                <ul class="notic_secl_ul">
                    <li class="notic_curli" onclick="myh(1)">用户信息 </li>
                    <li onclick="myh(2)">实名认证 </li>
                    <li onclick="myh(3)">充值与提现 </li>
                    <li onclick="myh(4)">投资与还款 </li>
                    <li onclick="myh(5)">充值与提现 </li>
                </ul>
            </div>
            <script type="text/javascript">
                $(function(){
                    myh(1);

                })

                function myh(obj){
                    if(obj=="1"){
                        $("#login1").attr("style","display:block;text-align: center; width: 100%;")

                    }else if(obj=="2"){
                        $("#login11").attr("style","display:block;text-align: center; width: 100%;")
                        $("#login1").attr("style","display:none")
                    }

                }

            </script>

            <!-- end l -->
            <div class="notic_sec_r fl">

                <div id="login1"    class="left_form fl" style="text-align: center; width: 100%;display: none">
                    <form action="h" method="post">
                        <table class="table">
                            <tr>
                                <td><label>用户名:</label></td>
                                <td>
                                    <input type="text" class="form-control"  name="pUsername" value="请输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入用户名';}">
                                </td>
                            </tr>
                            <tr>
                                <td><label>密码:</label></td>
                                <td>
                                    <input type="password" class="form-control" style="padding-left: 50px;" name="pPassword" value="请输入密码" onfocus="this.value = '';"
                                           onblur="if (this.value == '') {this.value = '请输入密码';}">
                                </td>
                            </tr>
                            <tr>
                                <td>邀请人:</td>
                                <td> <input type="text" class="form-control " name="pInvite" value="邀请人" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邀请人';}">
                                </td>
                            </tr>

                            <tr>
                                <td>资金:</td>
                                <td><input type="text" class="chcode " name="pCapital" value="资金" onfocus="this.value ='';" onblur="if (this.value == '') {this.value = '资金';}">
                                </td>
                            </tr>

                            <tr>
                                <td>可用资金:</td>
                                <td><input type="text" class="form-control " name="pUsable" value="可用资金" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '可用资金';}">
                                </td>
                            </tr>

                            <tr>
                                <td>信用值:</td>
                                <td><input type="text" class="form-control " name="pCredit" value="信用值" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '信用值';}">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="3" style="text-align: center">
                                    <button class="btn btn-default " type="submit" >确定</button>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>







                    <div id="login11"    class="left_form fl" style=" width: 100%; text-align: center;display: none" >
                        <form action="${ctx}/attestaion/upload" method="post"  enctype="multipart/form-data">
                            <table class="table">
                                <tr>
                                    <td>
                                        <input type="hidden" class="form-control"  id="pId" name="pId"  value="1">
                                    </td>
                                </tr>

                                <tr>
                                    <td><label>真实姓名:</label></td>
                                    <td>
                                        <input type="text" class="form-control" id="aName"  name="aName" >
                                    </td>
                                </tr>
                                <tr>
                                    <td><label>身份证号码</label></td>
                                    <td>
                                        <input type="text" class="form-control"  id="aSfz" name="aSfz" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>身份证照反面</td>
                                    <td> <input type="file"  id="pInvite" name="reverse" >
                                    </td>
                                </tr>

                                <tr>
                                    <td>身份证照正面:</td>
                                    <td><input type="file" id="pCapital" name="front" >
                                    </td>
                                </tr>

                                <tr>
                                    <td colspan="3" style="text-align: center">
                                        <button class="btn btn-default" type="submit" >提交</button>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>



            </div>
            </div>
   </div>
</div>
</div>


</body>
</html>
