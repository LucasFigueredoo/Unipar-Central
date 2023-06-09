/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

import java.sql.Date;

/**
 *
 * @author 00240578
 */
public class Pessoafisica extends AbstractBaseEntity{
    
    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private Pessoa pessoa;

    public Pessoafisica() {
    }

    public Pessoafisica(String nome, String cpf, String rg, Date dataNascimento, Pessoa pessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Pessoafisica{" + "nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", pessoa=" + pessoa + '}';
    }
    
}
