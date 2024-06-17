import java.util.Scanner;
public class Average{
    public static void main(String []args){
        Double [] a = new Double[4]; 
        Scanner sc = new Scanner (System.in);
        float avg = 0;
        int sum = 0;
        for (int i = 0 ; i < a.length ; i++){
            System.out.println("Enter element in array a["+ i +"]");
            a[i] = sc.nextDouble();
            sum += a[i];


        }
        avg = sum / (float) 4 ;
        System.out.println("sum of the number is: "+sum);
        System.out.println("average is : "+avg);

        
    }
}

