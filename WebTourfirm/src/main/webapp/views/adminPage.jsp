<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="tables">
		<ul class="list-group">
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="cities">Міста</button>
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target=".bs-example-modal-sm">Update form</button>
			</li>
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="hotels">Готелі</button></li>
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="rooms">Кімнати</button></li>
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="visas">Візи</button></li>
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="clients">Клієнти</button></li>
			<li class="list-group-item"><button type="submit"
					class="btn btn-primary" id="booking">Бронювання</button></li>
		</ul>
	</div>


	<div id="table">
		<table class="table table-striped" class="emptyMe">
			<thead>
				<tr>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>

	<div class="btn-group" id="loginBlock">
		<button type="button" class="btn btn-primary dropdown-toggle"
			data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			<span id="aName"></span> <span class="caret"></span>
		</button>
		<ul class="dropdown-menu">
			<li><a id="logstatus" href="logOut"></a></li>
		</ul>
	</div>

	<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog"	aria-labelledby="mySmallModalLabel">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-body">
						<form action="updateCity" method="post" autocomplete="on" id="updateForm">
							<div class="form-group">
								<label for="exampleInputPassword1">Id</label> 
								<input type="text" class="form-control" id="idCity" name="idCity" value="" disabled>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Назва міста</label> 
								<input type="text" class="form-control" id="cityName" name="cityName" value="">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1">Країна</label> 
								<input type="text" class="form-control" id="country" name="country" value="">
							</div>
							
							<div class="modal-footer">
								<button type="button" class="btn btn-default" data-dismiss="modal">Закрити</button>
								<button type="submit" class="btn btn-primary" id="updateCity">Зберегти</button>
							</div>
						</form>
					</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Введіть нове місто</h4>
				</div>
				<div class="modal-body">
					<form action="addCity" method="post" autocomplete="on" id="addForm">
						<div class="form-group">
							<label for="exampleInputPassword1">Назва міста</label>
							<input type="text" class="form-control" id="cityName" name="cityName">
						</div>

						<div class="form-group">
							<label for="exampleInputPassword1">Країна</label>
							<input type="text" class="form-control" id="country" name="country">
						</div>
				
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Закрити</button>
							<button type="submit" class="btn btn-primary" id="addCity">Зберегти</button>
						</div>
					</form>
			  	</div>
			</div>
		</div>
	</div>


</body>
</html>