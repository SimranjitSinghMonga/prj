import java.io.*;
class Calculation
{
String name;    
int no;
    BufferedReader br;
   public void Info() throws IOException
    {
     
br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Name : ");
name=br.readLine();
System.out.print("Enter No : ");
no=Integer.parseInt(br.readLine());
 
    }
   public static void main(String[] args) throws IOException
   {
     Calculation cal=new Calculation();
     cal.Info();
   }

}