import p1.*;

import java.util.*;

 

class graphics

{

                public static void main(String []args)

                {

                                Scanner sc=new Scanner(System.in);

                                System.out.println("Enter The side of the Square : ");

                                int s=sc.nextInt();

                                square sq=new square(s);

                               

                                System.out.println("Area of Square is " + sq.area());

 

                                System.out.println("Enter The radius of the Circle : ");

                                int r=sc.nextInt();

                                circle ci=new circle(s);

               

                                System.out.println("Area of Circle is " + ci.area());

                               

                               

               

                System.out.println("Enter The length of rectangle ");

                                int a=sc.nextInt();

                                System.out.println("Enter The breath of rectangle ");

                                int b=sc.nextInt();

                                rectangle q=new rectangle(a,b);

               

                                System.out.println("Area of Triangle is " + q.area());

               

               

                                System.out.println("Enter The Side1 of the Triangle : ");

                                int s1=sc.nextInt();

                                System.out.println("Enter The Side2 of the Triangle : ");

                                int s2=sc.nextInt();

                                System.out.println("Enter The Side3 of the Triangle : ");

                                int s3=sc.nextInt();

                                triangle t=new triangle(s1,s2,s3);

                               

                                System.out.println("Area of Triangle is " + t.area());

                }

}