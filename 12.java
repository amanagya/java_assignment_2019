import java.util.*;
public class sol{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        while(x!=y)
    {
        if(x > y)
            x -= y;
        else
            y -= x;
    }
        System.out.println(x);
    }
}