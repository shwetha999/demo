package samplepackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import resuablecode.LaunchBrowser;
import resuablecode.ReadExcel;

import java.io.IOException;


public class LearnmoreSteps extends LaunchBrowser {


    WebElement CategoryEle;

    @Given("User navigates to LearnMore LoginPage")
        public void openURl(){
        driver=new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
    }


//    @When("Enter the username {string} and password {string} credentials")
//    public void enterCredentials() throws IOException {
//
//        driver.findElement(By.id("username")).sendKeys(ReadExcel.getData("Sheet1",0,0));
//        driver.findElement(By.id("password")).sendKeys(ReadExcel.getData("Sheet1",0,1));
//    }


    @And("Click on Login button")
    public void click() {

        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("User validates error message")
    public void validate() {
        String errorMsg= driver.findElement(By.id("errorMessage")).getText();
        System.out.println(errorMsg);
    }


    @Given("User navigates to Amazon homepage")
    public void userNavigatesToAmazonHomepage() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7nz3nh37er_e&adgrpid=1323813657261162&hvadid=82738617292972&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149832&hvtargid=kwd-82739282108858:loc-90&hydadcr=5625_2377262");
    }

    @When("user clicks on baby wishlist")
    public void userClicksOnBabyWishlist() {
        WebElement SignupEle = driver.findElement(By.id("nav-link-accountList"));
        Actions a = new Actions(driver);
        a.clickAndHold(SignupEle).build().perform();
    }

    @When("user selects value from Category dropdown")
    public void userSelectsValueFromCategoryDropdown() {
        CategoryEle = driver.findElement(By.id("searchDropdownBox"));
        Select s = new Select(CategoryEle);
        s.selectByVisibleText("Amazon Pharmacy");
    }

    @And("user extracts values from Category dropdown")
    public void userExtractsValuesFromCategoryDropdown() {
        int catSize = CategoryEle.findElements(By.tagName("option")).size();
        for(int i=0; i<catSize; i++){
            String catValues = CategoryEle.findElements(By.tagName("option")).get(i).getText();
            System.out.println(catValues);
        }
    }

    @Given("user navigates to Amazon homepage")
    public void Homepage() {
        driver =new ChromeDriver();
        driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7nz3nh37er_e&adgrpid=1323813657261162&hvadid=82738617292972&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149832&hvtargid=kwd-82739282108858:loc-90&hydadcr=5625_2377262");
    }

    @Given("Navigate to jquery webpage")
    public void navigateToJqueryWebpage() {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
    }

    @When("user performs drag and drop action")
    public void userPerformsDragAndDropAction() {
        WebElement frameEle = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameEle);
        WebElement dragEle = driver.findElement(By.id("draggable"));
        WebElement dropEle = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(dragEle,dropEle).build().perform();
        driver.switchTo().defaultContent();
    }

    @Then("Validate the title")
    public void validateTheTitle() {
        Actions a = new Actions(driver);
        WebElement BabyEle = driver.findElement(By.xpath("//div[@id='nav-al-wishlist']/descendant::span[3]"));
        a.clickAndHold(BabyEle).build().perform();
        BabyEle.click();

    }

    @When("Enter the credentials")
    public void enterTheCredentials() throws IOException {

            driver.findElement(By.id("username")).sendKeys(ReadExcel.getData("Sheet1",0,0));
            driver.findElement(By.id("password")).sendKeys(ReadExcel.getData("Sheet1",1,0));

    }
}

