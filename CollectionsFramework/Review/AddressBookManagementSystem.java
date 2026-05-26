package CollectionsFramework.Review;

import java.io.*;
interface InnerAddressBookManagement {
    abstract void read();
    abstract void write();

    
}
 public class AddressBookManagementSystem implements InnerAddressBookManagement {
      private String name;
      private int contactNum;
      private int BuildingNum;
      private String colonyName;
      private int socityNum;
      public void setname(String name){
        this.name=name;
      }
      public String getname(){
        return name;
      }
      public void setcontactNum(int contactNum){
        this.contactNum=contactNum;
      }
      public int getcontactNum(){
        return contactNum;
      }public void setBuildingNum(int BuildingNum){
        this.BuildingNum=BuildingNum;
      }
      public int getBuildingNum(){
        return BuildingNum;
      }public void setColonyName(String colonyName){
        this.colonyName=colonyName;
      }
      public String getcolonyName(){
        return colonyName;
      }public void setsocityNum(int socityNum){
        this.socityNum=socityNum;
      }
      public int getsocitynum(){
        return socityNum;
      }
       String getdetailes(){
        return getname()+" "+getcontactNum()+" "+getBuildingNum()+" "+getcolonyName()+" "+getsocitynum();

      }


      public void read() {

        try {
    
            FileReader fl = new FileReader("file.txt");
    
            int data;
    
            while ((data = fl.read()) != -1) {
    
                System.out.print((char) data);
    
            }
    
            fl.close();
    
        } catch (IOException e) {
    
            e.printStackTrace();
        }
    }
    public void write() {

      try {
  
          FileWriter fl = new FileWriter("file.txt", true);
  
          String details = getdetailes();
  
          fl.write(details + "\n");
  
          fl.close();
  
      } catch (IOException e) {
  
          e.printStackTrace();
      }
  }
  public void clearFile() {

    try {

        FileWriter fl = new FileWriter("file.txt");

        fl.write("");

        fl.close();

        System.out.println("File cleared");

    } catch (IOException e) {

        e.printStackTrace();
    }
}
public void updateFile() {

  try {

      FileWriter fl = new FileWriter("file.txt");

      fl.write("");

      fl.close();

      System.out.println("File updated ");

  } catch (IOException e) {

      e.printStackTrace();
  }
}


    
}
