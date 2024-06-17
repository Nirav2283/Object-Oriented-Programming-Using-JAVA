import java.util.Scanner;
public class Diamond{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= (2 * n - 1 ) ; i++ ){
            if(i <= n){
                for( int j = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = (2*n-i) ; j>=1 ; j--){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}