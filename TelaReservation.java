/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import controle.ConectaBanco;
import controle.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import static java.util.logging.Level.parse;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias
 */
public class TelaReservation extends javax.swing.JFrame {

ConectaBanco conecta = new ConectaBanco();
ConectaBanco conn = new ConectaBanco();
SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public TelaReservation() {
        initComponents();
        
        conecta.conexao();
        preencherTabela("select * from reservation order by id_reservation");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldObs = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableReservation = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelName1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelNameDate1 = new javax.swing.JLabel();
        jLabelNameDate = new javax.swing.JLabel();
        jLabelObs2 = new javax.swing.JLabel();
        jLabelObs = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelpeoople = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("system book table");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Guest Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("N° Person :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Time:");

        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("EDIT");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        TableReservation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 51, 51)));
        TableReservation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TableReservation.setGridColor(new java.awt.Color(0, 0, 0));
        TableReservation.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(TableReservation);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Confirmation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName1.setText("Name :");

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(153, 0, 0));
        jLabelName.setText("Name :");

        jLabelNameDate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameDate1.setText("Date:");

        jLabelNameDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameDate.setForeground(new java.awt.Color(153, 0, 0));
        jLabelNameDate.setText("Date:");

        jLabelObs2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelObs2.setText("Time:");

        jLabelObs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelObs.setForeground(new java.awt.Color(153, 0, 0));
        jLabelObs.setText("Time");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nombre of people");

        jLabelpeoople.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelpeoople.setForeground(new java.awt.Color(153, 0, 0));
        jLabelpeoople.setText("Quantity of people");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelName1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelName)
                        .addGap(55, 55, 55)
                        .addComponent(jLabelNameDate1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNameDate)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObs2)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelObs)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelpeoople)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName1)
                    .addComponent(jLabelName)
                    .addComponent(jLabelNameDate1)
                    .addComponent(jLabelNameDate)
                    .addComponent(jLabelObs2)
                    .addComponent(jLabelObs)
                    .addComponent(jLabel4)
                    .addComponent(jLabelpeoople))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "N° People", "Observations"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(991, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2923, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1432, 870));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*String Resposta;
        
        Resposta = JOptionPane.showInputDialog("Nome do cliente:");
        String nome = Resposta;
       
        Resposta = JOptionPane.showInputDialog("Quantidade de pessoas:");
        int qtd = Integer.parseInt(Resposta);
       
        Resposta = JOptionPane.showInputDialog("Data ex: dd/mm/yyyy:");
        String data = Resposta;
        
        Resposta = JOptionPane.showInputDialog("Observações");
        String obs = Resposta;*/
        
        conecta.conexao();
        conecta.executaSQL("Select * from reservation");
        
        try {
           //conn.rs.first();
            /*PreparedStatement pst = conecta.conn.prepareStatement("insert into reservation (nome_cliente, quantidade, data, observacao) values (?,?,?,?)"); 
            pst.setString(1, nome);
            pst.setInt(2, qtd);
            pst.setString(3, data);
            pst.setString(4, obs);*/
            String theDate = dateFormat.format(jCalendar1.getDate());
            PreparedStatement pst = conecta.conn.prepareStatement("insert into reservation (nome_cliente, quantidade, data, observacao) values (?,?,?,?)"); 
            pst.setString(1, jTextFieldName.getText());
            pst.setInt(2, Integer.parseInt(jTextFieldQtd.getText()));
            pst.setString(3, theDate);
            pst.setString(4, jTextFieldObs.getText());
            
            pst.execute();
            preencherTabela("select * from reservation order by id_reservation");
            
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela!"+ ex);
        }
            conn.desconecta();
            

      preencherTabelaTableRight("select * from reservation order by id_reservation");  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCalendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCalendar1MouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
      
       /* String Resposta;
        
        Resposta = JOptionPane.showInputDialog("Nome do cliente:");
        String nome = Resposta;
       
        Resposta = JOptionPane.showInputDialog("Quantidade de pessoas:");
        int qtd = Integer.parseInt(Resposta);
       
        
        Resposta = JOptionPane.showInputDialog("Observações");
        String obs = Resposta;*/
        String nome = jTextFieldName.getText();
        int qtd = Integer.parseInt(jTextFieldQtd.getText());
        String obs = jTextFieldObs.getText();

        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String theDate = dateFormat.format(jCalendar1.getDate());
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{theDate,nome,qtd,obs});

        jLabelName.setText(nome);
        jLabelNameDate.setText(theDate);
        jLabelObs.setText(obs);
        jLabel4.setText(String.valueOf(qtd));
        
      }
       catch(Exception ex)
      {
           JOptionPane.showMessageDialog(null,"No date selected");
       }
      
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        
    try {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(selectedRow, 0).toString());
        String nome = "" + jTable1.getValueAt(jTable1.getSelectedRow(),1);  
        int qtd = Integer.parseInt(""+ jTable1.getValueAt(jTable1.getSelectedRow(),2)); 
        String obs = "" + jTable1.getValueAt(jTable1.getSelectedRow(),3);
        
        jCalendar1.setDate(date);
        jTextFieldName.setText(nome);
        jTextFieldQtd.setText(String.valueOf(qtd));
        jTextFieldObs.setText(obs);
        
    } catch (ParseException ex) {
        Logger.getLogger(TelaReservation.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");        
        int selectedRow = jTable1.getSelectedRow();
        String theDate = dateFormat.format(jCalendar1.getDate());
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setValueAt(theDate, selectedRow,0);
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"No date selected");
    }
    }//GEN-LAST:event_jButtonEditActionPerformed
