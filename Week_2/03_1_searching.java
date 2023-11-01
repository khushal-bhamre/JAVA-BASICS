import java.util.*;

public class 03_1_searching {  
     static int linearsearch(int a[],int key){
        int ans=-1;
        for (int i = 0; i < a.length; i++) {
            if(key==a[i])ans= i;
        }
         return ans;
     }

     static int binarysearch(int a[],int key){
        int i=0;
        int j=a.length-1;
        int mid;
        while(i<j){
            mid=(i+j)/2;
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]<key){
               i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
     }


    public static void main(String[] args) {
        int [] arr=new int [5];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
       
        int result=binarysearch(arr, 30);
        System.out.println(result);
    
     
    }
}
