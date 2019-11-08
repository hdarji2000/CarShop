package Com.StepDefinations;

import Com.Page.SignUp_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class SignUp extends driverClass {


//    public SignUp_Page signUp_page = PageFactory.initElements(driver,SignUp_Page.class);

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {

//        openBrowser();

//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
    }

    @When("^I click on Accept Cookies$")
    public void iClickOnAcceptCookies() {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 500);
        element= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.optanon-allow-all")));
        driver.findElement(By.cssSelector("button.optanon-allow-all")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    @When("^I click on top right menu button$")
    public void iClickOnTopRightMenuButton() {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 500);
        element= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.u-pl:nth-child(5) > a:nth-child(1) > span:nth-child(2)")));
        driver.findElement(By.cssSelector("li.u-pl:nth-child(5) > a:nth-child(1) > span:nth-child(2)")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }

    @And("^I click on Sign up now button$")
    public void iClickOnSignUpNowButton() {
        driver.findElement(By.linkText("Don't have an account? Sign up now")).click();
    }

    @Given("^I enter Firstname as \"([^\"]*)\"$")
    public void iEnterFirstnameAs(String Firstname) throws Throwable {
        driver.findElement(By.id("firstName")).sendKeys(Firstname);
    }

    @And("^I enter Lastname as \"([^\"]*)\"$")
    public void iEnterLastnameAs(String Lastname) throws Throwable {
        driver.findElement(By.id("lastName")).sendKeys(Lastname);
    }

    @And("^I enter Emailadd as \"([^\"]*)\"$")
    public void iEnterEmailaddAs(String Emailadd) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(Emailadd);
    }

    @And("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String Password) throws Throwable {
       driver.findElement(By.id("password")).sendKeys(Password);
    }

    @And("^I enter Confirm Password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String Confpass) throws Throwable {
        driver.findElement(By.id("confirmPassword")).sendKeys(Confpass);
    }

    @When("^I click Sign up button on Sign up page$")
    public void iClickSignUpButtonOnSignUpPage() {
        driver.findElement(By.cssSelector(".c-button")).click();
    }

    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String Message) throws Throwable {
        String actual_pagetitle;
        String expected_Pagetitle = Message;
        actual_pagetitle =driver.findElement(By.cssSelector("p.u-text-center:nth-child(1)")).getText();
        assertEquals(expected_Pagetitle,actual_pagetitle);
    }

    @And("^I click on Sign in button$")
    public void iClickOnSignInButton() {

        driver.findElement(By.linkText("Sign In")).click();
    }

    @Given("^I enter Email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String username) throws Throwable {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @When("^I click Sign in button on Sign in page$")
    public void iClickSignInButtonOnSignInPage() throws InterruptedException {
        driver.findElement(By.cssSelector(".c-button")).click();
        Thread.sleep(500);
    }

    @Given("^I enter Keyword as \"([^\"]*)\"$")
    public void iEnterKeywordAs(String keyword) throws Throwable {
        driver.findElement(By.cssSelector(".c-form-control--lg")).sendKeys(keyword);
        Thread.sleep(500);
    }


    @When("^I click on matches button$")
    public void iClickOnMatchesButton()
    {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, 500);
        element= wait.until(ExpectedConditions.elementToBeClickable(By.className("i-icon  i-icon--angle-right")));
        driver.findElement(By.className("i-icon  i-icon--angle-right")).click();
    }

    @And("^I select \"([^\"]*)\" from sort by Relevance$")
    public void iSelectFromSortByRelevance(String Price) throws Throwable {
        Select selectByValue = new
                Select(driver.findElement(By.name("sortBy")));
        selectByValue.selectByValue("PRICE_DSC");
        selectByValue.selectByVisibleText("Sort by Payment: High - Low");

    }

    @And("^I click on Third car from list$")
    public void iClickOnThirdCarFromList() {
        driver.findElement(By.cssSelector("#YH18FVF > div > div.o-media__body.o-media--middle.c-card > div > strong")).click();
    }

    @And("^I click heart icon on Third available vehicale$")
    public void iClickHeartIconOnThirdAvailableVehical() {
        driver.findElement(By.className("c-option__heart")).click();
    }


    @And("^I click Recently viewed$")
    public void iClickRecentlyViewed() {
        driver.findElement(By.className("ng-binding")).click();
    }

    @Then("^I should see message as \"([^\"]*)\"$")
    public void iShouldSeeMessageAs(String Recent) throws Throwable {

        String actual_pagetitle;
        String expected_Pagetitle = Recent;
        actual_pagetitle =driver.findElement(By.className("u-text-thin  u-text-display-1  u-m-0")).getText();
        assertEquals(expected_Pagetitle,actual_pagetitle);

    }

    @And("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String expected_url) throws Throwable {
        String actual_url;
        actual_url = driver.getCurrentUrl();
        assertEquals(expected_url,actual_url);
    }

    @Given("^I entered Keyword as \"([^\"]*)\"$")
    public void iEnteredKeywordAs(String arg0) throws Throwable {
        driver.findElement(By.name("freeText")).sendKeys("Jaguar");
    }

    @And("^I selected \"([^\"]*)\" from sort by Relevance$")
    public void iSelectedFromSortByRelevance(String arg0) throws Throwable {
        Select selectByValue = new
                Select(driver.findElement(By.name("sortBy")));
        selectByValue.selectByValue("PRICE_ASC");
        selectByValue.selectByVisibleText("Sort by Payment: Low - High");
    }

    @And("^I click on Second car from list$")
    public void iClickOnSecondCarFromList() {
        driver.findElement(By.cssSelector("#OV13AZD > div > div.o-media__body.o-media--middle.c-card > div > strong")).click();
    }


    @And("^I click heart icon on Second available vehicale$")
    public void iClickHeartIconOnSecondAvailableVehicale() {
        driver.findElement(By.className("c-option__heart")).click();
    }
}
