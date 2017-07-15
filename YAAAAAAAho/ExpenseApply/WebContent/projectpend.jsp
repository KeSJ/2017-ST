<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<a href="load_budget_pend" class="collection-item ">预算申请审核</a>
						<a href="ce5" class="collection-item">出差报销审核</a>
						<a href="load_expense_pend" class="collection-item active">项目报销审核</a>
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
						<a href="load_expense_pend" class="collection-item active">项目报销审核</a>
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
								<li><div class="collapsible-header active">
										待办项目报销<span class="new badge"></span>
									</div>
									<div class="collapsible-body">
										<table>
											<thead>
												<tr>
													<th data-field="project_id">项目报销ID</th>
													<th data-field="project_name">项目ID</th>
													<th data-field="teacher_req">申请人</th>
												</tr>
											</thead>
											<tbody>
												<s:iterator value="expenses" id="list">
													<tr>
														<td><a
															href="load_expense_pend?expense_id=${list.eId }">${list.eId }</td>
														<td>${list.budId }</a></td>
														<td>${list.eAppTea }</td>
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
								<li><div class="collapsible-header active">
										报销条目<span class="badge"><a href="#model1"
											class="modal-trigger btn waves-effect waves-teal"
											data-target="modal1">新增</a></span>
									</div>
									<div class="collapsible-body">

										<table class="bordered centered">

											<thead>
												<tr>
													<th data-field="id">条目编号</th>
													<th data-field="name">条目名</th>
													<th data-field="type">条目是否可用</th>
													<th data-field="control">操作</th>
												</tr>
											</thead>
											<tbody>
												<s:iterator value="expenseItemsAll" id="list4">
													<tr>
														<td><s:property value="#list4.expItemId" /></td>
														<td><s:property value="#list4.expItemName" /></td>
														<s:if test="#list4.expInuse == 1">
															<td>可用</td>
															<td><a
																href="stop_exp_item?itemId=<s:property value="#list4.expItemId" />"
																class="lighten-1  teal-text text-lighten-2">停用</a></td>
														</s:if>
														<s:else>
															<td style="color: red">不可用</td>
															<td><a
																href="start_exp_item?itemId=<s:property value="#list4.expItemId" />"
																class="lighten-1  teal-text text-darken-3">启用</a></td>
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
								<li><div class="collapsible-header">项目报销审批</div>
									<div class="collapsible-body" style="padding: 2rem">
										<div class="row">
											<div class="col s12">
												<h6>项目预算信息</h6>
											</div>
										</div>

										<div class="row">
											<div class="col s12">
												<h6>预算总计</h6>
												<table class="bordered">
													<tr>
														<th style="color: teal">总计</th>
														<td>${total_money_budget }</td>
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
																	<th style="color: teal">预算条目ID</th>
																	<th style="color: teal">预算条目名称</th>
																	<th style="color: teal">预算条目金额</th>
																</tr>
															</thead>
															<tbody>
																<s:iterator value="budgetItems" id="list2">
																	<tr>
																		<td>${list2.budgetItemId }</td>
																		<td>${list2.budgetItemName }</a></td>
																		<td>${list2.budgetItemMoney }</td>
																	</tr>
																</s:iterator>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="collapsible-body" style="padding: 2rem">
										<div class="row">
											<div class="col s12">
												<h6>报销单位及人员信息</h6>
												<table class="bordered">
													<tr>
														<th style="color: teal">单位</front></th>
														<td>${expense.eUnit }</td>
													</tr>

													<tr>
														<th style="color: teal">项目经费代码</th>
														<td>${expense.budId }</td>
													</tr>

												</table>

											</div>
										</div>

										<div class="row">
											<div class="col s12">
												<h6>报销单据</h6>
												<table>
													<tr>
														<s:if test="file_path == '0'">
															<th>无报销单据</th>
														</s:if>
														<s:else>
															<th><a href="${file_path }"
																class="btn waves-effect waves-light">单据下载</a></th>
														</s:else>
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
																	<th style="color: teal">核准报销金额</th>
																</tr>
															</thead>
															<tbody>
																<s:iterator value="expenseItems" id="list5">
																	<tr>
																		<td>${list5.expItemName }</td>
																		<td>${list5.expMoney }</td>
																	</tr>
																</s:iterator>
															</tbody>
														</table>
													</div>

													<div class="col s12">
														<table>
															<tr>
																<th style="color: teal">合计金额</th>
																<td>${total_money_expense }</td>
															</tr>
														</table>
													</div>
												</div>
												<div class="row">
													<div class="col s12">
														<h6>转卡人信息</h6>
														<table>
															<thead>
																<tr>
																	<th style="color: teal">工号</th>
																	<th style="color: teal">姓名</th>
																	<th style="color: teal">银行卡号</th>
																	<th style="color: teal">转账金额</th>
																</tr>
															</thead>
															<tbody>
																<s:iterator value="accepts" id="list3">
																	<tr>
																		<td>${list3.teacherId }</td>
																		<td>${list3.teacherName }</a></td>
																		<td>${list3.acceptCardId }</td>
																		<td>${list3.acceptSum }</td>
																	</tr>
																</s:iterator>
															</tbody>
														</table>

													</div>
												</div>
											</div>
										</div>


										<div class="row">
											<div class="col offset-s8">
												<a href="pass_expense?expense_id=${expense.eId }"
													class="btn  waves-effect waves-light">通过</a> <a
													class="btn  waves-effect waves-light red light-2 modal-trigger"
													data-target="modal_defuse" href="#defuse">拒绝</a>
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

	<div id="modal1" class="modal modal-fixed-footer">
		<form action="add_exp_item" method="post">
			<div class="modal-content grey lighten-5">
				<h5>新增条目</h5>
				<div class="row col s12">
					<div class="input-field col s8">
						<input id="exp_item_name" name="exp_item_name"
							placeholder="请确认后输入条目名" type="text" class="validate"> <label
							for="exp_item_name">条目名</label>
					</div>
					<div class="input-field col s4">
						<s:select list="budgetItemsAll" name="budget_item_id"
							id="budgetItemId" listKey="budgetItemId"
							listValue="budgetItemName" headerKey="" headerValue="请选择对应的预算条目"></s:select>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="submit"
					class="modal-action modal-close waves-effect waves-green btn-flat">确认</button>
			</div>
		</form>
	</div>
	<div id="modal_defuse" class="modal">
		<form action="reject_expense?expense_id=${expense.eId }" method="post">
			<div class="modal-content">
				<div class="row">
					<div class="input-field col s12">
						<input placeholder="请输入拒绝原因" class="validate" type="text"
							id="defuse_reason" name="defuse_reason"><label
							for="defuse_reason">拒绝理由</label>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="submit"
					class="modal-action modal-close waves-effect waves-green btn-flat">确认</button>
				<a href="#!"
					class="modal-action modal-close waves-effect waves-green btn-flat">取消</a>
			</div>
		</form>
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