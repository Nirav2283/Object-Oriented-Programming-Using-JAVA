import java.util.Scanner;
public class Maxno{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int a = sc.nextInt();

        System.out.print("enter number 2: ");
        int b = sc.nextInt();

        System.out.print("enter number 3: ");
        int c = sc.nextInt();

        if(a > b){
            if(a>c){
                System.out.print("a is greater");
            }else{
                System.out.print("c is greater");
            }
        }
         else if(b>c){
            System.out.print("b is greater");
        }if(a == b || b == c || a == c){
            System.out.println("all number are equal");
           }
        else{
            System.out.print("c is greater");
        }
    }  
}