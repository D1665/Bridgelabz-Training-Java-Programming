package CabService.com;

import java.util.HashMap;

public class CabInvoiceGenerator {


    public static void main(String args[]){
        HashMap<Integer,Customers>map=new HashMap<>();
        CalculateFair cf=new CalculateFair();
        map.put(1,new Customers("Dinesh",1,new Rides(1,5).getRides(),true,"5Gj$hkfshkhf","dineshsirsiya@gmail.com","98754397599",cf.CalculateFare(10,30,new isPrimeUser(true).getCustomer())));
        map.put(2,new Customers("Sirsiya",2,new Rides(2,8).getRides(),true,"5Gj$hkfshkhf","sirsiya@gmail.com","98754397599",cf.CalculateFare(15,40,new isPrimeUser(false).getCustomer())));
        map.put(3,new Customers("modi",3,new Rides(3,10).getRides(),false,"5Gj$hkfshkkjdkjdjkf","modi@gmail.com","98754397599",cf.CalculateFare(20,35,new isPrimeUser(true).getCustomer())));
        map.put(4,new Customers("amit",4,new Rides(4,9).getRides(),true,"5Gj$hkfjkdkjshkhf","amit@gmail.com","98754397599",cf.CalculateFare(40,60,new isPrimeUser(false).getCustomer())));

        System.out.println("All Customer's Invoice are following:-\n ");
        for(Customers i:map.values()){
            i.getdetails();
        }

    }


}
