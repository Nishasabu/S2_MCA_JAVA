import java.util.Scanner;
 
public class Employee {
 
 int empid;
 String name;
 float salary;
int item;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empno :");
  empid = in.nextInt();
  System.out.print("Enter the name :: ");
  name = in.next();
  System.out.print("Enter the salary :: ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee no = " + empno);
  System.out.println("Employee name = " + name);
  System.out.println("Employee salary = " + salary);
 }
 
 public static void main(String[] args) {
 
  Employee e[] = new Employee[5];
  
  for(int i=0; i<5; i++) {
   
   e[i] = new Employee();
   e[i].getInput();
  }
  
  System.out.println("details of employeees");
  
  for(int i=0; i<5; i++) {
   
   e[i].display();
  }

System.out.println("Enter the search value:");
      item = input.nextInt();
for(int i=0; i<5; i++) {
   
   if(e[i]==item);

 }
}