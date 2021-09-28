import java.util.Scanner ;
class Employee{
    int empid;
    String name;
    float salary;
    String address;
    Employee(int eid,String nm,float sal,String adrs)
    {
        empid=eid;
        name=nm;
        salary=sal;
        address=adrs;
    }
    
}
class Teacher extends Employee{
String department;
String subject;
Teacher(int empid,String name,float salary,String address,String dept,String sub){
super(empid,name,salary,address);

department=dept;
subject=sub;

}
public void display()
{
  System.out.println("Teacher's id: "   +empid);
  System.out.println("Teacher's name: "   +name);
  System.out.println("Teacher's salary: "   +salary);
  System.out.println("Teacher's address: "   +address);
  System.out.println("Teacher's department: "  +department);
  System.out.println("Teacher's department: "  +subject);
}
}
public class TeacherArrObjects{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

     System.out.println("Enter the number of teachers:");
     
       int n = sc.nextInt();
    System.out.println("Enter the teachers details one by one:"); 
    Teacher teacher[]= new Teacher[n];
    
    for(int i=0;i<+n;i++)
    {
        System.out.println("Enter teacher id");
        int tid =sc .nextInt();
        System.out.println("Enter teacher name");
        String name= sc.next();
        System.out.println("Enter teacher salary");
       float  salary= sc.nextFloat();
        System.out.println("Enter teacher address");
        String address= sc.next();
        System.out.println("Enter teacher department");
        String department =sc.next();
        System.out.println("Enter teacher subject");
        String subject= sc.next();
        Teacher t = new Teacher(tid,name,salary,address,department,subject);
                teacher[i]=t;
    }
    System.out.println("Teachers are");
    for(Teacher x :teacher){
        x.display();
        System.out.println("\n");
        
        
    }
    
    
    }
}
