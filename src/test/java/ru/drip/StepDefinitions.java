package ru.drip;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by apodoplelov on 28.06.17.
 */
public class StepDefinitions {

    private WebDriver driver = null;

    @Given("^No food in fridge$")
    public void no_food_in_fridge() throws Throwable {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        //final FirefoxProfile firefoxProfile = new FirefoxProfile();
        //firefoxProfile.setPreference("xpinstall.signatures.required", false);
        System.setProperty("webdriver.gecko.driver", "/Users/apodoplelov/Frameworks/gecko/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        //driver = new ChromeDriver(capabilities);
        driver = new FirefoxDriver(capabilities);
        //driver = new FirefoxDriver(capabilities);
        driver.get("https://www.google.ru");
    }

    @When("^Early morning$")
    public void early_morning() throws Throwable {
        driver.findElement(By.id("dummy")).click();
    }

    @Then("^Wake up angry$")
    public void wake_up_angry() throws Throwable {
    }

}
