import java.util.Scanner;
public class Factorial {

   static int Fact(int n)
    {   if(n==0)return 1;
        int ans=1;
        for(int i=1;i<=n;i++){   //calculating factorial of a number using functions
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Enter a number for factorial");
        num=scn.nextInt();
        int result=Fact(num);
        System.out.println("Factorial of a number is-> "+result);
    }
}
