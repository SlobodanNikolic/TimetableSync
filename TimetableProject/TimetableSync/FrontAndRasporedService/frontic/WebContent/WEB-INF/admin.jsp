<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
<script src="js/app-ajax.js" type="text/javascript"></script>

<script type="text/javascript" >
		function id(id){
			return document.getElementById(id);
		}

		function login(form){
			var ajax=new XMLHttpRequest();
			ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			ajax.send("username="+form.username.value+"&password="+form.password.value);
		}
		
		function upload(form){
			var form = document.getElementById('file-form');
			var fileSelect = document.getElementById('file-select');
			var uploadButton = document.getElementById('upload-button');
		}
	</script>
</head>
<body>
	<div id="login">
		<p>Logujte se:</p>
		<form method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="login">
			<input type="text" name="username" placeholder="username">
			<input type="password" name="password" placeholder="password">
			<input type="submit" value="Login" onclick="login(this.form)">
		</form>
	</div>
	<div id="unos">
		<p>Unesite raspored:</p>
		<form id="file-form" method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="fajl">
			<input name="fajl" id="file-select" type="file" accept=".csv">
			<input type="submit" id="upload-button" value="Potvrdi">
		</form>
	</div>
</body>
</html>