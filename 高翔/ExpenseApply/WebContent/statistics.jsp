<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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

	<header class="page-header">
		<nav class="white" role="navigation">
			<div class="nav-wrapper container">
				<a id="logo-container" href="main.html" class="brand-logo bt">学校报销系统</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="index.html">注销</a></li>
					<li><a href="#">联系管理员</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<div class="container">
		<div class="row">
			<div class="col s12 m4 l3">
				<div class="collection">
				
					<a href="main.html" class="collection-item">用戶管理</a> <a
						href="budgetrequest.html" class="collection-item">预算申请</a> <a
						href="bussexp.html" class="collection-item">出差报销</a> <a
						href="projectexp.html" class="collection-item">项目报销</a> <a
						href="budgetpend.html" class="collection-item">预算申请审核</a> <a
						href="busspend.html" class="collection-item">出差报销审核</a> <a
						href="projectpend.html" class="collection-item">项目报销审核</a> <a
						href="#!" class="collection-item active">统计分析</a>
				</div>
			</div>

			<div class="col s12 m8 l9">
				<div class="card-panel white">
				<form action="ce3" method="post" >
					<h6>统计教师及其项目</h6>
					<br>
					<div class="row">
						<div class="input-field col s3">
							<input type="text" id="teacher_id" name="teacher_id" class="validate" placeholder="请输入教师工号"><label for="teacher_id">教师工号</label>
						</div>
						<div class="input-field col s6">
							<input class="validate" type="number" id="project_id" name="project_id" placeholder="请输入项目ID"
								> <label for="project_id">项目ID</label>
						</div>
						<div class="input-field col s3">
							<button class="btn waves-effect waves-light" type="submit">确定</button>
						</div>
					</div>
					</form>
					<form action="ce4" method="post" >

					<div class="row">
						<div class="col s12">
							<ul class="collapsible popout" data-collapsible="expandable">
								<li><div class="collapsible-header">已审核预算</div>
									<div class="collapsible-body">
										<table class="bordered centered">
											<thead>
												<tr>
													<th data-field="project_name">项目名称</th>
													<th data-field="total_money">总计</th>
											
													<th data-field="own_mony">自筹和配套</th>
													
													<th data-field="agencies_money">向省厅申请</th>
													<th data-field="leave_agencies">省厅剩余</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>${project_name}</td>
													<td>${sum}</td>												
													<td>${selfRaised}</td>
													<td>${apply}</td>													
													<td>${rest}</td>
												</tr>
											</tbody>
										</table>
									</div></li>
								
								<li><div class="collapsible-header">出差报销</div>
									<div class="collapsible-body">
										<table class="bordered centered">
											<thead>
												<tr>
													<th data-field="project_name">报销项目名称</th>
													<th data-field="total_money">总计</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>${project_name}</td>
													<td>${csum}</td>
													
												</tr>
											</tbody>
										</table>
									</div></li>
								
							</ul>
						</div>
					</div>
					

					<div class="row">
						<div class="col s12">
							<h6>导出Excel文件</h6>
							
						
							
							<button class="btn waves-effect waves-light" type="submit">导出到本地</button>
						</div>
					</div>
					</form>
					
					
					<div class="row">
					<div class="col s12">
					<h6>统计表单</h6></div></div>
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