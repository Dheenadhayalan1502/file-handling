
package employeepayroll;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployeePayRoll 
{
     //adding employees, searching employees, updating salary, deleting employee details, and calculating net salary.
  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         Scanner sc1=new Scanner(System.in);
         ArrayList<Employee> obj=new ArrayList<>();
         int choise=0;
         while(choise!=6)
         {
             System.out.println("1.add employee :");
              System.out.println("2.search employee");
               System.out.println("3.update employee");
                System.out.println("4.delete employee");
                 System.out.println("5.calculate the net salary");
                  System.out.println("6.exit");
                   System.out.println("enter the choise : ");
                   choise=sc.nextInt();
                   switch(choise)
                   {
                       case 1:
                       {
                           System.out.println("enter the id : ");
                           int id=sc.nextInt();
                           System.out.println("enter the department : ");
                           String department=sc1.nextLine();
                           System.out.println("enter the salary");
                           double salary=sc.nextDouble();
                           obj.add(new Employee(id, department, salary));
                           System.out.println("added succesfully ");
                           break;
                       }
                       case 2:
                       {
                           System.out.println("enter the id to search employee ");
                           int id =sc.nextInt();
                           for(Employee obj1:obj)
                           {
                               if(obj1.id==id)
                               {
                                   obj1.display();
                               }
                               else
                               {
                                   System.out.println("list is empty ");
                               }
                           }
                           break;
                       }
                       case 3:
                       {
                           System.out.println("enter the salary to update : ");
                           double salary=sc.nextDouble();
                           System.out.println("enter the id to update salary");
                           int id=sc.nextInt();
                           for(Employee obj1:obj)
                           {
                               if(obj1.id==id)
                               {
                                   obj1.salary=salary;
                               }
                           }
                           break;
                           
                           
                       }
                       case 4:
                       {
                           System.out.println("enter the employee id to delete : ");
                           int id=sc.nextByte();
                           for(Employee obj1:obj)
                           {
                               if(obj1.id==id)
                               {
                                 obj.remove(obj1);
                                 break;
                               }
                           }
                           
                       }
                       case 5:
                       {
                           System.out.println("enter the id to calculate the net salary :");
                           int id=sc.nextInt();
                           for(Employee obj1:obj)
                           {
                               if(obj1.id==id)
                               {
                                   double result=obj1.netSalary();
                                   System.out.println("Netsalary"+result);
                                   
                               }
                           }
                           break;
                           
                           
                       }
                       case 6:
                       {
                           System.out.println("exiting the program ");
                           break;
                       }
                           
                       
                   }
         }
    }
    
}
