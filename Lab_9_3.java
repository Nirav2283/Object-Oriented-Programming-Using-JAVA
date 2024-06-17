import java.util.*;

class RowSum implements Runnable {
    int[] rows;
    int sum = 0;

    public RowSum(int[] rows) {
        this.rows = rows;

    }
    public void run() {
            try{
                for (int i = 0; i < rows.length; i++) {
                    sum = sum + rows[i];
        
                }
        
            }
            catch(Exception e){
                e.printStackTrace();
            }
    }
    public int printSum() {
        return sum;
    }
}

public class Lab_9_3 {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter numebr of col: ");
        int n = sc.nextInt();

        int [][] mat = new int[m][n] ;
        System.out.println("Enter the elemnets of the matrix : ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        Thread[] t = new Thread[m];
        RowSum[] thread = new RowSum[m];


        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                thread[i] = new RowSum(mat[i]);
                t[i] = new Thread(thread[i]);
                t[i].start();
            }
        }
        System.out.println("sum of each row: ");
        for(int i = 0 ; i < m ; i++){           
                System.out.println("Row "+(i+1)+"sum :"+ thread[i].printSum());     
            }
        }

      
    }