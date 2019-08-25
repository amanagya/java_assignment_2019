import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        long n = scan.nextInt();
        long last=0;
        while (n>0){
            last = 10*last + n%10;
            n=n/10;
        }
        System.out.printf("%5d",last);
    }
}