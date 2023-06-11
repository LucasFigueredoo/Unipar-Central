/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author 00240578
 */
public class Pessoa extends AbstractBaseEntity {
    
    private int id;
    private String email;

    public Pessoa() {
    }
    
    public Pessoa(int id, String email) {
        this.id = id;
        this.email = email;
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

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", email=" + email + '}';
    }
    
}
