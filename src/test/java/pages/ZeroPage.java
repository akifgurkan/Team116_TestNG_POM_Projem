package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class ZeroPage {

    public ZeroPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signIn;
    @FindBy(xpath = "//input[@name='user_login']")
    public WebElement loginKutusu;
    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signIn2;
    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBanking;
    @FindBy(xpath = "//*[@id=\"pay_bills_tab\"]/a")
    public WebElement payBills;
    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement Purchase;
    @FindBy(xpath = "//select[@name='currency']")
    public WebElement dropDownMenu;
}