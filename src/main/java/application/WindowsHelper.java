package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collection;

public class WindowsHelper extends HelperBase {
    public WindowsHelper(WebDriver wd) {
        super(wd);
    }

    public void selectBrowserWindows() {
        click(By.xpath("//span[.='Browser Windows']"));
    }


    public String getTextNewTab() {
        return wd.findElement(By.id("sampleHeading")).getText();
    }

    public String getTextNewWindow() {
        return wd.findElement(By.id("sampleHeading")).getText();
    }

    public String getTextMassage() {
        return wd.findElement(By.xpath("//body[contains(.,'Knowledge increases ')]")).getText();
    }
}

