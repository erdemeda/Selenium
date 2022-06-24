package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutoExercisePage;
import utilities.Driver;

public class AutoExerciseStepDefinitions {

    AutoExercisePage autoExercisePage = new AutoExercisePage();
    public Actions actions=new Actions(Driver.getDriver());
    public Faker faker;

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

        Select select1 = new Select(autoExercisePage.dayButton);
        select1.selectByIndex(10);

        Select select2 = new Select(autoExercisePage.monthButton);
        select2.selectByIndex(10);
        Select select3 = new Select(autoExercisePage.yearButton);
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

        Select select = new Select(autoExercisePage.country);
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

    @And("Test Case butonuna tiklar")
    public void testCaseButonunaTiklar() {
        autoExercisePage.testCaseButton.click();
    }

    @Then("Test Case sayfasina basarili bir sekilde gecis yapildigini test eder")
    public void testCaseSayfasinaBasariliBirSekildeGecisYapildiginiTestEder() {
        Assert.assertTrue(autoExercisePage.testCaseSayfasi.isDisplayed());
    }

    @Given("Products butonuna tiklar")
    public void products_butonuna_tiklar() {
        autoExercisePage.productsButton.click();
    }

    @Given("ALL PRODUCTS sayfasina basarili bir sekilde gecis yapildigini test eder")
    public void all_products_sayfasina_basarili_bir_sekilde_gecis_yapildigini_test_eder() {
        Assert.assertTrue(autoExercisePage.allProductsPage.isDisplayed());

    }

    @Given("urun listesinin gorunur oldugunu test eder")
    public void urun_listesinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.productsList.isDisplayed());

    }

    @Given("ilk urunun View Product butonuna tiklar")
    public void ilk_urunun_view_product_butonuna_tiklar() {
        autoExercisePage.firstViewProductButton.click();
    }

    @Then("urun detey sayfasina yonlendirildigini test eder")
    public void urun_detey_sayfasina_yonlendirildigini_test_eder() {
        Assert.assertTrue(autoExercisePage.productDetailsSayfasi.isDisplayed());

    }

    @Then("product name category price availability condition brand ayrintilarinin gorunur oldugunu test eder")
    public void product_name_category_price_availability_condition_brand_ayrintilarinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.productname1.isDisplayed());
        Assert.assertTrue(autoExercisePage.productcategory.isDisplayed());
        Assert.assertTrue(autoExercisePage.productprice1.isDisplayed());
        Assert.assertTrue(autoExercisePage.productavailability.isDisplayed());
        Assert.assertTrue(autoExercisePage.productcondition.isDisplayed());
        Assert.assertTrue(autoExercisePage.productbrand.isDisplayed());

    }

    @And("search product kutusunun icine product name yazar ve search butonuna tiklar")
    public void searchProductKutusununIcineProductNameYazarVeSearchButonunaTiklar() {
        autoExercisePage.searchProductKutusu.sendKeys("Stylish Dress");
        autoExercisePage.searchProductKutuButton.click();
    }

    @Then("SEARCHED PRODUCTS yazisinin gorunur oldugunu test eder")
    public void searchedPRODUCTSYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.searchedProductsYazisi.isDisplayed());
    }

    @And("aramayla ilgili tum urunlerin gorunur oldugunu test eder")
    public void aramaylaIlgiliTumUrunlerinGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.aranaUrunlerinGorunurlugu.isDisplayed());

    }


    @And("alt bilgi icin asagi kaydirir.")
    public void altBilgiIcinAsagiKaydirir() {
        autoExercisePage.anasayfa.sendKeys(Keys.END);
    }

    @And("SUBSCRIPTION yazisinin gorunur oldugunu test eder")
    public void subscrıptıonYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.subscriptionYazisi.isDisplayed());
    }

    @Then("your email adderss kutucuguna email adresini yazar ve ok isaterine tiklar")
    public void yourEmailAdderssKutucugunaEmailAdresiniYazarVeOkIsaterineTiklar() {
        autoExercisePage.subscriptionEmailKutusu.sendKeys("abc@hotmail.com");
        autoExercisePage.subscriptionOkButonu.click();
    }

    @And("You have been successfully subscribed yazisinin gorunur oldugunu test eder")
    public void youHaveBeenSuccessfullySubscribedYazisininGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage.successfullySubscribedYazisi.isDisplayed());
    }

    @And("Cart butonuna tiklar")
    public void cartButonunaTiklar() {
        autoExercisePage.cartButton.click();
    }

    @Given("ilk urunun uzerine gelir ve Add to cart a tiklar")
    public void ilk_urunun_uzerine_gelir_ve_add_to_cart_a_tiklar() {
        actions = new Actions(Driver.getDriver());
        actions.moveToElement(autoExercisePage.firstProduct).perform();
        autoExercisePage.firstAddToCartButton.click();

    }

    @Given("Continue Shopping butonuna tiklar")
    public void continue_shopping_butonuna_tiklar() throws InterruptedException {
        autoExercisePage.continueShoppingButton.click();
        Thread.sleep(2000);
    }


    @And("fareyi ikinci urunun uzerine getirir ve Add to cart a tiklar")
    public void fareyiIkinciUrununUzerineGetirirVeAddToCartATiklar() throws InterruptedException {
        actions.moveToElement(autoExercisePage.secondProduct).perform();
        Thread.sleep(2000);
        autoExercisePage.secondAddToCartButton.click();

    }


    @Given("View Cart butonuna tiklar")
    public void view_cart_butonuna_tiklar() {
        autoExercisePage.viewCartButton.click();

    }

    @Given("iki urunun de sepete eklendigini test eder")
    public void iki_urunun_de_sepete_eklendigini_test_eder() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(autoExercisePage.productname1.isDisplayed());
        Assert.assertTrue(autoExercisePage.productname2.isDisplayed());

    }

    @Given("fiyatlarini miktarlarini ve toplam fiyatin dogrulugunu test eder")
    public void fiyatlarini_miktarlarini_ve_toplam_fiyatin_dogrulugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.productprice1.isDisplayed());
        Assert.assertTrue(autoExercisePage.productQuantity1.isDisplayed());
        Assert.assertTrue(autoExercisePage.totalPrice1.isDisplayed());
        Assert.assertTrue(autoExercisePage.productprice2.isDisplayed());
        Assert.assertTrue(autoExercisePage.productQuantity2.isDisplayed());
        Assert.assertTrue(autoExercisePage.totalPrice2.isDisplayed());


    }
