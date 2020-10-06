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

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        UserValidation userValidation = new UserValidation();
        System.out.println(userValidation.validateFirstName(scanner.nextLine()));
        System.out.println(userValidation.validateLastName(scanner.nextLine()));
    }
}
