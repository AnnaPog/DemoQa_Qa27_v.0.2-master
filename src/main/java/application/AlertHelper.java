package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AlertHelper extends HelperBase{
    public AlertHelper(WebDriver wd) {
        super(wd);
    }

    public void selectItemAlert() {
        hideFooter();
        hideADS();
        pause(1000);
        //click(By.xpath("//div/h5[.='Alerts, Frame & Windows']"));
        click(By.xpath("//div[@class='category-cards']/div[3]"));

    }

    public void selectAlerts() {
        hideFooter();
        pause(2000);
        click(By.xpath("//span[text()='Alerts']"));
    }

    public void clickNewWindow() {
        click(By.id("tabButton"));
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));

    }

    public void clickToSeeAlert() {
        click(By.id("alertButton"));
        wd.switchTo().alert().accept();
    }

    public void confirmAlert(String text) {
        click(By.id("confirmButton"));
        pause(4000);
        if(text!= null && text.equals("Cancel")){
            wd.switchTo().alert().dismiss();
        }else if(text != null && text.equals("Ok"))
            wd.switchTo().alert().accept();
    }

    public String confirmResult(){
        return wd.findElement(By.id("confirmResult")).getText();
    }
}
