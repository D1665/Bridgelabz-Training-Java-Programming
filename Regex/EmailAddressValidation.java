package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Email address: ");
        String email=sc.nextLine();
        Pattern p = Pattern.compile("[A-Za-z0-9+_.-]+@(.+)$");
        Matcher m=p.matcher(email);
        if(m.matches()){
            System.out.println("Your Email address is Correct!");
        }
        else{
            System.out.println("Your Email address is not correct!");
        }
    }
    
}
