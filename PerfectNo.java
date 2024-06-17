import java.util.*;
public class PerfectNo {
    public static void main(String [] args){
        int sum = 0 ; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = sc.nextInt();
        for(int i = 1  ; i < number ; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            System.out.println(number+" is a perfect number");
        }else{
            System.out.println(number+" is not a perfect number");
        }
    }
}
