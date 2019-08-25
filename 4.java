import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sec = scan.nextInt();
        int hr=0,min=0;
        int seconds=sec;
        while (sec>60){
            min++;
            sec-=60;
        }
        while(min>60){
            hr++;
            min-=60;
        }
        System.out.printf("%d seconds is equivalent to %d hours %d minutes and %d seconds.",seconds,hr,min,sec);
    }
}