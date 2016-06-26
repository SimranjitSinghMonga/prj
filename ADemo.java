import java.io.*;
class ADemo
{
  public static void main(String[] args)
   {
        Console c=System.console();
        System.out.println("Enter Name : ");
        String name=c.readLine();
        System.out.println("Enter age : ");
        int age=Integer.parseInt(c.readLine());
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
   }
}