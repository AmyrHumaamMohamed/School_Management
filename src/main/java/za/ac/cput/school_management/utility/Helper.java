package za.ac.cput.school_management.utility;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class Helper {
    public static boolean isEmpty(String t){
        return (t.equals(null) || t.isEmpty() || t.equals("") || t.equalsIgnoreCase("null"));
    }

    public static boolean isValidEmail(String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }
}
