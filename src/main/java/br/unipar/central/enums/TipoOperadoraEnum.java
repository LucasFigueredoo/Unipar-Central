/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.central.enums;

/**
 *
 * @author 00240578
 */
public enum TipoOperadoraEnum {

    TIM(1),
    CLARO(2),
    VIVO(3),
    OI(4),
    OUTROS(5);

    private final int numero;

    private TipoOperadoraEnum(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}

    

