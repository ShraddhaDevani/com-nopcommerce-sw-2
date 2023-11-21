package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void WriteDownTheFollowingTestIntoTopMenuTestClass() {
        //click on the ‘Computers’ link
        WebElement computerLink = driver.findElement(By.linkText("Computers"));
        computerLink.click();
        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(actualText, expectedText);


        //click on the ‘Electronics’ link
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        electronicsLink.click();
        //Verify the text ‘Electronics’
        String expectedResult = "Electronics";
        String actualResult = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedResult, actualResult);


        //click on the ‘Apparel’ link
        WebElement apparelLink = driver.findElement(By.linkText("Apparel"));
        apparelLink.click();
        //Verify the text ‘Apparel’
        String expectedOutcome = "Apparel";
        String actualOutcome = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedOutcome, actualOutcome);

        //click on the ‘Digital downloads’ link
        WebElement digitalDownloadsLink = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsLink.click();
        //Verify the text ‘Digital downloads’
        String expectedAnswer = "Digital downloads";
        String actualAnswer = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedAnswer, actualAnswer);

        //click on the ‘Books’ link
        WebElement booksLink = driver.findElement(By.linkText("Books"));
        booksLink.click();
        //Verify the text ‘Books’
        String expectedMessage = "Books";
        String actualMessage = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);

        //click on the ‘Jewelry’ link
        WebElement jewelryLink = driver.findElement(By.linkText("Jewelry"));
        jewelryLink.click();
        //Verify the text ‘Jewelry’
        String expectedMess = "Jewelry";
        String actualMess = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedMess, actualMess);

        //click on the ‘Gift Cards’ link
        WebElement giftCardLink = driver.findElement(By.linkText("Gift Cards"));
        giftCardLink.click();
        //Verify the text ‘Gift Cards’
        String expectedAns = "Gift Cards";
        String actualAns = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedAns, actualAns);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
