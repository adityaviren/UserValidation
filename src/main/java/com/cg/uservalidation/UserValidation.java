package com.cg.uservalidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean validateFirstName(String first_name){
        return Pattern.matches("[A-Z]{1}[a-z]{2,}", first_name);
    }
    public boolean validateLastName(String last_name) {
        return Pattern.matches("[A-Z]{1}[a-z]{2,}", last_name);

    }
    public boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$",email);

    }
    public boolean validateMobile(String mobile) {
        return Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mobile);

    }
    public boolean validatePassword(String password) {
        boolean passCheck;
        passCheck = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
                password);
        passCheck = passCheck && Pattern.matches("\\w*[^\\w\\s]{1}\\w*", password);
        return passCheck;
    }

    public String happyOrSad(String message) {
        if(message.contains("sad"))
            return "sad";
        else
            return "happy";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserValidation userValidation = new UserValidation();
        System.out.println(userValidation.validateFirstName(scanner.nextLine()));
        System.out.println(userValidation.validateLastName(scanner.nextLine()));
        System.out.println(userValidation.validateEmail(scanner.nextLine()));
        System.out.println(userValidation.validateMobile(scanner.nextLine()));
        System.out.println(userValidation.validatePassword(scanner.nextLine()));
        System.out.println(userValidation.happyOrSad(scanner.nextLine()));
    }
}
