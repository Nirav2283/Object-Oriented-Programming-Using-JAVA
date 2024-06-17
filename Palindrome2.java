import java.util.*;
public class Palindrome2{
    public static void main(String []args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String r = n.next();
        String s = "";
        for(int i=r.length()-1 ;i>=0; i--){
           char c = r.charAt(i);
            s=s+c;
        }
        if(s.equals(r)){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not palindrome");
        }
        
    }
}