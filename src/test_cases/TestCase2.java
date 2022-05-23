package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase2 {
    public static void main(String[] args) {
        /*
        Test Case 2: Validate ComfyElite Contact Us page "Connect With Us"
sectionGiven user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading1 as "Connect With Us"
And user should be able to see “Facebook” icon and hyperlink reference for it should be
“https://www.facebook.com/103179127717601”
And user should be able to see “Instagram” icon and hyperlink reference for it should be
“https://www.instagram.com/comfyelite”
         */

        WebDriver driver = Driver.getDriver();
        Contact_Us_Page_Navigation.navigateToContactUsPage();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));
        WebElement fBookIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        WebElement fBookLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/103179127717601']"));
        WebElement instagramIcon = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
        WebElement instagramLink = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/comfyelite']"));

        System.out.println(heading1.getText().equals("Connect With Us") ? "Connect With Us heading1 validation PASSED" :"Connect With Us heading1 validation FAILED");
        System.out.println(fBookIcon.isDisplayed() ? "Facebook icon validation: PASSED" :"Facebook icon validation: FAILED" );
        System.out.println(fBookLink.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "Facebook hyperlink validation PASSED" : "Facebook hyperlink validation FAILED");
        System.out.println(instagramIcon.isDisplayed() ? "Instagram icon validation: PASSED" :"Instagram icon validation: FAILED");
        System.out.println(instagramLink.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "Instagram logo validation PASSED" : "Instagram logo validation FAILED");

        Driver.quitDriver();
    }
}
