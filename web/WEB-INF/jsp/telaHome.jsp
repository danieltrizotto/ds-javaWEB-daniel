<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>pagina inicial</title>
    <script src="https://kit.fontawesome.com/0444e3e789.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous" />
    <link rel="stylesheet" href="./styles/telaHome.css" />
  </head>

  <body>
    <header>
      <div id="cabeçalho">
        <div id="pesquisa">
          <div id="pesquisa1">
            <img src="./assets/pngegg.png" alt="" />
            <h1>Bocchi instrumentos</h1>
          </div>

          <div id="pesquisa2">
            <input type="text" placeholder="Pesquise um produto..." />
            <div id="confirm">
              <button><i class="fa-solid fa-book-bookmark"></i></button>
            </div>
          </div>
          <div class="logout">
            <a href="./logout"><i class="fa-solid fa-door-open">Logout</i></a>
          </div>
        </div>
        <nav class="categorias">
          <div>
            <a href="./guitarController">1.guitarras</a>
          </div>
          <div>
            <a href="#">2.baterias</a>
          </div>
          <div>
            <a href="#">3.baixos</a>
          </div>
          <div>
            <a href="#">4.Pianos</a>
          </div>
          <div>
            <a href="#">5.equipamentos</a>
          </div>
          <div>
            <a href="#">6.acessorios</a>
          </div>
        </nav>
      </div>
    </header>
    <main>
      <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="d-block w-100" src="./assets/comprar-instrumentos.jpg" alt="Primeiro Slide" />
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="./assets/instrumentos-musicais.jpg" alt="Segundo Slide" />
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="./assets/lojas-de-instrumentos-online.jpg" alt="Terceiro Slide" />
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Anterior</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Próximo</span>
        </a>
      </div>
      <div class="produtos">
        <h1>Produtos</h1>

        <br>
        <br>
//victor
        <div class="enviarimg">
          <form name="frmProduct" action="insert" enctype="multipart/form-data" method="post">
            <br><br>
            <h2>IMAGEM</h2>
            <input type="file" name="imagem" id="imagem">
            <h2>nome
              <h2 />
              <input type="text" name="nome">
              <h2>categoria
                <h2 />
                <input type="text" name="categoria">
                <h2>valor
                  <h2 />
                  <input type="text" name="valor">
                  <input type="submit" value="Enviar">
          </form>
        </div>
//victor
        <div class="faixaprodutos">
          
              <%-- Use JSP para iterar sobre a lista de livros e exibi-los na tabela --%>
                <c:forEach items="${produtos}" var="produtos">
                  <div class="card" style="width: 18rem;">
                    <img src="" alt="">
                    <div class="card-body">
                      <p name="categoria">${produtos}</p>
                      <h5 class="card-title" name="nome">${produtos}</h5>
                      <p class="card-text" name="preço">${produtos}</p>
                      <button name="comprar">Add carrinho</button>
                    </div>
                  </div>
                </c:forEach>
         
        </div>

    </main>
    <footer>
      <nav class="categorias">
        <div>
          <a href="./guitarController">guitarras</a>
        </div>
        <div>
          <a href="#">baterias</a>
        </div>
        <div>
          <a href="#">baixos</a>
        </div>
        <div>
          <a href="#">Pianos</a>
        </div>
        <div>
          <a href="#">equipamentos</a>
        </div>
        <div>
          <a href="#">acessorios</a>
        </div>
      </nav>
      <p>daniel trizotto@2024</p>
    </footer>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
      integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
      crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
      integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
      crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
      integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
      crossorigin="anonymous"></script>
  </body>

  </html>
