<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<link rel="stylesheet"
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
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
					<s:if test="#session.currentUserType == '财务人员'">
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
					<s:elseif test="#session.currentUserType == '教师'">
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
						<a href="ce" class="collection-item active">出差报销</a>
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
					<form action="ce2" method="post" enctype="multipart/form-data">
						<div class="row">
							<div class="col s12">
								<h6>
									<strong>报销单位及人员信息</strong>
								</h6>
								<div class="input-field col s6">
									<input placeholder="请输入单位名称" id="project_name"
										name="project_name" type="text" class="validate"> <label
										for="project_name">单位</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s3">
									<input placeholder="姓名" id="teacher_name1" name="teacher_name1"
										type="text" class="validate"><label
										for="teacher_name1">报销人</label>
								</div>
								<div class="input-field col s3">
									<input id="teacher_type1" name="teacher_type1" type="text"
										class="validate"><label for="teacher_type1">职称（务）</label>
								</div>
								<div class="input-field col s3">
									<input placeholder="姓名" id="teacher_name2" name="teacher_name2"
										type="text" class="validate"><label
										for="teacher_name2">报销人</label>
								</div>
								<div class="input-field col s3">
									<input id="teacher_type2" name="teacher_type2" type="text"
										class="validate"><label for="teacher_type2">职称（务）</label>
								</div>
								<div class="input-field col s3">
									<input placeholder="姓名" id="teacher_name3" name="teacher_name3"
										type="text" class="validate"><label
										for="teacher_name3">报销人</label>
								</div>
								<div class="input-field col s3">
									<input id="teacher_type3" name="teacher_type3" type="text"
										class="validate"><label for="teacher_type3">职称（务）</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col s12">
								<div class="input-field col s3">
									<input id="option_test" name="option_test" type="number"
										class="validate"><label for="option_test">项目经费代码</label>
								</div>
								<div class="input-field col s8">
									<input id="buss_reason" name="buss_reason" type="text"
										class="validate"><label for="buss_reason">出差事由</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col s12">
								<h6>报销单据</h6>
							</div>
						</div>
						<div class="row">
							<div class="col s12">
								<div class="input-field col s4">
									<input placeholder="请输入整数" id="qu_bill" name="qu_bill"
										type="number" class="validate"><label for="qu_bill">单据数量</label>
								</div>

								<div class="file-field input-field col s8">
									<div class="waves-effect waves-light btn">
										<span>文件</span> <input type="file" name="file">

									</div>
									<div class="file-path-wrapper">
										<input class="file-path validate" type="text"
											placeholder="请上传单据，数量多时请用压缩文件">
									</div>
								</div>
							</div>

						</div>
						<div class="row">
							<div class="row">
								<div class="col s12">
									<ul class="collapsible" data-collapsible="accordion">
										<li><div class="collapsible-header active">预算条目</div>
											<div class="collapsible-body">
												<h6>出差地点</h6>
												<div class="row">
													<div class="col s12">
														<div class="input-field col s6">
															<select name="locationType" id="locationType">
																<option value="" disabled selected>请选择出差地点</option>
																<option value="1">省内</option>
																<option value="2">省外</option>
															</select>
														</div>
														<div class="input-field col s6">
															<input type="text" class="validate" id="location"
																name="location" placeholder="请输入出差地"><label
																for="location">出差地</label>
														</div>
													</div>
													<table class="bordered">
														<thead>
															<tr>
																<th>ID</th>
																<th>名称</th>
																<th>金额</th>
															</tr>
														</thead>
														<tbody>
															<s:iterator value="businessitems" id="list1">
																<tr>
																	<td><s:property value="#list1.busItemId" /></td>
																	<td><s:property value="#list1.busItemName" /></td>
																	<td>
																		<div class="input-field col s12">
																			<label for="money">RMB</label> <input id="itemMoney"
																				name="itemMoney" type="number" step="0.01"
																				class="validate">
																		</div>
																	</td>

																</tr>
															</s:iterator>

														</tbody>
													</table>
													<div class="row">
														<br>
														<div class="col s2 offset-s10"></div>
													</div>
												</div></li>
									</ul>
								</div>
							</div>

							<div class="col s12">
								<table>
									<thead>
										<tr>
											<th>核准报销金额</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><a class="btn-floating waves-effect waves-light red"><i
													class="material-icons">add</i></a></td>
										</tr>
									</tbody>
								</table>
							</div>
							<div class="col s12">
								<div class="input-field col s6">
									<input type="number" id="total_money"><label
										for="total_money">合计金额</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col s12">
								<h6>转卡人信息</h6>
								<div class="input-field col s2">
									<input type="text" id="teacher_id" name="teacher_id"
										placeholder="请输入登录账号"><label for="teacher_id">工号</label>
								</div>
								<div class="input-field col s3">
									<input type="text" id="teacher_name" name="teacher_name"
										placeholder=" "><label for="teacher_name">姓名</label>
								</div>
								<div class="input-field col s5">
									<input type="text" id="bank_id" name="bank_id" placeholder=" "><label
										for="bank_id">银行卡号</label>
								</div>
								<div class="input-field col s2">
									<input type="number" id="exp_money" name="exp_money"
										placeholder="RMB" step="0.01"><label for="exp_money">转账金额</label>
								</div>
								<a class="btn-floating waves-effect waves-light red"><i
									class="material-icons">add</i></a>
							</div>
						</div>


						<div class="row">
							<div class="right col offset-s2 s2">
								<button type="submit" class="btn teal waves-effect waves-light">提交</button>
							</div>
						</div>
					</form>
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
	<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>

	<!-- <![endif]--> -->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js"></script>
	<!--<![endif]-->

	<script type="text/javascript">
		
	</script>

</body>
</html>

