
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
public class V_VEHICLE {
    
    private int id;
    private int type;
    private int ownerId;
    private String price;
    private String kilometers;
    private String brand;
    private String motor;
    private String color;
    private String gear;
    private int doors;
    private int seats;
    private int year;
    private boolean ac;
    private boolean gps;
    private boolean cas;
    private boolean ps;
    private String problems;

    V_VEHICLE(int i, int type, String price, int ownerId, String kilometers, String brand, String motor, int doors, int seats, int year, String color, String gear, boolean have_ac, boolean have_gps, boolean have_ps, boolean have_cas, String problems) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getKilometers() {
        return kilometers;
    }

    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isCas() {
        return cas;
    }

    public void setCas(boolean cas) {
        this.cas = cas;
    }

    public boolean isPs() {
        return ps;
    }

    public void setPs(boolean ps) {
        this.ps = ps;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }
    
    
    
    public V_VEHICLE(){}
    
    public V_VEHICLE(int ID, int TYPE, int OWNERID, String PRICE, String KILOMETERS, String BRAND, String MOTOR, String COLOR, String GEAR, int DOORS, int SEATS, int YEAR, boolean AC, boolean PS, boolean CAS, boolean GPS, String PROBLEMS ){
        this.id = ID;
        this.type = TYPE;
        this.ownerId = OWNERID;
        this.price = PRICE;
        this.kilometers = KILOMETERS;
        this.brand = BRAND;
        this.motor = MOTOR;
        this.color = COLOR;
        this.gear = GEAR;
        this.doors = DOORS;
        this.seats = SEATS;
        this.year = YEAR;
        this.ac = AC;
        this.gps = GPS;
        this.cas = CAS;
        this.ps = PS;
        this.problems = PROBLEMS;
    }
    
