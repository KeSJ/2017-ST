<%@page import="booklib.model.SystemUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书管理系统-读者借阅情况查询</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
<meta name="author" content="Muhammad Usman">

<!-- The styles -->
<link id="bs-css" href="css/bootstrap-cerulean.min.css" rel="stylesheet">

<link href="css/charisma-app.css" rel="stylesheet">
<link href='bower_components/fullcalendar/dist/fullcalendar.css'
	rel='stylesheet'>
<link href='bower_components/fullcalendar/dist/fullcalendar.print.css'
	rel='stylesheet' media='print'>
<link href='bower_components/chosen/chosen.min.css' rel='stylesheet'>
<link href='bower_components/colorbox/example3/colorbox.css'
	rel='stylesheet'>
<link href='bower_components/responsive-tables/responsive-tables.css'
	rel='stylesheet'>
<link
	href='bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css'
	rel='stylesheet'>
<link href='css/jquery.noty.css' rel='stylesheet'>
<link href='css/noty_theme_default.css' rel='stylesheet'>
<link href='css/elfinder.min.css' rel='stylesheet'>
<link href='css/elfinder.theme.css' rel='stylesheet'>
<link href='css/jquery.iphone.toggle.css' rel='stylesheet'>
<link href='css/uploadify.css' rel='stylesheet'>
<link href='css/animate.min.css' rel='stylesheet'>

<link rel="shortcut icon" href="img/favicon.ico">
<script type="text/javascript">
	function search_barcode() {
		document.search.action = "search_barcode";
		document.search.submit();
	}
	function search_bookname() {
		document.search.action = "search_bookname";
		document.search.submit();
	}
</script>
</head>
<body>

	<!-- topbar starts -->
	<div class="navbar navbar-default" role="navigation">

		<div class="navbar-inner">
			<button type="button" class="navbar-toggle pull-left animated flip">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html"> <img
				alt="Charisma Logo" src="img/logo20.png" class="hidden-xs" /> <span>图书管理系统</span></a>

			<!-- user starts -->
			<div class="btn-group pull-right">
				<ul class="collapse navbar-collapse nav navbar-nav top-menu">
					<li><a href="" name="id"><i
							class="glyphicon glyphicon-user"></i>${currentUserName }</a></li>
					<li><a href="load_modify_pwd"><i
							class="glyphicon glyphicon-user"></i>修改密码</a>
					<li><a href="login.jsp"><i
							class="glyphicon glyphicon-user"></i>退出登录</a></li>
				</ul>
			</div>
			<!-- user ends -->

		</div>
	</div>
	<!-- topbar ends -->

	<div class="ch-container">
		<div class="row">

			<!-- left menu starts -->
			<div class="col-sm-2 col-lg-2">
				<div class="sidebar-nav">
					<div class="nav-canvas">
						<div class="nav-sm nav nav-stacked"></div>
						<ul class="nav nav-pills nav-stacked main-menu">
							<li class="nav-header">功能</li>

							<li><a class="ajax-link" href="load_blank"><span>
										主页</span></a></li>
							<li class="nav-header hidden-md">系统管理模块</li>
							<li><a class="ajax-link" href="manage_user"><span>
										系统用户管理</span></a></li>
							<li><a class="ajax-link" href="manage_reader_type"><span>
										读者类别管理</span></a></li>
							<li><a class="ajax-link" href="manage_reader"><span>
										读者信息管理</span></a></li>
							<li><a class="ajax-link" href="manage_publisher"><span>
										出版社管理</span></a></li>

							<li class="nav-header hidden-md">图书借阅模块</li>
							<li><a class="ajax-link" href="book"><span>
										图书信息管理</span></a></li>
							<li><a class="ajax-link" href="book_borrow"><span>
										图书借阅管理</span></a></li>
							<li class="accordion"><a href="book_return"><span>
										图书归还管理</span></a></li>

							<li class="nav-header hidden-md">查询模块</li>
							<li><a class="ajax-link" href="check_book"><span>
										图书借阅情况查询</span></a></li>
							<li><a class="ajax-link" href="check_reader"><span>
										读者借阅情况查询</span></a></li>

						</ul>
					</div>
				</div>
			</div>
			<!--/span-->
			<!-- left menu ends -->

			<div id="content" class="col-lg-10 col-sm-10">
				<!-- content starts -->
				<div>
					<ul class="breadcrumb">
						<li><a href="load_blank">主页</a></li>
						<li>读者借阅情况查询</li>
					</ul>
				</div>

				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>读者借阅情况查询</h2>
							</div>

							<div class="box-content">
								<form class="navbar-search pull-left" action="check_reader_search">
									<ul class="collapse navbar-collapse nav navbar-nav top-menu">
										<li><input placeholder="输入读者ID"
											class="search-query form-control col-md-10" name="massage"
											type="text" /></li>
										<li><input class="btn btn-primary btn-sm" value="查询"
											type="submit"></li>
									</ul>
								</form>

								<br>
								<table
									class="table table-striped table-bordered bootstrap-datatable datatable responsive">
									<thead>
										<tr>
											<th>读者ID</th>
											<th>图书条码</th>
											<th>借阅时间</th>
											<th>归还时间</th>
											<th>罚金</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="bookLendRecords" id="list">
											<tr>
												<td class="center"><s:property value="#list.readerid" /></td>
												<td class="center"><s:property value="#list.bookBarcode" /></td>
												<td class="center"><s:date name="#list.lendDate"
														format="yyyy-MM-dd hh:mm:ss" /> 
												<td class="center"><s:date name="#list.returnDate"
														format="yyyy-MM-dd hh:mm:ss" /> 
												<td class="center"><s:property value="#list.penalSum" /></td>
											</tr>
										</s:iterator>

									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
			<!--/#content.col-md-0-->
		</div>
		<!--/fluid-row-->

		<hr>

		<footer class="row">
		<p class="col-md-9 col-sm-9 col-xs-12 copyright">&copy; 图书管理系统 柯思佳</p>
		</footer>

	</div>
</body>
</html>
