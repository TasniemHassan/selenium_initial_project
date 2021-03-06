package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        /*
        Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND
US A MESSAGE" form headings
Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading2 as "Contact Us"
And user should be able to see heading4 as "SEND US A MESSAGE"
         */

        WebDriver driver = Driver.getDriver();
        Contact_Us_Page_Navigation.navigateToContactUsPage();


        WebElement heading2 = driver.findElement(By.cssSelector("h2[data-aid='CONTACT_SECTION_TITLE_REND']>span"));
        WebElement heading4 = driver.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));

        if(heading2.getText().equals("Contact Us")) System.out.println("Heading2 validation is passed");
        else throw new NotFoundException("Heading2 is not displayed as expected");
        System.out.println(heading4.getText().equals("SEND US A MESSAGE"));
        System.out.println(heading4.isDisplayed());

        Driver.quitDriver();
    }
}
