<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Produtos</title>
</head>
<body>
	<form action="cadastrar" method="POST">
		Nome: <input type="text" name="nome"/> <br />
		Preço: <input type="text" name="preco"/> <br />
		Quantidade: <input type="text" name="quantidade"/> <br />
		<input type="submit" value="Cadastrar"/> <br />
	</form>
</body>
</html>