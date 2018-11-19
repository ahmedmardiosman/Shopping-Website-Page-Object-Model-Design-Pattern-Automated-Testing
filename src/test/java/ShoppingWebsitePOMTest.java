import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingWebsitePOMTest {

	private String url = "http://automationpractice.com/index.php";
	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Ahmeds Applications\\chrome driver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	
	@After
	 public void teardown() {
	 driver.quit();
	 }

	@Test
	public void testShoppingSearch() {

		driver.manage().window().maximize();
		driver.get(url);

		//searches and submits request
		ShoppingLandingPage page = PageFactory.initElements(driver, ShoppingLandingPage.class);

		page.searchFor("dress");

		// Selects the dress from next page
		SearchResultsShopping summerDress = PageFactory.initElements(driver, SearchResultsShopping.class);

		summerDress.selectDress();
		
		//Extracts string from Summer Dress page
		SelectedDressPage dressPage = PageFactory.initElements(driver, SelectedDressPage.class);

		assertEquals("Printed Summer Dress", dressPage.getName());

	}

}
