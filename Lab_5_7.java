class A{
    int rollno;
    int id;
    static double marks;

    public A(int rollno , int id , double marks){
        this.rollno = rollno;
        this.id = id;
        this.marks = marks;
    }
    static void print(){
        marks=3.2;
        
    }
    static void display(){
        System.out.println("marks: ");
    }
}
public class Lab_5_7 {
    public static void main(String [] args){
       A a1 = new A(30 , 10 , 3.2);
       a1.display();

    }
}
