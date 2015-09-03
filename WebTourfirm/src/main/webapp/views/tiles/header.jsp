<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</div>
</body>

</html>