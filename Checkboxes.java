package Day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Checkboxes {

        WebDriver driver;


        @BeforeSuite
        public void setup(){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Family\\IdeaProjects\\Day5\\src\\main\\resources\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }




    @Test
    public void test001() {
        System.out.println("fdgvdf");
        String url = "http://the-internet.herokuapp.com/checkboxes";

        driver.get(url);

        WebElement checkbox1 = driver.findElements(By.tagName("input")).get(0);
        WebElement checkbox2 = driver.findElements(By.tagName("input")).get(1);

        String checkbox1Attribute =  checkbox1.getAttribute("checked");

        Assert.assertNull(checkbox1Attribute);

        checkbox1.click();

        String checkbox1Attribute2 = checkbox1.getAttribute("checked");

        Assert.assertEquals(checkbox1Attribute2, "true");

    }

}
