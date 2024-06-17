class Vehicle{
    String name;
   
    public Vehicle(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("name: "+name);
    }
}
class Car extends Vehicle{
    int price;
    public Car(String name , int price){
        super(name);
        this.price = price;
    }
    public void display(){
       
        System.out.println("price of "+name+" is"+": "+price);
    }
        
        
}
public class Lab_6_6{
    public static void main (String [] args){
        Car v1 = new Car("BMW" , 1000000);
        Car v2 = new Car("Audi" , 20000);
        v1.display();
        v2.display();
    }
}
