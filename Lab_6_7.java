//using final keyword we can use variable and method only one time and we cant extend class.
final class Vehicle{
    final String name = "BMW";
    
    final public void display(){
        System.out.println("name: "+name);
    }
}
public class Lab_6_7 {
    public static void main(String [] args){
        Vehicle v1 = new Vehicle();
        v1.display();
    }
}
