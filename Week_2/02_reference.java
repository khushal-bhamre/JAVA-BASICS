import java.util.*;

public class 02_reference{

static void inc(int a[]){
   for(int i=0;i<a.length;i++){
       a[i]++;                                 //array as a parameter always pass by reference
    }
}
   public static void main(String[] args) {  
        Scanner scn =new Scanner(System.in);
        int[] arr=new int [5];

        System.out.println("Enter elements:")
        for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt();
        }
          inc(arr);
         System.out.println("elements are: ")
          for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
          }

    }
}
