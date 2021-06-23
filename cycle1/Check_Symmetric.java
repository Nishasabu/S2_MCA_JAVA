
import java.util.Scanner;
class Check_Symmetric{

public static void main(String args[])
{
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

if(row==colum)
{

for (int i = 0; i < row; i++)
 {
for (int j = 0; j < colum; j++)
{
 matrix1[j][i] = matrix1[i][j];
                 
}     
}
}        
int x=0;
 for(int i=0;i<row;i++) 
   for(int j=0;j<colum;j++) 
     if(matrix1[i][j]==matrix1[j][i])
       x=1;
if(x==1)
  System.out.println("the matrix is symmetric");
else
  System.out.println("the matrix is not symmetric");
  
     }
  
}
 