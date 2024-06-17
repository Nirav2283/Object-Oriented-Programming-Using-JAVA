import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    int [] subject_code;
    int [] subject_credits;
    char [] grade_obtained;
    int [] grade_point;
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id no : ");
        id_no = sc.nextInt();
        System.out.println("Enter no of subject registered: ");
        no_of_subjects_registered = sc.nextInt();

        subject_code = new int[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new char[no_of_subjects_registered];

        for(int i = 0 ; i < no_of_subjects_registered ; i++){
            System.out.println("Enter Subject code of subject " + (i + 1) + ":");
            subject_code[i] = sc.nextInt();
            System.out.println("Enter a subject credits of subject " +(i + 1) + ":" ); 
            subject_credits[i] = sc.nextInt();
            System.out.println("Enter a grade obtained of subject "+(i + 1) + ":");
            grade_obtained[i] = sc.next().charAt(0);
 
        }
    }
    public void displayInformation(){
    
        System.out.println("Student id no: "+id_no);
        System.out.println("Registered Subjects: "+no_of_subjects_registered);
        for(int i =0 ; i < no_of_subjects_registered ; i++ ){
            System.out.println("Enter subject code: "+subject_code[i]);
            System.out.println("Enter Subject Credits: "+subject_credits[i]);
            System.out.println("Grade obtained in subject: "+grade_obtained[i]);
        }
    }
    public void calculate_spi() {
       //code of spi
    
        
    }

}
public class Lab_6_1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students: ");
        int n = sc.nextInt();

        Student [] s1 = new Student[n];
        for(int i = 0 ; i < n ; i++){
            s1[i] = new Student();
            s1[i].displayInformation();
            s1[i].calculate_spi();
        }

    }
}