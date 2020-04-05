
import java.util.ArrayList;



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
        return true;
    }
    
    
    //function to edit a selected vehicle
    public boolean editVehicle (V_VEHICLE vehicle){
        return true;
    }
    
    
    //function to delete a selected vehicle
     public boolean removeVehicle (int vehicleId){
        return true;
    }
     
    //function to return an arraylist of vehicles
     public ArrayList<V_VEHICLE> vehiclesList(){
         return new ArrayList<V_VEHICLE>();
     }
     
}
