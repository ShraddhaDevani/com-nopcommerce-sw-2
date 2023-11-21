package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.xpath("//a[@class= 'ico-register']"));
        registerLink.click();

        //Verify the text “Register”
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        WebElement registerLink = driver.findElement(By.xpath("//a[@class= 'ico-register']"));
        registerLink.click();

        //Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']"));

        //Enter First name
        driver.findElement(By.xpath("//input[starts-with(@id, 'FirstName')]")).sendKeys("vini");

        //Enter Last name
        driver.findElement(By.xpath("//input[contains(@id, 'LastName')]")).sendKeys("patel");

        //select Day
        driver.findElement(By.xpath("//select[@name= 'DateOfBirthDay']")).sendKeys("10");

        //select Month
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("August");

        //select Year
        driver.findElement(By.xpath("//select[@name= 'DateOfBirthYear']")).sendKeys("1983");

        //Enter the email address
        driver.findElement(By.xpath("//input[@id= 'Email'] ")).sendKeys("vinishah10@gmail.com");

        //Enter the Company details
        driver.findElement(By.xpath("//input[@id='Company'] ")).sendKeys("maza");

        // //Enter the password field
        driver.findElement(By.xpath("//input[@type= 'password'][@id= 'Password']")).sendKeys("shah_1234");

        // //Enter the password field
        driver.findElement(By.xpath("//input[@type= 'password'][@id= 'ConfirmPassword']")).sendKeys("shah_1234");

        //click on the ‘Register’ link
        driver.findElement(By.xpath("//button[starts-with(@name, 'register-button')]")).click();

        //Verify the text “Your registration completed”
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class= 'result']")).getText();
        Assert.assertEquals(actualText, expectedText);

    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}


