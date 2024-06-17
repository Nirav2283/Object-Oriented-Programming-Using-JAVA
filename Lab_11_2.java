import java.io.*;
import java.util.*;
public class Lab_11_2 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File f  = new File(filename);
        if(f.exists()){
            if(f.isFile()){
                System.out.println("File size: "+f.length()+"KB");
            }
            else{
                System.out.println("Folder: ");
                String [] filenames = f.list();
                for(int i = 0 ; i < filenames.length ; i++){
                    System.out.println(filenames[i]);
                }
            }
        }
        else{
            System.out.println("File does not exist");
        }
    }
}

