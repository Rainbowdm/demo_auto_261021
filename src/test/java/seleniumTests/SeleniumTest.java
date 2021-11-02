package seleniumTests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    WebDriver webDriver;
    Logger logger;

    @Test
    public void test() {
        logger = Logger.getLogger(getClass());
        File fileChrome = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChrome.getAbsolutePath());
        webDriver = new ChromeDriver();
        logger.info("Get chromedriver");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.selenium.dev/");
        webDriver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[3]/a/span")).click();
        logger.info("Open link: https://www.selenium.dev/downloads/");
        Assert.assertEquals(
                "Downloads",
                webDriver.findElement(By.xpath("//*[@id='td-cover-block-0']/div/div/div/div/h1")).getText());

        webDriver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[5]/a/span")).click();
        logger.info("Open link: https://www.selenium.dev/projects/");
        Assert.assertEquals(
                "Selenium Projects",
                webDriver.findElement(By.xpath("//*[@id='td-cover-block-0']/div/div/div/div/h1")).getText());
        webDriver.findElement(By.xpath("//*[@id='main_navbar']/ul/li[6]/a/span")).click();
        logger.info("Open link: https://www.selenium.dev/support/");
        Assert.assertEquals(
                "Getting Help",
                webDriver.findElement(By.xpath("//*[@id='td-cover-block-0']/div/div/div/div/h1")).getText());
//       List<WebElement> elements = webDriver.findElements(By.xpath("//*[@id='main_navbar']/ul/li"));
        List<WebElement> elements = webDriver.findElements(By.xpath("//*[@id='main_navbar']/ul/li/a/span"));
        logger.info("Number of elements: " + elements.size());
        for (int i = 0; i < elements.size(); i++) {
            logger.info("Values: " + elements.get(i).getText());
        }
        webDriver.quit();
        logger.info("Close browser");
    }
}
