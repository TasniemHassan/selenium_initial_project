package test_cases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {
/*
Test Case 1: Validate ComfyElite Contact Us Page heading section Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see ComfyElite logo
And user should be able to see heading2 as “High quality comfy pillows and accessories for
travel, office and home.”
 */

        WebDriver driver = Driver.getDriver();
        Contact_Us_Page_Navigation.navigateToContactUsPage();

        WebElement logo = driver.findElement(By.id("n-48560"));
        WebElement heading2 = driver.findElement(By.id("dynamic-tagline-48605"));

        System.out.println(logo.isDisplayed());
        System.out.println(heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home."));
        System.out.println(heading2.isDisplayed());

    Driver.quitDriver();

    }
}
