import java.io.*;
import java.util.Scanner;
public class Lab_10_1 {
    public static void main(String[]args){
        int linecount = 0;
        int charcount = 0;
        int count = 0 ;
        String line;
        try{
            File f = new File("abc.txt");
            
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String l = sc.nextLine();
                System.out.println(l);
                linecount++;
                charcount += l.length();
                
            }
            
            
            System.out.println("number of line is : "+linecount);
            System.out.println("Number of charcter: "+charcount);
            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
       
    }
    
    
   
}
