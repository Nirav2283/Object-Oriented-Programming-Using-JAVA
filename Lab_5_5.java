import java.util.Scanner;
public class Lab_5_5 {
    public static class ComplexNumber{
        float real;
        float imaginary;
        public ComplexNumber(){
            real=0 ; 
            imaginary = 0;
        }
        public ComplexNumber(float real , float imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }
        public ComplexNumber add(ComplexNumber i2){
            ComplexNumber c = new ComplexNumber();
            c.real = this.real + i2.real;
            c.imaginary = this.imaginary + i2.imaginary;
            return c;
        }
        
       
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ComplexNumber i1 = new ComplexNumber();
        ComplexNumber i3 = new ComplexNumber();
        float real1 , imag1 ;
        System.out.println("Enter real part of 1st number : ");
        i1.real  = sc.nextFloat();
        System.out.println("Enter Imaginary part of 1st number: ");
        i1.imaginary = sc.nextFloat();
        System.out.println("Enter real part of 2nd number: " );
        real1 = sc.nextFloat();
        System.out.println("Enter imaginary part of 3rd number: ");
        imag1 = sc.nextFloat();
        ComplexNumber i2 = new ComplexNumber(real1,imag1);
        i3=i1.add(i2);
        System.out.println("Sum of "+i1.real+" + "+i1.imaginary+"i"+" and "+i2.real+" + "+i2.imaginary+"i = "+i3.real+" + "+i3.imaginary+"i");

    }
}
