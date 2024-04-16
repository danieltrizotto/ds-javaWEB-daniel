package model.bean;

import java.sql.Blob;

public class Produtos {
//victor

    private int idProduto;
    private String nome;
    private byte[] imgBlob;
    private float valor;
    private int categoriaId;

    public Produtos(int idProduto, String nome, byte[] imgBlob, float valor, int categoriaId) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.imgBlob = imgBlob;
        this.valor = valor;
        this.categoriaId = categoriaId;
    }

    public Produtos() {

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
