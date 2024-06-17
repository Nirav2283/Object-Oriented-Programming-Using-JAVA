class Odd implements Runnable{
    public void run(){
            while(true){
            for(int i = 1 ; i <= 20 ; i++){
                if(i % 2 != 0){
                    System.out.println("Odd: "+i);
                }
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();

                }

            }

        }
    }
}

class Even implements Runnable{
    public void run(){
            while(true){
            for(int i = 1 ; i <= 20 ; i++){
                if(i % 2 == 0){
                    System.out.println("Even: "+i);
                }
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException abc){
                    abc.printStackTrace();
                }
            }
        }
    }
}

public class Lab_9_2{
    public static void main(String[]args){
        Thread oddnumber = new Thread(new Odd());
        Thread evennumber = new Thread(new Even());

        oddnumber.start();
        evennumber.start();
    }
}