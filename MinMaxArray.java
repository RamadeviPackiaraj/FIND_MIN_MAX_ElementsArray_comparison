import java.util.Arrays;
import java.util.Scanner;
public class MinMaxArray{
    public static int Min(int[] arr,int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
    public static int Max(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Maximum Element:"+Max(arr,n));
        System.out.println("Minimum Element:"+Min(arr,n));

       sc.close();


 }
}