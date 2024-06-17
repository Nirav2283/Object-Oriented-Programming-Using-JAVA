import java.util.Scanner;
public class Vowel{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        
        int vowel = 0;
        int cons = 0;
        for(int i = 0 ; i < a.length() ; i++){
            char c = a.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }
            else{
                cons++;
            }


        }
        System.out.println("Vowel is: "+vowel);
        System.out.println("consonant is : "+cons);

    }
}