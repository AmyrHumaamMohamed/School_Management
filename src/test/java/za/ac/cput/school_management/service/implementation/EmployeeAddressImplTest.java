package za.ac.cput.school_management.service.implementation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.school_management.domain.EmployeeAddress;
import za.ac.cput.school_management.factory.EmployeeAddressFactory;
import za.ac.cput.school_management.repository.IEmployeeAddressRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeAddressImplTest {

    @Autowired
    private IEmployeeAddressRepository repository;

    @Test
    void create() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress(
                "staffId",
                "1",
                "2",
                "3",
                "4",
                4);

        repository.save(employeeAddress);
        assertNotNull(employeeAddress);
    }

    @Test
    void read() {
        EmployeeAddress employeeAddress = repository.findById("staffId").orElse(null);
        System.out.println("employeeAddress = " + employeeAddress);
    }

    @Test
    void readAll() {
        repository.findAll().forEach(System.out::println);
    }

    @Test
    void delete() {
        repository.deleteById("staffId");
    }
}