import java.io.*;
public class Demo
{
   BufferedReader br;
   float no1,no2,res;
  public void Add() throws IOException
  {
br=new BufferedReader(new InputStreamReader(System.in));    
System.out.print("Enter No : ");
no1=Float.parseFloat(br.readLine());
System.out.print("Enter No : ");
no2=Float.parseFloat(br.readLine());
res=no1+no2;
System.out.println("Result is : "+res);    
    
  }
  public static void main(String[] args) throws IOException
   {
       Demo d=new Demo();
       d.Add();

   }
}