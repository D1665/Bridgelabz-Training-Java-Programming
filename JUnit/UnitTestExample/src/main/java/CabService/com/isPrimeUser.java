package CabService.com;

public class isPrimeUser {
    boolean res;
    isPrimeUser(boolean res){
        this.res=res;
    }
    public String getCustomer(){
        if(res){
            return "Yes";
        }
        else {
            return "No";
        }
    }


}
