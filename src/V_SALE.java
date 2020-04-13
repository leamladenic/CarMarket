
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lea
 */
public class V_SALE {
    
    private int id;
    private int vehicleId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public V_SALE(){}
    
    public V_SALE(int ID, int VEHICLE_ID, int CLIENT_ID, String FINAL_PRICE, String SELLING_DATE){
        this.id = ID;
        this.vehicleId = VEHICLE_ID;
        this.clientId = CLIENT_ID;
        this.finalPrice = FINAL_PRICE;
        this.sellingDate = SELLING_DATE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    public boolean addNewSale(V_SALE sale){
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `sale_table`(`vehicle_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, sale.getVehicleId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public boolean editSaleData(V_SALE sale){
        
        PreparedStatement ps;
        
        String editQuery = "UPDATE `sale_table` SET `vehicle_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, sale.getVehicleId());
            ps.setInt(2, sale.getClientId());
            ps.setString(3, sale.getFinalPrice());
            ps.setString(4, sale.getSellingDate());
            ps.setInt(5, sale.getId());
            
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     
    }
    
    public boolean deleteSale(int saleId){
        
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `sale_table` WHERE `id`=?";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, saleId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_SALE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ArrayList<V_SALE>salesList(){
        
        ArrayList<V_SALE>list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `sale_table`";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            V_SALE sales;
            
            while(rs.next()){
                sales = new V_SALE(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                
                list.add(sales);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(V_SALE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
