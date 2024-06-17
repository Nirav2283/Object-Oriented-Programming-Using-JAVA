public class Commandline {
    public static void main(String a[]){
        try{
            double  i= Double.parseDouble(a[0]);
            double b = Double.parseDouble(a[1]);
            System.out.println("sum is : "+(i+b));
        }catch(Exception e){
            System.out.println("Enter a input");
        }
        
    }
}
