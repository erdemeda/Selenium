package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement  aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    public WebElement allButtonElementi;

    @FindBy(xpath = "//*[text()='digital content & devices']")
    public WebElement digitalContentElementi;

    @FindBy(xpath = "//*[text()='Kindle E-readers & Books']")
    public WebElement kindleEreadersButtonElementi;

    @FindBy(xpath = "//*[text()='Kindle Kids']")
    public WebElement kindleKidssButtonElementi;

    @FindBy(xpath = "(//a[@class='nav-a  '])[3]")
    public WebElement registryButtonElementi;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement selectButtonElementi;

    @FindBy(xpath = "//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit']")
    public WebElement searchButtonElementi;

}
