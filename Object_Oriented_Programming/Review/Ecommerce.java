package Object_Oriented_Programming.Review;

class product {
    static int totalproducts=0;
    private int productid;
    private String name;
    private int price;
    private int stock;
    product(int productid,String name){
        this.productid=productid;
        this.name=name;
        totalproducts++;
       

    }
    public void setprice(int price){
             if(price>0){
                this.price=price;
             }
            
    }
    public void setstock(int stock){
        if(stock>=0){
            this.stock=stock;
           
        }
       
        
    }
    public void getproductdetails(){
       System.out.println("total products is "+totalproducts);
       System.out.println("Product id is: "+productid);
       System.out.println("product price is: "+price);
       System.out.println(("Stock is: "+stock));

    }
}
class Customer{
    private int customerPin=7878;
    protected String customerPlace="Aligarh";

    int customerid;
    String name;
    String email;
    Customer(int customerid,String name,String email){
        this.customerid=customerid;
        this.name=name;
        this.email=email;

    }
    void customerdetail(){
        System.out.println("Customer name is: "+name);
        System.out.println("Customer Email is: "+email);
        System.out.println("Customer id is: "+customerid);

    }

}
class premiumCustomer extends Customer{
    int membershiplevel;
    premiumCustomer(int customerid, String name, String email,int membershiplevel) {
        super(customerid, name, email);
        this.membershiplevel=membershiplevel;
    }
    void premiumCustomerDetails(){
        super.customerdetail();
        System.out.println("Customer place is: "+customerPlace);
        // System.out.println("Customer pin is: "+customerPin);
    }



}

public class Ecommerce {
    public static void main(String[]args){
        Customer []objects=new Customer[2];
        objects[0]=new Customer(1,"Dinesh","dinesh@gmailcom");
        objects[1]=new Customer(1,"Sirsiya","sirsiys@gmailcom");

        premiumCustomer pc=new premiumCustomer(1,"Dinesh","dinesh@gmailcom", 9);
        System.out.println(pc instanceof Customer);
        pc.customerdetail();

        pc.premiumCustomerDetails();
        product p1=new product(1,"pen");
        p1.setprice(90);
        p1.setstock(89);
        product p2=new product(2,"chair");

        p1.getproductdetails();
        
        System.out.println(product.totalproducts);
    }
}
