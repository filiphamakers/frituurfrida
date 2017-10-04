<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!doctype html>
<html>
<head>
<title>Frituur Frida</title>
<link rel="stylesheet" href="styles/default.css">
<link rel="shortcut icon" href="images/favicon.ico">
</head>
<body>
	<h1>Frituur Frida</h1>
	<p>${adres.straat} ${adres.huisNr} ${adres.gemeente.naam} ${adres.gemeente.postcode}</p>
	<p>Wij zijn vandaag ${openGesloten}</p>
	<img src="images/${openGesloten}.png" alt="${openGesloten}">
</body>
</html>