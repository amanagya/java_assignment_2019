import java.util.Scanner;
import static java.lang.Math.*;

public class equ
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter a, b, c");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        System.out.println("\nequation is = ");
        System.out.println(a+ "x^2 + "+ b+ "x + "+c +" = 0 \n");
        double discriminant= (Math.pow(b,2)-(4*(a*c)));
        double root1=0;
        double root2=0;
        if (discriminant>0)
        {
            System.out.println("roots are distinct and real. \n");
            root1 = ((-b-(Math.sqrt(discriminant)))/(2*a));
            System.out.println("root1 is : \n" + root1);
            root2 = ((-b+(Math.sqrt(discriminant)))/(2*a));
            System.out.println("root2 is : \n" + root2);
        }
        else if(discriminant==0)
        {
            System.out.println("roots are equal and real. \n");
            root1 = ((-b-(Math.sqrt(discriminant)))/(2*a));
            System.out.println("root1 is : \n" + root1);
            root2 = ((-b+(Math.sqrt(discriminant)))/(2*a));
            System.out.println("root2 is : \n"+ root2);
        }
        else
        {
            System.out.println("roots are unequal and complex. \n");
            System.out.println("Equation have no root. \n");
        }
        
    }
}
