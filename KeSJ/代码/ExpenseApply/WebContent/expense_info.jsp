<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.List"%>
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
					<s:if test="currentUserType == '财务人员'">
						<a href="" class="collection-item">报销信息</a>
						<a href="" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="#3" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="load_budget_pend" class="collection-item">预算申请审核</a>
						<a href="#4" class="collection-item">出差报销审核</a>
						<a href="load_expense_pend" class="collection-item">项目报销审核</a>
						<a href="#4" class="collection-item">统计分析</a>
						<a href="#4" class="collection-item">个人信息修改</a>
					</s:if>
					<s:elseif test="currentUserType == '教师'">
						<a href="" class="collection-item">报销信息</a>
						<a href="" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="#3" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="#4" class="collection-item">个人信息修改</a>
					</s:elseif>
					<s:else>
						<a href="#!" class="collection-item">用戶管理</a>
						<a href="" class="collection-item">报销信息</a>
						<a href="" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="#3" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="load_budget_pend" class="collection-item">预算申请审核</a>
						<a href="#4" class="collection-item">出差报销审核</a>
						<a href="load_expense_pend" class="collection-item">项目报销审核</a>
						<a href="#4" class="collection-item">统计分析</a>
						<a href="#4" class="collection-item">个人信息修改</a>
					</s:else>

				</div>
			</div>


			<div class="col s12 m8 l9">
				<div class="card-panel white">
					<div class="row">
						<div class="col s12">
							<ul class="collapsible" data-collapsible="accordion">
								<li><div class="collapsible-header active">报销记录</div>
									<div class="collapsible-body">
										<table class="centered">
											<thead>
												<tr>
													<th data-field="project_name">项目名称</th>
													<th data-field="expense_type">报销单ID</th>
													<th data-field="expense_time">申请时间</th>
													<th data-field="exp_result">申请结果</th>
												</tr>
											</thead>
											<tbody>
												<s:iterator value="expenses" id="list">
													<tr>
														<td>${list.proName }</td>
														<td><a href="load_exp_info?expId=${list.eId }">${list.eId }</a></td>
														<td>${list.eAppDate }</td>
														<s:if test="list.eResult == true">
															<td>通过</td>
														</s:if>
														<s:else>
															<td>不通过</td>
														</s:else>
													</tr>
												</s:iterator>
											</tbody>

										</table>
									</div></li>
							</ul>
						</div>
					</div>

					<div class="row">
						<div class="col s12">
							<ul class="collapsible" data-collapsible="accordion">
								<li><div class="collapsible-header">申请报销信息</div>
									<div class="collapsible-body" style="padding: 2rem">
										<div class="row">
											<div class="col s12">

												<h6>
													<strong>报销单位及人员信息</strong>
												</h6>

												<table class="bordered">
													<tr>
														<th style="color: teal">项目名称</front></th>
														<td>${budget.projectName }</td>
													</tr>
													<tr>
														<th style="color: teal">项目计划类别</th>
														<td>${ppcName }</td>
														<th style="color: teal">技术管理领域</th>
														<td>${tmaName }</td>
													</tr>
													<tr>
														<th style="color: teal">项目技术来源</th>
														<td>${ptrName }</td>
														<th style="color: teal">&nbsp;</th>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<th style="color: teal">开始日期</th>
														<td>${budget.proStartTime }</td>
														<th style="color: teal">结束日期</th>
														<td>${budget.proFinishTime }</td>
													</tr>


												</table>

											</div>
										</div>

										<div class="row">
											<div class="col s12">
												<h6>预算总计</h6>
												<table class="bordered">
													<tr>
														<th style="color: teal">总计</th>
														<td>${total_money }</td>
														<th style="color: teal">&nbsp;</th>
														<td>&nbsp;</td>
													</tr>
													<tr>
														<th style="color: teal">自筹和配套</th>
														<td>${budget.selfRaised }</td>
														<th style="color: teal">向省厅申请</th>
														<td>${budget.apply }</td>
													</tr>
												</table>
											</div>
										</div>

										<div class="row">
											<div class="col s12">
												<h6>报销条目</h6>
												<div class="row">
													<div class="col s12">
														<table>
															<thead>
																<tr>
																	<th style="color: teal">报销条目</th>
																	<th style="color: teal">报销金额</th>
																</tr>
															</thead>
															<tbody>
																<s:iterator value="expenseItems" id="list3">
																	<tr>
																		<td></td>
																	</tr>
																</s:iterator>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div></li>
							</ul>
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
