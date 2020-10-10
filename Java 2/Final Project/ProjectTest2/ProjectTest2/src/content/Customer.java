package content;


public class Customer {
       private String customerID;
    private String name;
    private String streetAddress;
    private String city;
    
    public Customer(String customerID){
    this.customerID = customerID;
    }
    public String getID(){
    return this.customerID;
    }
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
    return this.name;
    }
    public void setStreetAddress(String streetAddress){
    this.streetAddress = streetAddress;
    }
    public String getStreetAdress(){
    return this.streetAddress;
    }
    public void setCity(String city){
    this.city = city;
    }
    public String getCity(){
    return this.city;
    } 
}
