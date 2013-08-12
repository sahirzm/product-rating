function loadForm(props) {
	props = props || {};
    props.params = props.params || {};
    props.url = props.url;
    props.data = props.data || '';
    props.container = props.container;
    props.callback = props.callback || function(){};
    $.ajax({
		url : BASE_URL + props.url,
		type : "get",
		data : props.data,
		success : function(data) {
			$(container).html(data);
			props.callback();
		}
	});
}

function submitForm(props) {
	props = props || {};
    props.params = props.params || {};
    props.id = props.id;
    props.url = props.url;
    props.container = props.container;
    props.success = props.success || function(){};
    props.error = props.error || function(){};

	$.ajax({
		url : BASE_URL + props.url,
		type : "POST",
		data : $(props.id).serialize(),
		success : function(data) {
			try {
				var json = $.parseJSON(data);
				$.each($("#"+props.id+" div.error"), function(value) {
					$(this).removeClass("error");
				});
				$.each($("#"+props.id +" input"), function(value){
					$(this).tooltip("destroy");
				});
				$.each($("#"+props.id +" textarea"), function(value){
					$(this).tooltip("destroy");
				});
				$.each($("#"+props.id +" select"), function(value){
					$(this).tooltip("destroy");
				});
				$.each(json, function(key, value) {
					$('#'+key).parent().addClass("error");
					$('#'+key).tooltip({
						trigger: "focus",
						title: value,
						placement: "bottom"
					});
				});
				props.error();
			} catch (ex) {
				$(container).html(data);
				props.success();
			}
		}
	});
}

function changeHeading(heading) {
	$('#pageHeading .pageHeading').html(heading);
}

function changeTitle(title) {
	document.title = title;
}

$(function() {
	$(document).ajaxSend(function(event, request, settings) {
		$('#ajaxIndicator').show();
	});

	$(document).ajaxError(function(jqXHR, textStatus, errorThrown) {
		console.log(errorThrown);
		alert("Some Error occured..");
	});

	$(document).ajaxComplete(function(event, request, settings) {
		$('#ajaxIndicator').hide();
	});
});