
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lea
 */
public class Owner_Window extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Window
     */
    public Owner_Window() {
        initComponents();
        
        Border panel_border = BorderFactory.createMatteBorder(0,0,4,0, new Color(0,76,153));
        jPanel_Title.setBorder(panel_border);
        
        fillJtableWithOwnersData();
    }
    
    public void fillJtableWithOwnersData(){
        
        V_OWNER owner = new V_OWNER();
        ArrayList<V_OWNER> ownersList = owner.ownersList();
        
        String[] colNames = {"ID", "First name", "Last name", "Phone", "E-mail", "Address"};
        
        Object[][] rows = new Object[ownersList.size()][6];
        
        for(int i = 0; i < ownersList.size(); i++){
            rows[i][0] = ownersList.get(i).getId();
            rows[i][1] = ownersList.get(i).getFname();
            rows[i][2] = ownersList.get(i).getLname();
            rows[i][3] = ownersList.get(i).getPhone();
            rows[i][4] = ownersList.get(i).getEmail();
            rows[i][5] = ownersList.get(i).getAddress();
        }
        
        DefaultTableModel model = (new DefaultTableModel(rows, colNames));
        jTable1.setModel(model);
      
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(51,153,255));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_FName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton_Add_Owner = new javax.swing.JButton();
        jButton_Edit_Owner = new javax.swing.JButton();
        jButton_Remove_Owner = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_LName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Owner_Vehicles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 238, 255));

        jPanel1.setBackground(new java.awt.Color(204, 238, 255));

        jPanel_Title.setBackground(new java.awt.Color(51, 153, 255));

        jLabel_Title.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setText("Owners");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(618, 618, 618)
                .addComponent(jLabel_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("First name:");

        jTextField_FName.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel3.setText("Address:");

        jButton_Add_Owner.setBackground(new java.awt.Color(0, 204, 0));
        jButton_Add_Owner.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton_Add_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Owner.setText("Add");
        jButton_Add_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_OwnerActionPerformed(evt);
            }
        });

        jButton_Edit_Owner.setBackground(new java.awt.Color(255, 204, 0));
        jButton_Edit_Owner.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton_Edit_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Owner.setText("Edit");
        jButton_Edit_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_OwnerActionPerformed(evt);
            }
        });

        jButton_Remove_Owner.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Owner.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton_Remove_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Owner.setText("Remove");
        jButton_Remove_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_OwnerActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(102, 102, 255));
        jButton_Refresh.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh.setText("Refresh");
        jButton_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel4.setText("Last name: ");

        jTextField_LName.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel5.setText("Phone:");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setText("E-mail:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton_Owner_Vehicles.setBackground(new java.awt.Color(204, 0, 204));
        jButton_Owner_Vehicles.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton_Owner_Vehicles.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Owner_Vehicles.setText("Owner Vehicles");
        jButton_Owner_Vehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Owner_Vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Owner_VehiclesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField_FName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_LName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Owner_Vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Owner_Vehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remove_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_OwnerActionPerformed

        //get owner data
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_Address.getText();
        
        V_OWNER owner = new V_OWNER();
        
        if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || address.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter required informations [first name, last name, phone, email, address]", "Add owner", 2);
        }
        else{
            if(owner.addNewOwner(new V_OWNER(0, fname, lname, phone, email, address))){   
                JOptionPane.showMessageDialog(null, "New owner added to the system", "Add owner", 1);
                
                        
                        jTextField_FName.setText("");
                        jTextField_LName.setText("");
                        jTextField_Phone.setText("");
                        jTextField_Email.setText("");
                        jTextArea_Address.setText("");
            }
            else{
            JOptionPane.showMessageDialog(null, "Owner NOT added to the system", "Add owner", 2);
            }
        
       }
        
    }//GEN-LAST:event_jButton_Add_OwnerActionPerformed

    private void jButton_Edit_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_OwnerActionPerformed

        
        String fname = jTextField_FName.getText();
        String lname = jTextField_LName.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String address = jTextArea_Address.getText();
        
        V_OWNER owner = new V_OWNER();
        
        try{
            int ownerId = Integer.valueOf(jTextField_Id.getText());
              
            if(fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || address.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter required informations [first name, last name, phone, address]", "Edit owner", 2);
            }
            else{
                if(owner.editOwnerData(new V_OWNER(ownerId, fname, lname, phone, email, address))){   
                    JOptionPane.showMessageDialog(null, "New owner data edited", "Edit owner", 1);
                    
                        jTextField_Id.setText("");
                        jTextField_FName.setText("");
                        jTextField_LName.setText("");
                        jTextField_Phone.setText("");
                        jTextField_Email.setText("");
                        jTextArea_Address.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Owner data NOT edited", "Edit owner", 2);
                }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage() + " Enter a valid ID", "Invalid ID", 0);
        }
    
    }//GEN-LAST:event_jButton_Edit_OwnerActionPerformed

    private void jButton_Remove_OwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_OwnerActionPerformed

        try{
            int ownerId = Integer.valueOf(jTextField_Id.getText());
       
            V_OWNER owner = new V_OWNER();

            if(jTextField_Id.getText().trim().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Owner ID", "Empty ID field", 2);
            }
            else{
           
                int yes_or_no = JOptionPane.showConfirmDialog(null, "Do you want to delete this owner?", "Delete Owner", JOptionPane.YES_NO_OPTION );

                if(yes_or_no == JOptionPane.YES_OPTION){

                    if(owner.deleteOwner(ownerId)){
                        JOptionPane.showMessageDialog(null, "Owner deleted", "Delete owner", 1);
                        
                        jTextField_Id.setText("");
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Operation failed", "Delete owner", 2);
                    }

                }
            }    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage() + " Enter a valid ID", "Invalid ID", 0);
        }
       
    }//GEN-LAST:event_jButton_Remove_OwnerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        int selectedRowIndex = jTable1.getSelectedRow();
        jTextField_Id.setText(jTable1.getValueAt(selectedRowIndex, 0).toString());
        jTextField_FName.setText(jTable1.getValueAt(selectedRowIndex, 1).toString());
        jTextField_LName.setText(jTable1.getValueAt(selectedRowIndex, 2).toString());
        jTextField_Phone.setText(jTable1.getValueAt(selectedRowIndex, 3).toString());
        jTextField_Email.setText(jTable1.getValueAt(selectedRowIndex, 4).toString());
        jTextArea_Address.setText(jTable1.getValueAt(selectedRowIndex, 5).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        
        fillJtableWithOwnersData();
        
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_Owner_VehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Owner_VehiclesActionPerformed
      
        try{
            
            int selectedRowIndex = jTable1.getSelectedRow();
            int id = Integer.valueOf(jTable1.getValueAt(selectedRowIndex, 0).toString());
            
            Owner_Vehicles_Form ownerform = new Owner_Vehicles_Form(id);
            ownerform.ownerId = id;
            ownerform.setVisible(true);
            ownerform.pack();
            ownerform.setLocationRelativeTo(null);
            ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Select The Owner From The Table First", "No Owner Selected", 2);
        }
        
        
        
    }//GEN-LAST:event_jButton_Owner_VehiclesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Owner;
    private javax.swing.JButton jButton_Edit_Owner;
    private javax.swing.JButton jButton_Owner_Vehicles;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Remove_Owner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FName;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_LName;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables
}
