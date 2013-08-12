function loadForm(props) {
	props = props || {};
	props.params = props.params || {};
	props.url = props.url;
	props.data = props.data || '';
	props.container = props.container;
	props.callback = props.callback || function() {
	};
	YUI.use('node', 'io', function(Y) {
		Y.io(props.url, {
			data : props.data,
			type : "get",
			on : {
				success : function(data) {
					Y.one(container).setHTML(data);
					props.callback();
				}
			}
		});
	})
}
function changeHeading(heading) {
	YUI().use('node', function(Y) {
		Y.one('#pageHeading .pageHeading').setHTML(heading);
	});
}

function changeTitle(title) {
	document.title = title;
}
