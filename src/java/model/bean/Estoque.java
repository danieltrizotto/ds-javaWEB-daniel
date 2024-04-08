/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

public class Estoque {

    private int id_estoque;
    private int produto_id2;
    private int quantidade_estoque;

    public Estoque(int id_estoque, int produto_id2, int quantidade_estoque) {
        this.id_estoque = id_estoque;
        this.produto_id2 = produto_id2;
        this.quantidade_estoque = quantidade_estoque;
    }
    public Estoque(){
        
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getProduto_id2() {
        return produto_id2;
    }

    public void setProduto_id2(int produto_id2) {
        this.produto_id2 = produto_id2;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }
    
    
}
