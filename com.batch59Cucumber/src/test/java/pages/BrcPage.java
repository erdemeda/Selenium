package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement ikinciLoginButonu;


    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;

    @FindBy(xpath = "//select[@class='mb-3 form-select form-select-lg']")
    public WebElement selectCarButonu;

    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpPlace;

    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOffPlace;

    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;

    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpHour;

    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;

    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffHour;

    @FindBy(xpath = "//*[text()=' CONTINUE RESERVATION']")
    public WebElement continiueReservation;

    @FindBy(xpath = "//div[@class='modal-header']")
    public WebElement completeReservation;

   // @FindBy(xpath = "")
   // public WebElement ;
}
