/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.repositories;

import br.unipar.central.models.Transacao;
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
public class TransacaoDAO {
    
    private static final String INSERT = 
            "INSERT INTO TRANSACAO (ID, DATAHORA, VALOR, TIPO, RA, CONTA_ORIGEM, CONTA_DESTINO) " +
            "VALUES(?, ?, ?, ?, ?, ?, ?)";
    
    private static final String FIND_ALL =
            "SELECT ID, DATAHORA, VALOR, TIPO, RA, CONTA_ORIGEM, CONTA_DESTINO " +
            "FROM PESSOAFISICA ";
    
    private static final String FIND_BY_ID = 
            "SELECT ID, DATAHORA, VALOR, TIPO, RA, CONTA_ORIGEM, CONTA_DESTINO " +
            "FROM TRANSACAO " +
            "WHERE ID = ?";
    
    private static final String DELETE_BY_ID =
            "DELETE FROM TRANSACAO WHERE id = ?";
    
    private static final String UPDATE =
            "UPDATE TRANSACAO SET datahora = ?, valor = ?, tipo = ?, ra = ?, conta_origem = ?, conta_destino = ? " +
            "WHERE id = ?";
    
    public List<Transacao> findAll() throws SQLException {
        
        ArrayList<Transacao> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            
            pstmt = conn.prepareStatement(FIND_ALL);
            
            rs = pstmt.executeQuery(); 
            
            while (rs.next()) {
                //ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID 
                Transacao transacao = new Transacao();
                transacao.setNome(rs.getString("NOME"));
                pessoaFisica.setCpf(rs.getString("CPF"));
                pessoaFisica.setRg(rs.getString("RG"));
                pessoaFisica.setDataNascimento(Date.valueOf(rs.getString("DATANASCIMENTO")));
                pessoaFisica.setPessoa(new PessoaDAO().findById(rs.getInt("pessoa_id")));
                
                retorno.add(pessoaFisica);
                
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
    
}
