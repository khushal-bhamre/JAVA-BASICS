import java.util.Scanner;
public class 01_array{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        //declaration 
        int []arr=new int [10];

        //initialization
        arr[0]=4;

         String []friends=new String[5];

         friends[0]="virat";
         friends[1]="rohit";
         friends[2]="rahul";
         friends[3]="surya";
         friends[4]="siraj";
   

         System.out.println("Enter size of array:");
         int n=scn.nextInt();
         int [] arr1 =new int[n];
         System.out.println("Enter numbers:");
         for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scn.nextInt();
         }
        System.out.println("All numbers are->");
         for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
         }

    //      System.out.println(friends.length);
    }
}
