/**
 * Sunil Sunichura, Sudesh Sunichura
 * Student Number: 991578383, 991421780
 * Final Project
 * April 5, 2020
 */

package content;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CustomerFile {

    public static ArrayList getCustomerRecords() throws IOException {
        ArrayList<Customer> customerList = new ArrayList<>();
        FileReader fr = new FileReader("src/content/Customer.dat");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            StringTokenizer csep = new StringTokenizer(line, ",");
            String ID = csep.nextToken();
            String name = csep.nextToken();
            String streetAddress = csep.nextToken();
            String city = csep.nextToken();
            Customer one = new Customer(ID);
            one.setName(name);
            one.setStreetAddress(streetAddress);
            one.setCity(city);
            customerList.add(one);
            line = br.readLine();
        }
        br.close();
        fr.close();
        return customerList;
    }

    public static void setCustomerRecords(ArrayList<Customer> customerList)
            throws IOException {
        FileWriter fw = new FileWriter("src/content/Customer.dat");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int sub = 0; sub < customerList.size(); sub++) {
            Customer one = customerList.get(sub);
            String record = one.getID() + ", " + one.getName() + ", "
                    + one.getStreetAdress() + ", " + one.getCity();
            bw.write(record);
            bw.newLine();

        }
        bw.close();
        fw.close();
    }
}
