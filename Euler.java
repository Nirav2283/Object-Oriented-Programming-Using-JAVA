import java.util.Scanner;
public  static double evaluateEquation(String equation, double x, double y) {

    return x+y;
}
public class Euler {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Equation in the form of dy/dx: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the initial value of x given in question: ");
        double x0 = sc.nextDouble();
        System.out.print("Enter the initial value of y given in question: ");
        double y0 = sc.nextDouble();
        System.out.println("Enter the value of x which need to find for y: ");
        double xn = sc.nextDouble();
        System.out.println("enter the step-size : ");
        double h = sc.nextDouble();
        double m = (xn - x0) / h ; 
        System.out.println("Number of step is: "+m);

        for(int i = 0 ; i < m ; i++) {
            double value = evaluateEquation(s1, x0, y0);
            x0 = x0 + h;
            y0 = y0 + h * value;
            
        }
         


    }
}
