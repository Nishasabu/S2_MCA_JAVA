import java.util.Scanner;
class Complex
{
  float real1,imag1,real2,imag2;
 
 void get()
  { 
Scanner op=new Scanner(System.in);
     System.out.print("\n Enter the real part of first complex number: ");
     real1=op.nextFloat();
  System.out.print(" Enter the imaginary part of first complex number: ");
     imag1=op.nextFloat();
  System.out.print("\n Enter the real part of second complex number: ");
     real2=op.nextFloat();
  System.out.print(" Enter the imaginary part of second complex number :  ");
     imag2=op.nextFloat();
  }
void display()
  {   
      System.out.println(" \n Sum of complex numbers " + real1 + "+" + imag1 + "i and "  + real2 + "+" + imag2 + "i is " + (real1+real2) + "+" + (imag1+imag2) + "i");
  }
 
public static void main(String args[]) 
 {
  Complex cmp = new Complex();
   cmp.get();
   cmp.display();
 }
}