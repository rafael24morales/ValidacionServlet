<%-- 
    Document   : Exito
    Created on : Dec 10, 2018, 9:46:37 AM
    Author     : rafaelm
--%>

<%@page import="com.utileria.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Etzito :D</h1>
        <% Usuario user = (Usuario) request.getAttribute("usuario");
        String nombre = user.getUsuario();
            %>
            <%= nombre %>
    </body>
</html>
