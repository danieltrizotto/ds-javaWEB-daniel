<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/0444e3e789.js" crossorigin="anonymous"></script>
        <title>LOGIN</title>
        <link rel="stylesheet" href="./styles/login.css">
    </head>

    <body>
        <main>

            <div class="login">
                <form name="formLogin" method="post" action="login.jsp">
                    <h2>LOGIN</h2>
                    <input type="text" name="usuario" placeholder="Usuario..." />
                    <br><br>
                    <input type="password" name="senha" placeholder="Senha..." />
                    <br><br>
                    <button type="submit" name="entrar" value="Entrar">Entrar</button>
                </form>
            </div>

        </main>



    </body>

    </html>