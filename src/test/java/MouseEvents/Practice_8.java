package MouseEvents;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_8 extends BaseTest {
    @Test
    public void hover() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement img = driver.findElement(By.xpath("//div/div[1]/img"));
        WebElement profileTest = driver.findElement(By.xpath("//div/div[1]/img//../div"));

        Actions action = new Actions(driver);
        action.moveToElement(img).perform();

        boolean profileApper=profileTest.isDisplayed();
        Assert.assertTrue(profileApper);
    }
}
