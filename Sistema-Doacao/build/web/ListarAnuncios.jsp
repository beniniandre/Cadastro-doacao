<%@page import="br.com.Model.Anuncio"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="br.com.Model.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTA DE ANÚNCIOS</h1>
        <%
            DAO dao = new DAO();
            List list = dao.obtemLista();
            Iterator it = list.iterator();
        %>
           <table border="1" cellspacing="3" cellpadding="5"/>
                <thead>
                    <tr>
                        <th> ID </th>
                        <th> Nome Fantasia </th>
                        <th> Razão Social </th>
                        <th> CNPJ </th>
                        <th> Telefone </th>
                        <th> Email </th>
                        <th> Endereço </th>
                        <th> Descrição </th>
                </thead>
                <tbody>
                    <%
                        while(it.hasNext()) {
                            Anuncio a = (Anuncio)it.next();               
                    %>
                    <tr>
                        <td> <%= a.getId()%> </td>
                        <td> <%= a.getNomeFantasia()%> </td>    
                        <td> <%= a.getRazaoSocial()%> </td>
                        <td> <%= a.getCNPJ()%> </td> 
                        <td> <%= a.getTelefone()%> </td> 
                        <td> <%= a.getEmail()%> </td> 
                        <td> <%= a.getEndereco()%> </td> 
                        <td> <%= a.getDescricao()%> </td>                    
                    </tr>
                    <% } %>
                </tbody>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
