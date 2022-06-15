package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.utility.Helper;

public class NameFactory {
    public static Name createName(String firstName, String lastName, String middleName){

        if(Helper.isEmpty(firstName)
                || Helper.isEmpty(lastName) || Helper.isEmpty(middleName) ){
            return null;
        }

        return   Name.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .build();
    }
}
