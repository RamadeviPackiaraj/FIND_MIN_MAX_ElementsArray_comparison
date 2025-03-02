import java.util.Scanner;
public class MinMaxArray_Tournament_Method{
    static class Pair{
        int min;
        int max;
    }
    //recursive function for tournament method
    static Pair findMinMax(int[] arr, int low, int high){
        Pair minMax=new Pair();
        Pair left,right;
        
        //if there is only one Elements
        if(low==high){
            minMax.min=arr[low];
            minMax.max=arr[high];
            return minMax;
        }
        //if there is 2 Elements
        if(high==low+1){
            if(arr[low]<arr[high]){
               minMax.min=arr[low];
               minMax.max=arr[high];  
            }
            else{
               minMax.min=arr[high];
               minMax.max=arr[low]; 
            }
            return minMax;
        }
        
        //if there is more than 2 elements, divide the arraay
        
        int mid=(low+high)/2;
        left= findMinMax(arr,low,mid);
        right =findMinMax(arr,mid+1,high);
        
        
        minMax.min=Math.min(left.min,right.min);
        minMax.max=Math.max(left.max,right.max);
          return minMax;
            }

    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }  
        Pair result=findMinMax(arr,0,n-1);
        System.out.println("Maximum Element:"+result.max);
        System.out.println("Minimum Element:"+result.min);
    }
}