/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.repositories;

import br.unipar.central.models.Endereco;
import br.unipar.central.utils.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 00240578
 */
public class EnderecoDAO {
    
    private static final String INSERT =
            "INSERT INTO ENDERECO (ID, LOGRADOURO, NUMERO, BAIRRO, CEP, COMPLEMENTO, RA, PESSOA_ID, CIDADE_ID) " +
            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private static final String FIND_ALL =
            "SELECT ID, LOGRADOURO, NUMERO, BAIRRO, CEP, COMPLEMENTO, RA, PESSOA_ID, CIDADE_ID " +
            "FROM ENDERECO";
    
    private static final String FIND_BY_ID =
            "SELECT ID, LOGRADOURO, NUMERO, BAIRRO, CEP, COMPLEMENTO, RA, PESSOA_ID, CIDADE_ID" +
            "FROM ENDERECO " +
            "WHERE ID = ?";
    
    private static final String DELETE_BY_ID =
            "DELETE FROM ENDERECO WHERE ID = ?";
    
    private static final String UPDATE =
            "UPDATE ESTADO SET logradouro = ?, numero = ?, bairro = ?, cep = ?, complemento =?, pessoa_id = ? cidade_id = ?" +
            "WHERE id = ?";
    
    public List<Endereco> findAll() throws SQLException {
        
        ArrayList<Endereco> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            
            pstmt = conn.prepareStatement(FIND_ALL);
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                
               Endereco endereco = new Endereco();
               endereco.setId(rs.getInt("ID"));
               endereco.setLogradouro(rs.getString("LOGRADOURO"));
               endereco.setNumero(rs.getString("NUMERO"));
               endereco.setBairro(rs.getString("Bairro"));
               endereco.setCep(rs.getString("CEP"));
               endereco.setComplemento(rs.getString("COMPLEMENTO"));
               endereco.setRegistroAcademico(rs.getString("RA"));
               endereco.setPessoa(new PessoaDAO().findById(rs.getInt("PESSOA_ID")));
               endereco.setCidade(new CidadeDAO().findById(rs.getInt("CIDADE_ID")));
            }
            
        } finally {
            
            if (rs != null)
                rs.close();
            
            if (pstmt != null)
                pstmt.close();
            
            if (conn != null) 
                conn.close();
            
        }
        
        return retorno;
        
    }
    
    public Endereco findById(int id) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Endereco retorno = null;
        
        try {
        
            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(FIND_BY_ID);
            pstmt.setInt(1,id);
            
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                retorno = new Endereco();
                retorno.setId(rs.getInt("ID"));
                retorno.setLogradouro(rs.getString("LOGRADOURO"));
                retorno.setNumero(rs.getString("NUMERO"));
                retorno.setBairro(rs.getString("BAIRRO"));
                retorno.setCep(rs.getString("CEP"));
                retorno.setComplemento(rs.getString("COMPLEMENTO"));
                retorno.setRegistroAcademico(rs.getString("RA"));
                retorno.setPessoa(new PessoaDAO().findById(rs.getInt("PESSOA_ID")));
                retorno.setCidade(new CidadeDAO().findById(rs.getInt("CIDADE_ID")));
            }
            
        } finally {
            
            if (rs != null)
                rs.close();
            
            if (pstmt != null)
                pstmt.close();
            
            if (conn != null)
                conn.close();
            
        }
        
        return retorno;
        
    }
    
    public void insert(Endereco endereco) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(INSERT);
            pstmt.setInt(1,endereco.getId());
            pstmt.setString(2,endereco.getLogradouro());
            pstmt.setString(3,endereco.getNumero());
            pstmt.setString(4,endereco.getBairro());
            pstmt.setString(5,endereco.getCep());
            pstmt.setString(6,endereco.getComplemento());
            pstmt.setString(7,endereco.getRegistroAcademico());
            pstmt.setInt(8,endereco.getPessoa().getId());
            pstmt.setInt(9,endereco.getCidade().getId());
            
            pstmt.executeUpdate();
            
            
        } finally {
            
            if (pstmt != null)
                pstmt.close();
            
            if (conn != null)
                conn.close();
            
        }
    }
    
    public void update(Endereco endereco) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(UPDATE);
            pstmt.setInt(1,endereco.getId());
            pstmt.setString(2,endereco.getLogradouro());
            pstmt.setString(3,endereco.getNumero());
            pstmt.setString(4,endereco.getBairro());
            pstmt.setString(5,endereco.getCep());
            pstmt.setString(6,endereco.getComplemento());
            pstmt.setString(7,endereco.getRegistroAcademico());
            pstmt.setInt(8,endereco.getPessoa().getId());
            pstmt.setInt(9,endereco.getCidade().getId());
            
            pstmt.executeUpdate();
        
        } finally {
            
            if (pstmt != null)
                pstmt.close();
            
            if (conn != null)
                conn.close();
            
        }
        
    }
    
    public void delete(int id) throws SQLException {
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            pstmt = conn.prepareStatement(DELETE_BY_ID);
            pstmt.setInt(1, id);
            
            pstmt.executeUpdate();
            
        } finally {
            if (pstmt != null)
                pstmt.close();
            if (conn != null)
                conn.close();
        }
        
    }
    
}
