import java.util.*;
public class 06_2_loops{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //while loop
        int i=5;
        while(i>=1){
            System.out.println("count->"+i);
            i--;
        }

         System.out.println();

        int count=5;
        //do-while
         do {
            System.out.println("count->"+count);
            count--;
         } while (count>=1);

         System.out.println();

         //for loop
         int j;
         for(j=1;j<=100;j+=5){
            System.out.println("count->"+ j);
         }
         System.out.println(j);

         System.out.println();
         //for loop examples

         for(int k=1;k<=30;k++){
            if(k==5){
              System.out.println("BIRTHDAY1!!!!!!");
              continue;
            }
            System.out.println(k);
         }
    }
}
