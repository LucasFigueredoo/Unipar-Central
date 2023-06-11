/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import br.unipar.central.enums.TipoOperadoraEnum;

/**
 *
 * @author andersonbosing
 */
public class Telefone {
    
    private int id;
    private String numero;
    private TipoOperadoraEnum operadora;
    private Pessoa pessoa;
    private Agencia agencia; 

    public Telefone() {
    }

    public Telefone(int id, String numero, TipoOperadoraEnum operadora, Pessoa pessoa, Agencia agencia) {
        this.id = id;
        this.numero = numero;
        this.operadora = operadora;
        this.pessoa = pessoa;
        this.agencia = agencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoOperadoraEnum getOperadora() {
        return operadora;
    }

    public void setOperadora(TipoOperadoraEnum operadora) {
        this.operadora = operadora;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", numero=" + numero + ", operadora=" + operadora + ", pessoa=" + pessoa + ", agencia=" + agencia + '}';
    }

}
