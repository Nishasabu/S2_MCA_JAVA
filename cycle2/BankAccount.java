import java.util.*;
class Bank
{
int acno;
String name,type;
float amount;
void details(int n,String nm,String t,float a)
{
acno=n;
name=nm;
type=t;
amount=a;
}
void show()
{
System.out.println("Account number:"+acno);
System.out.println("Customer Name:"+name);
System.out.println("Account Type:"+type);
System.out.println("Balance Amount:" +amount);
}
void deposit(float a)
{
amount= amount+a;
System.out.println("deposit amount:"+amount);
}
void withdraw(float a)
{
if(amount<a)
System.out.println("insufficentt balance");
else
amount= amount-a;
System.out.println("withdraw amount is:"+a);
}
void checkbalance()
{
System.out.println("Balance is:"+amount);
}}
class BankAccount
{
public static void main(String args[])
{
Bank b =new Bank();
b.details(123456,"Nisha Sabu","Savings",5000);
b.show();
b.deposit(70000);
b.checkbalance();
b.withdraw(5000);
b.checkbalance();
}}