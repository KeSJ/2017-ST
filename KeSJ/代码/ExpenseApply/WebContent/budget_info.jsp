<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
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
			<li><a href="#">${currentUserName }</a></li>
			<li><a href="index.jsp">注销</a></li>
		</ul>
	</div>
	</nav> </header>
	<div class="container">
		<div class="row">
			<div class="col s12 m4 l3">
				<div class="collection">
					<s:if test="currentUserType == '财务人员'">
						<a href="load_exp_info" class="collection-item">报销信息</a>
						<a href="load_bud_info" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="ce" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="load_budget_pend" class="collection-item">预算申请审核</a>
						<a href="ce5" class="collection-item">出差报销审核</a>
						<a href="load_expense_pend" class="collection-item">项目报销审核</a>
						<a href="ce3" class="collection-item">统计分析</a>
						<a href="userinfo.jsp" class="collection-item">个人信息修改</a>
					</s:if>
					<s:elseif test="currentUserType == '教师'">
						<a href="load_exp_info" class="collection-item">报销信息</a>
						<a href="load_bud_info" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="ce" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="userinfo.jsp" class="collection-item">个人信息修改</a>
					</s:elseif>
					<s:else>
						<a href="user_info" class="collection-item">用戶管理</a>
						<a href="load_exp_info" class="collection-item">报销信息</a>
						<a href="load_bud_info" class="collection-item">预算信息</a>
						<a href="load_budget_req" class="collection-item">预算申请</a>
						<a href="ce" class="collection-item">出差报销</a>
						<a href="load_expense_req" class="collection-item">项目报销</a>
						<a href="load_budget_pend" class="collection-item">预算申请审核</a>
						<a href="ce5" class="collection-item">出差报销审核</a>
						<a href="load_expense_pend" class="collection-item">项目报销审核</a>
						<a href="ce3" class="collection-item">统计分析</a>
						<a href="userinfo.jsp" class="collection-item">个人信息修改</a>
					</s:else>
				</div>
			</div>

			<div class="col s12 m8 l9">
				<div class="card-panel white">
					<div class="row">
						<div class="col s12">
							<ul class="collapsible" data-collapsible="accordion">
								<li><div class="collapsible-header active">预算记录</div>
									<div class="collapsible-body">
										<table class="centered">
											<thead>
												<tr>
													<th data-field="project_name">项目名称</th>
													<th data-field="start_time">开始时间</th>
													<th data-field="end_time">结束时间</th>
													<th data-field="expense_time">申请时间</th>
													<th data-field="exp_result">申请结果</th>
												</tr>
											</thead>
											<tbody>
												<s:iterator value="budgets" id="list">
													<tr>
														<td><a href="load_bud_info?budId=${list.budId }">${list.projectName }</a></td>
														<td>${list.proStartTime }</td>
														<td>${list.proFinishTime }</td>
														<td>${list.budAppDate }</td>
														<td>${list.budState }</td>
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
								<li><div class="collapsible-header">申请预算信息</div>
									<div class="collapsible-body" style="padding: 2rem">
										<div class="row">
											<div class="col s12">

												<h6>
													<strong>预算信息</strong>
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
												<h6>预算条目</h6>
												<div class="row">
													<div class="col s12">
														<table>
															<thead>
																<tr>
																	<th style="color: teal">预算条目</th>
																	<th style="color: teal">预算金额</th>
																</tr>
															</thead>
															<tbody>
																<s:iterator value="budgetItems" id="list2">
																	<tr>
																		<td>${list2.budgetItemName }</td>
																		<td>${list2.budgetItemMoney }</td>
																	</tr>
																</s:iterator>
															</tbody>
														</table>
													</div>
												</div>
											</div>

											<div class="row">
												<div class="col s12">
													<table>
														<tr>
															<th style="color: teal">拒绝理由</th>
															<td>${budget.budRejectReason }</td>
														</tr>
													</table>
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
