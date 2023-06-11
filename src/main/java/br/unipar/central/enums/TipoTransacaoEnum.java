/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.central.enums;

/**
 *
 * @author 00240578
 */
public enum TipoTransacaoEnum {

    DEBITO(1),
    CREDITO(2),
    PIX(3),
    OUTRAS(4);

    private final int numero;

    private TipoTransacaoEnum(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
    

