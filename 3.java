import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double cm=scan.nextFloat();
        double in = cm/2.54;
        int ft=0;
        while(in>12){
            ft+=1;
            in-=12;
        }
        System.out.printf("%.1f centimeters is %d feet %.1f inches",cm,ft,in);
    }
}