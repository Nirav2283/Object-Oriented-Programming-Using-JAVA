import java.util.Scanner;
public class Area{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a radius: ");
        float a = sc.nextFloat();
        System.out.println("Area of circle is: "+(3.14*a*a));
        
    }
}