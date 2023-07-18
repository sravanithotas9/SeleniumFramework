package features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

    @Given("^I visit the website as guest user$")





    public void i_visit_the_website_as_guest_user() {
        System.out.println ( ">> - Given - I visit the website as guest user" );
    }
    @When("^I select the books option from the search dropdown$")
    public void i_select_the_books_option_from_the_search_dropdown() {
        System.out.println (">> - When - I select the books option from the search dropdown");
    }
    @When("^I Click on search icon option$")
    public void i_click_on_search_icon_option() {
        System.out.println (">> - When - I Click on search icon option");
    }
    @Then("^I should see the page having headings as Amazon Best Reads is getting displayed$")
    public void i_should_see_the_page_having_headings_as_amazon_best_reads_is_getting_displayed() {
        System.out.println (">> - Then -I should see the page having headings as Amazon Best Reads is getting displayed ");
    }
    @Then("^I should not see the other category products$")
    public void i_should_not_see_the_other_category_products() {
        System.out.println (">> - Then -I should not see the other category products ");
    }
    @When("^I select the baby option from the search dropdown$")
    public void i_select_the_baby_option_from_the_search_dropdown() {
        System.out.println ( ">> - When -I select the baby option from the search dropdown" );
    }

    @Then("^I should see the page having headings as Offers on Baby products is getting displayed$")
    public void i_should_see_the_page_having_headings_as_offers_on_baby_products_is_getting_displayed() {
        System.out.println (">> - Then -I should see the page having headings as Offers on Baby products is getting displayed");
    }
    @Then("^I should not see the other category products$")
    public void I_should_not_see_the_other_category_products() {
        System.out.println (">> - Then -I should not see the other category products");
    }
}
