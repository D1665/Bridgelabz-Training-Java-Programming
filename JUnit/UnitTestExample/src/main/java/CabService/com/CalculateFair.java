package CabService.com;

public class CalculateFair {
    public static double CalculateFare(double km,double timeinMin , String Customerstatus){
        if(Customerstatus=="Yes"){
            return Math.max((km*15+timeinMin*2),20);

        }
        else {
            return Math.max((km*10+timeinMin*1),5);
        }
    }
}
