function makeTableEmpty() {
	$("thead>tr").empty();
	$("tbody>tr").empty();
}

function getAllCities() {
	var empty = makeTableEmpty();
	$
			.ajax({
				contentType : 'application/json',
				type : 'GET',
				url : 'getAllCities',
				dataType : 'json',
				success : function(result) {
					console.log(result);
					$("thead>tr")
							.append(
									"<th>id</th><th>Країна</th><th>Назва міста</th><th></th>");
					$.each(result.city,	function() {
										var tr1 = "<tr>";
										var tr2 = ("<td>" + this.idCity + "</td>");
										var tr3 = ("<td>" + this.country + "</td>");
										var tr4 = ("<td>" + this.name + "</td>");
										var tr5 = ("<td><button type=\"button\" onclick=\"getCity(" + this.idCity + ")\"><span><i class=\"fa fa-pencil fa-lg\"</i></span></button></td>");
										var tr6 = "</tr>";
										$("tbody").append(
												tr1 + tr2 + tr3 + tr4 + tr5
														+ tr6);
									});
					$('.table').show();
				}
			});
}


function getAllHotels() {
	var empty = makeTableEmpty();
	$
			.ajax({
				contentType : 'application/json',
				type : 'GET',
				url : 'getAllHotels',
				dataType : 'json',
				success : function(result) {
					console.log(result);
					$("thead>tr")
							.append(
									"<th>id</th><th>idCity</th><th>Назва </br> готелю</th><th>Категорія</th><th>Адреса</th><th>email</th><th>Телефон</th><th></th>");
					$.each(result.hotels, function() {
										var tr1 = "<tr>";
										var tr2 = ("<td>" + this.idHotel + "</td>");
										var tr3 = ("<td>" + this.idCity.name + "</td>");
										var tr4 = ("<td>" + this.hotelName + "</td>");
										var tr5 = ("<td>" + this.category + "</td>");
										var tr6 = ("<td>" + this.location + "</td>");
										var tr7 = ("<td>" + this.emailHotel + "</td>");
										var tr8 = ("<td>" + this.telHotel + "</td>");
										var tr9 = ("<td><span><i class=\"fa fa-pencil fa-lg\"</i></span></td>");
										var tr10 = "</tr>";
										$("tbody").append(
												tr1 + tr2 + tr3 + tr4 + tr5
														+ tr6 + tr7 + tr8 + tr9
														+ tr10);
									});
					$('.table').show();
				}
			});
}

function getCity(id) {

	var idCity = id.toString();
	var url = 'getCity/'+ idCity + '/';
	
	$.ajax({
		contentType : 'application/json',
		type : 'GET',
		url : url,
		dataType : 'json',
		success : function(result) {
			console.log(result);
			$('#idCity').attr('value', result.city.idCity);
			$('#cityName').attr('value', result.city.name);
			$('#country').attr('value', result.city.country);
			$('#updateForm').show();
		},
		error : function() {
			$(this).html("Error!");
		}
	});

}

function updateCity() {
	
	$('#updateForm').submit(function(e) {

		var frm = $('#updateForm');
		e.preventDefault();

		var data = {}
		var Form = this;

		//Gather Data also remove undefined keys(buttons)
		$.each(this, function(i, v) {
			var input = $(v);
			data[input.attr('name')] = input.val();
			delete data["undefined"];
		});
		
		console.log(data);
		console.log(frm.attr('method'));
		console.log(frm.attr('action'));
		
		$.ajax({
			type : frm.attr('method'),
			url : frm.attr('action'),
			data : JSON.stringify(data),
			contentType : 'application/json',
			dataType : 'json',
			success: function() {
					console.log("Response: success!");
			},
			error : function() {
				$(this).html("Error!");
			}
		});
	});
}

function getAdminName() {
	$.ajax({
		type : 'GET',
		url : 'getStatus',
		dataType : 'json',
		success : function(result) {
			if (result.loginStatus = true) {
				$('#aName').html(result.admin + " ");
				$('a#logstatus').html("logOut");
			}
			if (result.loginStatus = false) {
				$('#loginBlock').hide();
			}
		}
	});
}

$(document).ready(function() {
	var AdminName = getAdminName();
	$('#cities').click(getAllCities);
	$('#hotels').click(getAllHotels);
	$('#updateCity').click(updateCity);

});