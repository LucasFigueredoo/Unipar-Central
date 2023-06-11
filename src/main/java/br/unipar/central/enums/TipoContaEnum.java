/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unipar.central.enums;

/**
 *
 * @author 00240578
 */
public enum TipoContaEnum {
    CORRENTE(1),
    POUPANCA(2),
    SALARIO(3);

    private final int numero;

    private TipoContaEnum(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public static TipoContaEnum paraEnum(int codigo) {
        for (TipoContaEnum tipo : TipoContaEnum.values()) {
            if (tipo.getNumero() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido!");
    } 
    
}
