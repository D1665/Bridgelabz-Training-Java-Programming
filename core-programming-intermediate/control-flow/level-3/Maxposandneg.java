
public class Maxposandneg {
    static int maxi(int[]arr){
        int pos=0;
        int neg=0;
        for(int a:arr){
            if(a>0)
                pos++;
            else if(a<0)
                neg++;
        }
        return Math.max(pos,neg);
    }
    public static void main(String[]args){
        int[]arr={-2,-1,-3,4,3,7,-9};
        int arr2[]={1,0,0,2,-3,-2,1,4};
        System.out.println(maxi(arr2));
    }
}
