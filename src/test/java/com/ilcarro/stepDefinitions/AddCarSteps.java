package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddCarPage;
import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Test;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on Ok button")
    public void click_on_Ok_button() {
        new LoginPage(driver).clickOnOkButton();
    }

    @And("User clicks on Let the car work link")
    public void click_on_Let_the_car_work_link() {
        new HomePage(driver).clickAddCarLink();
    }

    @And("User enters car valid data")
    public void enter_car_valid_data() {
        new AddCarPage(driver)
                .enterCarAdress("145 Hayarkon Street 63453 Tel Aviv")
                .enterCarManufacture("Opel")
                .enterCarModel("Vectra")
                .enterCarYear("2020")
                .enterCarFuel("Diesel").
                enterCarSeats("4")
                .enterCarClass("B")
                .enterCarRegistrationNumber("maynard111")
                .enterCarPrice("333").enterCarPhoto("C:\\QA\\img\\opelvectra.jpg")
                .clickOnSubmitButton()
                ;
    }


    @Then("User verifies Car added message is displayed")
    public void verifies_Success_added_Is_displayed(){
        new AddCarPage(driver).isCarAddedSuccessMessagePresent("Car added");
    }

}
