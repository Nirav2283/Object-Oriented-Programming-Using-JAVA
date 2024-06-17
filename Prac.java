// public class Prac{
//     public static void main(String[]args){
//         System.out.println(args[0]+args[1]);
//         int a = Integer.parseInt(args[0]);
//         int b = Integer.parseInt(args[1]);
//         System.out.println(a+b);
//     }
// }

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


import java.io.File;
import java.util.*;
import java.io.*;

class NewThread extends Thread{
    public NewThread(){
        super("Demo thread");
        System.out.println("Child thread: "+this);
        start();
    }
    public void run(){
        try{
            for(int i =5 ; i < 10 ; i++){
                System.out.println("Child Thread: "+i);
                sleep(5000);
            }
        }
        catch(Exception e){
            System.out.println("Child Interuupted");
        }
        System.out.println("Exiting child Thread");
    }
}
public class Prac {
        public static void main(String [] args) {
           try{
            NewThread n1 = new NewThread();
            n1.start();
           }
           catch(IllegalThreadStateException e){
            e.printStackTrace();
           }
            
            
            

        }
    }