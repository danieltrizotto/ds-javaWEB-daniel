package model.bean;

public class Pedidos_produtos {

    private int id_pedido_produto;
    private int pedido_id;
    private int produto_id;
    private int quantidade;
    private float preco_unitario;

    public Pedidos_produtos(int id_pedido_produto, int pedido_id, int produto_id, int quantidade, float preco_unitario) {
        this.id_pedido_produto = id_pedido_produto;
        this.pedido_id = pedido_id;
        this.produto_id = produto_id;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
    }

    public Pedidos_produtos() {

    }

    public int getId_pedido_produto() {
        return id_pedido_produto;
    }

    public void setId_pedido_produto(int id_pedido_produto) {
        this.id_pedido_produto = id_pedido_produto;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(float preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    
    
}
