interface A{
    final int a = 10;
    void display();
}
interface A1 extends A{
    final int a1 = 20;
    void display();
}
interface A2 extends A{
    final int a2 = 30;
    void display();
}
interface A12 extends A1,A2{
    final int a3 = 40;
    void display();
}
class B implements A12{
    public void display(){
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
public class Lab_7_2 {
    public static void main(String[]args){
        B b1 = new B();
        b1.display();

    }
}
