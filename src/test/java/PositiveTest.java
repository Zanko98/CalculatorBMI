import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void imtLessThen15() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("38");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
    }

    @Test
    public void imt15() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("38.5");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
    }

    @Test
    public void imtMore15() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("39");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
    }
    @Test
    public void imt18point5() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("47.38");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }
    @Test
    public void imtMore18point5() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("48");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }
    @Test
    public void imt25() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("64");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
    }
    @Test
    public void imtMore25() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("65");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }
    @Test
    public void imt30() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("76.8");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
    }
    @Test
    public void imtMore30() {
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("77");
        driver.findElement(By.name("ht")).sendKeys("160");
        driver.findElement(By.cssSelector("[value=Calculate]")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}

