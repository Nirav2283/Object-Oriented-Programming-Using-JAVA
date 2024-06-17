import java.util.Scanner;
public class ArrayReverse{
    public static void main(String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter Size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
            
        for(int i = 0 ; i < a.length ; i++){
            System.out.println("Enter element in array a["+ i +"]: ");
            a[i] = sc.nextInt();
        } 
        System.out.println("revrse order of array is : ");
        for(int j = n-1 ; j >= 0 ; j--){
            System.out.println(a[j]);
        }
    }

}