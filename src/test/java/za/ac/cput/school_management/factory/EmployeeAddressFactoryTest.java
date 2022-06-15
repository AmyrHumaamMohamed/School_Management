package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.EmployeeAddress;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {

    @Test
    void createEmployeeAddress() {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress(
                "1",
                "2",
                "3",
                "4",
                "5",
                6
        );
        assertNotNull(employeeAddress);
        System.out.println("employeeAddress = " + employeeAddress);
    }
}