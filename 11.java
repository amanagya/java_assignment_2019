import java.lang.Math;
import java.util.*;
public class solution{
    public static void main(String[] args){
        double[] arr=new double[5];
        arr[0]=2%((2+2)*2-(2/2));
        int a = 4,b=5,c=6;
        arr[1]=((a <b) || (b >c)&&(a>b) || (!(a>c)));
        double i=8,j=5,x=0.005,y=-0.01;
        arr[2]=5* ((i / 7) + ( j *(i -3))%(x+ y- 2+ i));
        int x2=10;
        arr[3]=--x2*x2--;
        int t=6;
        arr[4]=7*t+2;
        for (int p = 0 ; p<5;p++){
            System.out.println(arr[p]);
        }
    }
}