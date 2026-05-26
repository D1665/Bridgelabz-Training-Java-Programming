package CollectionsFramework.Review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    static void deleteaddress(String name,Map<String,AddressBookManagementSystem>mp,AddressBookManagementSystem d){
        mp.remove(name);
        d.clearFile();
        for(AddressBookManagementSystem i:mp.values()){
            i.write();
        }

    }
    static void updateaddress(String name,Map<String,AddressBookManagementSystem>mp,AddressBookManagementSystem d,AddressBookManagementSystem u){
        mp.put(name,u);
        d.updateFile();
        for(AddressBookManagementSystem i:mp.values()){
            i.write();
        }

    }
    
    public static void main(String[] args) {
        HashMap<String,AddressBookManagementSystem>map=new HashMap<>();
        AddressBookManagementSystem ad1=new AddressBookManagementSystem();
        AddressBookManagementSystem ad2=new AddressBookManagementSystem();
        AddressBookManagementSystem ad3=new AddressBookManagementSystem();
        AddressBookManagementSystem ad4=new AddressBookManagementSystem();
        AddressBookManagementSystem ad5=new AddressBookManagementSystem();
        ad1.setname("Dinesh");
        ad1.setBuildingNum(89);
        ad1.setColonyName("Mathura");
        ad1.setcontactNum(4234298);
        ad1.setsocityNum(43849);
        ad2.setname("Sirsiya");
        ad2.setBuildingNum(89);
        ad2.setColonyName("Mathura");
        ad2.setcontactNum(4234298);
        ad2.setsocityNum(43849);
        ad3.setname("modi");
        ad3.setBuildingNum(89);
        ad3.setColonyName("Mathura");
        ad3.setcontactNum(4234298);
        ad3.setsocityNum(43849);
        ad4.setname("amit");
        ad4.setBuildingNum(89);
        ad4.setColonyName("Mathura");
        ad4.setcontactNum(4234298);
        ad4.setsocityNum(43849);
        ad5.setname("yogi");
        ad5.setBuildingNum(89);
        ad5.setColonyName("Mathura");
        ad5.setcontactNum(4234298);
        ad5.setsocityNum(43849);
        map.put(ad1.getname(),ad1);
        map.put(ad2.getname(),ad2);
        map.put(ad3.getname(),ad3);
        map.put(ad4.getname(),ad4); 
        map.put(ad5.getname(),ad5);
        
        

        for(AddressBookManagementSystem i:map.values()){
            i.write();
        }
    
        
        ad1.read();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name Which Address You Want to Delete:- ");
        String dname=sc.next();
        deleteaddress(dname, map,ad1);
        ad1.read();
        AddressBookManagementSystem adu=new AddressBookManagementSystem();
        System.out.println("Enter Name Which Address You Want to Update its detailes :- ");
        String uname=sc.next();
        adu.setname(uname);
        System.out.println("Enter new details:- ");
        
        System.out.println("Enter its new buildingnum:- ");
        adu.setBuildingNum(sc.nextInt());
        System.out.println("Enter its new colonyNum:- ");
        adu.setColonyName(sc.next());
        System.out.println("Enter its new contactnum:- ");
        adu.setcontactNum(sc.nextInt());
        System.out.println("Enter its new socitynum:- ");
        adu.setsocityNum(sc.nextInt());

        updateaddress(uname,map,ad1,adu);
        ad1.read();


       

        

    }
    
}
