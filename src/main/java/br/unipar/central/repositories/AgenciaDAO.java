/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.repositories;

/**
 *
 * @author 00240578
 */
public class AgenciaDAO {
    
    public static final String INSERT =
            "INSERT INTO AGENCIA (ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID) " +
            "VALUES(?, ?, ?, ?, ?, ?, ?)";
    
    public static final String FIND_ALL =
            "SELECT ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID " +
            "FROM AGENCIA";
    
}
