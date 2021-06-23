import java.util.Scanner;

class Student_Subject
{
public static void main(String args[])
{
     float sub1,sub2,sub3,sub4,sub5; 
     double total, percentage;
    Scanner op=new Scanner(System.in);
    
    System.out.println("Enter marks of subject out of 100");
    System.out.print("Enter marks of subject1:");
    sub1=op.nextFloat();
    System.out.print("Enter marks of subject2:");
    sub2=op.nextFloat();
    System.out.print("Enter marks of subject3:");
    sub3=op.nextFloat();
    System.out.print("Enter marks of subject4:");
    sub4=op.nextFloat();
    System.out.print("Enter marks of subject5:");
    sub5=op.nextFloat();

   
    total = sub1+sub2+sub3+sub4+sub5;
    percentage = (total / 500) * 100;

  
    System.out.println("Total marks ="+total);
    System.out.println("Percentage = "+percentage);

   }
}