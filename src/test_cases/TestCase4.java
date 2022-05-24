package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Contact_Us_Page_Navigation;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {


    /*
    Test Case 4: Validate ComfyElite Contact Us page "SEND US A
MESSAGE" form Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And validate "First Name" input box
And validate "Last Name" input box
And validate "Email" input box
And validate "Message" input box
     */
        WebDriver driver = Driver.getDriver();
    Contact_Us_Page_Navigation.navigateToContactUsPage();

    WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
   // WebElement firstNameInputBox = driver.findElement(By.xpath("((//form)[2]/div//input)[1]");
    WebElement firstNameInputBoxText = driver.findElement(By.xpath("//label[text()='First Name*']"));
   // WebElement firstNameInputBoxText = driver.findElement(By.xpath("((//form)[2]/div//label)[1]"));
    WebElement lastNameInputBox = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
    WebElement lastNameInputBoxText = driver.findElement(By.xpath("//label[text()='Last Name*']"));
    WebElement emailInputBox = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
    WebElement emailInputBoxText = driver.findElement(By.xpath("//label[text()='Email*']"));
    WebElement messageInputBox = driver.findElement(By.xpath("//textarea[@data-aid='CONTACT_FORM_MESSAGE']"));

    firstNameInputBox.sendKeys("Tasniem");
    lastNameInputBox.sendKeys("Hassan");
    emailInputBox.sendKeys("hello@gmail.com");
    messageInputBox.sendKeys("TEST MESSAGE");



        System.out.println(firstNameInputBoxText.getText().equals("First Name*") && firstNameInputBox.isDisplayed()
                                ? "First Name input box validation PASSED" : "First Name input box validation FAILED");
        System.out.println(lastNameInputBoxText.getText().equals("Last Name*") && lastNameInputBox.isDisplayed()
                ? "Last Name input box validation PASSED" : "Last Name input box validation FAILED");
        System.out.println(emailInputBoxText.getText().equals("Email*") && emailInputBox.isDisplayed()
                ? "Email input box validation PASSED" : "Email input box validation FAILED");
        System.out.println(messageInputBox.getAttribute("placeholder").equals("Message*") && messageInputBox.isDisplayed()
                ? "Message input box validation PASSED" : "Message input box validation FAILED");

        System.out.println(firstNameInputBox.getAttribute("value").equals("Tasniem")
                ? "Send keys validation PASSED" : "Send keys validation FAILED");
        System.out.println(lastNameInputBox.getAttribute("value").equals("Hassan")
                ? "Send keys validation PASSED" : "Send keys validation FAILED");
        System.out.println(emailInputBox.getAttribute("value").equals("hello@gmail.com")
                ? "Send keys validation PASSED" : "Send keys validation FAILED");
        System.out.println(messageInputBox.getText().equals("TEST MESSAGE")
                ? "Send keys validation PASSED" : "Send keys validation FAILED");


        Driver.quitDriver();

    }
}