package MouseEvents;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_7 extends BaseTest {
    @Test
    public void dragDrop() {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement dragElement = driver.findElement(By.xpath("//li/a[text()=\" BANK \"]"));
        WebElement dropPlace = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        WebElement resultTable = driver.findElement(By.id("bal3"));

        Actions action = new Actions(driver);
        action.dragAndDrop(dragElement, dropPlace).perform();

        boolean tableApper=resultTable.isDisplayed();
        Assert.assertTrue(tableApper);
    }
}