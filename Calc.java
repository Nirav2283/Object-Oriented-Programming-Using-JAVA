import java.util.Scanner;

public class Calc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        double a = sc.nextDouble();
        System.out.println("Enter a 2nd number: ");
        double b = sc.nextDouble();
        System.out.println("Enter a operator(+,-,/,*)): ");
        String i = sc.next();
        if(i.equals("+")){
            System.out.println("sum of two number is: "+(a+b));
        }
        if(i.equals("-")){
            System.out.println("subtraction of two number is: "+(a-b));
        }
          if(i.equals("*")){
            System.out.println("multiplication of two number is: "+(a*b));     
    }
      if(i.equals("/")){
            System.out.println("divison of two number is: "+(a/b));
}
    }
}
