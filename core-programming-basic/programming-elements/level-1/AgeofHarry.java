public class AgeofHarry {
    int bornyear=1900;
    int bornday=24;
    int bornmonth=6;
    int currentyear=2024;
    int currentday=15;
    int currentmonth=4;
    int ageofyear=currentyear-bornyear;
    int ageofmonth=currentmonth-bornmonth;
    int ageofday=currentday-bornday;
    public static void main(String[] args) {
        AgeofHarry obj=new AgeofHarry();
        System.out.println("Age of Harry is "+obj.ageofyear+" years "+obj.ageofmonth+" months "+obj.ageofday+" days");
    }       
}
