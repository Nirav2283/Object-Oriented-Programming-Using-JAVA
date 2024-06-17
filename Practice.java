// // public class Practice{
// // 	public static void main(String [] args){
// // 		try{
// // 			int a , b;
// // 			b = 0;
// // 			a = 5 / b;
// // 			System.out.println("A");
// // 		}
// // 		catch(ArithmeticException e){
// // 			System.out.println("B");
// // 		}
// // 		finally{
// // 			System.out.println("C");
// // 		}

// // 	}
// // }

// import java.util.Scanner;

// public class Practice {
// 	public static void main(String [] args){
// 		Scanner sc = new Scanner(System.in);
// 		int balance = 5000;

// 		System.out.println("Enter amount: ");
// 		int w = sc.nextInt();
// 		try{
// 			if(balance - w < 0){
// 				throw new Exception("Balance should be greater than zero");
// 			}
	
// 			balance = balance -w ;
// 		}
// 		catch(Exception e){
// 			e.printStackTrace();
// 		}
// 		finally{
// 			System.out.println("Good bye");
// 		}
		
		
// }
// }
import java.util.ArrayList;
import java.io.File;
import java.util.ArrayList;

public class Practice
    {
        public static void main(String args[]) {
            List a1 = new ArrayList();
            a1.add("Arjun");
            a1.add("Nirav");
            a1.add("Darshan");
            a1.add("Dhruvil");
            a1.add("Harsh");
            System.out.println(a1);

        }

       
        
    }