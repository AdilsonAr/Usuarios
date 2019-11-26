<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios</title>
</head>
<body>

<%!String metodo="post"; %>

<form action="Conector" method= <%=metodo %>>

Nombre: <input type="text" name="nombre"><br><br>
Apellido: <input type="text" name="apellido"><br><br>

<input type="radio" name="metodo" value="1" checked="checked">Usar metodo get<br>
<input type="radio" name="metodo" value="2">Usar metodo post<br><br>

<input type="submit" value="Enviar">

</form>

</body>
</html>