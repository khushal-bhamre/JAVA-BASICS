import java.util.*;

public class 03_array_operations {
    static int Max(int x[]){
    int max=x[0];
    for(int i=1;i<x.length;i++){
        if(x[i]>max)max=x[i];
    }
    return max;
}

    static int sum(int x[]){
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        return sum;
    }

    static int [] reverse (int x[]){
         int []a=new int [x.length];
         int i,j=0;

         for(i=0;i<x.length;i++){
           a[i]=x[i];
         }
         i--;
         for(;i>=0;i--){
           x[j++]=a[i];
         }
         return x;
    }
    static void reverse2(int x[]){
        int i=0;
        int j=x.length;

        while(i<j){
            int a=x[i];
            x[i++]=x[j];
            x[j--]=a;
        }
        for (int j2 = 0; j2 < x.length; j2++) {
            System.out.println(x[j2]);
        }
    }
    public static void main(String[] args) {
        int [] arr=new int [5];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        // int []result=new int [arr.length];
        // reverse2(arr);
    
        //  for(int i=0;i<result.length;i++){
        //     System.out.println(result[i]);
        //  }
       
      //    int result= Max(arr);
     // System.out.println("max element is "+result);
    //  int sum=sum(arr);
//    System.out.println("sum of all elements is "+sum);
    }
}
