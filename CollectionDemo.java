
import java.util.*;
class Student{
    String name;
    int age;
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}
class AgeComparator implements Comparator<Student>{
    public int compare(Student o1 , Student o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.age==s2.age){
            return 0;
        }
        else if(s1.age > s2.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class CollectionDemo
    {
        public static void main(String [] args) {
            List<Student> a1 = new ArrayList<Student>();

            System.out.println("Age of the Students in ascending order is: ");
            System.out.println("==========================================");
            a1.add(new Student("Arjun" , 23));
            a1.add(new Student("Nirav" , 18));
            a1.add(new Student("Atmik" , 10));
            a1.add(new Student("bala" , 24));
            a1.add(new Student("Harsh" , 13));
            
            Collections.sort(a1 , new AgeComparator());
        

            Iterator<Student> itr = a1.iterator();
            while(itr.hasNext()){
                Student st = (Student)itr.next();
                System.out.println(st.name + " " + st.age);
                
            }
            System.out.println("==========================================");

        }
    }