package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends MainPage{

    public MyAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//h1[@class='page-heading']")
    public WebElement titleMyAccount;

    @FindBy(xpath = "//a[@class='account']/span")
    public WebElement accountBtn;

    public String checkTitle() {
        WebElement titleElement =
                (new WebDriverWait(webDriver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='page-heading']")));
        return titleMyAccount.getText();
    }

    public boolean checkTitleTextOnPage(String title) {
        webElements.checkTitle(title);
        return true;
    }

    public void checkTitle(boolean actualRes, boolean expectedRes) {
        webElements.check(actualRes, expectedRes);
    }

    public String getAccountName() {
        return accountBtn.getText();
    }
}
