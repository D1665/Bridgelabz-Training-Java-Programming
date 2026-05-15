package DataStructureandAlgorithm.review;



public class movezero {
    
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j++]=arr[i];

            }
        }
        for(int i=j;i<arr.length;i++){
            arr[i]=0;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
    
}
