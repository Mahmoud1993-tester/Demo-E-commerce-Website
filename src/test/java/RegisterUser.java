import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterUser {

    ChromeDriver driver;
    WebElement day_dropdown;
    WebElement month_dropdown;
    WebElement years_dropdown;
    WebElement country_dropdown;
    Select select_day;
    Select select_month;
    Select select_year;
    Select select_country;


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
    public void enter_username_and_email_in_signup() {
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Ahmed");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("fivixip128@kelenson.com");
    }


    @Test (priority = 2)
    public void click_on_signup_Button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    }

    @Test (priority = 3)
    public void fill_fields_title_and_password() {
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("445500ss");

    }

    @Test (priority = 4)
    public void setSelect_day() {
        day_dropdown= driver.findElement(By.id("days"));
        select_day = new Select(day_dropdown);
        select_day.selectByValue("29");
    }

    @Test (priority = 5)
    public void setSelect_month() {
        month_dropdown= driver.findElement(By.id("months"));
        select_month = new Select(month_dropdown);
        select_month.selectByValue("9");
    }

    @Test (priority = 6)
    public void setSelect_year() {
        years_dropdown = driver.findElement(By.id("years"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", years_dropdown);
        select_year = new Select(years_dropdown);
        select_year.selectByValue("1993");

    }

    @Test (priority = 7)
    public void  select_checkbox_After_this() {
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
    }

    @Test (priority = 8)
    public void filling_names_company_address_fields () {
        driver.findElement(By.id("first_name")).sendKeys("Ahmed");
        driver.findElement(By.id("last_name")).sendKeys("Saber");
        driver.findElement(By.id("company")).sendKeys("Glass Tec");
        driver.findElement(By.id("address1")).sendKeys("Fifth Avenue");
        driver.findElement(By.id("address2")).sendKeys("NewYork");


    }

    @Test (priority = 9)
    public void select_country() {
        country_dropdown = driver.findElement(By.id("country"));
        select_country = new Select(country_dropdown);
        select_country.selectByValue("United States");

    }

    @Test (priority = 10)
    public void enter_state() {
        driver.findElement(By.id("state")).sendKeys("Brooklyn");
    }

    @Test (priority = 11)
    public void enter_city() {
        driver.findElement(By.id("city")).sendKeys("NewYork");
    }

    @Test (priority = 12)
    public void enter_zipcode() {
        driver.findElement(By.id("zipcode")).sendKeys("11203");
    }

    @Test (priority = 13)
    public void enter_mobile_number() {
        driver.findElement(By.id("mobile_number")).sendKeys("(555) 123-4567");
    }

    @Test (priority = 14)
    public void click_create_account() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
    }

    @Test (priority = 15)
    public void click_continue_button() {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }

}
