import java.util.*;
import java.math.*;
public class solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        double d=(b*b)-(4*a)*c;
        if(d>0){
            System.out.println("Real Distinct Roots");
        }
        else if(d==0){
            System.out.println("Real Equal Roots");
        }
        else{
            System.out.println("Complex Roots");
        }
    }
}