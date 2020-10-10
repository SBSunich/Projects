/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttest2;

import content.Customer;
import content.CustomerFile;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sudesh
 */
public class ProjectTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
      ArrayList <Customer> customerList = CustomerFile.getCustomerRecords();
      
      Customer one = new Customer("C105");
      one.setName("Dino Jackson");
      one.setCity("Brampton");
      one.setStreetAddress("8138 Street");
      customerList.add(one);
      CustomerFile.setCustomerRecords(customerList);
        }
        catch(IOException e){
        System.err.println(e);
        }
    }
    
}
