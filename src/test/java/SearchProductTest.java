import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchProductTest {
    WebDriver driver;

    @BeforeTest
    public void prepare() {
        driver = new ChromeDriver();
        driver.get("http://automationexercise.com");
    }

    @Test(priority = 0)
    public void click_on_products_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
    }

    @Test (priority = 1)
    public void enter_product_name_in_search() {
        driver.findElement(By.id("search_product")).sendKeys("Men Tshirt");
    }

    @Test (priority = 2)
    public void click_on_search_button() {
        driver.findElement(By.id("submit_search")).click();
    }
}
