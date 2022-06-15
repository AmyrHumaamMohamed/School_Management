package za.ac.cput.school_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Employee>> getAll(@RequestParam(required = false) String name) {
        return employeeService.getAll(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteStudent(@PathVariable String id){
        return employeeService.delete(id);
    }

    @GetMapping("/find-by-email/{email}")
    public List<String> findByEmail(@PathVariable String email) {
        return employeeService.findByEmail(email);
    }

}
