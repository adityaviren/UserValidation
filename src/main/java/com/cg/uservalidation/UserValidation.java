package com.cg.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {

    public boolean validateFirstName(String first_name) throws FirstNameException{
        checkValidity checkFirstName = (f_name) -> Pattern.matches("[A-Z]{1}[a-z]{2,}", f_name);
        if(checkFirstName.check(first_name)){
            return true;
        }
        else{
            throw new FirstNameException("First name unexpected");
        }
    }
    public boolean validateLastName(String last_name) throws LastNameException{
        checkValidity checkLastName = (l_name) -> Pattern.matches("[A-Z]{1}[a-z]{2,}", l_name);
        if(checkLastName.check(last_name)){
            return true;
        }
        else
            throw new LastNameException("Last Name unexpected");
    }

    public boolean validateEmail(String email) throws EmailException{
        checkValidity checkEmail = mail -> (Pattern.matches("^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",mail));
        if (checkEmail.check(email))
            return true;
        else
            throw new EmailException("Email unexpected");

    }
    public boolean validateMobile(String mobile) throws MobileException {
        checkValidity checkMobile = mob -> (Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mob));
        if (checkMobile.check(mobile))
            return true;
        else
            throw new MobileException("Mobile unexpected");

    }
    public boolean validatePassword(String password) throws PasswordException{
        checkValidity checkPassword = pass -> ((Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
                pass)) && Pattern.matches("\\w*[^\\w\\s]{1}\\w*", pass));
        if(checkPassword.check(password))
            return true;
        else
            throw new PasswordException("Password Unexpected");
    }

    public String happyOrSad(String message) {
        checkValidity checkMood = mess -> mess.contains("sad");
        if(checkMood.check(message))
            return "sad";
        else
            return "happy";
    }
}
@FunctionalInterface
interface checkValidity{
    boolean check(String str);
}
