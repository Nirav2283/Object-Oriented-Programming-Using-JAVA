class First extends Exception{
    public First(String s){
        super(s);
    }
}
class Second extends Exception{
    public Second(String s){
        super(s);
    }
}
class Third extends Exception{
    public Third(String s){
        super(s);
    }
}
class Four extends Exception{
    public Four(String s){
        super(s);
    }
}
public class Lab_8_2{
    public static void main(String [] args){
        try{
            int sum = 0 ;
            for(int i = 0 ; i < args.length ; i++){
                if(Integer.parseInt(args[i]) < 0){
                    throw new First("number is negative");
                }
            }
        }
        catch(First e){
            System.out.println(e.getMessage());
        }
        
    }
}