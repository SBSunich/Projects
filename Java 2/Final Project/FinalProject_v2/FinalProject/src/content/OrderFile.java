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

public class OrderFile {

    public static ArrayList<Order> getOrders() throws IOException {
        ArrayList<Order> orderList = new ArrayList<>();

        FileReader fr = new FileReader("src/content/Order.dat");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ",");
            String orderID = st.nextToken();
            String customerID = st.nextToken();
            String product = st.nextToken();
            String shippingMethod = st.nextToken();

            Order one = new Order(orderID);
            one.setCustomerID(customerID);
            one.setProduct(product);
            one.setShippingMethod(shippingMethod);

            orderList.add(one);

            line = br.readLine();

        }

        br.close();
        fr.close();

        return orderList;
    }

    public static void setOrders(ArrayList<Order> orderList) 
            throws IOException {
        FileWriter fw = new FileWriter("Order.dat");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int sub = 0; sub < orderList.size(); sub++) {
            Order one = orderList.get(sub);
            String order = one.getOrderID() + ", " + one.getCustomerID()
                    + ", " + one.getProduct() + ", " + one.getShippingMethod();
            bw.write(order);
            bw.newLine();
        }

        bw.close();
        fw.close();
    }

}
