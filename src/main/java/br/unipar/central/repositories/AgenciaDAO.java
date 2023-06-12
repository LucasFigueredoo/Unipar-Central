/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.central.repositories;

import br.unipar.central.models.Agencia;
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
public class AgenciaDAO {
    
    public static final String INSERT =
            "INSERT INTO AGENCIA (ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID) " +
            "VALUES(?, ?, ?, ?, ?, ?, ?)";
    
    public static final String FIND_ALL =
            "SELECT ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID " +
            "FROM AGENCIA";
    
    public static final String FIND_BY_ID =
            "SELECT ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID " +
            "FROM AGENCIA " +
            "WHERE ID = ?";
    
    public static final String DELE_BY_ID =
            "DELETE FROM AGENCIA WHERE ID = ?";
    
    public static final String UPDATE =
            "UPDATE AGENCIA SET codigo = ?, digito = ?, razaosocial = ?, cnpj = ?, ra = ?, banco_id = ?";
    
     public List<Agencia> findAll() throws SQLException {
        
        ArrayList<Agencia> retorno = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            
            conn = new DatabaseUtils().getConnection();
            
            pstmt = conn.prepareStatement(FIND_ALL);
            
            rs = pstmt.executeQuery(); 
            
            while (rs.next()) {
                //ID, CODIGO, DIGITO, RAZAOSOCIAL, CNPJ, RA, BANCO_ID 
                Agencia agencia = new Agencia();
                agencia.setId(rs.getInt("ID"));
                agencia.setCodigo(rs.getString("CODIGO"));
                agencia.setDigito(rs.getString("DIGITO"));
                agencia.setRazaoSocial(rs.getString("RAZAOSOCIAL"));
                agencia.setCnpj(rs.getString("CNPJ"));
                agencia.setRegistroAcademico(rs.getString("RA"));
                agencia.setBanco(new BancoDAO().findById(rs.getInt));
                
                retorno.add(agencia);
                
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
