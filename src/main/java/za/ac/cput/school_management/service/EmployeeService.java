package za.ac.cput.school_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.exception.ResourceNotFoundException;
import za.ac.cput.school_management.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService  {

    @Autowired
    EmployeeRepository employeeRepository;

    //Crud Insert Employee
    public Employee add(Employee employee){
        if(employeeRepository.findAll().contains(employee)){
            return null;
        }
        return employeeRepository.save(employee);
    }

    //Return list of all employees
    public ResponseEntity<List<Employee>> getAll(String name) {
        try {
            List<Employee> students = new ArrayList<Employee>();
            if (name == null) {
                employeeRepository.findAll().forEach(students::add);
            }
            if (students.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Crud Delete Employee by ID
    public ResponseEntity<Employee> delete(String id) {
        Employee student = employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Student does not exist with Id: "+id));
        employeeRepository.delete(student);
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //FindByEmail Service Unattended!!
    public List<String> findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    //FindAllByCity Service Unattended!!
    public List<Employee> findAllByCity(String cityID) {
        return null;
    }
}
