
import java.util.Scanner;
public class sol {

    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while(i<=number)                    //while loop
        {
            fact = fact * i;
            i++;
        }
        // for(int i = 1; i <= number; i++) //for loop
        // {
        //     fact = fact * i;
        // }
        // do{                            //do while loop
        //     fact = fact * i;
        //     i++;
        // }while(i<=number);
        
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}