//Test Case 13

    @Given("ana sayfadaki herhangi bir ürün için View Product i tıklar")
    public void ana_sayfadaki_herhangi_bir_ürün_için_view_product_i_tıklar(){

        autoExercisePage.firstViewProductButton.click();

    }

    @Given("urun detaylarinin acildigini test eder")
    public void urun_detaylarinin_acildigini_test_eder() {
        Assert.assertTrue(autoExercisePage.firstProductDetails.isDisplayed());

    }

    @And("miktari dort e cikarir")
    public void miktariDortECikarir() {
        autoExercisePage.firstProductQuantity.sendKeys(Keys.DELETE);
        autoExercisePage.firstProductQuantity.sendKeys("4");
    }

    @Then("Add to cart butonuna tiklar")
    public void add_to_cart_butonuna_tiklar() {
        autoExercisePage.firstProductDetailsAddToCart.click();

    }

    @Then("urunun sepet sayfasinda tam miktari ile goruntulendigini test eder")
    public void urunun_sepet_sayfasinda_tam_miktari_ile_goruntulendigini_test_eder() {
        Assert.assertTrue(autoExercisePage.firstProductInCart.isDisplayed());

    }
//TestCase14
    @Given("sepete urun ekler")
    public void sepete_urun_ekler() {

        actions.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                moveToElement(autoExercisePage.firstProduct).
                perform();
        autoExercisePage.firstAddToCartButton.click();
        autoExercisePage.continueShoppingButton.click();
}

    @Then("sepet sayfasinin goruntulendigini test eder")
    public void sepet_sayfasinin_goruntulendigini_test_eder() {
        Assert.assertTrue(autoExercisePage.sayfaGorunurlugu.isDisplayed());

    }

    @Then("Proceed To Checkout tiklar")
    public void proceed_to_checkout_tiklar() {
        autoExercisePage.proceedToCheckoutButton.click();

    }

    @Then("Register login tiklar")
    public void register_login_tiklar() {
        autoExercisePage.registerLoginButton.click();

    }

    @Then("kayit bolumundeki ayrintilari doldurur ve hesap olusturur")
    public void kayit_bolumundeki_ayrintilari_doldurur_ve_hesap_olusturur() {
        faker=new Faker();
        actions.click(autoExercisePage.nameTextBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        actions.click(autoExercisePage.genderButton)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("25")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("India")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("5553332211")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }

    @Then("ACCOUNT CREATED yazisinin gorunur oldugunu test eder ve Continue butonuna tiklar")
    public void account_created_yazisinin_gorunur_oldugunu_test_eder_ve_continue_butonuna_tiklar() {
    Assert.assertTrue(autoExercisePage.accountCreatedYazisi.isDisplayed());
    autoExercisePage.continiueButton.click();

    }

    @Then("en ustteki Logged in as username yazisinin gorunur oldugunu test eder")
    public void en_ustteki_logged_in_as_username_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage.loggedInUsernameYazisi.isDisplayed());


    }
    @Then("Proceed To Checkout butonuna tiklar")
    public void proceed_to_checkout_butonuna_tiklar() {
        autoExercisePage.proceedToCheckoutButton.click();

    }

    @Then("adres ayrintilarinin ve siparisin dogrulugunu test eder")
    public void adres_ayrintilarinin_ve_siparisin_dogrulugunu_test_eder() {
        actions.sendKeys(Keys.PAGE_DOWN).
               // sendKeys(Keys.ARROW_DOWN).
                perform();

        Assert.assertTrue(autoExercisePage.addressDetails.isDisplayed());
        Assert.assertTrue(autoExercisePage.firstProductReviewYourOrder.isDisplayed());

    }

    @Then("yorum metni alanına açıklama girer ve Place Order i tıklar")
    public void yorum_metni_alanına_açıklama_girer_ve_place_order_i_tıklar() {
        autoExercisePage.commentTextArea.sendKeys("thank you");
        autoExercisePage.placeOrderButton.click();
    }

    @Then("Name on Card Card Number CVC Expiration date gibi odeme ayrintilarini girer")
    public void name_on_card_card_number_cvc_expiration_date_gibi_odeme_ayrintilarini_girer() throws InterruptedException {
        actions.click(autoExercisePage.nameOnCard).sendKeys("kart adi")
                .sendKeys(Keys.TAB)
                .sendKeys("25635")
                .sendKeys(Keys.TAB)
                .sendKeys("321")
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("2022")
                .perform();

        Thread.sleep(2000);
    }

    @Then("Pay and Confirm Order butonunu tiklar")
    public void pay_and_confirm_order_butonunu_tiklar() {
        autoExercisePage.payAndConfirmOrderButton.click();

    }

    @Then("Your order has been placed successfully yazisinin gorunur oldugunu test eder")
    public void your_order_has_been_placed_successfully_yazisinin_gorunur_oldugunu_test_eder() {
       Assert.assertTrue(autoExercisePage.yourOrderPlacedSuccessfullyYazisi.isDisplayed());

    }


}

