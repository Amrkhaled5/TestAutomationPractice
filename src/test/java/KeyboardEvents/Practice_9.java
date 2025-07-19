package KeyboardEvents;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_9 extends BaseTest {
    @Test
    public void keyboardActions() {
        driver.get("https://demo.guru99.com/test/login.html");
        Actions action = new Actions(driver);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("Ab");

        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("v").sendKeys("v").keyUp(Keys.CONTROL).perform();

        Assert.assertEquals(emailField.getAttribute("value"),"AbAb");
    }
}
