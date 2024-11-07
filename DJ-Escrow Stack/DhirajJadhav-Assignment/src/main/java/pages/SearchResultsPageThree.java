package pages;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//span[text()='Leather']")
    private WebElement leatherFilter;

    @FindBy(xpath = "//span[@class='a-size-base a-color-base'][text()='Fastrack']")
    private WebElement fastrackFilter;

    @FindBy(xpath = "//a[contains(text(),'2')]")
    private WebElement pageTwoLink;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    private WebElement firstProduct;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void applyLeatherFilter() throws InterruptedException {
        Thread.sleep(20);
        click(leatherFilter);
    }

    public void applyFastrackFilter() throws InterruptedException {
        Thread.sleep(20);
        click(fastrackFilter);
    }

    public void goToSecondPage() throws InterruptedException {
        Thread.sleep(20);
        click(pageTwoLink);
    }

    public void selectFirstProduct() throws InterruptedException {
        Thread.sleep(20);
        click(firstProduct);
    }
}
