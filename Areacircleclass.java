import java.util.Scanner;
class Circle{
   float area(float radius){
   float ans = (float)3.14 * radius * radius ;
   return ans;
   }
   
}
public class Areacircleclass {
   
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("enter a Radius: ");
        float radius = sc.nextFloat();
        float a = c.area(radius);
        System.out.println("Area of Circle is : " +a);
    }
}
