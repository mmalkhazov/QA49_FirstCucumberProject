package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCarPage extends BasePage {
    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement carAddress;

    public AddCarPage enterCarAdress(String address) {
        carAddress.sendKeys("145 Hayarkon Street 63453 Tel Aviv");
        pause(1000);
        carAddress.sendKeys(Keys.ARROW_DOWN);
        pause(1000);
        carAddress.sendKeys(Keys.ENTER);
        return this;
    }


    @FindBy(id = "make")
    WebElement carManufacture;

    public AddCarPage enterCarManufacture(String manufacture) {
        type(carManufacture, manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement carModel;

    public AddCarPage enterCarModel(String model) {
        type(carModel, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement carYear;

    public AddCarPage enterCarYear(String year) {
        type(carYear, year);
        return this;
    }


    @FindBy(id = "fuel")
    WebElement carFuel;

    public AddCarPage enterCarFuel(String option) {
        Select select = new Select(carFuel);
        select.selectByVisibleText(option);
        return this;
    }


    @FindBy(id = "seats")
    WebElement carSeats;

    public AddCarPage enterCarSeats(String seats) {
        type(carSeats, seats);
        return this;
    }

    @FindBy(id = "class")
    WebElement carClass;

    public AddCarPage enterCarClass(String classOfCar) {
        type(carClass, classOfCar);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement carRegistrationNumber;

    public AddCarPage enterCarRegistrationNumber(String number) {
        type(carRegistrationNumber, number);
        return this;

    }

    @FindBy(id = "price")
    WebElement carPrice;

    public AddCarPage enterCarPrice(String price) {
        type(carPrice, price);

        return this;
    }



    @FindBy(id = "photos")
    WebElement fileUpload;


    public AddCarPage enterCarPhoto(String path) {
        pause(1000);
//        click(fileUpload);
        fileUpload.sendKeys(path);
        return this;
    }



    @FindBy(xpath = "//button[text()='Submit']")
    WebElement fileSubmit;

    public AddCarPage clickOnSubmitButton() {
        pause(1000);
        click(fileSubmit);
        return this;
    }


    @FindBy(xpath = "//h1[text()='Car added']")
    WebElement carAddedSuccessMessage;

    public AddCarPage isCarAddedSuccessMessagePresent(String message) {
        assert carAddedSuccessMessage.getText().contains(message);
        return this;
    }


}