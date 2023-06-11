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
    
}
