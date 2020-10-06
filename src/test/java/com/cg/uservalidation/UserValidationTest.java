package com.cg.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    UserValidation userValidation= new UserValidation();

    @Test
    public void givenFirstName_whenEntered_shouldReturnValidation() {
        Assert.assertTrue(userValidation.validateFirstName("Aditya"));
    }
    @Test
    public void givenLastName_whenEntered_shouldReturnValidation() {
        Assert.assertTrue(userValidation.validateLastName("Viren"));
    }
    @Test
    public void givenEmail_whenEntered_shouldReturnValidation() {
        Assert.assertTrue(userValidation.validateEmail("adi.vir@gmail.co.in"));
    }
    @Test
    public void givenMobile_whenEntered_shouldReturnValidation() {
        Assert.assertTrue(userValidation.validateMobile("91 9999999999"));
    }
    @Test
    public void givenPassword_whenEntered_shouldReturnValidation() {
        Assert.assertTrue(userValidation.validatePassword("Aditya@123"));
    }
    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assert.assertEquals("sad",userValidation.happyOrSad("Happy and not sad"));
    }

}
