public class kilometertomiles {
    boolean iskilometer=true;
    double kilometer=10.0;
    double miles=0.621371;
    double result=kilometer*miles;
    public static void main(String[] args) {
        kilometertomiles obj=new kilometertomiles();
        if(obj.iskilometer){
            System.out.println(obj.kilometer+" kilometers is equal to "+obj.result+" miles.");
        }else{
            System.out.println(obj.kilometer+" miles is equal to "+obj.result+" kilometers.");      
        }
    }
}
