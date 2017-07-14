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
			<li><a href="#">${currentUserName }</a></li>
			<li><a href="index.html">注销</a></li>
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
					<form action="budget_request" method="post">
						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									<input placeholder="请输入项目名称" id="project_name"
										name="project_name" type="text" class="validate"> <label
										for="project_name">项目名称</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									<s:select list="proPlanCategories" name="ppcCode" id="ppcCode"
										listKey="ppcCode" listValue="ppcName" headerKey=""
										headerValue="请选择"></s:select>
									<label>项目计划类别</label>
								</div>

								<div class="input-field col s6">
									<s:select list="tecMngAreas" name="tmaCode" id="tmaCode"
										listKey="tmaCode" listValue="tmaName" headerKey=""
										headerValue="请选择"></s:select>
									<label>技术管理领域</label>
								</div>

								<div class="input-field col s6">
									<s:select list="proTecReses" name="ptrCode" id="ptrCode"
										listKey="ptrCode" listValue="ptrName" headerKey=""
										headerValue="请选择"></s:select>
									<label>项目技术来源</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s6">
									<label for="start_time">开始日期</label> <input id="start_time"
										name="start_time" type="text" class="datepicker">
								</div>
								<div class="input-field col s6">
									<label for="end_time">结束日期</label> <input id="end_time"
										name="end_time" type="text" class="datepicker">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s4">
									<input placeholder="RMB" id="my_price" name="my_price"
										type="number" step="0.01" class="validate"> <label
										for="project_name">自筹和配套</label>
								</div>

								<div class="input-field col s4">

									<input placeholder="RMB" id="agencies_price"
										name="agencies_price" type="number" step="0.01"
										class="validate"> <label for="project_name">向省厅申请</label>
								</div>

							</div>
						</div>
						<table class="bordered responsive-table">
							<thead>
								<tr>
									<th>预算类目</th>
									<th>预算金额</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="budgetItems" id="list">
									<tr>
										<td><s:property value="#list.budgetItemName" /></td>
										<td>
											<div class="input-field col s12">
												<label for="money">RMB</label> <input id="itemMoney"
													name="itemMoney" type="number" step="0.01" class="validate">
											</div>
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<div class="row">
							<br>
							<div class="col s2 offset-s10">
								<button type="submit" class="btn teal waves-effect waves-light" onsubmit="return_page()" >提交</button>
									<!-- data-target="submit_success" -->
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="submit_success" class="modal">
		<div class="modal-content">
			<h6 style="text-align: center">提交成功(正在跳转)</h6>
			<h6 style="text-align: center">
				<a href="main.jsp">若没有自动跳转请点击</a>
			</h6>
			<div class="progress">
				<div class="indeterminate"></div>
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
