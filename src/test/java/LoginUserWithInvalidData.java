import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUserWithInvalidData {
    WebDriver driver;

    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test (priority = 0)
    public void signup_login_button() {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    @Test (priority = 1)
    public void enter_invalid_values() {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("msaber2020@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("445587f");
    }

    @Test (priority = 2)
    public void click_login() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

}
