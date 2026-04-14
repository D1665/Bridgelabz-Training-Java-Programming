import java.util.*;
public class PositiveandNegative {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                System.out.println(arr[i]+" is positive");
            }
            if(arr[i]<0){
                System.out.println(arr[i]+" is negative");
            }
            else{
                System.out.println(arr[i]+" is zero");
            }
        }
        
    }

}
