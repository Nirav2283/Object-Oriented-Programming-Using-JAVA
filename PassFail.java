import java.util.Scanner;
public class PassFail{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a total mark per subject: ");
        float totalmark = sc.nextFloat();
       
        System.out.println("Enter Mark of subject 1: ");
        float m1 = sc.nextFloat();

        System.out.println("Enter Mark of subject 2: ");
        float m2 = sc.nextFloat();

        System.out.println("Enter Mark of subject 3: ");
        float m3 = sc.nextFloat();

        System.out.println("Enter Mark of subject 4: ");
        float m4 = sc.nextFloat();

        System.out.println("Enter Mark of subject 5: ");
        float m5 = sc.nextFloat();

        float a = (( m1 + m2 + m3 + m4 + m5 )*100)/(totalmark * 5);
        System.out.println("percentage is: "+a);

        if(a >= 60){
            System.out.println("FIRST DIVISON");
        }

        if(a >= 50 && a <= 59){
            System.out.println("SECOND DIVISON");
        }

        if(a >=40 && a <= 49){
            System.out.println("THIRD DIVISON");
        }

        if(a < 40){
            System.out.println("FAIL");
        }

    }
}