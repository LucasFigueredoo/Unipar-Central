/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import br.unipar.central.enums.TipoTransacaoEnum;

/**
 *
 * @author 00240578
 */
public class Transacao {
    
    private double valor;
    private TipoTransacaoEnum tipo;
    private int contaOrigem;
    private int contaDestino;

    public Transacao() {
    }

    public Transacao(double valor, TipoTransacaoEnum tipo, int contaOrigem, int contaDestino) {
        this.valor = valor;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacaoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacaoEnum tipo) {
        this.tipo = tipo;
    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    @Override
    public String toString() {
        return "Transacao{" + "valor=" + valor + ", tipo=" + tipo + ", contaOrigem=" + contaOrigem + ", contaDestino=" + contaDestino + '}';
    }
    
}