    //function to add a new vehicle
    public boolean addNewVehicle (V_VEHICLE vehicle){
        
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO `vehicle_table`(`type`, `ownerId`, `price`, `kilometers`, `brand`, `motor`, `color`, `gear`, `doors`, `seats`, `year`, `ac`, `gps`, `cas`, `ps`, `problems`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            ps.setInt(1, vehicle.getType());
            ps.setInt(2, vehicle.getOwnerId());
            ps.setString(3, vehicle.getPrice());
            ps.setString(4, vehicle.getKilometers());
            ps.setString(5, vehicle.getBrand());
            ps.setString(6, vehicle.getMotor());
            ps.setString(7, vehicle.getColor());
            ps.setString(8, vehicle.getGear());
            ps.setInt(9, vehicle.getDoors());
            ps.setInt(10, vehicle.getSeats());
            ps.setInt(11, vehicle.getYear());
            ps.setBoolean(12, vehicle.isAc());
            ps.setBoolean(13, vehicle.isGps());
            ps.setBoolean(14, vehicle.isCas());
            ps.setBoolean(15, vehicle.isPs());
            ps.setString(16, vehicle.getProblems());
            
            return(ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_VEHICLE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
      
    }
    
    
    //function to edit a selected vehicle
    public boolean editVehicle (V_VEHICLE vehicle){
        
       PreparedStatement ps;
        
        String editQuery = "UPDATE `vehicle_table` SET `type`=?,`ownerId`=?,`price`=?,`kilometers`=?,`brand`=?,`motor`=?,`color`=?,`gear`=?,`doors`=?,`seats`=?,`year`=?,`ac`=?,`gps`=?,`cas`=?,`ps`=?,`problems`=? WHERE `id` = ?";
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            ps.setInt(1, vehicle.getType());
            ps.setInt(2, vehicle.getOwnerId());
            ps.setString(3, vehicle.getPrice());
            ps.setString(4, vehicle.getKilometers());
            ps.setString(5, vehicle.getBrand());
            ps.setString(6, vehicle.getMotor());
            ps.setString(7, vehicle.getColor());
            ps.setString(8, vehicle.getGear());
            ps.setInt(9, vehicle.getDoors());
            ps.setInt(10, vehicle.getSeats());
            ps.setInt(11, vehicle.getYear());
            ps.setBoolean(12, vehicle.isAc());
            ps.setBoolean(13, vehicle.isGps());
            ps.setBoolean(14, vehicle.isCas());
            ps.setBoolean(15, vehicle.isPs());
            ps.setString(16, vehicle.getProblems());
            ps.setInt(17, vehicle.getId());
            
            return(ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_VEHICLE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    //function to delete a selected vehicle
     public boolean removeVehicle (int vehicleId){
         
        PreparedStatement ps;
        
        String deleteQuery = "DELETE FROM `vehicle_table` WHERE `id`=?";
        
        
        
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, vehicleId);
            
            return (ps.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(V_CLIENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     
    public V_VEHICLE findVehicle (int vehicleId){
        
        PreparedStatement ps;
        ResultSet rs;
        V_VEHICLE vehicle = null;
        
        String searchQuery = "SELECT * FROM `vehicle_table` WHERE `id` = ?";
        
        
        try {
            
            ps = THE_CONNECTION.getTheConnection().prepareStatement(searchQuery);
            ps.setInt(1, vehicleId);
            rs = ps.executeQuery();
            
            if(rs.next()){
                vehicle = new V_VEHICLE(rs.getInt("id"), rs.getInt("type"), rs.getInt("ownerId"), rs.getString("price"), rs.getString("kilometers"), rs.getString("brand"), rs.getString("motor"), rs.getString("color"), rs.getString("gear"), rs.getInt("doors"), rs.getInt("seats"), rs.getInt("year"), rs.getBoolean("ac"), rs.getBoolean("gps"), rs.getBoolean("cas"), rs.getBoolean("ps"), rs.getString("problems"));
            }
            
            return vehicle;
            
        } catch (SQLException ex) {
            Logger.getLogger(V_VEHICLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vehicle;
    } 
     
    //function to return an arraylist of vehicles
     public ArrayList<V_VEHICLE> vehiclesList(){
         
        ArrayList<V_VEHICLE> list = new ArrayList<V_VEHICLE>();
        Statement st;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `vehicle_table`";
        
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            
            V_VEHICLE vehicle;
            
            while(rs.next()){
                vehicle = new V_VEHICLE(rs.getInt("id"), rs.getInt("type"), rs.getInt("ownerId"), rs.getString("price"), rs.getString("kilometers"), rs.getString("brand"), rs.getString("motor"), rs.getString("color"), rs.getString("gear"), rs.getInt("doors"), rs.getInt("seats"), rs.getInt("year"), rs.getBoolean("ac"), rs.getBoolean("gps"), rs.getBoolean("cas"), rs.getBoolean("ps"), rs.getString("problems"));
                
                list.add(vehicle);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(V_VEHICLE.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
     
      public ArrayList<V_VEHICLE> vehiclesListByType(int vehicleType){

            ArrayList<V_VEHICLE> list = new ArrayList<V_VEHICLE>();
            PreparedStatement ps;
            ResultSet rs;
            String selectQuery = "SELECT * FROM `vehicle_table` WHERE `type`=?";

            try {
                ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
                ps.setInt(1, vehicleType);
                rs = ps.executeQuery();

                V_VEHICLE vehicle;

                while(rs.next()){
                    vehicle = new V_VEHICLE(rs.getInt("id"), rs.getInt("type"), rs.getInt("ownerId"), rs.getString("price"), rs.getString("kilometers"), rs.getString("brand"), rs.getString("motor"), rs.getString("color"), rs.getString("gear"), rs.getInt("doors"), rs.getInt("seats"), rs.getInt("year"), rs.getBoolean("ac"), rs.getBoolean("gps"), rs.getBoolean("cas"), rs.getBoolean("ps"), rs.getString("problems"));

                    list.add(vehicle);
                }

            } catch (SQLException ex) {
                Logger.getLogger(V_VEHICLE.class.getName()).log(Level.SEVERE, null, ex);
            }

            return list;
        }


    }


//function to return a list of vehicle depending on the selected type

   