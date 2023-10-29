import java.util.Scanner;
public class switch{
    public static void main(String[] args) {

        Scanner  scan=new Scanner(System.in);
        System.out.println("Enter your order no:");
        int choice= scan.nextInt();

        switch(choice){
            case 1:
            System.out.println("Your order is Hamburger...please wait for 15 mins");
            break;
            case 2:
           System.out.println("Your order is Pizza...please wait for 30 mins");
            break;
            case 3:
             System.out.println("Your order is cold coffee...please wait for 15 mins");
            break;
            case 4:
            System.out.println("Your order is chicken thali...please wait for 40 mins");
            break;
            case 5:
             System.out.println("Your order is italian food...please wait for 45 mins");
            break;
            case 6:
             System.out.println("Your order is paneer tikka...please wait for 30 mins");
            break;
            case 7:
            System.out.println("Your order is puran poli...please wait for 15 mins");
            break;
            default:
            System.out.println("invalid choice ...please enter a valid choice");
        }
        if(choice<=7){
        System.out.println("TIME OVER!!");
        System.out.println("Your order is ready");
        System.out.println("Thank you for coming!!");
        }
    }
}
