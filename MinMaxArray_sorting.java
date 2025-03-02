import java.util.Arrays;
import java.util.Scanner;
public class MinMaxArray_sorting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[n-1];
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
}
}