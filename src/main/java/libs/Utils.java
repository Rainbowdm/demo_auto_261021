package libs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Utils {

    /**
     * Taking screenshot into patch
     *
     * @param patchToScreenShot
     * @param webDriver
     */
    public void screenShot(String patchToScreenShot, WebDriver webDriver) {
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(patchToScreenShot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hardWait(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

