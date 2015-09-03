<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
	<link href="<c:url value=" resources/css/style.css "/>" rel="stylesheet" />
	<link href="<c:url value=" resources/css/bootstrap.min.css "/>" rel="stylesheet">
	<link href="<c:url value=" resources/css/font-awesome.min.css "/>" rel="stylesheet">

	<script src="<c:url value=" resources/js/jquery.min.js "/>" type="text/javascript"></script>
	<script src="<c:url value=" resources/js/bootstrap.min.js "/>" type="text/javascript"></script>
	<script src="<c:url value=" resources/js/jscontroller/aplicationFormController.js "/>" type="text/javascript"></script>
</head>

<body>

<div id="header">

	<div id="menu">
		<ul class="menuClass">
			<li><a href="getCities">Міста</a>
			</li>
			<li><a href="getHotels">Готелі</a>
			</li>
			<li><a href="" data-toggle="modal" data-target="#myModal">Оформити
				візу</a>
			</li>
			<li><a href="" data-toggle="modal" data-target="#modalBooking">Зарезервувати
				номер</a>
			</li>
		</ul>
	</div>

	<div class="alert alert-success" role="alert" style="width: 150px;">
		<p>Дані збережено!</p>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Введіть свої
						особисті дані</h4>
					<p id="message"></p>
				</div>
				<div class="modal-body">
					<form action="apply" method="post" autocomplete="on" id="aplicationForm">
						<div class="form-group">
							<label for="exampleInputPassword1">Ім'я</label>
							<input type="text" class="form-control" name="fName">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Прізвище</label>
							<input type="text" class="form-control" name="sName">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Серія та номер паспорта
							</label>
							<input type="text" class="form-control" name="pasportNumber">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Адреса проживання</label>
							<input type="text" class="form-control" name="adress">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Телефон</label>
							<input type="text" class="form-control" name="tel">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Email</label>
							<input type="email" class="form-control" name="email">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Закрити</button>
							<button type="submit" class="btn btn-primary" id="myButton">Зберегти</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="modalBooking" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="labelModalBooking">Оберіть деталі
						резервування</h4>
				</div>
				<div class="modal-body">
					<form action="apply" method="post" autocomplete="on" id="bookingForm">
						<div class="form-group">
							<label for="exampleInputPassword1">Ім'я</label>
							<input type="text" class="form-control" name="fName">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Прізвище</label>
							<input type="text" class="form-control" name="sName">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Місто</label>
							<input type="text" class="form-control" name="pasportNumber">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Готель</label>
							<input type="text" class="form-control" name="adress">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Дата заселення</label>
							<input type="text" class="form-control" name="tel">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Дата виселення</label>
							<input type="email" class="form-control" name="email">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Закрити</button>
							<button type="submit" class="btn btn-primary" id="bookButton">Зберегти</button>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>


	<form action="findhotel" class="form-inline" id="form">
		<div class="form-group">
			<input type="email" class="form-control" id="exampleInputEmail2" placeholder="Введіть назву готеля">
		</div>
		<button type="submit" class="btn btn-default">Пошук</button>
	</form>

</div>

<div id="body">
	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" id="body">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			<li data-target="#carousel-example-generic" data-slide-to="3"></li>
			<li data-target="#carousel-example-generic" data-slide-to="4"></li>
			<li data-target="#carousel-example-generic" data-slide-to="5"></li>
			<li data-target="#carousel-example-generic" data-slide-to="6"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="<c:url value=" resources/jpg/foto_homepage/1.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/2.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/3.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/4.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/5.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/6.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
			<div class="item">
				<img src="<c:url value=" resources/jpg/foto_homepage/7.jpg "/>">
				<div class="carousel-caption" id="myCarusel">WEB TOURFIRM</div>
			</div>
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev"> <span class="sr-only">Previous</span>
		</a>
		<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next"> <span class="sr-only">Next</span>
		</a>
	</div>
</div>
</div>

</body>

</html>