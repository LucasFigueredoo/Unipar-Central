/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import br.unipar.central.enums.TipoContaEnum;

/**
 *
 * @author 00240578
 */
public class Conta extends AbstractBaseEntity{
    
    private int id;
    private String numero;
    private String digito;
    private Double saldo;
    private TipoContaEnum tipo;
    private Agencia agencia;
    private Pessoa pessoa;

    public Conta() {
    }

    public Conta(int id, String numero, String digito, Double saldo, TipoContaEnum tipo, Agencia agencia, Pessoa pessoa) {
        this.id = id;
        this.numero = numero;
        this.digito = digito;
        this.saldo = saldo;
        this.tipo = tipo;
        this.agencia = agencia;
        this.pessoa = pessoa;
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

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public TipoContaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoContaEnum tipo) {
        this.tipo = tipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", numero=" + numero + ", digito=" + digito + ", saldo=" + saldo + ", tipo=" + tipo + ", agencia=" + agencia + ", pessoa=" + pessoa + '}';
    }
    
}
