import java.util.Scanner; //importing scanner class
public class input{
    public static void main(String[] args) {

//operations by assigning values itself

    int x=20;
    int y=10;
    System.out.println("Addition of x and y "+(x+y));
    System.out.println("subtraction of x and y "+(x-y));
    System.out.println("Multiplication of x and y "+(x*y));
    System.out.println("Dividion of x and y "+(x/y));
    System.out.println("using modulo operator"+(x%y));


 //Operations by taking input from user

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


    }
}
