package za.ac.cput.school_management.service;

import za.ac.cput.school_management.domain.EmployeeAddress;

import java.util.List;

public interface IEmployeeAddressService {
    //Abstract CRUD methods
    //Create
    EmployeeAddress create(EmployeeAddress employeeAddress);

    //Read
    EmployeeAddress read(String staffId);

    //ReadAll
    List<EmployeeAddress> readAll();

    //Delete
    void delete(String staffId);
}
