package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Books_Computing_and_internet_Page extends BasePage {
	public Books_Computing_and_internet_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[@value=\"Add to cart\"])[1]")
	private WebElement addtocart_button;

	public WebElement getAddtocart_button() {
		return addtocart_button;
	}

}
