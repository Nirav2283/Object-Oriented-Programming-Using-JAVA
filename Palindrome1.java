import java.util.Scanner;
public class Palindrome1{
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int m = n.nextInt();
        int c = 0;
        int store=m;
        int sum=0;
        
        while(m!=0){
            c = m % 10;
            sum = sum*10+c;
            m = m / 10;
        }
        System.out.print("Reverse number is: "+sum);
        System.out.println();
        if(sum > 0){
            if(sum==store){
                System.out.println("here,Reverse number = Given number");
                System.out.println("given number is palindrome");
             }
            else{
            System.out.println("given number is not palindrome");
        } 
    }else if(sum < 0){
        System.out.println("Number is negative hence it is not palindrome");
    }
    }
   
}