import java.util.Scanner;
public class Prime{
    
   public static boolean isprime(int n){
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;             //checking the given number whether it is prime or not
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num;
        boolean result;
        System.out.println("Enter a value to check whether it prime or not!!");
        num=scn.nextInt();
        if(num==0){
            System.out.println("it is a whole number!! ");
        }
        else if(num==1){
            System.out.println("it a natural number!!");
        }
        else{
            result=isprime(num);
            if(result==true){
            System.out.println("Number is prime!");
           }
            else{
            System.out.println("Number is not prime!");
           }

        }
    }
}
