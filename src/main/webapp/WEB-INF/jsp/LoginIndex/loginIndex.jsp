<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/3
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="/common/head.jsp" %>
    <%@taglib prefix="t" uri="http://www.springframework.org/tags" %>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/all.js"></script>
    <script type="text/javascript" src="js/iepng.js"></script>
    <script type="text/javascript" src="js/less.min.js"></script>
</head>
<style>
    /*.code
    {
        font-family:Arial;
        font-style:italic;
        color:blue;
        font-size:10px;
        border:0;
        padding:2px 3px;
        letter-spacing:3px;
        font-weight:bolder;
        float:left;
        cursor:pointer;
        width:60px;
        height:40px;
        line-height:40px;
        text-align:center;
        vertical-align:middle;
        background-color:#D8B7E3;
    }
    span {
        text-decoration:none;
        font-size:12px;
        color:#288bc4;
        padding-left:10px;
    }

    span:hover {
        text-decoration:underline;
        cursor:pointer;
    }*/
</style>

<script type="text/javascript">
    //页面加载时，生成随机验证码
    window.onload=function(){
        createCode(4);
    }

    //生成验证码的方法
    function createCode(length) {
        var code = "";
        var codeLength = parseInt(length); //验证码的长度
        var checkCode = document.getElementById("checkCode");
        ////所有候选组成验证码的字符，当然也可以用中文的
        var codeChars = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        //循环组成验证码的字符串
        for (var i = 0; i < codeLength; i++)
        {
            //获取随机验证码下标
            var charNum = Math.floor(Math.random() * 62);
            //组合成指定字符验证码
            code += codeChars[charNum];
        }
        if (checkCode)
        {
            //为验证码区域添加样式名
            checkCode.className = "code";
            //将生成验证码赋值到显示区
            checkCode.innerHTML = code;
        }
    }

    //检查验证码是否正确
    function validateCode()
    {
        //获取显示区生成的验证码
        var checkCode = document.getElementById("checkCode").innerHTML;
        //获取输入的验证码
        var inputCode = document.getElementById("inputCode").value;

        console.log(checkCode);
        console.log(inputCode);

        if (inputCode.length <= 0)
        {
            alert("请输入验证码！");
        }
        else if (inputCode.toUpperCase() != checkCode.toUpperCase())
        {
            alert("验证码输入有误！");
            createCode(4);
        }
        else
        {
            alert("验证码正确！");
        }
    }
    /*function clik_form() {
        var name=document.getElementById("pUsername");
        var pwd=document.getElementById("pPassword");
        var pwd1=document.getElementById("pPassword1");
        var phone=document.getElementById("pInvite");
        var yzm=document.getElementById("yzm");
        if(name.value=="") {
            alert("请设置您的用户名！");
            return false;
        }
        if(name.value.length < 6 ||username.value.length > 18){
            alert("格式错误,长度应为6-18个字符");
            return false;
        }
        if(pwd.value.length=="")
        {
            alert("请输入密码!");
            return false;
        }
        if(pwd.value.length<6 || pwd1.value.length>8)
        {
           alert("密码由6-8位字符或数字组成")
            return false;
        }
        if(pwd1.value!=pwd.value){
            alert("两次密码不一致！")
            return false;
        }
        if(phone.value==""){
            alert("请输入您的手机号码");
            return false;
        }
        if(yzm.value!=""){
            alert("请输入验证码");
            return false;
        }
        return true;
    }
*/
</script>


