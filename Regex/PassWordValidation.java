package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your phone Num: ");
        String phNum=sc.nextLine();
        Pattern p=Pattern.compile("\\d{10}");
        Matcher m=p.matcher(phNum);
        if(m.matches()){
            System.out.println("Your Phone num is Correct!");
        }
        else{
            System.out.println("Your phone num is not correct!");
        }
    }
}
