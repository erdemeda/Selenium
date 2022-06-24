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

    @FindBy(xpath ="//*[text()=' Delete Account']")
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


    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCaseButton;

    @FindBy(xpath = "//html[@lang='en']")
    public WebElement testCaseSayfasi;


    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "(//div[@class='container'])[3]")
    public WebElement allProductsPage;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement productsList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement firstViewProductButton;

    @FindBy(xpath = "//div[@class='product-details']")
    public WebElement productDetailsSayfasi;

    @FindBy(xpath = "//*[.='Blue Top']")
    public WebElement productname1;

    @FindBy(xpath = "//*[.='Category: Women > Tops']")
    public WebElement productcategory;

    @FindBy(xpath = "//*[.='Rs. 500']")
    public WebElement productprice1;

    @FindBy(xpath = "//*[.='Availability:']")
    public WebElement productavailability;

    @FindBy(xpath = "//*[.='Condition:']")
    public WebElement productcondition;

    @FindBy(xpath = "//*[.='Brand:']")
    public WebElement productbrand;


    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductKutusu;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchProductKutuButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsYazisi ;

    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public WebElement aranaUrunlerinGorunurlugu;


   @FindBy(xpath = "//*[.='Subscription']")
    public WebElement subscriptionYazisi;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmailKutusu;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionOkButonu;

    @FindBy(xpath = "//*[.='You have been successfully subscribed!']")
    public WebElement successfullySubscribedYazisi;

    @FindBy(xpath = "(//a[@href='/view_cart'])[1]")
    public WebElement cartButton;


    @FindBy(xpath = "(//div[@class='single-products'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[2]")
    public WebElement firstAddToCartButton;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//div[@class='single-products'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[4]")
    public WebElement secondAddToCartButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//a[text()='Men Tshirt']")
    public WebElement productname2;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement productQuantity1;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement totalPrice1;

    @FindBy(xpath = "(//p[text()='Rs. 400'])[1]")
    public WebElement productprice2;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement productQuantity2;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement totalPrice2;

    //Test Case 13

    @FindBy(xpath = "//div[@class='product-details']")
    public WebElement firstProductDetails;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement firstProductDetailsAddToCart;

    @FindBy(xpath = "//div[@id='cart_info']")
    public WebElement firstProductInCart;

    //TestCase14


    @FindBy(xpath = "//html[@lang='en']")
    public WebElement sayfaGorunurlugu;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//u[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//h2[text()='Address Details']")
    public WebElement addressDetails;

    @FindBy(xpath = "//h2[text()='Review Your Order']")
    public WebElement firstProductReviewYourOrder;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement commentTextArea;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCard;

    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement yourOrderPlacedSuccessfullyYazisi;

   /*


    @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;

    @FindBy(xpath = "")
    public WebElement ;


    */








}
