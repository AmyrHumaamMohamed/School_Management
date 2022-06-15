package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createEmployee() {
        var employee = EmployeeFactory.createEmployee("1","joe@gmail.com","Joe"
                ,"lalstname","Gebbaa");
        assertNotNull(employee);
        System.out.println(employee);
    }
}