import java.util.*;

public class StudentGradeSystem {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Dear Student Enter Your Full Name");
       String name=sc.nextLine(); 
       System.out.println("Enter your Mathematics num =");
       int mathnum=sc.nextInt();
       System.out.println("Enter your English num =");
       int engnum=sc.nextInt();
       System.out.println("Enter your Physics num =");
       int phynum=sc.nextInt();
       System.out.println("Enter your Electronics num =");
       int elecnum=sc.nextInt();
       System.out.println("Enter your Chemistry num =");
       int chemnum=sc.nextInt();
       int sum=mathnum+engnum+phynum+elecnum+chemnum;
       sum=sum*100;
       int average=sum/500;

       System.out.println("Your all over percentage is :"+average);

       if(average<33){
        System.out.println("Sorry! "+name+", Your are failed.");
       }
       else if(average>=33&&average<=40){
        System.out.println("Congrats " +name+ ", You are passed and got C grade");
       }
       else if(average>40&&average<=50){
        System.out.println("Congrats "+name+", You are passed and got B- grade");
       }
       else if(average>50&&average<=60){
        System.out.println("Congrats "+name+" , You are passed and got B grade");
       }
       else if(average>60&&average<=70){
        System.out.println("Congrats "+name+", You are passed and got B+ grade");
       }
       else if(average>70&&average<=80){
        System.out.println("Congrats "+name+", You are passed and got A grade");
       }
       else if(average>80&&average<=90){
        System.out.println("Congrats "+name+" , You are passed and got A+ grade");
       }
       else if(average>90&&average<=100){
        System.out.println("Congrats "+name+", You are passed and got O grade");
       }

    }
}