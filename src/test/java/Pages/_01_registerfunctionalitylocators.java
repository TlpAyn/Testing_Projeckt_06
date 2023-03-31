package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_registerfunctionalitylocators extends Parent {
    public _01_registerfunctionalitylocators() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement SSN;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "(//input[@class='button'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logoutLink;

    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement loginSuccessMessage;

    @FindBy(xpath = "//p[@class='error']")
    public WebElement loginUnsuccessMessage;


    @FindBy(linkText = "Bill Pay")
    public WebElement billPay;
    @FindBy(name = "payee.name")
    public WebElement payeeName;
    @FindBy(name = "payee.address.street")
    public WebElement payeeAdress;

    @FindBy(name = "payee.address.city")
    public WebElement payeeCityt;

    @FindBy(name = "payee.address.state")
    public WebElement payeeState;

    @FindBy(name = "payee.address.zipCode")
    public WebElement payeeZip;

    @FindBy(name = "payee.phoneNumber")
    public WebElement payeePhone;

    @FindBy(name = "payee.phoneNumber")
    public WebElement element;

    @FindBy(name = "payee.accountNumber")
    public WebElement payeeAccount;

    @FindBy(name = "verifyAccount")
    public WebElement payeeVerifyAccount;

    @FindBy(name = "amount")
    public WebElement payeeAmount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement SendPAyment;

    //h1[text()='Bill Payment Complete']

    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement billPaymentComplete;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errorMessage;
















//public WebElement getWebElement(String strButton){
//
//        switch (strButton){
//            case
//                return null;
//        }
//
//    }
//
}
