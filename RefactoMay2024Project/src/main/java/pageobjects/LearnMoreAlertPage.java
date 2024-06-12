package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LearnMoreAlertPage {
    WebDriver driver;

    public LearnMoreAlertPage(WebDriver driver){
        this.driver =driver;
    }

    public void clickConfirmBoxButton(){
        driver.findElement(By.xpath("//div[@id='CancelTab']/child::button")).click();

    }
    public String getAlertBoxText(){
       return driver.switchTo().alert().getText();

    }
    public void clickCancelAlert(){

        driver.switchTo().alert().dismiss();
    }
    public void clickOkAlert(){

        driver.switchTo().alert().dismiss();
    }

    public String getCancelTextMessageFromUI(){

       String val = driver.findElement(By.cssSelector("#demo")).getText();
           return val;
    }


}
