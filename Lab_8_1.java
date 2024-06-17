public class Lab_8_1 {
    public static void main(String[]args){
        int a = 0;
        int b = 0;
        try{
            a= Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.println("multiplication of the number is: "+(a * b));
        }
        catch(NumberFormatException e){
           System.out.println("Please enter an integer");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("please enter valid input");
        }
        

    }
}
