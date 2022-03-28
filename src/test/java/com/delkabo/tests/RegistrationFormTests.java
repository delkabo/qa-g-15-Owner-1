package com.delkabo.tests;

import com.codeborne.selenide.Configuration;
import com.delkabo.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.delkabo.pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormTests {


    RegistrationPage registrationPage = new RegistrationPage();
    String firstname = "Kamil";
    String lastName = "Syapukov";
    String email = "kamil@syapukov.com";

    @BeforeAll
    static void beforeAll() {
        WebDriverConfig config = ConfigFactory
                .create(WebDriverConfig.class, System.getProperties());

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserSize = config.getResolution();
    }

    @Test
    void successFillTest() {
        registrationPage.openPage()
                .setFirstName(firstname)
                .setLastName(lastName)
                .setBirthDate("May", "1990", "17")
                .setEmail(email)
                .setGender("Other")
                .setNumberUser("89999999999")
                .interests("Math")
                .hobbies("Sports")
                .uploadPicture("cv.jpg")
                .curAddress("Some address 1")
                .scrollTo()
                .stateCity("NCR")
                .scrollToCity()
                .stateCity("Delhi")
                .submitButton()
                .showThanks("Thanks for submitting the form")
                .checkForm("Student Name", firstname + " " + lastName)
                .checkForm("Student Email", email)
                .checkForm("Gender", "Other")
                .checkForm("Mobile", "8999999999")
                .checkForm("Date of Birth", "17 May,1990")
                .checkForm("Subjects", "Maths")
                .checkForm("Hobbies", "Sports")
                .checkForm("Picture", "cv.jpg")
                .checkForm("Address", "Some address 1")
                .checkForm("State and City", "NCR Noida");
    }
}
