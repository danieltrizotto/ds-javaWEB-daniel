/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author User
 */
public class endereço {
    private int id_endereço;
    private int usuario_id1;
    private String rua;
    private int numero;
    private String cep;
    private String complemento;

    public endereço(int id_endereço, int usuario_id1, String rua, int numero, String cep, String complemento) {
        this.id_endereço = id_endereço;
        this.usuario_id1 = usuario_id1;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }
    public endereço(){
        
    }

    public int getId_endereço() {
        return id_endereço;
    }

    public void setId_endereço(int id_endereço) {
        this.id_endereço = id_endereço;
    }

    public int getUsuario_id1() {
        return usuario_id1;
    }

    public void setUsuario_id1(int usuario_id1) {
        this.usuario_id1 = usuario_id1;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
