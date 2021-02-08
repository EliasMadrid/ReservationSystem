
package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author bookafe
 */
public class ConectaBanco {
    
    public  Statement stm;//reponsavel por preparar e realizar pesquisa no banco de dados
    public  ResultSet rs;// responsavel por armazenar o resultado de uma pesquisa passada para o statement
    private String driver = "org.postgresql.Driver"; //Responsavel por indentificar o servico do bd de dados;
    private String caminho ="jdbc:postgresql://localhost:5434/reservation";// responsavel por setar ao local do banco de dados
    private String usuario = "postgres";
    private String senha = "eliasmd8";
    public  Connection conn;// responsavel por realizar a conexao com o banco de dados

   public void conexao(){// metodo responsavel por realizar a conexao com o banco.
       System.setProperty("jdbc.Driver", driver);//seta a propiedade do drive
       try {
       conn = DriverManager.getConnection(caminho, usuario, senha);// realiza a conexao com o banco de dados
           //JOptionPane.showMessageDialog(null, "Conectado com suscesso!");
       }
       catch (SQLException ex){
         JOptionPane.showMessageDialog(null, "Erro de conecxao!/n Erro"  + ex.getMessage());
          } 
     
     }
   public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
          //JOptionPane.showMessageDialog(null, "Erro de ExecutaSQL!/n Erro"  + ex.getMessage()); 
        }
       
   }

    public void desconecta() {
        try {
            conn.close();
         // JOptionPane.showMessageDialog(null, "Desconectado com suscesso!");  
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao fechar a conecxao!/n Erro"  + ex.getMessage());
        }
        //throw new UnsupportedOperationException("Erro ao fechar a conexao"); //To change body of generated methods, choose Tools | Templates.
    }
   }
   
    


