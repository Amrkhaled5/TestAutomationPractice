package XPathPractice;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_2 extends BaseTest {
    @Test
    public void addToCart(){
        driver.get("http://opencart.abstracta.us/index.php?rout=product/category&path=24");
        WebElement addtoCart = driver.findElement(By.xpath("//a[text()='iPhone']//..//..//..//span[text()=\"Add to Cart\"]"));
        addtoCart.click();

    }
}
