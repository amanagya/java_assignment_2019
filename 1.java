import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        int k=1;
        for (int i=0;i<4;i++){
            arr[i]=scan.nextInt();
        }
        for (int j:arr){
            k*=j;
        }
        System.out.println(k);
}}