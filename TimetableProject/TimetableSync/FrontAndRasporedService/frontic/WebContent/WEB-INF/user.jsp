<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Client</title>
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
		
		function register(form){
			var ajax=new XMLHttpRequest();
			ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			ajax.send("username="+form.username.value+"&password="+form.password.value);
		}
		
	</script>

</head>
<body>
<div id="registracija">
		<p>Registrujte se:</p>
		<form method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="registracija">
			<input type="text" name="username" placeholder="username">
			<input type="password" name="password" placeholder="password">
			<input type="submit" value="Potvrdi" onclick="register(this.form)">
		</form>
	</div>
	<div id="login">
		<p>Logujte se:</p>
		<form method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="login">
			<input type="text" name="username" placeholder="username">
			<input type="password" name="password" placeholder="password">
			<input type="submit" value="Login" onclick="login(this.form)">
		</form>
	</div>
	<div id="pretraga">
		<p>Pretrazite raspored:</p>
		<form method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="pretraga">
			<select name="grupa">
				<option value="" disabled selected>GRUPA</option>
			    <option value="101">101</option>
			    <option value="102">102</option>
			    <option value="103">103</option>
				<option value="104">104</option>
				<option value="105">105</option>
				<option value="106">106</option>
				<option value="1d1">1d1</option>
				<option value="1s1">1s1</option>
				<option value="1s2">1s2</option>
				<option value="201">201</option>
				<option value="202">202</option>
				<option value="203">203</option>
				<option value="204">204</option>
				<option value="205">205</option>
				<option value="206">206</option>
				<option value="2d1">2d1</option>
				<option value="2d2">2d2</option>
				<option value="2s1">2s1</option>
				<option value="2s2">2s2</option>
				<option value="301">301</option>
				<option value="302">302</option>
				<option value="303">303</option>
				<option value="304">304</option>
				<option value="305">305</option>
				<option value="306">306</option>
				<option value="307">307</option>
				<option value="308">308</option>
				<option value="309">309</option>
				<option value="310">310</option>
				<option value="312">312</option>
				<option value="313">313</option>
				<option value="314">314</option>
				<option value="317">317</option>
				<option value="319">319</option>
				<option value="3s1">3s1</option>
				<option value="3s2">3s2</option>
				<option value="401">401</option>
				<option value="402">402</option>
				<option value="403">403</option>
			</select>
			<select name="ucionica">
				<option value="" disabled selected>UCIONICA</option>
				<option value="CET8">CET8</option>
				<option value="KOLARAC">Kolarac</option>
				<option value="PROFESORSKIKABINET">Profesorski kabinet</option>
				<option value="RG1">RG1</option>
				<option value="RG3">RG3</option>
				<option value="RG7">RG7</option>
				<option value="RG9">RG9</option>
			    <option value="U1">U1</option>
			    <option value="U2">U2</option>
			    <option value="U3">U3</option>
				<option value="U4">U4</option>
				<option value="U5">U5</option>
				<option value="U6">U6</option>
				<option value="U7">U7</option>
				<option value="U8">U8</option>
				<option value="U9">U9</option>

			</select>
			<select name="dan">
				<option value="" disabled selected>DAN</option>
			    <option value="pon">Ponedeljak</option>
			    <option value="uto">Utorak</option>
			    <option value="sre">Sreda</option>
				<option value="cet">Cetvrtak</option>
				<option value="pet">Petak</option>
			</select>
			<input type="submit" value="Prikazi">
		</form>
	</div>
	<div id="sync">
		<p>Sinhronizujte sa Google calendarom:</p>		
		<form method="post" action="http://localhost:8080/">
			<input type="hidden" name="Id" value="sync">
			<input type="submit" value="Sinhronizuj">
		</form>
	</div>
</body>
</html>