
import java.util.*;
public class Guessingapp {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int cnt=0;
       int guessnum=(int)(Math.random()*100);
       int num=0;
       System.out.println("Guess num between 1 and 100");

       while(guessnum!=num){
        num=sc.nextInt();
        cnt++;
        if(num<0||num>100){
            System.out.println("You guess Wrong num so Please Guess Num bw 1 and 100");
        }
        else if(num<guessnum){
            System.out.println("your num is small so guess large num");
        }
        else if(num>guessnum){
            System.out.println("your num is large so guess small num");
        }
        else if(num==guessnum){
            System.out.println("Congrats you guess correct num is "+cnt+"attempt");
        }


       } 
    }
}
