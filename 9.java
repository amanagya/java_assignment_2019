import java.util.*;
public class solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input Format: n\n n numbers");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        if(n%2==0){
            double med = (arr[n/2]+arr[(n/2)-1])/2;
            System.out.println(med);
        }
        else{
            System.out.printf("Median is %d",arr[n/2]);
        }
    }
}