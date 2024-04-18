const btn = document.getElementById("cadastro");

btn.addEventListener("click", function () {
    const nomeInput = document.getElementsByClassName("nomeInput").value;
    const nomeUsuario = document.getElementsByClassName("usuarioInput").value;
    const senhaInput= document.getElementsByClassName("senhaInput").value;
    const telInput = document.getElementsByClassName("telInput").value;
    const datInput = document.getElementsByClassName("dateInput").value;

    // Criar um objeto com os dados a serem enviados
    const data = {
        nomeLivro: nomeLivro
    };


    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    };


    fetch('/criar', options)
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao enviar os dados');
            }
            return response.json();
        })
        .then(data => {
            console.log('Resposta do servidor:', data);
        })
        .catch(error => {
            console.error('Erro:', error);
        });
});


