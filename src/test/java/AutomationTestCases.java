import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationTestCases {

    public WebDriver driver;



    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void Login_to_the_ecommerce_application() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(10000);
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='title']")).getText(), "Products");

    }

    @Test
    public void Shop_new_product() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(10000);
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='title']")).getText(), "Productss");

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
