package Regex;
import java.util.regex.*;
import java.util.Scanner;

public class PhoneNumValidation {
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
