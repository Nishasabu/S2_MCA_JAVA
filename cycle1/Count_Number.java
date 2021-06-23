import java.util.Scanner;
class Count_Number
{
public static void main(String args[])

{
int num,count=0,x,i;
Scanner word=new Scanner(System.in);
System.out.println("enter the no of element do you want print:");
num=word.nextInt();
int array[]=new int[num];
System.out.println("enter all the numbers:");
for(i=0;i<num;i++)
{
array[i]=word.nextInt();
}
System.out.println("Enter the element of which you want to count number of occurrences:");
x=word.nextInt();
for(i=0;i<num;i++)
{
if(array[i]==x)
{
count=count+1;
}
}
System.out.println("enter number occur in times"+count);
}
}