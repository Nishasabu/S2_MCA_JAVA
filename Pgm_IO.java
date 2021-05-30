import java.io.*;
class Pgm_IO
{
public static void main(String args[]) throws Exception
{
char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
c=(char) br.read();
String str=br.readLine();
System.out.println("entered character is:"+c);
System.out.println("entered string is:"+str);
}
}

	