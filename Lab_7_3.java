interface Transport{
    void deliver();
}
abstract class Animal{

}
    
class Tiger extends Animal{
    public void deliver(){

    }
}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel is delievring");
    }
}
class Deer extends Animal{
    public void deliver(){
        
    }
}
class Donkey extends Animal implements Transport{
    public void deliver(){
         System.out.println("Donkey is delievring");
    }
}

public class Lab_7_3 {
    public static void main(String[]args){
        Animal [] arr = new Animal[4];
        arr[0] = new Tiger();
        arr[1] = new Camel();
        arr[2] = new Deer();
        arr[3] = new Donkey();

        for(int i = 0 ; i < arr.length ; i++){
        
        }
    }
}
