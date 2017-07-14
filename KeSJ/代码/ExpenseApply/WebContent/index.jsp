<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Parallax Template - Materialize</title>

<!-- CSS  -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" media="all"
	href="//manage-cdn.eadbox.com/assets/registrations-d4dbbb2c0e2ab78ab9816d289ea0ad8ef625d7506161c40ccba973e7ec3e9476.css" />
<script
	src="//manage-cdn.eadbox.com/assets/registrations-d43c5933c35a7f2420208ad2a1eaa43d22573cea2a50128caadd41db16e0561a.js"></script>
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token"
	content="Z03pw5YCeiV9vdQ4MbkM/vvGb7AlrgESpVipL+8HiDNK41NX7cT5qjaEm6ivkVuBbk3RTLn5Mf/E1fhW81C9RA==" />

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
</head>
<body>
	<nav class="white" role="navigation">
	<div class="nav-wrapper container">
		<a id="logo-container" href="#" class="brand-logo">学校报销系统</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="#">${currentUserName }</a></li>
			<li><a href="index.jsp">注销</a></li>
		</ul>
	</div>
	</nav>

	<div id="index-banner" class="parallax-container">
		<div class="section no-pad-bot">

			<div class="container">

				<h1 class="header center teal-text text-lighten-2">
					<br> 浙江大学城市学院
				</h1>
				<div class="row center">
					<h5 class="header col s12 light">在线报销系统</h5>
				</div>
			</div>
		</div>
		<div class="parallax">
			<img src="background1.jpg" alt="Unsplashed background img 1">
		</div>
	</div>


	<div class="row">
		<div id="toast-container"></div>

		<div class="row">
			<div class="wrapper">
				<div class="container">
					<h2 class="center-align blue-grey-text text-darken-2 light">登录</h2>
					<div class="row">
						<div class="col s6 offset-s3 m6 offset-m3">
							<div class=card-panelteal">
								<div class="trial-form cf centralize">
									<form class="simple_form user-login" novalidate="novalidate"
										id="new_user" action="login" accept-charset="UTF-8"
										method="post">
										<input name="utf8" type="hidden" value="&#x2713;" /><input
											type="hidden" name="authenticity_token"
											value="VbW0fL3SXRyIJl6EkiQWE7dipPKX/cL4vMtJfOUpwnV4Gw7oxhTek8MfERQMDEFsIukaDguq8hXdRhgF+X73Ag==" />
										<div class="row">
											<div class="col m8 offset-m2 s12">
												<div class="row email optional user_email">
													<div class="input-field col s12">
														<label class="email optional control-label"
															for="user_email">用户名</label><input
															class="string email optional" placeholder="教职工编号"
															type="text" name="user_email" id="user_email" /><span
															class="help-block">请输入您的教职工编号</span>
													</div>
												</div>
												<div class="row password optional user_password">
													<div class="input-field col s12">
														<label class="password optional control-label"
															for="user_password">密码</label><input
															class="password optional" placeholder="密码"
															type="password" name="user_password" id="user_password" /><span
															class="help-block">请输入密码</span>
													</div>
												</div>
												<h6>${returnMsg }</h6>
												<div class="center input-field row">
													<button type="submit"
														class="btn btn-large green waves-effect waves-light s12 col">登录
													</button>
												</div>
												<p class="shared-links">
													<br /> <a href="/password/new">忘记密码?</a><br />
												</p>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>




			<footer class="page-footer teal">
			<div class="container">
				<div class="row">
					<div class="col l6 s12">
						<h5 class="white-text">浙江大学城市学院</h5>
						<p class="grey-text text-lighten-4">浙江大学城市学院成立于1999年7月，是经国家教育部和浙江省人民政府批准设立，由浙江大学、杭州市人民政府合作办学，并与浙江省邮电管理局（现为浙江省电信实业集团）共同发起创办的一所新型普通本科高校。</p>


					</div>
					<div class="col l3 s12">
						<h5 class="white-text">校内链接</h5>
						<ul>
							<li><a class="white-text" href="http://10.61.2.6/">办公网</a></li>
							<li><a class="white-text" href="https://bb.zucc.edu.cn/">Blackboard教学平台</a></li>
							<li><a class="white-text" href="http://webmail.zucc.edu.cn/">校内邮件系统</a></li>
							<li><a class="white-text"
								href="http://www.zucc.edu.cn/index.php?c=index&a=tlist&catid=55">学院校历</a></li>
						</ul>
					</div>
					<div class="col l3 s12">
						<h5 class="white-text">友情链接</h5>
						<ul>
							<li><a class="white-text" href="http://www.zucc.edu.cn/">浙江大学城市学院</a></li>
							<li><a class="white-text" href="http://jsxy.zucc.edu.cn/">计算分院</a></li>
							<li><a class="white-text"
								href="http://libweb.zucc.edu.cn/redir.php?catalog_id=45">数字资源专用VPN</a></li>
							<li><a class="white-text"
								href="http://www.zucc.edu.cn/index.php?c=index&a=tlist&catid=56">电话查询</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="footer-copyright">
				<div class="container">
					Made by <a class="orange-text text-lighten-3"
						href="http://materializecss.com">柯思佳 高翔 刘佳鹏</a>
				</div>
			</div>
			</footer>


			<!--  Scripts-->
			<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
			<script src="js/materialize.js"></script>
			<script src="js/init.js"></script>
</body>
</html>
