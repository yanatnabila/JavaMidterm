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

    //employeeName() will return employee name

    public String employeeName(String name, LocalDate hireDate){
        this.name =name;
        this.hireDate = hireDate;
        public String getNAme(){
            return name;
        }
    }



    //assignDepartment() will assign employee to departments
    public void assignDepartment();

    //calculate employee salary
   public int calculateSalary();

    //employee benefit
   public void benefitLayout();

}
