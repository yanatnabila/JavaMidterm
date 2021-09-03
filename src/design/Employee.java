package design;

import java.time.LocalDate;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    // employeeId() will return employee id.
   public int employeeId();
    private String empName;
    private String emId;
    private String empOB;

    public Employee(){}
    public Employee(String empName,String empID,String empDOB){
        this.empName = empName;
        this.empID = empID;
        this.empDOB = empDOB;
    }


    //employeeName() will return employee name
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

   public void setEmpName(String empName){
        this.empName = empName;
   }
   public String getEmplID(){
        return empID;
   }

   public void setEmpID(String empID){
        this.empID;
   }
   public String getEmpDOB() {
    return empDOB;
    //assignDepartment() will assign employee to departments
    public void assignDepartment();

    //calculate employee salary
   public int calculateSalary();

    //employee benefit
   public void benefitLayout();

}
