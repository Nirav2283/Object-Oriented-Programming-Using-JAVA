import java.util.Scanner;
class Count2
	{ 
		static int count;
		public Count2(){
		count++;
	}
	}
public class Lab_5_6
{
	public static void main(String[] args){
		Count2 b1=new Count2();
		Count2 b3 = new Count2();
		Count2 b2 = new Count2();
		Count2 b4 = new Count2();
		System.out.println("count of object is : "+Count2.count);
		
	}}
