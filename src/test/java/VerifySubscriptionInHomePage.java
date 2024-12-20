import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifySubscriptionInHomePage {

    WebDriver driver;
    WebElement footer;

    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test (priority = 0)
    public void scroll_to_footer() {
        footer = driver.findElement(By.id("footer"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", footer);
    }

    @Test (priority = 1)
    public void enter_email() {
        driver.findElement(By.id("susbscribe_email")).sendKeys("engabosaber2014@gmail.com");
    }

    @Test (priority = 2)
    public void click_submit_button() {
        driver.findElement(By.id("subscribe")).click();
    }

}
