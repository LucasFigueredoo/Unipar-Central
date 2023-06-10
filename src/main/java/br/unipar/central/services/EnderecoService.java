/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.services;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.models.Endereco;

/**
 *
 * @author 01330
 */
public class EnderecoService {
    
    private void validar(Endereco endereco) throws EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        
        if (endereco == null) {
            throw new EntidadeNaoInformadaException("Endereco");
        }
        
        if (endereco.getLogradouro() == null ||
            endereco.getLogradouro().isEmpty() ||
            endereco.getLogradouro().isBlank()) {
            throw new CampoNaoInformadoException("Logradouro");
        }
        
        if (endereco.getNumero() == null ||
            endereco.getNumero().isEmpty() ||
            endereco.getNumero().isBlank()) {
            throw new CampoNaoInformadoException("Numero");
        }
        
        if (endereco.getBairro() == null ||
            endereco.getBairro().isEmpty() ||
            endereco.getBairro().isBlank()) {
            throw new CampoNaoInformadoException("Bairro");
        }
        
        if (endereco.getCep() == null ||
            endereco.getCep().isEmpty() ||
            endereco.getCep().isBlank()) {
            throw new CampoNaoInformadoException("CEP");
        }
        
        if (endereco.getComplemento() == null ||
            endereco.getComplemento().isEmpty() ||
            endereco.getComplemento().isBlank()) {
            throw new CampoNaoInformadoException("Complemento");   
        }
        
        if (endereco.getPessoa() == null) {
            throw new CampoNaoInformadoException("Pessoa");
        }
        
        if (endereco.getCidade() == null) {
            throw new CampoNaoInformadoException("Cidade");
        }
        
        if (endereco.getLogradouro().length() > 120) {
            throw new TamanhoCampoInvalidoException("Logradouro", 120);
        }
        
        if (endereco.getNumero().length() > 10) {
            throw new TamanhoCampoInvalidoException("Numero", 10);
        }
        
    }
    
}
