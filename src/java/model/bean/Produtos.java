package model.bean;

import java.sql.Blob;

public class Produtos {
//victor

    private int id_Produto;
    private String nome;
    private byte[] imgBlob;
    private String img;
    private float valor;
    private int categoriaId;

    public Produtos(int id_Produto, String nome, byte[] imgBlob, float valor, int categoriaId, String img) {
        this.id_Produto = id_Produto;
        this.nome = nome;
        this.imgBlob = imgBlob;
        this.valor = valor;
        this.categoriaId = categoriaId;
    }

    public Produtos() {

    }

    public int getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getImgBlob() {
        return imgBlob;
    }

    public void setImgBlob(byte[] imgBlob) {
        this.imgBlob = imgBlob;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }
    ////

}
