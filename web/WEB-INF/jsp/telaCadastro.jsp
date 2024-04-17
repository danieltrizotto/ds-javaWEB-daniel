<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://kit.fontawesome.com/0444e3e789.js" crossorigin="anonymous"></script>
    <title>cadastro</title>
    <link rel="stylesheet" href="./styles/cadastro.css">
</head>

<body>


    <div class="areaCadastro">
        <form name="formCadastro" method="post" action="Cadastro">
            <h2>Cadastro</h2>
            <input type="text" placeholder="nome..." class="nomeInput" name="nome">
            <br><br>
            <input type="text" placeholder="usuario..." class="usuarioInput" name="usuario">
            <br><br>
            <input type="text" placeholder="Senha..." class="senhaInput" name="senha">
            <br><br>
            <input type="text" placeholder="telefone..." class="telInput" name="telefone">
            <br><br>
            <input type="date" class="dateInput" name="data">
            <br><br>
            <input type="text" class="cpfInput" name="cpf" placeholder="cpf...">
            <br><br>
            <button type="submit" name="entrar" value="Entrar" id="cadastro">cadastrar</button>
        </form>
        <a href="./logar">Ir a tela de login</a>
    </div>


</body>

</html>