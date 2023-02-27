<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora</title>
    </head>
    <body>
    <div align="center">
    <form action="calcular" method="post">
        <p>Informe o primeiro numero: <input type="number" name="first" required></p>
        <p>Operacao:
            <select name="operator">
                <option value="+">Soma</option>>
                <option value="-">Subtracao</option>>
                <option value="*">Muliplicacao</option>>
                <option value="/">Divisao</option>>
            </select></p>
        <p>Informe o segundo numero: <input type="number" name="second" required></p>
        <input type="submit" value="calcular" >
    </form>
    </div>

    <br/>
    </body>
</html>