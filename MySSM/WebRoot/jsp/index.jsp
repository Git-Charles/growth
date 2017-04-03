<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>幼儿成长乐园</title>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="css/layout.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.innerfade.js"></script>
<script type="text/javascript" src="js/index.js" ></script>
</head>
<body id="top">
<div class="wrapper col1">
  <div id="header">
   <img class="logo_pic" src="images/lovely_66.24px_568912_easyicon.net.png" />
    <div id="logo">
      <h1><a href="#">幼儿成长乐园</a></h1>
      <p>孩子们，我会看着你们一天天长大！</p>
    </div>
   <div id="search">
   login
   </div>
    <div id="topnav">
      <ul>
        <li class="last"><a href="#">个人中心</a>
        	<ul>
        		<li><a href="#">成长树</a></li>
        		<li><a href="#">个人资料</a></li>
        		<li><a href="#">日程安排</a></li>
        		<li><a href="#">注销</a></li>
        	</ul>
        </li>
        <!-- <li><a href="#">学生信息管理</a></li>
        <li><a href="#">家长信息管理</a></li>
       	<li><a href="#">角色管理</a></li> -->
        <li><a href="#">趣味互动</a></li>
        <li><a href="#">爱健康</a></li>
        <li><a href="full-width.html">爱生活</a></li>
        <li class="tiexin"><a href="javascript:void(0)">爱学习</a></li>
        <li class="active"><a href="home/index">首页</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2  content_center" style="min-height: 600px;background: white;">
  <!--<div id="intro">
    <div class="fl_left">
      <h1>Lacus iner dum at mat&hellip;</h1>
      <ul>
        <li>
          <h2>Lipsum</h2>
          <p>Nullamlacus dui ipsum conseqlo borttis non euisque morbipen a sdapibulum orna.</p>
          <p>Urnau ltrices quis curabitur pha sellent esque congue magnisve stib ulum quismodo nulla et feugiat. Adipisciniap ellentum leo ut consequam.</p>
          <p>Nullamlacus dui ipsum conseqlo borttis non euisque morbipen a sdapibulum orna.</p>
          <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
        </li>
        <li class="last">
          <h2>Lipsum</h2>
          <p>Nullamlacus dui ipsum conseqlo borttis non euisque morbipen a sdapibulum orna.</p>
          <p>Urnau ltrices quis curabitur pha sellent esque congue magnisve stib ulum quismodo nulla et feugiat. Adipisciniap ellentum leo ut consequam.</p>
          <p>Nullamlacus dui ipsum conseqlo borttis non euisque morbipen a sdapibulum orna.</p>
          <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
        </li>
      </ul>
    </div>
    <div class="fl_right">
      <ul id="rotation">
        <li><a href="#"><img src="images/1.jpg" alt="" /></a></li>
        <li><a href="#"><img src="images/2.jpg" alt="" /></a></li>
        <li><a href="#"><img src="images/3.jpg" alt="" /></a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>-->
			
			this is content
</div>
<!-- ####################################################################################################### -->
<!--<div class="wrapper col3">
  <div id="container">
    <div id="latest">
      <ul>
        <li>
          <h2>Indonectetus facilis leo nibh</h2>
          <p class="imgholder"><img src="images/4.jpg" alt="" /></p>
          <p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>
        </li>
        <li>
          <h2>Indonectetus facilis leo nibh</h2>
          <p class="imgholder"><img src="images/5.jpg" alt="" /></p>
          <p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>
        </li>
        <li class="last">
          <h2>Indonectetus facilis leo nibh</h2>
          <p class="imgholder"><img src="images/6.jpg" alt="" /></p>
          <p>Nullamlacus dui ipsum conseqlo bo rttis non euisque morbipen asda pibulum orna. <a href="#">More &raquo;</a></p>
        </li>
      </ul>
      <br class="clear" />
    </div>
    <div id="content">
      <h2>About This Free CSS Template</h2>
      <p>This is a W3C standards compliant free website template from <a href="http://www.cssmoban.com/" title="æ¨¡æ¿ä¹å®¶">æ¨¡æ¿ä¹å®¶</a>.</p>
      <p>This template is distributed using a <a href="#">Website Template Licence</a>, which allows you to use and modify the template for both personal and commercial use when you keep the provided credit links in the footer.</p>
      <p>For more CSS templates visit <a href="#">Free Website Templates</a>.</p>
      <p>Sedvestibulum rhoncus rhoncus mauris tincidunt mollis intesque elit arcu lor tempus. Feugiateget nis justo amet eger venean cras elit sociis morbi congue.</p>
      <p>Malesuadaipsum vel felit sed pede curabitae phasellus in morbi pellent cursuspendissim. Elisadipiscingillamcorper ut et eger adipit mi vestie vitae magnis ut in sapibusinterdum.</p>
    </div>
    <div id="column">
      <div class="holder">
        <h2 class="title"><img src="images/7.jpg" alt="" />Nullamlacus dui ipsum conseque loborttis</h2>
        <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat adipisciniapellentum leo.</p>
        <p class="readmore"><a href="#">Continue Reading &raquo;</a></p>
      </div>
    </div>
    <div class="clear"></div>
  </div>
</div>-->
<!-- ####################################################################################################### -->
<!--<div class="wrapper col4">
  <div id="footer">
    <div id="newsletter">
      <h2>Stay In The Know !</h2>
      <p>Please enter your email to join our mailing list</p>
      <form action="#" method="post">
        <fieldset>
          <legend>News Letter</legend>
          <input type="text" value="Enter Email Here&hellip;"  onfocus="this.value=(this.value=='Enter Email Here&hellip;')? '' : this.value ;" />
          <input type="submit" name="news_go" id="news_go" value="GO" />
        </fieldset>
      </form>
      <p>To unsubscribe please <a href="#">click here &raquo;</a></p>
    </div>
    <div class="footbox">
      <h2>Lacus interdum</h2>
      <ul>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li class="last"><a href="#">Praesent et eros</a></li>
      </ul>
    </div>
    <div class="footbox">
      <h2>Lacus interdum</h2>
      <ul>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li class="last"><a href="#">Praesent et eros</a></li>
      </ul>
    </div>
    <div class="footbox">
      <h2>Lacus interdum</h2>
      <ul>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Praesent et eros</a></li>
        <li><a href="#">Lorem ipsum dolor</a></li>
        <li><a href="#">Suspendisse in neque</a></li>
        <li class="last"><a href="#">Praesent et eros</a></li>
      </ul>
    </div>
    <br class="clear" />
  </div>
</div>-->
<!-- ####################################################################################################### -->
<div class="wrapper col5">
  <div id="copyright">
    <p class="fl_left">Copyright &copy;2017<a href="#">create by yl</a></p>
    
    <br class="clear" />
  </div>
</div>
</body>
</html>
