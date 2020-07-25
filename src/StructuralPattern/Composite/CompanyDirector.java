package StructuralPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements Employee {

    List<Employee> employeeList=new ArrayList<Employee>();
    public void addEmployee(Employee employee)
    {
            employeeList.add(employee);
    }
    public void removeEmployee(Employee employee)
    {
        employeeList.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for(Employee employee:employeeList){
            employee.showEmployeeDetails();
        }
    }
}
