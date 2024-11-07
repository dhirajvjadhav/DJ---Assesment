package org.example;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import pages.SearchResultsPage;
import pages.ProductPage;

public class AmazonWristWatchTest extends BaseTest {

    @Test
    public void testAddWristWatchToCart() throws InterruptedException {
        driver.get("https://amazon.in/");
        Thread.sleep(20);

        AmazonHomePage homePage = new AmazonHomePage(driver);
        Thread.sleep(20);
        homePage.searchProduct("Wrist Watches");

        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        resultsPage.applyLeatherFilter();
        resultsPage.applyFastrackFilter();
        resultsPage.goToSecondPage();
        resultsPage.selectFirstProduct();
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }
}