class Member{
    String name;
    int age;
    int phone_no;
    String address;
    int salary;
    public Member(String name , int age , int phone_no , String address , int salary){
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.salary = salary;
    }
    public void printsalary(){
       System.out.println("name: "+name);
       System.out.println("age: "+age);
       System.out.println("phone number: "+phone_no);
       System.out.println("address: "+address);
       System.out.println("salary: "+salary);
       System.out.println("");
    }
}
class Employee extends Member{
    String speciliazaiton;
    public Employee(String name , int age , int phone_no , String address , int salary , String specialiazation){
        
        super(name , age , phone_no , address ,salary);
        System.out.println("specialization: "+specialiazation);
        this.speciliazaiton = specialiazation;
        
    }
}
class Manager extends Member{
    String Department;
    public Manager(String name , int age , int phone_no , String address , int salary , String Department){
        super(name , age , phone_no , address ,salary);
        this.Department = Department;
        System.out.println("department: "+Department);

    }
}
public class Lab_6_3 {
    public static void main(String [] args){
        Employee e1 = new Employee("Deepdo" , 19 , 293849392 , "rajkot" , 10000 , "cse");
        System.out.println("employee");
        e1.printsalary();
        Manager m1 = new Manager("xyz" , 18, 3473847, "morbi", 1000 , "AI");
        System.out.println("manager");
        m1.printsalary();
        

    }
}
