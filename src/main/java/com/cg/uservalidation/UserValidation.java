package com.cg.uservalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String first_name) throws FirstNameException{
        if(Pattern.matches("[A-Z]{1}[a-z]{2,}", first_name)){
            return true;
        }
        else{
            throw new FirstNameException("First name unexpected");
        }
    }
    public boolean validateLastName(String last_name) throws LastNameException{

        if(Pattern.matches("[A-Z]{1}[a-z]{2,}", last_name)){
            return true;
        }
        else
            throw new LastNameException("Last Name unexpected");
    }

    public boolean validateEmail(String email) throws EmailException{
        if (Pattern.matches("^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",email))
            return true;
        else
            throw new EmailException("Email unexpected");

    }
    public boolean validateMobile(String mobile) throws MobileException {
        if (Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mobile))
            return true;
        else
            throw new MobileException("Mobile unexpected");

    }
    public boolean validatePassword(String password) throws PasswordException{
        boolean passCheck;
        passCheck = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
                password);
        passCheck = passCheck && Pattern.matches("\\w*[^\\w\\s]{1}\\w*", password);
        if(passCheck)
            return true;
        else
            throw new PasswordException("Password Unexpected");
    }

    public String happyOrSad(String message) {
        if(message.contains("sad"))
            return "sad";
        else
            return "happy";
    }
}
