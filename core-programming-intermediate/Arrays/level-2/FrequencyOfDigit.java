import java.util.*;
public class FrequencyOfDigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=0;
        while(num>0){
            cnt++;
            num=num/10;
        }
        int feq[]=new int[cnt];
        int i=0;
        while(num>0){
            int rem=num%10;
            feq[i]=rem;
            num=num/10;
            i++;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<feq.length;j++){
            if(map.containsKey(feq[j])){
                map.put(feq[j],map.get(feq[j])+1);
            }
            else{
                map.put(feq[j],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    
}
