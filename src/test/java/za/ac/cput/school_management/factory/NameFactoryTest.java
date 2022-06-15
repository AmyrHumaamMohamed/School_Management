package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void createName() {
        var name = NameFactory.createName("Kurtney","Clyde","Jantjies");
        assertNotNull(name);
        System.out.println(name);
    }
}