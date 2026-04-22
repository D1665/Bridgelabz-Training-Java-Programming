package Object_Oriented_Programming.OOPs_Basic.Projects;

public class LineComparison {
    int x1;
    int y1;
    int x2;
    int y2;
    LineComparison(int x1,int y1,int x2,int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;    
    }
    
    double getlength(){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    public static void main(String args[]){
        LineComparison l1=new LineComparison(2,4 ,8,10 );
        LineComparison l2=new LineComparison(24,25,33,45);
        double len1=l1.getlength();
        double len2=l2.getlength();
        System.out.println("Length of line 1 is: "+len1);
        System.out.println("Length of line 2 is: "+len2);
        if(len1==len2){
            System.out.println("Both lines are equal");
        }
        else if(len1>len2){
            System.out.println("First line is longer than Second line");
        }
        else{
            System.out.println("Second line is longer than first line");
        }

    }
    
}
