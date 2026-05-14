package Object_Oriented_Programming.Review;

class BankLoan{
    int rate;
    int amount;
    int timeinyears;
    static String bankname="State Bank of India";
    String customername;
    BankLoan(String customername,int amount,int timeinyears,int rate){
        this.customername=customername;
        this.amount=amount;
        this.timeinyears=timeinyears;
        this.rate=rate;

    }
    int simpleintrest(){
        return (amount*rate*timeinyears*24)/100;
    }
    void customerdetails(){
        System.out.println("Customer name is: "+customername);
        System.out.println("Bank name is: "+bankname);
        System.out.println("Customer intial loan amount: "+amount);
        System.out.println("Total bank interest on amount: "+simpleintrest());
        int totalamount=amount+simpleintrest();
        System.out.println("Total amount after including interest which you have to pay: "+totalamount);
    }
}

public class BankloanAplication {
    
    public static void main(String[] args) {
        BankLoan customer1=new BankLoan("Dinesh Sirsiya", 100000, 2, 2);
        customer1.customerdetails();
    }

    
}
