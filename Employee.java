
package employeepayroll;

//Employee IDEmployee NameDepartmentBasic Salary/
//Create a method to calculate Net Salary using the following formula:

//HRA = 20% of Basic SalaryDA = 10% of Basic SalaryPF = 5% of Basic SalaryNet Salary Formula:
//Net Salary = Basic Salary + HRA + DA - PF
public class Employee 
{
    int id;
    String departmentname;
    double salary;

    public Employee(int id, String departmentname, double salary) 
    {
        this.id = id;
        this.departmentname = departmentname;
        this.salary = salary;
    }
    void display()
    {
        System.out.println("id :" +id);
         System.out.println("department :"+departmentname);
          System.out.println("salary :"+salary);
    }
    
   double netSalary()
   {
       double hra=0.20*salary;
       double da=0.10*salary;
       double pf=0.05*salary;
       double netsalary=salary+hra+da-pf;
       return netsalary;
       
      
       
       
   }
    
    
    
}
