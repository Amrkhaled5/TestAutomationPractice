package XPathPractice;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Practice_3 extends BaseTest {
    @Test
    public void Links(){
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.xpath("//ul/li/a"));
        System.out.println(links.size());
        Assert.assertEquals(links.size(),44);
        for(WebElement l:links){
            System.out.println(l.getText());
        }
    }
}
