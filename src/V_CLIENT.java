
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Lea
 */
public class V_CLIENT {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    
    public int getId(){
        
        return this.id;
        
    }
    
    public void setId(int ID){
        
        this.id = ID;
        
    }
    
    public String getFname(){
        
        return this.firstName;
        
    }
    
    public void setFname(String FNAME){
        
        this.firstName = FNAME;
        
    }
    
    public String getLname(){
        
        return this.lastName;
        
    }
    
    public void setLname(String LNAME){
        
        this.lastName = LNAME;
        
    }
    
    public String getPhone(){
        
        return this.phone;
        
    }
    
    public void setPhone(String PHONE){
        
        this.phone = PHONE;
    }
    
    public String getEmail(){
        
        return this.email;
        
    }
    
    public void setEmail(String EMAIL){
        
        this.email = EMAIL;
    }
    
    public String getAddress(){
        
        return this.address;
        
    }
    
    public void setAddress(String ADDRESS){
        
        this.address = ADDRESS;
    }
    
    public V_CLIENT(){
        
    }
    
    public V_CLIENT(int ID, String FNAME, String LNAME, String PHONE, String EMAIL, String ADDRESS){
        
        this.id = ID;
        this.firstName = FNAME;
        this.lastName = LNAME;
        this.phone = PHONE;
        this.email = EMAIL;
        this.address = ADDRESS;
        
    }
    
    //add a new client
    public boolean addNewClient(V_CLIENT client){
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `clients_table`(`fname`, `lname`, `phone`, `email`, `address`) VALUES (?,?,?,?,?)";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public boolean editClientData(V_CLIENT client){
        
        PreparedStatement ps;
        
        String editQuery = "UPDATE `clients_table` SET `fname`=?,`lname`=?,`phone`=?,`email`=?,`address`=? WHERE `id`=?";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setString(1, client.getFname());
            ps.setString(2, client.getLname());
            ps.setString(3, client.getPhone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            ps.setInt(6, client.getId());
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     
    }
    
    public boolean deleteClient(int clientId){
        
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `clients_table` WHERE `id`=?";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, clientId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<V_CLIENT>clientsList(){
        
        ArrayList<V_CLIENT>list = new ArrayList<>();
        
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `clients_table`";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            V_CLIENT client;
            
            while(rs.next()){
                client = new V_CLIENT(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                
                list.add(client);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(V_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
}
