import java.util.Scanner;
public class 07_functions{
    static void greet(){
        System.out.println("Khushal");
    }
    static void age(int a){
        System.out.println("Your age is-> "+a);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scn.nextInt();
        age(age);
    }
}
