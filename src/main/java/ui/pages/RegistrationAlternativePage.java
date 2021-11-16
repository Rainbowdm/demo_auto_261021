package ui.pages;

import model.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationAlternativePage extends MainPage {

    public RegistrationAlternativePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[@class='radio-inline'][1]")
    public WebElement genderMr;

    @FindBy(xpath = "//div[@class='radio-inline'][2]")
    public WebElement genderMrs;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstNameField;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastNameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "days")
    public WebElement daysInDropDown;

    @FindBy(id = "months")
    public WebElement monthsInDropDown;

    @FindBy(id = "years")
    public WebElement yearsInDropDown;

    @FindBy(xpath = "//h3[contains(text(),'Your address')]")
    public WebElement titleYourAddress;

    @FindBy(id = "firstname")
    public WebElement fistNameField;

    @FindBy(id = "lastname")
    public WebElement lastNameField;

    @FindBy(xpath = "//div[@class='account_creation']//p[4]/input[@type='text']")
    public WebElement streetField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(xpath = "//select[@id='id_state']")
    public WebElement stateSelect;

    @FindBy(id = "postcode")
    public WebElement postCodeField;

    @FindBy(id = "id_country")
    public WebElement countryField;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "alias")
    public WebElement aliasField;

    @FindBy(id = "submitAccount")
    public WebElement submitButtonAccount;

    public RegistrationAlternativePage selectGender(String gender) {
        if (gender.equals("Mr.")) {
            webElements.clickRadioButton(genderMr, gender);
        } else {
            webElements.clickRadioButton(genderMrs, gender);
        }
        return this;
    }

    public RegistrationAlternativePage inputCustomerFN(String firstName) {
        webElements.inputText(customerFirstNameField, firstName);
        return this;
    }

    public RegistrationAlternativePage inputCustomerLN(String lastName) {
        webElements.inputText(customerLastNameField, lastName);
        return this;
    }

    public RegistrationAlternativePage inputEmail(String email) {
        webElements.inputText(emailField, email);
        return this;
    }

    public RegistrationAlternativePage inputPassword(String password) {
        webElements.inputText(passwordField, password);
        return this;
    }

    public RegistrationAlternativePage selectBirthday(String day) {
        webElements.selectValueInDropDown(daysInDropDown, day);
        return this;
    }

    public RegistrationAlternativePage selectMonth(String month) {
        webElements.selectValueInDropDown(monthsInDropDown, month);
        return this;
    }

    public RegistrationAlternativePage selectYear(String year) {
        webElements.selectValueInDropDown(yearsInDropDown, year);
        return this;
    }

    public RegistrationAlternativePage inputFirstName(String fistName) {
        webElements.inputText(fistNameField, fistName);
        return this;
    }

    public RegistrationAlternativePage inputLastName(String lastName) {
        webElements.inputText(lastNameField, lastName);
        return this;
    }

    public RegistrationAlternativePage inputStreet(String street) {
        webElements.inputText(streetField, street);
        return this;
    }

    public RegistrationAlternativePage inputCity(String city) {
        webElements.inputText(cityField, city);
        return this;
    }

    public RegistrationAlternativePage selectState(String text) {
        webElements.selectTextInDropDownByText(stateSelect, text);
        return this;
    }

    public RegistrationAlternativePage selectCountry(String text) {
        webElements.selectTextInDropDownByText(countryField, text);
        return this;
    }

    public RegistrationAlternativePage inputPostCode(String postCode) {
        webElements.inputText(postCodeField, postCode);
        return this;
    }

    public RegistrationAlternativePage inputMobilePhone(String phone) {
        webElements.inputText(phoneMobile, phone);
        return this;
    }

    public RegistrationAlternativePage inputAliasAddress(String alias) {
        aliasField.clear();
        aliasField.sendKeys(alias);
        webElements.inputText(aliasField, alias);
        return this;
    }

    public RegistrationAlternativePage clickToButtonSubmitAccount() {
        webElements.clickOnElement(submitButtonAccount);
        return this;
    }

    public RegistrationAlternativePage registrationNewUser(Account account) {
        selectGender(account.getGender());
        inputCustomerFN(account.getFirstCustomerName());
        inputCustomerLN(account.getLastCustomerName());
        inputEmail(account.getEmail());
        inputPassword(account.getPassword());
        selectBirthday(account.getDay());
        selectMonth(account.getMonth());
        selectYear(account.getYear());
        inputFirstName(account.getFistName());
        inputLastName(account.getLastName());
        inputStreet(account.getAddress1());
        inputCity(account.getCity());
        selectState(account.getState());
        inputPostCode(account.getPostCode());
        selectCountry(account.getCountry());
        inputMobilePhone(account.getPhoneNumber());
        inputAliasAddress(account.getAlias());
        return this;
    }
}
