import java.util.Scanner;
public class Prime{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a number: ");
        int a = sc.nextInt();
        int count = 0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
              count++;
            }
        }
        if(count == 0){
            System.out.print("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
        
    }
}

