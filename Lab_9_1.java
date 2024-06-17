class Morning implements Runnable {
    public void run() {
        while (true){
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Afternoon implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Lab_9_1 {
    public static void main(String[] args) {
        Morning m = new Morning();
        Thread morningThread = new Thread(m);
        Thread afternoonThread = new Thread(new Afternoon());
        morningThread.start();
        afternoonThread.start();
    }
}
