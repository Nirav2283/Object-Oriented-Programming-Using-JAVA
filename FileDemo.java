// import java.io.*;
// public class FileDemo {
//     public static void main(String [] args){
//         File f1 = new File("LAB10");
//         String [] l = f1.list();
//         for(int i = 0 ; i < l.length; i++){
//             File temp = new File("f1" , l[i]);
//             System.out.println(l[i].length());
//             System.out.println(l[i]);
//         }
//        System.out.println(f1.getAbsolutePath());
//     }
// }

import java.io.*;
public class FileDemo{
    public static void main(String [] args){
        try{
            FileInputStream f = new FileInputStream("swayam.jpg");
            FileOutputStream fos = new FileOutputstream("swayamnew.jpg");
            int a = f.read();

            while(a ! =1){
                fos.write(a);
                a = f.read;
            }
            String str = "Kale mass bunk che"
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            fos.close();
        }
       
    }
}
