package CabService.com;

public class Rides {

    int custid;
    int numofrides;
    Rides(int custid,int numofrides){
        this.custid=custid;
        this.numofrides=numofrides;
    }
    public int getRides(){
        return numofrides;
    }


}
