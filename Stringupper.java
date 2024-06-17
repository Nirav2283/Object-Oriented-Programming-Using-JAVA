
public class Stringupper{
    public static void main(String[]args){
      
      for(int i = 0 ; i<args.length ; i++){
        if(args[i].charAt(0)>='A' && args[i].charAt(0)<='Z'){
            System.out.println(args[i]);
            System.out.println("no error");
        }
        else{
            System.out.println("Error");
            break;
        }
        
      }
    


    }
}