<body>
<div class="gy_box">
    <!-- header start -->
    <div id="gy_top_wper">
        <div class="gy_top px1000 clearfix">
            <div class="gy_top_l fl"><img src="images/service_pic.png" alt=""><span style="color:#999999;padding-left:10px;">在线客服:</span><img style="padding-left:10px;" src="images/service_photo.png" alt=""><span style="color: #5DB9E9;padding-left:10px;">客服热线：400-660-8612</span></div>
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
                <li><a href="">我要借款</a></li>
                <li><a href="">活动专区</a></li>
                <li><a href="">业务模式</a></li>
                <li><a href="">安全保障</a></li>
                <li><a href="">关于我们</a></li>
            </ul>
        </div>
    </div>
    <!-- header end -->
    <div id="gy_step">
        <div class="gy_step_main px1000 clearfix">
            <div class="gy_step_main_p fl">
                <p class="gy_step_proe1">1</p>
                <p style="color:#29A7E1;padding-top:10px;">填写用户信息</p>
            </div>
            <div class="list_press_wper fl">
                <div class="list_press">
                </div>
            </div>
            <div class="gy_step_main_p fl">
                <p class="gy_step_proe2">2</p>
                <p style="padding-top:10px;">手机信息验证</p>
            </div>
            <div class="list_press_wper fl">
                <div class="list_press">
                </div>
            </div>
            <div class="gy_step_main_p fl">
                <p class="gy_step_proe3">3</p>
                <p style="padding-top:10px;">注册成功</p>
            </div>
        </div>
    </div>

    <div id="form_main" class="px1000 clearfix">
        <div class="form_main_grjg_xx">
            <span id="form_main_gr">个人注册</span>
            <span id="form_main_jg">机构注册</span>
        </div>
        <div>
            <div id="login1" class="left_form fl" >
                <form id="from" action="${ctx}/LoginIndex/login/register"  method="post" modelAttribute="user">
                    <div class="form_lb">
                        <lable>用户名:</lable>
                        <input type="text" class="form-control" id="pUsername" name="pUsername" value="请输入用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入手机/邮箱';}"><br>
                    </div>
                    <div class="form_lb clearfix">
                        <lable>密码:</lable>
                        <input type="text" class="form-control" id="pPassword" name="pPassword" value="请输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入密码';}"><br>
                        <div class="saf_lv_main fl">
                            <div style="background:#29A7E1;" class="saf_lv"></div>
                            <div style="background:#29A7E1;" class="saf_lv"></div>
                            <div class="saf_lv"></div>
                            <div class="saf_lv"></div>
                            <div class="saf_lv"></div>
                        </div>
                    </div>
                    <div class="form_lb">
                        <lable>确认密码:</lable>
                        <input type="text" class="form-control " id="pPassword1" name="pPassword1" value="请再次输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请再次输入密码';}">
                    </div>

                    <div class="form_lb">
                        <lable>手机号码:</lable>
                        <input type="text" class="form-control " id="pInvite" name="pInvite" value="选填" size="11" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                    </div>

                    <div class="form_lb">
                        <lable>验证码:</lable>
                        <input type="text" class="chcode " id="inputCode" value="请输入右边的验证码" onfocus="this.value ='';" onblur="if (this.value == '') {this.value = '请输入右边的验证码';}">
                        <span><div id="checkCode" class="code"  onclick="createCode(4)"></div></span>
                    </div>

                    <div class="form_lb cheb_yes">
                        <input type="checkbox" name="aa" value=""/>
                        <span>我已阅读并同意ppp在线的<a href=""><span style="color:#29A7E1;">《服务条款》</span></a> </span>
                        <%--<p><input type="submit" value="注册" style="width:200px;height:30px" /> ></p>--%>
                       <p><input type="submit" value="注册" onclick="validateCode()" style="width:300px;height:40px;color:#3bc4ee;font-size:0.6cm"></p>
                    </div>
                <form>
            </div>

            <div id="login2" class="left_form fl" style="display:none;"><%--${ctx}/Oreg/add--%>
                <%--<form action="${ctx}/Oreg/add"  method="post" >
                    <div class="form_lb">
                        <lable>机构用户名:</lable>
                        <input type="text" class="form-control" name="oOrganization" value="请输入机构用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入机构用户名';}">
                    </div>
                    <div class="form_lb clearfix">
                        <lable>密码:</lable>
                        <input type="text" class="form-control" name="oPassword" value="请输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入密码';}">
                        <div class="saf_lv_main fl" >
                            <div class="saf_lv_main_jd">
                                <div style="background:#29A7E1;" class="saf_lv"></div>
                                <div style="" class="saf_lv"></div>
                                <div class="saf_lv"></div>
                                <div class="saf_lv"></div>
                                <div class="saf_lv"></div>
                            </div>
                        </div>
                    </div>
                    <div class="form_lb">
                        <lable>确认密码:</lable>
                        <input type="text" class="form-control " name="oPassword1" value="请再次输入密码" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请再次输入密码';}">
                    </div>
                    <div class="form_lb">
                        <lable>机构类型:</lable>
                        <select name="select" id="select_k1" class="xla_k">
                            <option value="国营企业">国营企业</option>
                            <option value="民营企业">民营企业</option>
                            <option value="政府单位">政府单位</option>
                            <option value="社会团体">社会团体</option>
                            <option value="慈善机构">慈善机构</option>
                        </select>
                    </div>
                    <div class="form_lb">
                        <lable>办公所在地:</lable>
                        <select name="select" id="form_lb_diqu" class="form_lb_diqu">
                            <option>辽宁省</option>
                            <option>湖南省</option>
                            <option>河北省</option>
                            <option>河南省</option>
                            <option>山东省</option>
                            <option>山西省</option>
                            <option>浙江省</option>
                            <option>江苏省</option>
                            <option>广东省</option>
                            <option>湖北省</option>
                        </select><span style="margin:auto 5px;color:#808080;">省</span>
                        <select name="select" id="form_lb_diqu" class="form_lb_diqu">
                            <option>北京</option>
                        </select><span style="margin:auto 5px;color:#808080;">市</span>
                    </div>

                    <div class="form_lb_name">
                        <lable>联系人姓名:</lable>
                        <input type="text" class="form_control_name" name="oLinkman" value="真实姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '真实姓名';}">
                        <input type="radio" value="先生" name="oSex">先生
                        <input type="radio" value="女士" name="oSex">女士
                    </div>

                    <div class="form_lb">
                        <lable>手机号:</lable>
                        <input type="text" class="form-control" name="oPhone" value="请输入手机号" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入手机号';}">
                    </div>
                    <div class="form_lb">
                        <lable>固定号码:</lable>
                        <input type="text" class="form-control" name="oFixedNumber" value="选填" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '选填';}">
                    </div>

                    <div class="form_lb cheb_yes">
                        <input type="checkbox" name="" value=""/>
                        <span>我已阅读并同意ppp在线的<a href=""><span style="color:#29A7E1;">《服务条款》</span></a> </span>
                        <p><input type="submit" value="注册" style="width:300px;height:40px;color:#3bc4ee;font-size:0.6cm"></p>
                    </div>
                </form>--%>
            </div>

        </div>
        <div class="right_pic fl" >
            <div class="l_acc_dl">
                <span>已有帐号？<a href=""><span style="color:#29A7E1;">立即登录</span></a></span>
            </div>
            <p><img src="images/right_bg.jpg"></p>
        </div>
    </div>


    <div id="gy_guide_help">
        <div class="px1000 clearfix">
            <div class="fl gy_guide_help_l"><a href=""><img src="images/gy_guide_help_zl.png"></a></div>
            <div class="fl gy_guide_help_r" ><img src="images/gy_guide_help_zlxx.png"></div>
        </div>
    </div>

    <div id="gy_guide_about_us">
        <div class="px1000 clearfix">
            <div class="gy_guide_aus_left fl">
                <div class="gy_guide_aus_block fl">
                    <p class="gy_guide_aus_ccp"><b>关于我们</b></p>
                    <ul>
                        <li><a href="">荣誉奖项</a></li>
                        <li><a href="">发展历程</a></li>
                        <li><a href="">招贤纳士</a></li>
                        <li><a href="">联系我们</a></li>
                    </ul>
                </div>
                <div class="gy_guide_aus_block fl">
                    <p class="gy_guide_aus_ccp"><b>金融资讯</b></p>
                    <ul>
                        <li><a href="">金融帮助</a></li>
                        <li><a href="">行业资讯</a></li>
                    </ul>
                </div>
                <div class="gy_guide_aus_block fl">
                    <p class="gy_guide_aus_ccp"><b>业务信息</b></p>
                    <ul>
                        <li><a href="">我要投资</a></li>
                        <li><a href="">我要借款</a></li>
                    </ul>
                </div>
                <div class="gy_guide_aus_block fl">
                    <p class="gy_guide_aus_ccp"><b>帮助中心</b></p>
                    <ul>
                        <li><a href="">新手指引</a></li>
                        <li><a href="">安全保障</a></li>
                        <li><a href="">融资借款</a></li>
                        <li><a href="">实时财务</a></li>
                    </ul>
                </div>
            </div>

            <div class="gy_guide_aus_right fl">
                <div class="fl gy_guide_aus_r_le">
                    <div class="gy_guide_aus_r_ewm"><img src="images/gy_guide_aus_right_ewm.png"></div>
                    <div style="padding-left:20px;"><img src="images/gy_guide_aus_right_sys.png"></div>
                </div>
                <div class="fl gy_guide_aus_r_re">
                    <p class="gy_guide_aus_r_pad" style="font-size:20px"><b>客服热线</b></p>
                    <p class="gy_guide_aus_r_pad" style="font-size:24.26px;color:#29a7e1;">400-678-7677</p>
                    <p class="gy_guide_aus_r_pad" style="font-size:14px">(周一至周日 08:00 - 22:00)</p>
                    <p class="gy_guide_aus_r_pad">
						<span>
							<a href=""><img src="images/gy_guide_aus_right_xlwb.png"></a>
							<a href=""><img src="images/gy_guide_aus_right_wx.png"></a>
							<a href=""><img src="images/gy_guide_aus_right_zxkf.png"></a>
						</span>
                    </p>
                </div>
            </div>
        </div>
    </div>

    <!-- footer start -->
    <div id="gy_footer_wper">
        <div class="gy_footer_xy px1000 clearfix">
            <div class="gy_footer_xy_picp">
                <img src="images/gy_cp_footer_wper_up01.jpg">
                <img src="images/gy_cp_footer_wper_up02.png">
                <img src="images/gy_cp_footer_wper_up03.png">
                <img src="images/gy_cp_footer_wper_up04.png">
                <img src="images/gy_cp_footer_wper_up05.png">
                <img src="images/gy_cp_footer_wper_up06.png">
            </div>
            <div class="gy_footer_xy_fonts">
                <p>©2014 亘元投资 All rights reserved 亘元投资金融有限公司 辽ICP备11046595号-6</p>
            </div>
            <div class="gy_footer_youqlj">
                <div class="fl">友情链接:</div>
                <div class="fl">
                    <ul class="gy_footer_youqlj_one">
                        <li><a href="">证券之星</a></li>
                        <li><a href="">南方财富网</a></li>
                        <li><a href="">蚂蚁财经</a></li>
                        <li><a href="">卡盟网</a></li>
                        <li><a href="" style="color:#5DB0D7">外汇理财</a></li>
                        <li><a href="">股市行情</a></li>
                        <li><a href="">P2P理财</a></li>
                        <li><a href="">白银理财</a></li>
                    </ul><br>
                    <ul id="unfold_show" class="gy_footer_youqlj_two" style="display:none;">
                        <li><a href="">证券之星</a></li>
                        <li><a href="">南方财富网</a></li>
                        <li><a href="">蚂蚁财经</a></li>
                        <li><a href="">卡盟网</a></li>
                        <li><a href="">外汇理财</a></li>
                        <li><a href="">股市行情</a></li>
                        <li><a href="">P2P理财</a></li>
                        <li><a href="">白银理财</a></li>
                    </ul><br>
                    <ul id="unfold_show" class="gy_footer_youqlj_three" style="display:none;">
                        <li><a href="">证券之星</a></li>
                        <li><a href="">南方财富网</a></li>
                        <li><a href="">蚂蚁财经</a></li>
                        <li><a href="">卡盟网</a></li>
                        <li><a href="">外汇理财</a></li>
                        <li><a href="">股市行情</a></li>
                        <li><a href="">P2P理财</a></li>
                        <li><a href="">白银理财</a></li>
                    </ul>
                </div>
                <div id="unfold" class="fl">
                    <span>展开</span>
                    <span><img src="images/gy_cp_footer_wper_down_zk.png"></span>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
