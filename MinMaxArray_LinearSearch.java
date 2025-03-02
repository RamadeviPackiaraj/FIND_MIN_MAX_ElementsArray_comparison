import java.util.Scanner;
public class MinMaxArray_LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element:"+max);
        System.out.println("Minimum Element:"+min);
    }
}