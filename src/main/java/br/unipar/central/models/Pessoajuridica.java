/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.models;

/**
 *
 * @author 00240578
 */
public class Pessoajuridica extends AbstractBaseEntity{
    
    private String razaoSocial;
    private String cnpj;
    private String cnaeprincipal;
    private String fantasia;
    private Pessoa pessoa;

    public Pessoajuridica() {
    }

    public Pessoajuridica(String razaoSocial, String cnpj, String cnaeprincipal, String fantasia, Pessoa pessoa) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cnaeprincipal = cnaeprincipal;
        this.fantasia = fantasia;
        this.pessoa = pessoa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnaeprincipal() {
        return cnaeprincipal;
    }

    public void setCnaeprincipal(String cnaeprincipal) {
        this.cnaeprincipal = cnaeprincipal;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Pessoajuridica{" + "razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", cnaeprincipal=" + cnaeprincipal + ", fantasia=" + fantasia + ", pessoa=" + pessoa + '}';
    }
    
}
