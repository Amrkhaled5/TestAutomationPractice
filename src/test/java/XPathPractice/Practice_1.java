package XPathPractice;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_1 extends BaseTest {
    @Test(priority = 0)
    public void editButton(){
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement editbutton = driver.findElement(By.xpath("//tbody/tr[2]/td[6]/a[1]"));
        editbutton.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/tables#edit");
    }

    @Test(priority = 1)
    public void deleteButton(){
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement deletebutton = driver.findElement(By.xpath("//table[1]/tbody/tr[td[text()='jdoe@hotmail.com']]/td[6]/a[2]"));
        deletebutton.click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/tables#delete");
    }
}
