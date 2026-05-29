package Regex;

import java.util.Scanner;
import java.util.regex.*;

public class EmailAddressValidation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email address: ");
        String email=sc.nextLine();
        String regex="^[a-zA-Z0-9$_.]+@[a-zA-Z0-9_]+\\.[a-zA-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m=p.matcher(email);
        if(m.matches()){
            System.out.println("Your Email address is Correct!");
        }
        else{
            System.out.println("Your Email address is not correct!");
        }
    }
    
}
