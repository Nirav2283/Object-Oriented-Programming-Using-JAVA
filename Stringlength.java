import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        System.out.println("Length of string is: " + n);
        System.out.print("Second half of the string is : ");
        for(int i=(n/2) ; i < n ; i++){
         System.out.print(s.charAt(i));
        }
    }

}