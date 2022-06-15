package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Address;

public class

AddressFactory {
    public static Address createAddress(String unitNumber, String complexName, String streetNumber, String streetName, int postalCode) {
        return Address.builder()
                .unitNumber(unitNumber)
                .complexName(complexName)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .postalCode(postalCode)
                .build();
    }
}
