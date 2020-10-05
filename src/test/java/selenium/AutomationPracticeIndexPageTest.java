package selenium;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeIndexPageTest {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 768));
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(5000);
        WebElement tShirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
        tShirt.click();
        Thread.sleep(5000);
        WebElement purchase = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
        purchase.click();
        Thread.sleep(5000);
        String productName = "Faded Short Sleeve T-shirts";
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        addToCart.click();
        Thread.sleep(10000);
        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
        proceedToCheckout.click();
        Thread.sleep(10000);
//        String searchTerm = "Printed";
//        searchBar.sendKeys(searchTerm);
//        searchBar.submit();
//
//        List<WebElement> products = driver.findElements(By.className("ajax_block_product"));
//        for(WebElement product: products) {
//            String productName = product.findElement(By.className("product-name")).getText();
//            if (!productName.contains(searchTerm)) {
//                fail("Non-relevant item returned");
//            }
//        }
    }

    @After
    public void tearDown() {
        driver.close();
    }
}