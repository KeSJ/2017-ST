<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="expense.model.ProPlanCategory"%>
<%@page import="expense.model.ProTecRes"%>
<%@page import="expense.model.TecMngArea"%>
<%@page import="expense.model.BudgetItem"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

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
					<a href="main.html" class="collection-item">用戶管理</a> <a href="#!"
						class="collection-item active">预算申请</a> <a href="bussexp.html"
						class="collection-item">出差报销</a> <a href="projectexp.html"
						class="collection-item">项目报销</a> <a href="budgetpend.html"
						class="collection-item">预算申请审核</a> <a href="busspend.html"
						class="collection-item">出差报销审核</a> <a href="projectpend.html"
						class="collection-item">项目报销审核</a> <a href="statistics.html"
						class="collection-item">统计分析</a>
				</div>
			</div>

			<div class="col s12 m8 l9">
				<div class="card-panel white">
					<form action="budget_request">
						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									<input placeholder="请输入项目名称" id="project_name" type="text"
										class="validate"> <label for="project_name">项目名称</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									
									<s:select list="publishers" name="pubid" id="pubid"
										listKey="pubid" listValue="publisherName"></s:select>
									<select>
										<option value="" disable selected></option>
										<option value="">option test</option>
									</select> <label>项目计划类别</label>
								</div>

								<div class="input-field col s6">
									<select>
										<option value="" disable selected></option>
										<option value="">option test</option>
									</select> <label>技术管理领域</label>
								</div>



								<div class="input-field col s6">
									<select>
										<option value="" disable selected></option>
										<option value="">option test</option>
									</select> <label>项目技术来源</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									<label class=" " for="start_time">开始日期</label> <input
										placeholder="" id="start_time" type="text" class="datepicker">
								</div>
								<div class="input-field col s6">
									<label for="end_time">结束日期</label> <input placeholder=""
										id="end_time" type="text" class="datepicker">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s4">
									<input placeholder="RMB" id="total_price" type="number"
										class="validate"> <label for="project_name">总计</label>
								</div>

								<div class="input-field col s4">

									<input placeholder="RMB" id="my_price" type="number"
										class="validate"> <label for="project_name">自筹和配套</label>
								</div>

								<div class="input-field col s4">

									<input placeholder="RMB" id="agencies_price" type="number"
										class="validate"> <label for="project_name">向省厅申请</label>
								</div>

							</div>
						</div>
						<table class="bordered responsive-table">
							<thead>
								<tr>
									<th>预算类目</th>
									<th>预算金额</th>
									<th>预算类目</th>
									<th>预算金额</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>item1</td>
									<td>
										<div class="input-field col s12">
											<label for="money">RMB</label> <input id="money"
												type="number" class="validate">
										</div>
									</td>
									<td>item1</td>
									<td>
										<div class="input-field col s12">
											<label for="money">RMB</label> <input id="money"
												type="number" class="validate">
										</div>
									</td>
								</tr>
								<tr>
									<td>item1</td>
									<td>
										<div class="input-field col s12">
											<label for="money">RMB</label> <input id="money"
												type="number" class="validate">
										</div>
									</td>
									<td>item1</td>
									<td>
										<div class="input-field col s12">
											<label for="money">RMB</label> <input id="money"
												type="number" class="validate">
										</div>
									</td>
								</tr>
								<tr>
									<td>item1</td>
									<td>
										<div class="input-field col s12">
											<label for="money">RMB</label> <input id="money"
												type="number" class="validate">
										</div>
									</td>
								</tr>
								</tobody>
						</table>
					</form>
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
