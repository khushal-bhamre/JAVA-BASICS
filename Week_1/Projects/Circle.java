import java.util.Scanner;
public class Circle {

    static double areaofcircle(double r){
        double area=(3.14*r*r);                    //calculating area of circle using functions and basics 
        return area;
    } 
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      double radius;
      System.out.println("Enter a value of radius: ");
      radius=scn.nextDouble();
      double area= areaofcircle(radius);
      System.out.println("Area of circle is->"+area);
    }
}