public void preencherTabela(String SQL){
       ArrayList dados = new ArrayList();
  /*private int id_reservation;
    private String nome_cliente;
    private int quantidade;
    private String data;
    private String observacao;*/
       
       //String [] Colunas = new String[] {"ID", "Nome", "Numero de clientes","Data", "Observacao"};
       String [] Colunas = new String[] {"ID", "Nome", "Numero de Clientes","Data","Observacao"};
               conecta.executaSQL(SQL);
               try{
                  conecta.rs.first();
                  do{
                      dados.add(new Object[]{conecta.rs.getInt("id_reservation"), conecta.rs.getString("nome_cliente"), conecta.rs.getInt("quantidade"), conecta.rs.getString("data"),conecta.rs.getString("observacao")});
                      //dados.add(new Object[]{conecta.rs.getInt("id_reservation"), conecta.rs.getString("nome_cliente"), conecta.rs.getInt("quantidade"), conecta.rs.getString("data"),conecta.rs.getString("observacao")});
              }while(conecta.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               TableReservation.setModel(modelo);
               TableReservation.getColumnModel ().getColumn(0).setPreferredWidth(50);
               TableReservation.getColumnModel().getColumn(0).setResizable(false);
               
               TableReservation.getColumnModel ().getColumn(1).setPreferredWidth(175);
               TableReservation.getColumnModel().getColumn(1).setResizable(false);
               
               TableReservation.getColumnModel ().getColumn(2).setPreferredWidth(175);
               TableReservation.getColumnModel().getColumn(2).setResizable(false);
               
               TableReservation.getColumnModel ().getColumn(3).setPreferredWidth(115);
               TableReservation.getColumnModel().getColumn(3).setResizable(false);
               
               TableReservation.getColumnModel ().getColumn(4).setPreferredWidth(815);
               TableReservation.getColumnModel().getColumn(4).setResizable(false);
               
               
               TableReservation.getTableHeader().setReorderingAllowed(false);
               TableReservation.setAutoResizeMode(TableReservation.AUTO_RESIZE_OFF);
               TableReservation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
       }

public void preencherTabelaTableRight(String SQL){
       ArrayList dados = new ArrayList();
  /*private int id_reservation;
    private String nome_cliente;
    private int quantidade;
    private String data;
    private String observacao;*/
       
       //String [] Colunas = new String[] {"ID", "Nome", "Numero de clientes","Data", "Observacao"};
       String [] Colunas = new String[] {"ID", "Nome", "Numero de Clientes","Data","Observacao"};
               conecta.executaSQL(SQL);
               try{
                  conecta.rs.first();
                  do{
                      dados.add(new Object[]{conecta.rs.getInt("id_reservation"), conecta.rs.getString("nome_cliente"), conecta.rs.getInt("quantidade"), conecta.rs.getString("data"),conecta.rs.getString("observacao")});
                      //dados.add(new Object[]{conecta.rs.getInt("id_reservation"), conecta.rs.getString("nome_cliente"), conecta.rs.getInt("quantidade"), conecta.rs.getString("data"),conecta.rs.getString("observacao")});
              }while(conecta.rs.next());       
                 }catch (SQLException ex){
                     JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array list! n ERRO:"+ex);
                   }  
               ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTable1.setModel(modelo);
               jTable1.getColumnModel ().getColumn(0).setPreferredWidth(50);
               jTable1.getColumnModel().getColumn(0).setResizable(false);
               
               jTable1.getColumnModel ().getColumn(1).setPreferredWidth(175);
               jTable1.getColumnModel().getColumn(1).setResizable(false);
               
               jTable1.getColumnModel ().getColumn(2).setPreferredWidth(175);
               jTable1.getColumnModel().getColumn(2).setResizable(false);
               
               jTable1.getColumnModel ().getColumn(3).setPreferredWidth(115);
               jTable1.getColumnModel().getColumn(3).setResizable(false);
               
               jTable1.getColumnModel ().getColumn(4).setPreferredWidth(815);
               jTable1.getColumnModel().getColumn(4).setResizable(false);
               
               
               jTable1.getTableHeader().setReorderingAllowed(false);
               jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
               jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
       }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableReservation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEdit;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelNameDate;
    private javax.swing.JLabel jLabelNameDate1;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JLabel jLabelObs2;
    private javax.swing.JLabel jLabelpeoople;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldObs;
    private javax.swing.JTextField jTextFieldQtd;
    // End of variables declaration//GEN-END:variables
}
