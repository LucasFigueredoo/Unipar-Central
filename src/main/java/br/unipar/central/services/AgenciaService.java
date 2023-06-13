/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.services;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.models.Agencia;

/**
 *
 * @author 01330
 */
public class AgenciaService {
    
    private void validar(Agencia agencia) throws EntidadeNaoInformadaException, CampoNaoInformadoException {
        
        if (agencia == null) {
            throw new EntidadeNaoInformadaException("Agencia");
        }
        
        if (agencia.getCodigo() == null ||
            agencia.getCodigo().isEmpty() ||
            agencia.getCodigo().isBlank()) {
            throw new CampoNaoInformadoException("Codigo");
        }
        
        if (agencia.getDigito() == null ||
            agencia.getDigito().isEmpty() ||
            agencia.getDigito().isBlank()) {
            throw new CampoNaoInformadoException("Digito");
        }
        
        if (agencia.getRazaoSocial() == null ||
            agencia.getRazaoSocial().isEmpty() ||
            agencia.getRazaoSocial().isBlank()) {
            throw new CampoNaoInformadoException("Razão social");
        }
        
        if (agencia.getCnpj()== null ||
            agencia.getCnpj().isEmpty() ||
            agencia.getCnpj().isBlank()) {
            throw new CampoNaoInformadoException("CNPJ");
        }
        
        if (agencia.getBanco()== null) {
            throw new CampoNaoInformadoException("Banco");
        }
        
    }
    
}
