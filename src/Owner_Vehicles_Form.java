
import java.awt.Color;
import java.util.ArrayList;
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
public class Owner_Vehicles_Form extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Vehicles_Form
     */
    
    static int ownerId;
    public Owner_Vehicles_Form(int oId) {
        initComponents();
        
        this.ownerId = oId;
        fillJtableWithVehiclesData(ownerId);
       
    }
    
    public void fillJtableWithVehiclesData(int id){
        
        V_VEHICLE vehicle = new V_VEHICLE();
        ArrayList<V_VEHICLE> vehicleList = vehicle.vehiclesListByOwner(id);
        
        String[] colNames = {"ID", "Type", "Owner ID", "Price", "Kilometers", "Brand", "Motor", "Color", "Gear", "Doors", "Seats", "Year", "Air condition", "GPS", "Car audio system", "Parking senzors", "Problems"};
        
        Object[][] rows = new Object[vehicleList.size()][17];
        
        for(int i = 0; i < vehicleList.size(); i++){
            rows[i][0] = vehicleList.get(i).getId();
            rows[i][1] = vehicleList.get(i).getType();
            rows[i][2] = vehicleList.get(i).getOwnerId();
            rows[i][3] = vehicleList.get(i).getPrice();
            rows[i][4] = vehicleList.get(i).getKilometers();
            rows[i][5] = vehicleList.get(i).getBrand();
            rows[i][6] = vehicleList.get(i).getMotor();
            rows[i][7] = vehicleList.get(i).getColor();
            rows[i][8] = vehicleList.get(i).getGear();
            rows[i][9] = vehicleList.get(i).getDoors();
            rows[i][10] = vehicleList.get(i).getSeats();
            rows[i][11] = vehicleList.get(i).getYear();
            
            if(vehicleList.get(i).isAc()) rows[i][12] = "YES";
            else rows[i][12] = "NO";
            
            if(vehicleList.get(i).isGps()) rows[i][13] = "YES";
            else rows[i][13] = "NO";
            
            if(vehicleList.get(i).isCas()) rows[i][14] = "YES";
            else rows[i][14] = "NO";
            
            if(vehicleList.get(i).isPs()) rows[i][15] = "YES";
            else rows[i][15] = "NO";
        
            rows[i][16] = vehicleList.get(i).getProblems();
           
        }
        
        DefaultTableModel model = (new DefaultTableModel(rows, colNames));
        jTable1.setModel(model);
      
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new Color(205, 133, 141));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(120);
        

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(Owner_Vehicles_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Vehicles_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Vehicles_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Vehicles_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Vehicles_Form(ownerId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
