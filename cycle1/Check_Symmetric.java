import java.util.Scanner;
class Check_Symmetric{

public static void main(String args[])
{
System.out.println("20MCA041-Nisha Sabu");
Scanner n1=new Scanner(System.in);
int row,colum;
System.out.println("enter the number of rows:");
row=n1.nextInt();
System.out.println("enter the number of column:");
colum=n1.nextInt();

int matrix1[][] = new int[row][colum];
System.out.println("enter the elements:");
for(int i=0; i < row;i++)
{
for(int j=0;j < colum;j++)
{
matrix1[i][j]=n1.nextInt();
}
}
System.out.println(" matrix is :");
         
for (int i = 0; i < row; i++)
{
for (int j = 0; j < colum; j++)
{
System.out.print(matrix1[i][j]+"\t");
}
             
System.out.println();
}

if(row!=colum){
System.out.println("Matrix is not a Squre matrix");
}
else{
int matrix2[][] = new int[colum][row];
for(int i=0; i <colum; i++)
{
for(int j = 0;j <row; j++)
{
matrix2[i][j] = matrix1[j][i];
 }
 }
int flag =0;
first:
for(int i =0; i <colum; i++){
for(int j = 0; j <row;j++){
 if(matrix1[i][j] != matrix2[i][j]){
flag =1;
 break first;
}
}
}
if(flag == 1)
{
System.out.println("Matrix is not Symmetric");
}
else
{
System.out.println("Matrix is Symmetric"); 
}
}
}
}