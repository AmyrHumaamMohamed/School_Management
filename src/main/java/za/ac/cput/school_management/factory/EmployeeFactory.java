package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.utility.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String employeeEmail, String employeeName, String employeeLastname, String employeeMiddleName){
        if(Helper.isEmpty(employeeEmail)
                || Helper.isEmpty(employeeName) || Helper.isEmpty(employeeLastname) || Helper.isEmpty(staffId)){
            return null;
        }

        if(!Helper.isValidEmail(employeeEmail)){
            System.out.println("Check Email!!!");
            return null;
        }

        Name name = NameFactory.createName(employeeName,employeeLastname,employeeMiddleName);
        return   Employee.builder()
                .staffId(staffId)
                .email(employeeEmail)
                .name(name)
                .build();
    }
}
