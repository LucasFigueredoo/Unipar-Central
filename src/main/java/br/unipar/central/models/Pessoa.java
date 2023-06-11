/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import br.unipar.central.enums.TipoPessoaEnum;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author 00240578
 */
public class Pessoa {
    
    private int id;
    private String email;
    private String ra;

    public Pessoa() {
    }
    
    public Pessoa(int id, String email, String ra) {
        this.id = id;
        this.email = email;
        this.ra = ra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", email=" + email + ", ra=" + ra + '}';
    }
    
}
