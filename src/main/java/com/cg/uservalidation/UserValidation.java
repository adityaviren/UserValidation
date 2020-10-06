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
        return Pattern.matches("[a-z]{1,}(\\.{1}[a-z]{1,})*@{1}[a-z]{1,}(.co){1}(\\.{1}[a-z]{1,})*", email);

    }
    public boolean validateMobile(String mobile) {
        return Pattern.matches("[0-9]{2}\s{1}[1-9]{1}[0-9]{9}", mobile);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        UserValidation userValidation = new UserValidation();
        System.out.println(userValidation.validateFirstName(scanner.nextLine()));
        System.out.println(userValidation.validateLastName(scanner.nextLine()));
        System.out.println(userValidation.validateEmail(scanner.nextLine()));
        System.out.println(userValidation.validateMobile(scanner.nextLine()));
    }
}
