package za.ac.cput.school_management.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    void createAddress() {
        Address address = AddressFactory.createAddress(
                "1",
                "2",
                "3",
                "4",
                5
        );
        assertNotNull(address);
        System.out.println("address = " + address);
    }
}