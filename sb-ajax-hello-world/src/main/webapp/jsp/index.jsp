<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	  $("#h").click(function(){
		  alert("click")
	    $(this).hide();
	  });
	  $.ajax({
		    url: '/goaction',
		    type: 'POST',   
		    data: { id: 'value' },
		    success: function (data) {
		        alert("success");
		    },
		    error: function () {
		        alert('error');
		    }
		});  
	  
	  
	});
</script>

</head>
<body>
	<h1 align="center" id="h">hey there i am using ajax with the help of
		spring boot</h1>

	<div class="login" align="center">


		<form class="login-container">

			<p>
				<input type="email" placeholder="Email">
			</p>

			<p>
				<input type="password" placeholder="Password">
			</p>

			<p>
				<input type="submit" value="Log in" onclick="save()">
			</p>

		</form>

	</div>


</body>
</html>

