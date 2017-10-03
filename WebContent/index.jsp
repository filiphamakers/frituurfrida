<%@page language="java" contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@page import="java.time.LocalDateTime,java.time.DayOfWeek"%>
<!doctype html>
<html>
<head>
<title>Frituur Frida</title>
</head>
<body>
	<%
		DayOfWeek dag = LocalDateTime.now().getDayOfWeek();
		out.print("We zijn vandaag ");
		out.print(dag.equals(DayOfWeek.MONDAY) || dag.equals(DayOfWeek.THURSDAY)?"gesloten":"open");
	%>
</body>
</html>