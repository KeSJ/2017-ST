<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0" />
<title>Starter Template - Materialize</title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<style>
html, body, .block {
	height: 100%;
}

nav ul li a:hover, nav ul li a.active {
	background-color: rgba(255, 255, 255);
}

footer {
	padding-left: 0;
}
</style>
</head>
<body>

	<header class="page-header"> <nav class="white"
		role="navigation">
	<div class="nav-wrapper container">
		<a id="logo-container" href="main.html" class="brand-logo bt">学校报销系统</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="index.html">注销</a></li>
			<li><a href="#">联系管理员</a></li>
		</ul>
	</div>
	</nav> </header>
	<div class="container">
		<div class="row">
			<div class="col s12 m4 l3">
				<div class="collection">
					<a href="main.html" class="collection-item">用戶管理</a> <a
						href="budgetrequest.html" class="collection-item">预算申请</a> <a
						href="bussexp.html" class="collection-item">出差报销</a> <a
						href="projectexp.html" class="collection-item">项目报销</a> <a
						href="#!" class="collection-item active">预算申请审核</a> <a
						href="busspend.html" class="collection-item">出差报销审核</a> <a
						href="projectpend.html" class="collection-item">项目报销审核</a> <a
						href="statistics.html" class="collection-item">统计分析</a>
				</div>
			</div>

			<div class="col s12 m8 l9">
				<div class="card-panel white">
					<div class="row">
						<div class="col s12">
							<ul class="collapsible" data-collapsible="accordion">
								<li><div class="collapsible-header active">
										待办预算<span class="new badge">4</span>
									</div>
									<div class="collapsible-body">
										<table>
											<thead>
												<tr>
													<th data-field="project_name">项目名称</th>
													<th data-field="teacher_req">申请人</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>project 1</td>
													<td>teacher 1</td>
											</tbody>
										</table>
									</div></li>
							</ul>
						</div>
					</div>

					<div class="row">
						<div class="col s12">
							<ul class="collapsible" data-collapsible="accordion">
								<li><div class="collapsible-header">
										预算条目<span class="badge">6</span>
									</div>
									<div class="collapsible-body" style="padding: 2rem">
										<label for id="chips1">增加条目输入后按回车</label>
										<div class="chips chips-initial" id="chips1"></div>
									</div></li>
							</ul>
						</div>
					</div>

					<div class="row">
						<div class="col s12">
							<table>
								<tr>
									<th data-field="a">a</th>
									<th data-field="b">b</th>
								</tr>
								<tbody>									 
									<td><button class="btn waves-effect waves-light" type="button" name="add" onclick="add()"></button></td></tbody>
							</table>
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
				<h5 class="white-text">Company Bio</h5>
				<p class="grey-text text-lighten-4">We are a team of college
					students working on this project like it's our full time job. Any
					amount would help support and continue development on this project
					and is greatly appreciated.</p>


			</div>
			<div class="col l3 s12">
				<h5 class="white-text">Settings</h5>
				<ul>
					<li><a class="white-text" href="#!">Link 1</a></li>
					<li><a class="white-text" href="#!">Link 2</a></li>
					<li><a class="white-text" href="#!">Link 3</a></li>
					<li><a class="white-text" href="#!">Link 4</a></li>
				</ul>
			</div>
			<div class="col l3 s12">
				<h5 class="white-text">Connect</h5>
				<ul>
					<li><a class="white-text" href="#!">Link 1</a></li>
					<li><a class="white-text" href="#!">Link 2</a></li>
					<li><a class="white-text" href="#!">Link 3</a></li>
					<li><a class="white-text" href="#!">Link 4</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="footer-copyright">
		<div class="container">
			Made by <a class="orange-text text-lighten-3"
				href="http://materializecss.com">Materialize</a>
		</div>
	</div>
	</footer>


	<!--  Scripts-->
	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>

</body>
</html>

<script>
function add() { 
			
	        var trObj = document.createElement("tr");  
	        trObj.id = new Date().getTime();  
	        trObj.innerHTML = "<td><input name='firstName'/></td><td><input name='lastName'/></td>";  
	        document.getElementById("tb").appendChild(trObj);  
	    } 
</script>