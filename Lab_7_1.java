abstract class Vegetables{
    String color;
    String name;
    Vegetables(String name , String color){
        this.name = name;
        this.color = color;
    }   
    
}
class Potato extends Vegetables{
    Potato(String a , String b){
        super(a,b);
    }
    public void display(){
        System.out.println("name: " + name + " "+"color: "+color);
    }
}
class Tomato extends Vegetables{
    Tomato(String a , String b){
        super(a , b);
    }
    public void display(){
        System.out.println("name: " + name + " "+"color: "+color);
    }
}
class Brinjal extends Vegetables{
    Brinjal(String a , String b){
        super(a , b);
    }
    public void display(){
        System.out.println("name: " + name + " "+"color: "+color);
    }
}

public class Lab_7_1 {
    public static void main(String [] args){
        Potato p1 = new Potato("Potato" , "yellow");
        Tomato t1 = new Tomato("Tomato" , "red");
        Brinjal b1 = new Brinjal("Brinjle" , "dark purple");
        p1.display();
        t1.display();
        b1.display();
    }
}
