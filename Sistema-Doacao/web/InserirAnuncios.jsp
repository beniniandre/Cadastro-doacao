<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="bean" scope="session" class="br.com.Model.Anuncio"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page </title>
    </head>
    <body>
        <h1> CADASTRO </h1>
        <table border="1" cellpadding="1">
            <form name="InserirAnuncios" action="IA" method="POST">
                <thead>
                    <tr>
                        <th> Campos </th>
                        <th> Valores </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> Nome Fantasia </td>
                        <td> <input type="text" name="NomeFantasia" size="100" /></td>
                    </tr>
                    <tr>
                        <td> Razão Social </td>
                        <td> <input type="text" name="RazaoSocial" size="100" /></td>
                    </tr>
                    <tr>
                        <td> CNPJ </td>
                        <td> <input type="text" name="CNPJ" size="100" /></td>
                    </tr>
                    <tr>
                        <td> Telefone </td>
                        <td> <input type="text" name="Telefone" size="100" /></td>
                    </tr>
                    <tr>
                        <td> Email </td>
                        <td> <input type="text" name="Email" size="100" /></td>
                    </tr>
                    <tr>
                        <td> Endereço </td>
                        <td> <input type="text" name="Endereco" size="100" /></td>
                    </tr>
                    <tr>
                        <td> Descrição </td>
                        <td> <input type="text" name="Descricao" size="100" /></td>
                    </tr>
                </tbody>
        </table>
        <input type="submit" value="ENVIAR" name="ENVIAR" />
    </form>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
