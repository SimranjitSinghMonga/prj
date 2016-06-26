class Employee
{
      public String name;
      public int Id;
  public void setId(int Id)
   {
     this.Id=Id;
   }
 public void setName(String name)
  {
    this.name=name;
  }
 public int getId()
  {
    return Id;
  }
 public String getName()
  {
    return name;
  }

  public static void main(String[] args)
   {
   Employee emp=new Employee();
   emp.setId(1);
   emp.setName("Simran");
   System.out.println("Employee ID : "+emp.getId());  
   System.out.println("Employee Name : "+emp.getName());
   Employee emp1=new Employee();
   emp1.setId(2);
   emp1.setName("Rajesh");
   System.out.println("Employee ID : "+emp1.getId());  
   System.out.println("Employee Name : "+emp1.getName());
      


   }

}