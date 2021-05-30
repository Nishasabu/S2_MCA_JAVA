import java.util.Scanner;
class Matrix_Addition
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int p,q,r,s;
System.out.println("enter the no of row in 1st matrix:");
p=x.nextInt();
System.out.println("enter the no of column in 1st matrix:");
q=x.nextInt();

System.out.println("enter the no of row in 2nd matrix:");
r=x.nextInt();
System.out.println("enter the no of column in 2nd matrix:");
s=x.nextInt();

int array1[][]=new int[p][q];
int array2[][]=new int[r][s];
int array3[][]=new int[r][s];
if(p==r&&q==s)
{
System.out.println("enter the elements of 1st matrix:");
for(int i=0;i<p;i++)
{
 for(int j=0;j<q;j++)
 {
 array1[i][j]=x.nextInt();
 }
}
System.out.println("enter the elements of 2nd  matrix:");
for(int k=0;k<r;k++)
{
 for(int l=0;l<s;l++)
 {
 array2[k][l]=x.nextInt();
 }
}
 System.out.println("First Matrix:");

            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(array1[i][j]+" ");
                }
                System.out.println("");
            }

 System.out.println("Second Matrix:");

            for (int i = 0; i< r; i++) 
            {
                for (int j= 0; j<s; j++) 
                {
                    System.out.print(array2[i][j]+" ");
                }
                System.out.println("");
            }

  for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < s; j++) 
                {
                    for (int k = 0; k < q; k++) 
                    {
                        array3[i][j] = array1[i][j] + array2[i][j];
                    }
                }
            }

 System.out.println(" Matrix after addition::");
for (int i= 0; i< p; i++) 
            {
                for (int j= 0; j<s; j++) 
                {
                    System.out.print(array3[i][j]+" ");
                }
                System.out.println("");
            }
}
 else
        {
            System.out.println("Addition would not be possible");
        }

}
}