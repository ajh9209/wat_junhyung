<%@ page contentType="text/html; charset=UTF-8"%>
<!-- footer start -------------------------------------->
<footer class="section text-left">
	<div class="background-image background-image"
		style="background-image: url('http://placehold.it/1500X100/000000/000000')"></div>
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<i class="-plus fa fa-2x fa-copyright fa-fw text-inverse">WeAreTeam</i>
			</div>
			<div class="col-sm-4">
				<p class="lead text-center text-muted"></p>
			</div>
			<div class="col-sm-4">
				<div class="row">
					<div class="col-sm-12 hidden-xs text-right">
						<a href="http://www.google.com"><i
							class="fa fa-2x fa-fw fa-google-plus text-inverse"></i></a> <a
							href="https://github.com/"><i
							class="fa fa-2x fa-fw fa-git text-inverse"></i></a> <a href="#"><i
							class="fa fa-2x fa-angellist fa-fw pull-right text-inverse"></i></a>
						<a href="#"><i class="fa fa-2x fa-at fa-fw hub text-inverse"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</footer>
<!-- 
<script>

	//구글 캘린더 API 연동
	(function($) {
		$.googleEventCalcInfo = function(option) {
			var events = [];
			var data = {
				key : option.auth_key,
				timeMin : option.start_time,
				timeMax : option.end_time,
				timeZone : 'Asia/Seoul',
				singleEvents : true,
				maxResults : 99 };

			$.ajax({
				googleCalendarId : null				,
				url : 'https://www.googleapis.com/calendar/v3/calendars/'
						+ encodeURIComponent(option.client_id) + '/events',
				data : data,
				async : false,
				cache : false,
				startParam : false,
				endParam : false,
				timezoneParam : false,
				success : function(data) {
					if (data.error) {
						alert('Google Calendar API: ' + data.error.message,
								data.error.errors);
					} else if (data.items) {
						$.each(data.items, function(i, entry) {
							events.push({
								id : entry.id,
								summary : entry.summary,
								start : entry.start.date,
								end : entry.end.date,
								url : entry.htmlLink,
								location : entry.location,
								description : entry.description
								});
						});
					}
				},
				error : function(jqXHR, textStatus, errorThrown) {
					var errorMsg = 'status(code) : ' + jqXHR.status + '\n';
					errorMsg += 'statusText : ' + jqXHR.statusText + '\n';
					errorMsg += 'responseText : ' + jqXHR.responseText + '\n';
					errorMsg += 'textStatus : ' + textStatus + '\n';
					errorMsg += 'errorThrown : ' + errorThrown;
					alert(errorMsg);
					return false;
				}
			});
			return events;
		};

	})(jQuery);
</script>
 -->
 
<script src="../js/watScript.js"></script>
</body>
</html>