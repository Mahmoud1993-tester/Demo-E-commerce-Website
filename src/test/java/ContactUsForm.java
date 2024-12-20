import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactUsForm {
    WebDriver driver;
    Alert alert;

    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test (priority = 0)
    public void click_contactus_button(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();
    }

    @Test (priority = 1)
    public void enter_name() {
        driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Ahmed");
    }

    @Test (priority = 2)
    public void enter_email() {
        driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("msaber93.egy@gmail.com");
    }

    @Test (priority = 3)
    public void enter_subject() {
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("Problem With Login");
    }

    @Test (priority = 4)
    public void enter_message() {
        driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("I have problem when i try to login! ");
    }

    @Test (priority = 5)
    public void upload_file() {
        driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("D:\\Programming\\Software Testing\\CV template\\Cover Letter.pdf");
    }

    @Test (priority = 6)
    public void click_submit_button() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }

    @Test (priority = 7)
    public void click_ok_button() {
        alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test (priority = 8)
    public void enter_home_button() {
        driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
    }

}
