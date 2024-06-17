import java.util.Scanner;
public class Fahrenheit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit: ");
        double a = sc.nextDouble();
        System.out.println("celsius form: "+(a-32)*(5/9.0));
    }
}