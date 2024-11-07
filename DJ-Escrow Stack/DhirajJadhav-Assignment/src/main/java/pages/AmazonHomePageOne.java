package pages;
import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {


    @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
    private WebElement searchBox;

    @FindBy(xpath ="//input[@id='nav-search-submit-button']")
    private WebElement searchButton;



    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String product) throws InterruptedException {
        Thread.sleep(20);
        sendKeys(searchBox, product);
        click(searchButton);
    }
}