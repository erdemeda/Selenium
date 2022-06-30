package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Random;

public class TradylinnPage {
    public TradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public Random rnd=new Random();
    public String codeNumarasi= String.valueOf(rnd.nextInt(10000));

    @FindBy(xpath = "//span[text()='Giriş Yap']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;


    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement hesabimButton;


    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement hasabimSayfasi;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//div[@class='wcfm_welcomebox_header']")
    public WebElement welcomeTradylinnDashboardYazisi;

    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[5]")
    public WebElement kuponlarButonu;

    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement yeniEkleButonu;

    @FindBy(xpath = "//*[text()='Add Coupon']")
    public WebElement addCouponYazisi;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionKutusu;

    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountTypeKutusu;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmountKutusu;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDateKutusu;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShipping;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showOnStore;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendKutusu;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendKutusu;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnly;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItems;

    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement excludeCategories;

    @FindBy(xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitButonu;

    @FindBy(xpath = "//div[@id='coupons_manage_limit_expander']")
    public WebElement limitlendirmeBolumu;

    @FindBy(xpath = "//input[@id='usage_limit']")
    public WebElement usageLimitPerCoupon;

    @FindBy(xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement limitUsageToXitems;

    @FindBy(xpath = "//input[@id='usage_limit_per_user']")
    public WebElement usageLimitPerUser;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitButonu;


    /*

 public class KuponOlusturmaPage {
    public KuponOlusturmaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public Random rnd=new Random();
    public String codeNumarasi= String.valueOf(rnd.nextInt(10000));



    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement hasabimSayfasi;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//div[@class='wcfm_welcomebox_header']")
    public WebElement welcomeTradylinnDashboardYazisi;

    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[5]")
    public WebElement kuponlarButonu;

    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement yeniEkleButonu;

    @FindBy(xpath = "//*[text()='Add Coupon']")
    public WebElement addCouponYazisi;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionKutusu;

    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountTypeKutusu;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmountKutusu;

    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expiryDateKutusu;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement allowFreeShipping;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showOnStore;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendKutusu;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendKutusu;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnly;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItems;

    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement excludeCategories;

    @FindBy(xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitButonu;

    @FindBy(xpath = "//div[@id='coupons_manage_limit_expander']")
    public WebElement limitlendirmeBolumu;

    @FindBy(xpath = "//input[@id='usage_limit']")
    public WebElement usageLimitPerCoupon;

    @FindBy(xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement limitUsageToXitems;

    @FindBy(xpath = "//input[@id='usage_limit_per_user']")
    public WebElement usageLimitPerUser;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitButonu;


}


 */
}
