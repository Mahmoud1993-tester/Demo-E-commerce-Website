import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTestCasePage {
    WebDriver driver;
    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test (priority = 0)
    public void click_on_test_cases_button() {
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
    }
}
