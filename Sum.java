import java.io.*;
class Sum
{
public static void main(String args[]) throws Exception
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter first number");
String a = br.readLine();
System.out.println("enter second number");
String b = br.readLine();
int n1 =Integer.parseInt(a);
int n2=Integer.parseInt(b);
System.out.println("sum is:"+(n1+n2));
}
}


	