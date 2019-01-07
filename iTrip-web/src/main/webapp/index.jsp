<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>layPage title here</title>
  <link rel="stylesheet" href="statics/layui/css/layui.css" media="all">
</head>

<body>


 
 

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
  <legend>显示完整功能</legend>
</fieldset>
 
<div id="demo7"></div>
 

<script src="statics/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['laypage', 'layer'], function(){
	  var laypage = layui.laypage
	  ,layer = layui.layer;
  //完整功能
  laypage.render({
    elem: 'demo7'
    ,count: 100
    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
    ,jump: function(obj){
      console.log(obj)
    }
  });
 
  
});
</script>

</body>
</html>