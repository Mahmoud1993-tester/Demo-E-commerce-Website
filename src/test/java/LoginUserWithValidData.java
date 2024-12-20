import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUserWithValidData {
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
    public void enter_valid_values() {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("fivixip128@kelenson.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("445500ss");
    }

    @Test (priority = 2)
    public void click_login() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    @Test (priority = 3)
    public void delete_account() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }
}
