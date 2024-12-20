import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddProductsInCart {
    WebDriver driver;
    WebElement secondProduct;
    Actions actions;
    WebElement scroll_to_add_cart;

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
    public void hover_and_click_on_add_to_cart_button() {
        secondProduct = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]"));
        actions = new Actions(driver);
        actions.moveToElement(secondProduct).perform();
    }



    @Test (priority = 2)
    public void scroll_to_add_to_cart_button() {
        scroll_to_add_cart = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scroll_to_add_cart);
    }

    @Test (priority = 3)
    public void click_add_to_cart_button() {
        scroll_to_add_cart.click();
    }
}
