<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Plataforma Web - Examen Parcial</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    </head>
    <body>
        
        <h1>INFORMACION DE PAGO</h1><br>
        
        <form action="libros" method="post">  
        
        <label class="pad_top">Nom y Ape:</label>        
        <input type="text" name="nombre" value="${cliente.nombre}"><br>
        
        <label class="pad_top">Num. Tarje.:</label>        
        <input type="text" name="numTarj" value="${cliente.numTarj}"><br>
        
        <label class="pad_top">F. Exo.:</label>        
        <input type="text" name="fechExo" value="${cliente.fechExo}"><br>
        
        <label class="pad_top">Cod.Seg</label>        
        <input type="text" name="CodSeg" value="${cliente.CodSeg}"><br>
        
        <input type="submit" value="Realizar Compra" class="margin_left">
        
            <input type="hidden" name="action" value="pagar">
            <input type="hidden" name="codigo" value="">                                  
            
        </form>
    </body>
</html>
