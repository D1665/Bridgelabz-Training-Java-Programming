import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n > 0) {
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    System.out.println(i + " is Even Number");
                }
                else {
                    System.out.println(i + " is Odd Number");
                }
            }
        }
        else {
            System.out.println("Not a Natural Number");
        }
    }
}