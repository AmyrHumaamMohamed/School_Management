package za.ac.cput.school_management.factory;

import za.ac.cput.school_management.domain.Name;
import za.ac.cput.school_management.domain.Student;
import za.ac.cput.school_management.utility.Helper;

public class StudentFactory {
    public static Student createStudent(String studentId, String email, Name name){

        if(!Helper.isValidEmail(email)){
            System.out.println("Check Email!!!");
            return null;
        }

        return   Student.builder()
                .studentId(studentId)
                .email(email)
                .name(name)
                .build();
    }
}
