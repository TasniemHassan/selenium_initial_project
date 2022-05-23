package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase6 {
    public static void main(String[] args) {
        /*
        Test Case 6: Validate ComfyElite Contact Us page "SEND" buttonGiven user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "SEND" button is displayed and clickable
And validate button text is displayed as “SEND”
         */

    WebDriver driver = Driver.getDriver();
        Contact_Us_Page_Navigation.navigateToContactUsPage();

        WebElement send = driver.findElement(By.cssSelector("button[data-aid='CONTACT_SUBMIT_BUTTON_REND']"));

        System.out.println(send.isDisplayed() && send.isEnabled() && send.getText().equals("SEND")
                ? "Send button validation PASSED" : "Send Button validation FAILED");

        Driver.quitDriver();

    }
}
