import java.util.Scanner;
public class 03_operators{
    public static void main(String[] args) {

//operations by assigning values itself

    int x=20;
    int y=10;
    System.out.println("Addition of x and y "+(x+y));
    System.out.println("subtraction of x and y "+(x-y));
    System.out.println("Multiplication of x and y "+(x*y));
    System.out.println("Dividion of x and y "+(x/y));
    System.out.println("using modulo operator"+(x%y));


 //Operations by taking input from user                           //arithmetic operators in java

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first value:");
        int a=scan.nextInt();
        System.out.println("Enter first value:");
        int b=scan.nextInt();
        
        System.out.println("Addition of a and b "+(a+b));
        System.out.println("subtraction of a and b "+(a-b));
        System.out.println("Multiplication of a and b "+(a*b));
        System.out.println("Dividion of a and b "+(a/b));
        System.out.println("using modulo operator"+(a%b));

      //logical operators

        int number = 5;

        // Using the AND operator (&&)
        boolean isBetween1And9 = number > 0 && number < 10;
        System.out.println("Number is between 1 and 9: " + isBetween1And9);

        // Using the OR operator (||)
        boolean isOutOfRange = number < 0 || number > 10;
        System.out.println("Number is out of range [0, 10]: " + isOutOfRange);

        // Using the NOT operator (!)
        boolean isOdd = number % 2 != 0;
        System.out.println("Number is odd: " + isOdd);

    }
}
