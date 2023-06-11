 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.services;

import br.unipar.central.exceptions.CampoNaoInformadoException;
import br.unipar.central.exceptions.EntidadeNaoInformadaException;
import br.unipar.central.exceptions.TamanhoCampoInvalidoException;
import br.unipar.central.models.Pessoa;
import br.unipar.central.repositories.PessoaDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 00240578
 */
public class PessoaService {
    
    private void validar(Pessoa pessoa) throws EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        
        if (pessoa == null) {
            throw new EntidadeNaoInformadaException("Pessoa");
        }
        
        if (pessoa.getEmail() == null ||
            pessoa.getEmail().isEmpty() ||
            pessoa.getEmail().isBlank()) {
            throw new CampoNaoInformadoException("Email");
        }
        
        if (pessoa.getEmail().length() > 120) {
            throw new TamanhoCampoInvalidoException("Emailj", 120);
        }
        
    }
    
    public List<Pessoa> findAll() throws SQLException {
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        List<Pessoa> resultado = pessoaDAO.findAll();
        
        return resultado;
        
    }
    
    public Pessoa findById(int id) throws SQLException, TamanhoCampoInvalidoException, Exception {
        
        if (id <= 0)
            throw new TamanhoCampoInvalidoException("id", id);
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        
        Pessoa retorno = pessoaDAO.findById(id);
        
        if(retorno == null)
            throw new Exception("Não foi possivel encontrar uma pessoa" 
                    + " com o id: " +id+ " informado");
        
        return retorno;
        
    }
    
    public void insert(Pessoa pessoa) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        validar(pessoa);
        
        PessoaDAO enderecoDAO = new PessoaDAO();
        enderecoDAO.insert(pessoa);
        
    }
    
    public void update(Pessoa pessoa) throws SQLException, EntidadeNaoInformadaException, CampoNaoInformadoException, TamanhoCampoInvalidoException {
        validar(pessoa);
        
        PessoaDAO enderecoDAO = new PessoaDAO();
        enderecoDAO.update(pessoa);
        
    }
    
    public void delete(int id) throws SQLException {
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.delete(id);
           
        
    }
    
}
