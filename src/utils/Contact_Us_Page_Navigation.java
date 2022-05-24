package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Us_Page_Navigation {

    public static void navigateToContactUsPage() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUsLink.click();
        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))
            System.out.println("URL validation PASSED! User navigated to Contact Us page successfully");
        else throw new NotFoundException("User is not routed to Contact Us page");
        //System.out.println("URL validation Failed! User did not navigate to Contact Us page");
    }
}