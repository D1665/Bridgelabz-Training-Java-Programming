import java.util.*;
public class MultiplicationOfArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int multiplication=8;
        for(int i=0;i<size;i++){
            multiplication=multiplication*arr[i];
        }
        System.out.println("Multiplication of array is:"+multiplication);
    }
}
