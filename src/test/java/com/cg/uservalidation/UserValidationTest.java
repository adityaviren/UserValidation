package com.cg.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserValidation userValidation= new UserValidation();

    @Test
    public void givenFirstName_whenEntered_shouldReturnValidation() {
        try {
            Assert.assertTrue(userValidation.validateFirstName("Adity"));
        } catch (FirstNameException e){
            e.getMessage();
        }
    }
    @Test
    public void givenLastName_whenEntered_shouldReturnValidation() {
        try {
            Assert.assertTrue(userValidation.validateLastName("Viren"));
        } catch (LastNameException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_whenEntered_shouldReturnValidation() {
        try {
            Assert.assertTrue(userValidation.validateEmail("adi.vir@gmail.co.in"));
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobile_whenEntered_shouldReturnValidation() {
        try {
            Assert.assertTrue(userValidation.validateMobile("91 9999999999"));
        } catch (MobileException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_whenEntered_shouldReturnValidation() {
        try {
            Assert.assertTrue(userValidation.validatePassword("Aditya@123"));
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assert.assertEquals("sad",userValidation.happyOrSad("Happy and not sad"));
    }

}