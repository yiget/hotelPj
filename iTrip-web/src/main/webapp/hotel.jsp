<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="hotel_files/share.css">
<script type="text/javascript" src="hotel_files/jquery_002.js"></script>
<script type="text/javascript" src="hotel_files/common.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>乐游旅游官方网站_中国专业旅游服务平台_快乐旅游 就在乐游！</title>
<meta name="description"
	content="乐游旅游，全国旅游连锁品牌，综合性旅游服务平台，提供出境游、国内游、周边游、自由行、机票预订、酒店预订主题定制等旅游全产业链服务，已在全国15个省30多个地市建立1600余家连锁门店。快乐旅游，就在乐游，全国旅游咨询热线：4000-121-888">
<meta name="keywords"
	content="乐游旅游,乐游旅游官网,旅游连锁,旅行社加盟,旅游分销平台,乐游美国,乐游邮轮,乐年汇">
<link rel="shortcut icon" type="image/x-icon"
	href="http://www.loyoyo.com/xtfsq/themes/default/ppgl/loyoyo.com/favicon.ico?timestamp=2015090216">
<link rel="stylesheet" type="text/css" href="hotel_files/cpgllist.css">
<link rel="stylesheet" type="text/css" href="hotel_files/pagination.css">
<link rel="stylesheet" type="text/css" href="css/hotel.css">
<link rel="stylesheet" type="text/css" href="css/paging.css">
<script type="text/javascript" src="js/hotel.js"></script>
<!-- 分页插件js css -->
<script src="js/paging.js"></script>
<link rel="stylesheet" type="text/css" href="css/paging.css">
<style>
.px ul li:hover {
	color: red;
}
</style>
</head>
<body>
<%-- 	<!-- 嵌入头部 -->
	<%@ include file="common/hread.jsp"%>
	<!-- 嵌入页面导航 -->
	<%@ include file="common/left.jsp"%> --%>


	<!--页面主体开始-->
	<div class="main main-cplist">

		<div class="main-in">
			<div class="cxtj">
				<div class="cxtj_xz">
					<dl id="nyxz">
						<dt>产品搜索 &gt;</dt>
						<dd id="yxcyfs" style="display: none;">
							出游方式&nbsp;<a></a><span><img
								src="hotel_files/cplb_cancle.png"></span>
						</dd>
						<dd id="yxzdscj" style="display: none;">
							价格区间&nbsp;<a></a><span><img
								src="hotel_files/cplb_cancle.png"></span>
						</dd>
						<dd id="yxxcts" style="display: none;">
							行程天数&nbsp;<a></a><span><img
								src="hotel_files/cplb_cancle.png"></span>
						</dd>
						<dd id="yxmdd" style="display: none;">
							目的地&nbsp;<a></a><span><img
								src="hotel_files/cplb_cancle.png"></span>
						</dd>
						<a href="javascript:qktj();" style="color: #333; font-size: 16px;">清空条件</a>
					</dl>
				</div>
				<div id="spans">
					<sp>${count}</sp>
					家酒店符合您选择的条件:
				</div>
				<ul>
					<li>
						<div class="xzbt">价格区间</div>
						<dl id="zdscj">
							<dd id="priceAll" class="current" onClick="ddAll(this,'price');">全部</dd>
							<c:forEach items="${getprice}" var="pp" varStatus="index">
								<dd id="${pp.info }"
									onClick="add(this,'price','${pp.info}','${pp.typeCode}','${pp.dictCode}');">${pp.info }元<c:if test="${index.first}">以下</c:if><c:if test="${index.last}">以上</c:if></dd>
							</c:forEach>
						</dl>
					</li>
					<li>
						<div class="xzbt">星级档次</div>
						<dl id="">
							<dd id="starAll" class="current" onClick="ddAll(this,'star');">全部</dd>
							<c:forEach items="${getstar}" var="st">
								<dd id="${st.info}"
									onClick="add(this,'star','${st.info }','${st.typeCode }','${st.dictCode }');">${st.info}</dd>
							</c:forEach>
						</dl>
					</li>
					<li>
						<div class="xzbt">酒店类型</div>
						<dl id="">
							<dd id="hotelsddAll" class="current"
								onClick="ddAll(this,'hotelsdd');">全部</dd>
							<c:forEach items="${first}" var="fir">
								<dd id="${fir.id}"
									onClick="add(this,'hotelsdd','${fir.id }','${fir.type }','');">${fir.name}</dd>
							</c:forEach>
						</dl>
					</li>
					<li id="xzmdd">
						<div class="xzbt">所在城市</div>
						<dl id="mdd" class="more">
							<dd id="citysddAll" class="current"
								onClick="ddAll(this,'citysdd');">全部</dd>
							<c:forEach items="${second}" var="se">
								<dd id="${se.id}"
									onClick="add(this,'citysdd','${se.id }','${se.type }','');">${se.name}</dd>
							</c:forEach>
							<span class="mdd_gd" id="mdd_gd" style="">更多 <i></i></span>
						</dl>
					</li>
				</ul>
			</div>
			<div class="content">
				<div class="px">
					<ul>
						<li class="currentup" onclick="attrLiCss(this)">综合</li>
						<li id="zdscj" class="" onclick="attrLiCss(this)">价格↑</li>
						<li id="pin" class="" onclick="attrLiCss(this)">评分↑</li>
					</ul>
				</div>
				<div id="cplist" style="position: relative; min-height: 520px;">
					<c:if test="${empty list }">
						<span
							style="display: block; width: 418px; position: absolute; top: 45%; left: 50%; margin-left: -209px; margin-top: -143px;"><img
							src="index_files/cplb_zwcp.jpg" width="418"></span>
					</c:if>
					<c:if test="${not empty list}">
						<c:forEach items="${list }" var="hotelx">
							<div class="cpzs">
								<a href="/hotels/hotelDetails?hotelId=${hotelx.hotelId}"
									target="_blank"> <img src="${hotelx.fileUrl }"
									onerror="this.src='/xtfsq/themes/images/default.jpg?timestamp=2015090216'">
									<!-- <div class="cpbq">跟团游</div> -->
								</a>
								<div class="cpmc">
									<div class="cppic">
										<a href="/hotels/hotelDetails?hotelId=${hotelx.hotelId}"
											target="_blank">${hotelx.hotelName } </a>
									</div>
									<div class="clear"></div>
									<p>酒店详情：${hotelx.hotelIntro }</p>
									<p>
										酒店星级：${hotelx.hotelRating}<span style="margin-left: 60px;">酒店评分：${hotelx.hotelRatings}</span>
									</p>
									<div class="cpxqnr">
										<p>酒店地址：${hotelx.hotelAddress }</p>
									</div>
								</div>
								<div class="jg">
									<span><em>¥</em><b>${hotelx.hotelPrice }</b>起</span>
									<button style="outline: none; margin-top: 15px;" type="button"
										onclick="javascript:window.open('/hotels/hotelDetails?hotelId=${hotelx.hotelId}')">立即预订</button>
								</div>
							</div>
						</c:forEach>
						<!-- **********************分页开始******************* -->
						<div class="M-box2" style="margin: 0 0 20px">
							<a href="javascript:querylist('home')" style="color: #000;"
								class="next">首页</a> <a href="javascript:querylist('upper')"
								style="color: #000;" class="next">上页</a> <a
								href="javascript:querylist('next')" style="color: #000;"
								class="next">下页</a> <a href="javascript:querylist('end')"
								style="color: #000;" class="next">末页</a>
						</div>
					</c:if>
					<!-- **********************分页结束******************* -->
				</div>
				<input type="hidden" id="pageNo" value="1"> <input
					type="hidden" id="total" value="${hotel.total}"> <input
					type="hidden" id="pageSize" value="${hotel.pageSize}">
			</div>
		</div>
	</div>
	<!-- 嵌入页面底部 -->
	<%-- <%@ include file="common/bottom.jsp"%><!--  -->
 --%>
	<div class="tczz"
		style="width: 100%; height: 100%; background-color: #000; background-color: rgba(0, 0, 0, 0.5); filter: alpha(opacity = 50); BORDER-LEFT: medium none; /*IE8支持*/ position: fixed; left: 0; top: 0; /* filter:alpha(Opacity=20);  */ z-index: 9998; display: none; pointer-events: auto;"></div>
	<div class="tck">
		<span></span>
		<div id="tsk" class="row">
			<div id="qxsc" class="col-xs-6">否</div>
			<div id="qdsc">是</div>
		</div>
	</div>
	<script src="hotel_files/jquery.js"></script>
	<input type="hidden" value="${mk}" id="mk">
	<script type="text/javascript">
		$(function() {
			var phone = $("#phoneM");
			var item = phone.text();
			if(item != ''){
				phone.text(item.substring(0, 3) + "****" + item.substring(7, 11));
			}
		});

		function loginout() {
			if (confirm("确认退出登录吗？")) {
				location.href = "loginout";
			}
		}
	</script>
</body>
</html>