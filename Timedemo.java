import java.util.Scanner;
class Time{
    int hour;
    int min;
Time(){
    this.hour=hour;
    this.min=min;
}
Time(int hour , int min){
    this.hour = hour;
    this.min = min;
}
void add(Time t){
    int h = this.hour + t.hour;
    int m = this.min + t.min;
    if(m>59){
       h++;
       m = m % 60;
    }
   
    System.out.println("hour: "  +h);
    System.out.println("minute: " +m);


}
}

public class Timedemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hour and minutes : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        Time t1 = new Time();
        Time t2 = new Time(hour  , min);
        t1.add(t2);
    }
}
