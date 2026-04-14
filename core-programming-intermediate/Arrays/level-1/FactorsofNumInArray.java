import java.util.*;
public class FactorsofNumInArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i); }
            }
        for(int i=0;i<factors.size();i++){
            System.out.println(factors.get(i));}
    }
}
