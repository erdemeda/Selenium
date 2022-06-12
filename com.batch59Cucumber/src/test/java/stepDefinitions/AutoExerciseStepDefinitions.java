package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AutoExercisePage;
import utilities.Driver;

public class AutoExerciseStepDefinitions {

    AutoExercisePage autoExercisePage=new AutoExercisePage();

    @Given("anasayfanin gorunur oldugu dogrulanir")
    public void anasayfanin_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(autoExercisePage.anasayfa.isDisplayed());

    }

    @Given("Signup Login butonuna tiklar")
    public void signup_login_butonuna_tiklar() {
        autoExercisePage.signupLoginButton.click();

    }

    @Given("New User Signup yazisinin gorunur oldugunu test eder")
    public void new_user_signup_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.newUserSignupYazisi.isDisplayed());

    }

    @Given("gecerli name ve email address girer")
    public void gecerli_name_ve_email_address_girer() {
        autoExercisePage.nameTextBox.sendKeys("eda");
        autoExercisePage.emailTextBox.sendKeys("abc@hotmail.com");

    }

    @Given("Signup butonuna tiklar")
    public void signup_butonuna_tiklar() {
        autoExercisePage.signupButton.click();

    }

    @Given("ENTER ACCOUNT INFORMATION yazisinin gorunur oldugunu test eder")
    public void enter_account_information_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.enterAccountYazisi.isDisplayed());

    }

    @Given("ilk kisim ayrintilari doldurur")
    public void ilk_kisim_ayrintilari_doldurur() {
        autoExercisePage.genderButton.click();
        autoExercisePage.passwordBox.sendKeys("123456");

        Select select1=new Select(autoExercisePage.dayButton);
        select1.selectByIndex(10);

        Select select2=new Select(autoExercisePage.monthButton);
        select2.selectByIndex(10);
        Select select3=new Select(autoExercisePage.yearButton);
        select3.selectByVisibleText("1999");

    }

    @Given("Sign up for our newsletter onay butonunu tiklar")
    public void sign_up_for_our_newsletter_onay_butonunu_tiklar() {
        autoExercisePage.newsletterBox.click();

    }

    @Given("Receive special offers from our partners onay butonunu tiklar")
    public void receive_special_offers_from_our_partners_onay_butonunu_tiklar() {
        autoExercisePage.receiveSpecialBox.click();

    }

    @Given("ikinci kisim ayrintilari doldurur")
    public void ikinci_kisim_ayrintilari_doldurur() {
        autoExercisePage.fistname.sendKeys("eda");
        autoExercisePage.lastname.sendKeys("erdem");
        autoExercisePage.company.sendKeys("stars");
        autoExercisePage.address1.sendKeys("address");
        autoExercisePage.address2.sendKeys("address2");

        Select select=new Select(autoExercisePage.country);
        select.selectByVisibleText("Canada");

        autoExercisePage.state.sendKeys("State");
        autoExercisePage.city.sendKeys("City");
        autoExercisePage.zipcode.sendKeys("654321");
        autoExercisePage.mobileNumber.sendKeys("654321123");

    }

    @Given("Create Account butonunu tiklar")
    public void create_account_butonunu_tiklar() {
        autoExercisePage.createAccountButton.click();

    }

    @Given("ACCOUNT CREATED yazisinin gorunur oldugunu test eder")
    public void account_created_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.accountCreatedYazisi.isDisplayed());

    }

    @Given("Continiue butonunu tiklar")
    public void continiue_butonunu_tiklar() {
        autoExercisePage.continiueButton.click();

    }

    @Given("Logged in as username yazisinin gorunur oldugunu test eder")
    public void logged_in_as_username_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.loggedInUsernameYazisi.isDisplayed());

    }

    @Then("Delete Account butonunu tiklar")
    public void delete_account_butonunu_tiklar() {
        autoExercisePage.deleteAccountButton.click();

    }


    @And("Login to your account yazisinin gorunur oldugunu test eder")
    public void loginToYourAccountYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.loginYourAccountYazisi.isDisplayed());

    }
/*
    @And("dogru {string} ve {string} girer")
    public void dogruVeGirer(String validEmail, String validPassword) {
        autoExercisePage.loginEmailBox.sendKeys(validEmail);
        autoExercisePage.loginPaswordBox.sendKeys(validPassword);
     }
 */



    @And("dogru email ve password girer")
    public void dogruEmailVePasswordGirer() {
        autoExercisePage.loginEmailBox.sendKeys("abc@hotmail.com");
        autoExercisePage.loginPaswordBox.sendKeys("123456");

    }


    @And("login butonuna tiklar")
    public void loginButonunaTiklar() {
        autoExercisePage.loginButton.click();

    }

    @And("yanlis email ve yanlis password girer")
    public void yanlisEmailVeYanlisPasswordGirer() {
        autoExercisePage.loginEmailBox.sendKeys("cba@hotmail.com");
        autoExercisePage.loginPaswordBox.sendKeys("654321");
    }

    @And("Your email or password is incorrect yazisinin gorunur oldugunu test eder")
    public void yourEmailOrPasswordIsIncorrectYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.yourEmailPasswordIncorrectYazisi.isDisplayed());

    }

    @And("Logout butonuna tiklar")
    public void logoutButonunaTiklar() {
        autoExercisePage.logoutButton.click();

    }

    @And("kullanicinin login sayfasina yonlendirildigini test eder")
    public void kullanicininLoginSayfasinaYonlendirildiginiTestEder() {
        Assert.assertTrue(autoExercisePage.loginYourAccountYazisi.isDisplayed());

    }

    @And("Email Address already exist yazisinin gorunur oldugunu test eder")
    public void emailAddressAlreadyExistYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.emailAlreadyExistYazisi.isDisplayed());

    }

    @Given("Contact Us butonuna tiklar")
    public void contact_us_butonuna_tiklar() {
       autoExercisePage.contactUsButton.click();

    }

    @Given("GET IN TOUCH yazisinin gorunur oldugunu test eder")
    public void get_in_touch_yazisinin_gorunur_oldugunu_test_eder() {
       Assert.assertTrue(autoExercisePage.getInTouchYazisi.isDisplayed());

    }

    @Then("name email subject ve message bilgileri girer")
    public void name_email_subject_ve_message_bilgileri_girer() {
       autoExercisePage.contactUsName.sendKeys("eda");
       autoExercisePage.contactUsEmail.sendKeys("abc@hotmail.com");
       autoExercisePage.contactUsSubject.sendKeys("Subject");
       autoExercisePage.contactUsMessage.sendKeys("Message");

    }

    @Then("dosya yuklemesi yapar")
    public void dosya_yuklemesi_yapar() {
       autoExercisePage.uploadFile.sendKeys("C:\\Users\\Administrator\\ders2");

    }

    @Then("Submit butonuna tiklar")
    public void submit_butonuna_tiklar() {
       autoExercisePage.submitButton.click();

    }

    @Then("OK butonuna tiklar")
    public void ok_butonuna_tiklar() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Success! Your details have been submitted successfully yazisinin gorunur oldugunu test eder")
    public void success_your_details_have_been_submitted_successfully_yazisinin_gorunur_oldugunu_test_eder() {
      Assert.assertTrue(autoExercisePage.successMessage.isDisplayed());

    }

    @Then("Home butonuna tiklar ve basarili bir sekilde gecis yapildigini test eder")
    public void home_butonuna_tiklar_ve_basarili_bir_sekilde_gecis_yapildigini_test_eder() {
        autoExercisePage.homeButton.click();
        Assert.assertTrue(autoExercisePage.anasayfa.isDisplayed());
    }
}
