class Employee
{
   int empNum;
   String empName;
   double empSalary;
   void setEmpDetails(int empNum,String empName,double empSalary)
   {
	this.empNum = empNum;
	this.empName = empName;
	this.empSalary = empSalary;
   }
   void dispEmpDetails()
   {
	System.out.println("Emp Num = "+empNum);
	System.out.println("Emp Name = "+empName);
	System.out.println("Emp Salary = "+empSalary);
   }
}
class EmployeeDemo
{
   public static void main(String[] args)
   {
	Employee e1 = new Employee();
	e1.setEmpDetails(111,"Ravi",5000);
	e1.dispEmpDetails();
	Employee e2 = new Employee();
	e2.setEmpDetails(222,"Raj",6000);
	e2.dispEmpDetails();
   }
}