import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int q = scan.nextInt();
        int result = n > p && n > q ? n : p > n && p >q ? p : q;
        System.out.println(result);
    }
}