// // // // // // // class Rect{
// // // // // // //     int len;
// // // // // // //     int width;
// // // // // // //     public Rect(int len , int width){
// // // // // // //         this.len = len;
// // // // // // //         this.width = width;
// // // // // // // }
// // // // // // // void area(){
// // // // // // //     int area = len * width;
// // // // // // //     System.out.println("Area is: "+area); 
// // // // // // // }
// // // // // // // }
// // // // // // // public class Examprac{
// // // // // // //     public static void main(String[]args){
// // // // // // //         Rect r1 = new Rect(6,6);
// // // // // // //         r1.area();
// // // // // // //     }
// // // // // // // }
// // // // // // public class Examprac{
// // // // // //     public static void main(String[]args){
// // // // // //         String word1 = "Arjun";
// // // // // //         String word2 = "bala";
// // // // // //         System.out.println(word1.concat(word2));
// // // // // //         System.out.println(word1.indexOf(word2));
       
// // // // // //     }
// // // // // // }
// // // // // import java.util.Scanner;

// // // // //     import java.util.*;

// // // // // class Student {
// // // // //     int id_no;
// // // // //     int no_of_subjects_registered;
// // // // //     int[] subject_code;
// // // // //     int[] subject_credits;
// // // // //     char[] grade_obtained;

// // // // //     public Student() {
// // // // //         Scanner sc = new Scanner(System.in);

// // // // //         System.out.print("Enter id_no of student =");
// // // // //         id_no = sc.nextInt();
// // // // //         System.out.print("Enter no of registered subjects =");
// // // // //         no_of_subjects_registered = sc.nextInt();

// // // // //         subject_code = new int[no_of_subjects_registered];
// // // // //         subject_credits = new int[no_of_subjects_registered];
// // // // //         grade_obtained = new char[no_of_subjects_registered];

// // // // //         for (int i = 0; i < no_of_subjects_registered; i++) {
// // // // //             System.out.print("Enter subject code " + (i + 1) + " :");
// // // // //             subject_code[i] = sc.nextInt();
// // // // //             System.out.print("Enter subject credits of subject " + (i + 1) + " :");
// // // // //             subject_credits[i] = sc.nextInt();
// // // // //             System.out.println("Enter obtained grade of subject " + (i + 1) + " :");
// // // // //             grade_obtained[i] = sc.next().charAt(0);
// // // // //         }
// // // // //     }

// // // // //     public void displayInformation() {
// // // // //         System.out.println("STUDENT ID NO = " + id_no);
// // // // //         System.out.println("REGISTERED SUBJECT = " + no_of_subjects_registered);
// // // // //         System.out.println("SUBJECT CODE = " + subject_code);
// // // // //         System.out.println("SUBJECTS CREDITS = " + subject_credits);
// // // // //         System.out.println("GRADE OBTAINED IN SUBJECT = " + grade_obtained);
// // // // //     }

// // // // //     public double  calculate_spi() {
// // // // //         System.out.println("Your SPI =");
// // // // //         return 0.0;
// // // // //     }
// // // // // }

// // // // // public class New{

// // // // //     public static void main(String[] args) {
// // // // //         Scanner sc = new Scanner(System.in);

// // // // //         System.out.print("Enter No Of Students = ");
// // // // //         int n = sc.nextInt();

// // // // //         Student[] students = new Student[n];
       
// // // // //         for(int i = 0;i<n;i++){
// // // // //             students[i] = new Student();
// // // // //             students[i].displayInformation();
// // // // //             System.out.print(students[i].calculate_spi());
// // // // //         }
// // // // //     }
// // // // // }
// // // // class Smartphone{
// // // //     public void Android(){
// // // //         System.out.println("go to on clock and set alaram");
// // // //     }
// // // // }
// // // // class Iphone extends Smartphone{
// // // //     public void setalaram(){
// // // //         System.out.println("open siri and set alaram");
// // // //     }
// // // // }
// // // // public class Examprac{
// // // //     public static void main(String []args){
// // // //         Smartphone a1 = new Smartphone();
// // // //         System.out.println("--Android--");
// // // //         a1.Android();

// // // //         Iphone i1 = new Iphone();
// // // //         System.out.println("--Iphone--");
// // // //         i1.setalaram();
// // // //     }
// // // // }
// // // class Car{
// // //     public void turnright(){
// // //         System.out.println("Turn right");
// // //     }
// // //     public void turnleft(){
// // //         System.out.println("turn left");
// // //     }
// // // }
// // // public class Examprac{
// // //     public static void main(String []args){
// // //         Car c1 = new Car();
// // //         c1.turnleft();
// // //     }
// // // }
// // class MyException extends Exception{
// //     public MyException(String s){
// //         super(s);
// //     }
// // }
// // public class Examprac{
// //     static int bal = 5000;
// //         public static void main(String []args){
// //             try{
// //                 int amount = Integer.parseInt(args[0]);
// //                 withdraw(amount);
// //             }
// //             catch(Exception e){
// //                 System.out.println("caught");
// //                 System.out.println(e.getMessage());
// //             }
// //         }
// //         public static void withdraw(int amount) throws Exception{
// //             int newbal = bal - amount;
// //             System.out.println("new balance: "+newbal);
// //             if (newbal < 1000){
// //                 throw new MyException("Darshan Exception");
// //             }
// //         }
// //     }

// import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.Reader;

// public class Examprac{
//     public static void main(String [] args) throws IOException{
//        FileReader fr = new FileReader("abc.txt");
//        BufferedReader b = new BufferedReader(fr);
//        char c [] = new char[20];
    
//        if(b.ready()){
//         System.out.println(b.readLine());
//         b.read(c);
//         for(int i = 0 ; i < 1 ; i++) {
//             System.out.println(c[i]);
//         }
//        }
        
//     }
// }

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;


public class Examprac{
    public static void main(String[] args){
        HashMap<BigInteger , String> a1 = new HashMap<>();
        a1.put(286, "Nirav");
        a1.put(77 , "Rashi");
        a1.put(285, "DEEP");

        
        System.out.println("Enter Enrollment no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        if(a1.containsKey(n)){
            String a = a1.get(n);
            System.out.println(a);
        }

       
      
       
       
}
}