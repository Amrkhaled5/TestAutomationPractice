package MouseEvents;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Practice_4andPractice_6 extends BaseTest {
    @Test(priority = -1)
    public void rightClick(){
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
        WebElement editButton = driver.findElement(By.xpath("//ul/li/span[text()=\"Edit\"]"));

        Actions action=new Actions(driver);
        action.contextClick(rightClickButton).perform();

        editButton.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"clicked: edit");
        alert.accept();
    }
    @Test
    public void doubleClick(){
        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));

        Actions action=new Actions(driver);
        action.doubleClick(rightClickButton).perform();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You double clicked me.. Thank You..");
        alert.accept();
    }
}
