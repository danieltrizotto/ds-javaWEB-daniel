package model.bean;

import java.sql.Blob;

public class Produtos {

    private int id_produto;
    private int categoria_id;
    private String nome;
    private byte[] imagem;
    private float valor;

    public Produtos(int id_produto, int categoria_id, String nome, byte[] imagem, float valor) {
        this.id_produto = id_produto;
        this.categoria_id = categoria_id;
        this.nome = nome;
        this.imagem = imagem;
        this.valor = valor;
    }
    
      public Produtos(){
          
      }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
      
      
}
