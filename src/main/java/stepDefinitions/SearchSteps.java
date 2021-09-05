package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.text.html.ListView;
import java.awt.*;
import java.util.List;

public class SearchSteps extends CommonFunctions {

    @Given("I open home page {String}")
    public void IOpenHomePage(String url) {
        driver.get(url);
        WebElement homepageVerEle = driver.findElement(By.xpath("//*[@id=\"header-logo\"]"));
        Assert.assertTrue(homepageVerEle.isDisplayed());
    }

    @When("I enter search product name{String}")
    public void entersearchProduct(String searchproduct) {
        driver.findElement(By.xpath("//*[@id=\"sli_search_1\"]")).sendKeys(searchproduct);
    }

    @When(" I click search icon")
    public void clicksearchicon() {
        driver.findElement(By.xpath("//*[@id=\"newsearch\"]/input[4]")).click();

    }

    @Then("I should be able to be  redirected to relevant search results page{String}")
    public void verifysearchresultspage(String expectedresultspage) {
        String actualresultspage = driver.findElement(By.xpath("//*[@id=\"ResultHeader\"]/div[1]/h1/div")).getText();
        Assert.assertEquals(expectedresultspage, actualresultspage);

    }


    @Then("i should see list of relevant results{String}")
    public void iShouldSeeListOfRelevantResults(String searchProducttermexpected) {
        List<WebElement> actualproducts = driver.findElement(By.xpath("//*[@id=\"i1\"]/section/div[1]/h2/a/span"));


        for (WebElement actualProduct : actualproducts) {
            Assert.assertTrue(actualProduct.getText().contains(searchProducttermexpected));

        }

    }
}