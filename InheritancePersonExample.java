
import java.util.Scanner;
class Person
{
    String name,gender,address;
    protected int age;
    public Person(){}
    public Person(String n, String g, String addr, int a){
        this.name=n;
        this.gender=g;
        this.address=addr;
        this.age=a;
    }
    public void displayPerson()
    {
        System.out.println("Name: " +name);
        System.out.println("gender: " +gender);
        System.out.println("address: " +address);
        System.out.println("age: " +age);
        
    }
}
class Employees extends Person
{
    int empid,salary;
    String companyname,qualification;
    public  Employees(){}
    public Employees(String n, String g, String addr, int a, int eid, String cname,String quali,int sal)
    {
        super(n,g,addr,a);
        empid=eid;
        companyname=cname;
        qualification=quali;
        salary=sal;   
    }
    public void displayEmployees()
    {
        super.displayPerson();
        System.out.println("empid: "+empid);
        System.out.println("companyname: "+companyname);
        System.out.println("qualification: "+qualification);
        System.out.println("Salary: "+salary);    
    }
}
class Teacher1 extends Employees
    {
        String subject,department;
        int teacherid;
        public Teacher1(String n, String g, String addr , int a ,int eid , String cname , String quali , int sal ,String sub , String dept , int tid )
        {
            super(n,g,addr,a,eid,cname,quali,sal);
            subject=sub;
            department=dept;
            teacherid=tid;
        }
        public void displayTeacher()
        {
            super.displayEmployees();
            System.out.println("teacher id : "+teacherid);
            System.out.println("subject: "+subject);
            System.out.println("department: "+department);
        }
    }
    class InheritancePersonExample
    {
        public static void main(String args [])
        {
            System.out.println("enter no.of teachers: ");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            Teacher1[] teacher1s= new Teacher1[n];
            Scanner scs=new Scanner(System.in);
            for(int i=0;i<n;i++)
            {
                System.out.println("enter name.of teacher: ");
                String name=scs.nextLine();
                System.out.println("enter gender of teacher: ");
                String gen=scs.next();
                System.out.println("enter address of teacher: ");
                String addr=scs.next();
                System.out.println("enter age of teacher: ");
                int ag=sc.nextInt();
                System.out.println("enter employee id of teacher: ");
                int eid=sc.nextInt();
                System.out.println("enter company name: ");
                String cn=scs.next();
                System.out.println("enter qualification of teacher: ");
                String quali=scs.next();
                System.out.println("enter salary of teacher: ");
                int sal=sc.nextInt();
                System.out.println("enter teacher id : ");
                int tid=sc.nextInt();
                System.out.println("enter subject of teacher: ");
                String sub=scs.next();
                System.out.println("enter department of teacher: ");
                String dept=scs.next();
                Teacher1 t = new Teacher1(name, gen, addr, ag, eid, cn, quali, sal, sub, dept, tid);
                teacher1s[i]=t;   
            }
            for(Teacher1 t: teacher1s){
                t.displayTeacher();
            }
        }
    }
