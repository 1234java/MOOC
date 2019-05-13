<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/3 0003
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>borrow</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <!-- <link rel="stylesheet/less" type="text/css" href="css/style.less" /> -->
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/all.js"></script>
    <!--[if IE 6]>
    <script src="./js/iepng.js" type="text/javascript"></script>
    <script type="text/javascript">
        EvPNG.fix('div, ul, img, li, input,span, p');
    </script>
    <![endif]-->
</head>
<body>
<!-- header start -->
<div class="gy_box">
    <!-- header start -->
    <div id="gy_top_wper">
        <div class="gy_top px1000 clearfix">
            <div class="gy_top_l fl"><img src="images/service_pic.png" alt=""><span
                    style="color:#999999;padding-left:10px;">在线客服:</span><img style="padding-left:10px;"
                                                                              src="images/service_photo.png"
                                                                              alt=""><span
                    style="color: #5DB9E9;padding-left:10px;">客服热线：400-660-8612</span></div>
            <div class="gy_top_r fr clearfix">
                <a href="">登录</a><span>|</span>
                <a href="">注册</a><span>|</span>
                <a href="">新手指导</a><span>|</span>
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
                    <a href=""> 我要投资</a>
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
                <li><a href="">产品特色</a></li>
                <li><a href="">活动专区</a></li>
                <li><a href="">业务模式</a></li>
                <li><a href="">安全保障</a></li>
                <li><a href="">关于我们</a></li>
            </ul>
        </div>
    </div>
    <!-- header end -->


</div>
<!-- end banner -->
<div class="bor_con_wper">
    <div class="bor_con px1000">
        <div class="bor_detail">
            <h2 class="bor_detail_tit">
                <span><a href="${ctx}/zking/jsp">房产抵押</a></span>
                <span><a href="${ctx}/zking/vehicle">车辆抵押</a></span>
                <span class="bor_decurspan">信用贷款</span>
            </h2>
            <div class="bor_detail_box">
                <div class="bor_det_one clearfix pt30 pb30">
                    <div class="bor_det_onel fl">
                        <p class="bor_p1">中兴财富平台的借款功能旨在帮助借款用户以
                            低成本获得借款。用户在需要资金时，可以将
                            自有房产和车产作为抵押物，小油菜线下审核
                            通过后，根据抵押物的价值融资。</p>
                        <p class="bor_p2">中兴财富平台的借款功能旨在帮助借款用户以
                            低成本获得借款。用户在需要资金时，可以将
                            自有房产和车产作为抵押物，小油菜线下审核
                            通过后，根据抵押物的价值融资。</p>
                        <h3 class="bor_onel_tit"><span>申请条件</span></h3>
                        <ul class="bor_onel_ul">
                            <li><img src="images/bor_pic01.png" alt="">年满18周岁以上的公民
                            </li>
                            <li><img src="images/bor_pic02.png" alt="">需要北京房产或车产抵押
                            </li>
                            <li><img src="images/bor_pic03.png" alt="">个人或企业银行征信记录良好
                            </li>
                            <li><img src="images/bor_pic04.png" alt="">
                                无现有诉讼记录
                            </li>

                        </ul>
                        <h3 class="bor_onel_tit"><span>提交资料</span></h3>
                        <ul class="bor_onel_ul">
                            <li>&nbsp;<img src="images/bor_pic05.png" alt="">省份证
                            </li>
                            <li><img src="images/bor_pic06.png" alt="">申请资料
                            </li>
                            <li><img src="images/bor_pic07.png" alt="">其他
                            </li>


                        </ul>
                    </div>
                    <!-- end l -->
                    <div class="bor_det_oner fl">
                        <f:form action="${ctx}/hipoteca/add?sid=2"  method="post" modelAttribute="borrower">
                            <%--   <form   action="${ctx}/hipoteca/add"  method="get" >--%>
                            <fieldset>
                                <div style="margin-top: 10px">
                                    <label>标题</label>
                                    <f:input path="bName"></f:input><f:errors path="bName"/>
                                </div>

                                <div>
                                    <label>申请人</label>
                                        <%--<input type="" name="bUsername">--%>
                                    <f:input path="bUsername"></f:input><f:errors path="bUsername"/>
                                </div>
                                <div class="mt15">
                                    <label>*借款金额</label>
                                        <%--<input type="" class="bor_inputbg01" name="bMoney">--%>
                                    <f:input path="bMoney"></f:input><f:errors path="bMoney"/>

                                </div>
                                <div class="mt15">
                                    <label>*还款期限</label>
                                    <input type="date" class="bor_inputbg02" name="bMoneyDeadline">

                                </div>
                                <div class="mt15">
                                    <label>*手机号码</label>
                                    <f:input path="bPhone"></f:input><f:errors path="bPhone"/>
                                        <%--<input type="" name="bPhone">--%>

                                </div>
                                <%--<div class="mt15 guarmethod clearfix">--%>
                                    <%--<label class="guarmethod_l fl">*担保方式</label>--%>
                                    <%--<div class="fl">--%>
                                        <%--<span>房屋数量</span>--%>
                                        <%--<input type="text" class="bor_inputbg03 input2" name="bHouse"><br><br>--%>

                                        <%--<span>总价值</span>--%>
                                        <%--<input type="text" class="bor_inputbg04 input2" name="bTotalValue"><br>--%>

                                    <%--</div>--%>

                                <%--</div>--%>
                                <div class="mt15">
                                    <label>*借款类别</label>
                                    <select name="bBorrowerType">

                                        <option>选择借款类别</option>
                                        <option value="1">信用贷款</option>
                                        <option value="2">抵押贷款</option>
                                        <option value="3">质押贷款</option>

                                    </select>
                                </div>
                                <div class="mt15">
                                    <label>*借款描述</label>
                                    <textarea name="bDescribe"></textarea>


                                </div>
                                <div class="mt15">
                                    <label>*借款情况</label>
                                    <input type="radio" value="1"  class="input3" name="bCondition">
                                    普通借款
                                    <input type="radio" value="2" class="input3" name="bCondition">
                                    紧急借款

                                </div>
                                    <%--<div class="mt15">--%>
                                    <%--<label>*验证码</label>--%>
                                    <%--<input type="text" class="yanzheng">--%>

                                    <%--</div>--%>
                                <div class="mt30">
                                    <label></label>
                                        <%-- <a href="" class="bor_btn">提交材料</a>--%>
                                    <button type="submit" class="bor_btn">提交材料</button>
                                </div>
                            </fieldset>
                        </f:form>
                    </div>
                </div>
                <!-- end 房产抵押 -->
                <%--<div class="bor_det_one" style="display:none;">--%>
                    <%--2--%>
                <%--</div>--%>
                <%--<!-- end  -->--%>
                <%--<div class="bor_det_one" style="display:none;">--%>
                    <%--3--%>
                <%--</div>--%>
                <%--<!-- end  -->--%>
                <%--<div class="bor_det_one" style="display:none;">--%>
                    <%--4--%>
                <%--</div>--%>
                <!-- end  -->
            </div>
        </div>
    </div>
</div>
</body>
</html>
