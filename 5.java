import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a<b){
            int c=b,i;
            for ( i=0 ; i<a-1 ; i++){
                b+=c;
            }
            System.out.println(b);
        }
        else{
            int c=a;
            for(int i=0;i<b-1;i++){
                a+=c;
            }  
            System.out.println(a);
        }
    }
}