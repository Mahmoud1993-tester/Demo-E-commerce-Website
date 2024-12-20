import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterUserWithExistingEmail {
    WebDriver driver;

    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test(priority = 0)
    public void signup_login_button() {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    @Test (priority = 1)
    public void enter_username_and_email_in_signup() {
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Ali");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("fivixip128@kelenson.com");
    }


    @Test (priority = 2)
    public void click_on_signup_Button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    }
}
