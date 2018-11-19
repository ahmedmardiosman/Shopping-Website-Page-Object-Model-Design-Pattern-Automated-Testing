import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectedDressPage {

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
	private WebElement getNameOfDress;

	public String getName() {

		return getNameOfDress.getText();

	}

}
