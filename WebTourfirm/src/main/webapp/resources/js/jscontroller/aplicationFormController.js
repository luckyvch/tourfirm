function apply() {
	
	$('#aplicationForm').submit(function(e) {

		var frm = $('#aplicationForm');
		e.preventDefault();

		var data = {}
		var Form = this;

		//Gather Data also remove undefined keys(buttons)
		$.each(this, function(i, v) {
			var input = $(v);
			data[input.attr('name')] = input.val();
			delete data["undefined"];
		});

		$.ajax({
			contentType : 'application/json',
			type : frm.attr('method'),
			url : frm.attr('action'),
			dataType : 'json',
			data : JSON.stringify(data),
			success: function() {
					$('#myModal').hide();
					console.log("Response: success!");
					$('.alert').show();
					$('.alert').hide(4000);
					$('#message').empty();
			},
			error : function() {
				$(this).html("Error!");
			}
		});

		

	});
}

$(document).ready(function() {
	$('#cityForm').hide();
	$('.alert').hide();
	$('#myButton').click(apply);
});