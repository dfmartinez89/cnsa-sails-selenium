package test.ual.cnsa.delia.login;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginKOMailTest {
	private WebDriver driver;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(false);
		driver = new FirefoxDriver(firefoxOptions);
		js = (JavascriptExecutor) driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void loginKOMail() {
		driver.get("http://localhost:1337/login");
		driver.manage().window().setSize(new Dimension(1366, 741));
		driver.findElement(By.xpath("//input[@type=\'email\']")).click();
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("user99@mail.com");
		driver.findElement(By.xpath("//input[@type=\'password\']")).click();
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("1234");
		driver.findElement(By.cssSelector(".button-text")).click();
		assertThat(driver.findElement(By.xpath("//p[@class='text-danger']")).getText(), is(
				"The credentials you entered are not associated with an account. Please check your email and/or password and try again."));
		{
			List<WebElement> elements = driver.findElements(By.cssSelector(".ajax-button"));
			assert (elements.size() > 0);
		}
	}
}