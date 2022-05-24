package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase5 {
    public static void main(String[] args) {
        /*
        Test Case 5: Validate ComfyElite Contact Us page "Sign up for our
email list for updates, promotions, and more." Checkbox Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate the "Sign up for our email list for updates, promotions, and more." checkbox


        1. Make sure checkbox is deselected by default
        2. click on it and now it should be selected
        3. click on it again then it should be deselected
         */

        WebDriver driver = Driver.getDriver();
        Contact_Us_Page_Navigation.navigateToContactUsPage();

        WebElement signUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpInput = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        signUp.click();
        System.out.println(signUpInput.isSelected() ? "Sign Up Click validation PASSED" : "Sign Up Click validation FAILED");

        signUp.click();
        System.out.println(!signUpInput.isSelected() ? "Sign Up not clicked validation PASSED" : "Sign Up not clicked validation FAILED");

        Driver.quitDriver();


    }
}
