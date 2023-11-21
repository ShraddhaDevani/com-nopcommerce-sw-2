package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToLoginPageSuccessfully() {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Verify the text “Welcome, Please Sign In!”
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Enter the email to email field
        driver.findElement(By.xpath("//input[@class='email'] ")).sendKeys("vinipatel@gmail.com");

        // //Enter the password field
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vini_1234");

        //Click on login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Verify the text “Log out”
        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@href='/logout']")).getText();
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyErrorMessage() {
        //find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("shraddhadevani@gmail.com");

        // //Enter the password field
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shraddha1");

        //Click on login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        //Verify the error message ‘Login was unsuccessful. Please correct the errors and try again.
        //No customer account found’
        String errorMassage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMassage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(actualMassage, errorMassage);
    }

    @After
    public void tearDown() {
        closeBrowser();

    }
}