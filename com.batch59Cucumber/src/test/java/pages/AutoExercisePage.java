package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {
    public AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//html[@lang='en']")
    public WebElement anasayfa;

    @FindBy(xpath ="//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath ="//*[text()='New User Signup!']")
    public WebElement newUserSignupYazisi;

    @FindBy(xpath ="//input[@type='text']" )
    public WebElement nameTextBox;

    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement emailTextBox;

    @FindBy(xpath ="//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath ="//*[text()='Enter Account Information']")
    public WebElement enterAccountYazisi;

    @FindBy(xpath ="//input[@id='id_gender2']")
    public WebElement genderButton;

    @FindBy(xpath ="//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath ="//select[@name='days']")
    public WebElement dayButton;

    @FindBy(xpath ="//select[@name='months']")
    public WebElement monthButton;

    @FindBy(xpath ="//select[@name='years']")
    public WebElement yearButton;

    @FindBy(xpath ="//input[@id='newsletter']")
    public WebElement newsletterBox;

    @FindBy(xpath ="//input[@id='optin']")
    public WebElement receiveSpecialBox;

    @FindBy(xpath ="//input[@id='first_name']")
    public WebElement fistname;

    @FindBy(xpath ="//input[@id='last_name']")
    public WebElement lastname;

    @FindBy(xpath ="//input[@id='company']")
    public WebElement company;

    @FindBy(xpath ="//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath ="//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath ="//select[@id='country']")
    public WebElement country;

    @FindBy(xpath ="//input[@id='state']")
    public WebElement state;

    @FindBy(xpath ="//input[@id='city']")
    public WebElement city;

    @FindBy(xpath ="//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath ="//input[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath ="//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath ="//*[text()='Account Created!']")
    public WebElement accountCreatedYazisi;

    @FindBy(xpath ="//*[text()='Continue']")
    public WebElement continiueButton;

    @FindBy(xpath ="//*[text()=' Logged in as ']")
    public WebElement loggedInUsernameYazisi;

    @FindBy(xpath ="//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginYourAccountYazisi;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPaswordBox;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement yourEmailPasswordIncorrectYazisi;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutButton;


    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement emailAlreadyExistYazisi;

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement contactUsButton;

    @FindBy(xpath = "(//h2[@class='title text-center'])[2]")
    public WebElement getInTouchYazisi;

    @FindBy(xpath = "//input[@data-qa='name']")
    public WebElement contactUsName;

    @FindBy(xpath = "//input[@data-qa='email']")
    public WebElement contactUsEmail;

    @FindBy(xpath = "//input[@data-qa='subject']")
    public WebElement contactUsSubject;

    @FindBy(xpath = "//textarea[@data-qa='message']")
    public WebElement contactUsMessage;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    public WebElement homeButton;


/*
    @FindBy(xpath = "")
    public WebElement ;

 */


}
