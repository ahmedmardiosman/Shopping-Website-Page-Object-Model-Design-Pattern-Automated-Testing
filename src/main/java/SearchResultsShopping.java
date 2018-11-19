import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsShopping {

	

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
	private WebElement gotButton;

	public void selectDress() {

		gotButton.click();

	}
	
	
}
