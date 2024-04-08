/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author Senai
 */
public class Pedido {
    private int id_pedido;
    private int usuario_id2;
    private int endereço_id;
    private String status_pagamento;
    private String metodo_pagamento;
    private float valor_total;
    private Date data_hora;

    public Pedido(int id_pedido, int usuario_id2, int endereço_id, String status_pagamento, String metodo_pagamento, float valor_total, Date data_hora) {
        this.id_pedido = id_pedido;
        this.usuario_id2 = usuario_id2;
        this.endereço_id = endereço_id;
        this.status_pagamento = status_pagamento;
        this.metodo_pagamento = metodo_pagamento;
        this.valor_total = valor_total;
        this.data_hora = data_hora;
    }
    public Pedido(){
        
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getUsuario_id2() {
        return usuario_id2;
    }

    public void setUsuario_id2(int usuario_id2) {
        this.usuario_id2 = usuario_id2;
    }

    public int getEndereço_id() {
        return endereço_id;
    }

    public void setEndereço_id(int endereço_id) {
        this.endereço_id = endereço_id;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }
    
}
