import java.util.Scanner;
class Person{
    String Name;
    String Gender;
    String Address;
    int age;
    Person(String nm,String gen,String adrs,int a){
        Name=nm;
        Gender=gen;
        Address=adrs;
        age=a;
        
    }
    
    public void displayPerson(){
        System.out.println("Name" + Name);
        System.out.println("Gender"+ Gender);
        System.out.println("Address"+ Address);
        System.out.println("Age" +age);
    }
}
class Employes extends Person{
    int empid;
    int salary;
    String company_name,qualification;
    
  Employes(String nm,String gen,String adrs,int a,int eid,String cname,String quali,int sal){
  super(nm,gen,adrs,a);
  empid=eid;
  company_name=cname;
  qualification=quali;
  salary=sal;
  }
  public void displayEmployee(){
      super.displayPerson();
      System.out.println("Empid"+ empid);
       System.out.println("company_name"+company_name);
        System.out.println("qualification"+qualification);
        System.out.println("salary"+salary);
        
  }  
}   
class Teachers extends Employes{
    String subject;
    String department;
    int teacherid;
    Teachers(String nm,String gen,String adrs,int a,int eid,String cname,String quali,int sal,String sub,String dept,int tid){
        super(nm,gen ,adrs,a,eid ,cname,quali,sal );
        subject=sub;
        department=dept;
        teacherid=tid;
    }

        public void displayTeacher( ){
             super.displayEmployee ( ) ;
              System.out.println("teacherid:"+teacherid);
            System.out.println("subject"+ subject);
            System.out.println("deprtment"+department);
                    
        }
        
    }
public class InheritencePersonExample{


  public static void main(String args[]){
    
    Scanner sc =new Scanner(System.in);

System.out.println("enter the number of teachers"); 
int N =sc.nextInt();
Teachers[] t1 =new Teachers[N];
for(int i=0;i<N;i++){
  System.out.println("enter the name of the teacher");
  String name1= sc.nextLine();
  System.out.println("enter the gender of the teacher");
  String gender1=sc.next();
   System.out.println("Enter the address of the teacher");
   String adr=sc.nextLine();
    System.out.println("enter the age of the teacher");
    int ag=sc.nextInt();
      System.out.println ("enter the empid of the teacher");
      int eid= sc.nextInt();
     System.out.println("enter the company name");
     String cn= sc.nextLine();
             System.out.println("enter the qualification of the teacher");
             String quali=sc.nextLine();
                     System.out.println("enter the salary of the taecher");
                      int sal=sc.nextInt();
                             System.out.println("enter the teacher id");
                             int tid= sc.nextInt();
                                     System.out.println("enter the subject of the taeacher ");
                                       String sub =sc.nextLine();
                                             System.out.println("enter the department of the teacher");
                                             String dept=sc.nextLine();
                                             
  Teachers t =new Teachers(name1, gender1, adr, ag, eid, cn, quali, sal, tid, sub, dept);
  teachers1[i]=t;
}
for(Teachers t:teachers1){
    t.displayTeacher();
  
}

  
  
}

        
}