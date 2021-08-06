import java.util.Scanner;
public class Sorting_Strings
{
public static void main(String[] args)
{
int count;
String temp;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Number Of Elements In The String:");
count = scan.nextInt();
String str[] = new String[count];
Scanner scan2 = new Scanner(System.in);
System.out.println("Enter The String Elements One By One:");
for(int i = 0; i < count; i++)
{
str[i] = scan2.nextLine();
}
scan.close();
scan2.close();
for (int i = 0; i < count; i++)
{
for (int j = i + 1; j < count; j++) {
if (str[i].compareTo(str[j])>0)
{
temp = str[i];
str[i] = str[j];
str[j] = temp;
}}}
System.out.print("Strings in Sorted Order:");
for (int i = 0; i <= count - 1; i++)
{
System.out.print(str[i] + ", ");
}}}