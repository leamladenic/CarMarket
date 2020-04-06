
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Lea
 */
public class V_TYPE {
    
    private int id;
    private String name;
    private String description;
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer ID){
        this.id = ID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String NAME){
        this.name = NAME;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String DESCRIPTION){
        
        this.description = DESCRIPTION;
    }
    
    public V_TYPE(){
        
    }
    
    public V_TYPE(Integer ID, String NAME, String DESCRIPTION){
        
        this.id = ID;
        this.name = NAME;
        this.description = DESCRIPTION;
    }
    
    public boolean execTypeQuery(String queryType, V_TYPE type){
        
        PreparedStatement ps;
        
        if(queryType.equals("add")){
            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement("INSERT INTO `vehicle_type_table`(`name`, `description`) VALUES (? , ?)");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(V_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        else if(queryType.equals("edit")){
            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement("UPDATE `vehicle_type_table` SET `name`= ?, `description` = ? WHERE `id`=?");
                ps.setString(1, type.getName());
                ps.setString(2, type.getDescription());
                ps.setInt(3, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(V_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else if(queryType.equals("remove")){
            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement("DELETE FROM `vehicle_type_table` WHERE `id`=?");
                
                ps.setInt(1, type.getId());
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(V_TYPE.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Enter the correct query", "Invalid operation", 2);
            return false;
        }
    }
    
    //return all types to hashmap
    
    public HashMap <String, Integer> getTypesMap(){

        HashMap<String, Integer>map = new HashMap<>();
        
        Statement st;
        ResultSet rs;
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("SELECT * FROM `vehicle_type_table`");
            V_TYPE type;
            
            while(rs.next()){
                type = new V_TYPE(rs.getInt(1), rs.getString(2), rs.getString(3));
                
                map.put(type.getName(), type.getId());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(V_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
        
    }
    
    //function to get a type data by id
    public V_TYPE getTypeById(Integer id){
        PreparedStatement ps;
        ResultSet rs;
        
        V_TYPE type = new V_TYPE();
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement("SELECT * FROM `vehicle_type_table` WHERE `id` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

        
            if(rs.next()){
                type.setId(id);
                type.setName(rs.getString(2));
                type.setDescription(rs.getString(3));
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(V_TYPE.class.getName()).log(Level.SEVERE, null, ex);
        }
        return type;
    }
}
