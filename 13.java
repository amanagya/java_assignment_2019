import java.util.Scanner;
public class last{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sm=0;
        for (int i=50;i<101;i++){
            if(i%7 == 0){
                sm +=i;
            }
        }
        System.out.println(sm);
    }
}