package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents GooglePage.
 *
 * @author Bharathish
 */
public class GooglePage extends BasePage {
	
	/** The searchinput. */
	@FindBy(name = "q")
	private WebElement searchinput;
	@FindBy(linkText = "News")
	private WebElement news;
	@FindBy(linkText = "Images")
	private WebElement images;	
	@FindBy(linkText = "Videos")
	private WebElement videos;
	@FindBy(linkText = "Maps")
	private WebElement maps;
	

	/**
	 * Instantiates a new google page.
	 *
	 * @param driver the driver
	 */
	public GooglePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Searches the given text.
	 *
	 * @param key the key
	 */
	public void searchText(String key) {
		searchinput.sendKeys(key + Keys.ENTER);
		
	}

	public void checkNews() {
		news.click();
	}

	public void checkImages() {
		images.click();
	}

	public void checkVideos() {
		videos.click();
	}

	public void checkMaps() {
		maps.click();
	}
	
}
