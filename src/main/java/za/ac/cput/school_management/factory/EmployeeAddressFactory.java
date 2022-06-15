package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Address;
import za.ac.cput.school_management.domain.EmployeeAddress;

public class EmployeeAddressFactory {
    public static EmployeeAddress createEmployeeAddress(String staffId, String unitNumber, String complexName,
                                                        String streetNumber, String streetName, int postalCode) {
        Address address = AddressFactory.createAddress(unitNumber, complexName, streetNumber,
                streetName, postalCode);
        return EmployeeAddress.builder()
                .staffId(staffId)
                .address(address)
                .build();
    }
}
