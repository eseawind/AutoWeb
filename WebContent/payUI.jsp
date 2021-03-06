<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> 支付</title>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/base.css" />
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/shopping.css" />
</head>

<body>
<div class="payment_tc">
	<div class="payment_tc_hd">请您在新打开的页面上完成支付</div>
    <p>付款完成前请不要关闭此窗口。</p>
    <p>完成付款后请根据您的情况点击下面的按钮：</p>
    <div class="payment_tc_btn"><a class="wc_btn" href="#" target="_blank">已付款完成</a><a class="wt_btn" href="#" target="_blank">付款遇到问题</a></div>
</div>
<div class="box">
 <%
        UserOrder uo = (UserOrder)session.getAttribute("order");
        %>
	<div class="path"><span class="mr10">您的位置：</span><a href="#" target="_blank">首页</a><em>》</em><span>订单详情</span></div>
    <div class="payment_title mt10">
    	<p class="header">订单提交成功，请您尽快付款！</p>
        <ul>
       
        	<li>订单号：<%= uo.getOrders().getpNo() %></li>
        	<li>总金额：<span class="red fonts_16">￥<%= uo.getTotalPrice()%></span></li>
        </ul>
    </div>
    <div class="cl payment_box mt10">
        <div class="cl address_title"><h4 class="fl">付款方式</h4><a class="beizhu" href="#" target="_blank">付款时需跳转至支付宝支付 </a></div> 
        <ul class="payment_list">
        	<li>
            	<input type="radio" checked="checked"/>
                <img src="<%=request.getContextPath()%>/images/zhiubao.jpg" width="124" height="34" alt="" />
            </li>
        </ul>
        <a class="payment_btn" target="_blank">前往支付宝支付</a>
    </div>
</div>

</body>
</html>
