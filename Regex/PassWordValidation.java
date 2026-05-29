package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password: ");
        String phNum=sc.nextLine();
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(phNum);
        if(m.matches()){
            System.out.println("Your Password is Correct!");
        }
        else{
            System.out.println("Your Password is not correct!");
        }
    }
}
