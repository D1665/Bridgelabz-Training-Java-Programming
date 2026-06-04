package CabService.com;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customers {
   Boolean status;
   int totalRides;
   int custId;
   String name;
   String password;
   String email;
   String phonenum;
   double fairperride;
   Validation v=new Validation();
   Customers(String name,int custId,int totalRides,Boolean status,String password,String email,String phonenum,double fairperride){
       this.name=name;
       this.custId=custId;
       this.totalRides=totalRides;
       this.status=status;
       this.fairperride=fairperride;
       if(v.isValidemail(email)){
           this.email=email;
       }
       else{
           this.email="this is not valid email";
       }
       if(v.isValidpassword(password)){
           this.password=password;
       }
       else{
           this.password="this is not valid password";
       }
       if(v.isValidphone(phonenum)){
           this.phonenum=phonenum;
       }
       else{
           this.phonenum="this is not valid phonenum";
       }



   }

   public void getdetails(){
       System.out.println("Customer's name is: "+name);
       System.out.println("Customer's id is: "+custId);
       System.out.println("Customer's total rides is: "+totalRides);
       System.out.println("Customer is prime user: "+status);
       System.out.println("Customer's email is: "+email);
       System.out.println("Customer's phonenum is: "+phonenum);
       System.out.println("Customer's password is: "+password);
       System.out.println("Custormer's total fair is: "+totalRides*fairperride);
       System.out.println("\n\n");
   }



}
