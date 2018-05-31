package stepDefinition;

import pageObject.DolceAndGabbanaPO;
import utilities.AllDrivers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DolceAndGabbanaStepdef {
    AllDrivers alldrivers = new AllDrivers();
    DolceAndGabbanaPO homepage = new DolceAndGabbanaPO();

    @Before
            public void startSession(){
        alldrivers.setDriver("chrome");

    }

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        homepage.launchUrl();
        homepage.confirmHomepage();
    }

    @When("^I select brand category from the header$")
    public void i_select_brand_category_from_the_header() throws Throwable {
        homepage.brandCategory();
    }

    @Then("^I should see the list of brands$")
    public void i_should_see_the_list_of_brands() throws Throwable {
        homepage.brandList();

    }

    @Then("^I select DOLCE and GABBANA brand from the list$")
    public void i_select_DOLCE_and_GABBANA_brand_from_the_list() throws Throwable {
        Thread.sleep(5000);
        homepage.dandGtab();
    }

    @Then("^I should see the list of products from DOLCE & GABBANA$")
    public void i_should_see_the_list_of_products_from_DOLCE_GABBANA() throws Throwable {
        homepage.dandGpage();
    }

    @After
    public void closeSession(){
        alldrivers.tearDown();
    }

}
