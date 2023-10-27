import java.util.Scanner;

public class conditional_s {
    public static void main(String[] args) {
        int a =5;
        int b=10;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);   //comparison operators
        System.out.println(a<=b);
        System.out.println(a==b);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of x");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("You are minors");
        } else if (age >= 18 && age < 65) {
            System.out.println("You are adult");      //conditional statements if-else
        } else {
            System.out.println("you are citizens");
        }
       
        int x=scan.nextInt();                       //ternary operator 
        int y=(x>5)?20:30;
        System.out.println(y);

    }
}
