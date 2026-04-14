import java.util.*;
public class FizzBuzz {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] res=new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0){
                res[i-1]="Fizz";
            }
            else if(i%5==0){
                res[i-1]="Buzz";
            }
            else if(i%3==0 && i%5==0){
                res[i-1]="FizzBuzz";
            }
            else{
                res[i-1]=Integer.toString(i);
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        
        
    }
}
