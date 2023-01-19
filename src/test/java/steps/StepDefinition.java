package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @And("User open website")
    public void user_open_website(){
        System.out.println("Open Website");
    }

    @And("verify user is on login page")
    public void verify_user_is_on_logic_page(){
        System.out.println("Do Login");

    }
    @And("User enter the valid credentials")
    public void user_enter_the_valid_credentials(){
        System.out.println("Enter valid credentials");

    }
    @Then("Verify home page is displayed")
    public void verify_home_page_is_displayed(){
        System.out.println("Verify Login successful");

    }
    @When("user enter the invalid credentials")
    public void user_enter_the_invalid_credentials() {
    }
    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {
    }


    @Then("Verify user is on login page")
    public void verify_user_is_on_login_page() {
    }

    @When("User search with TV")
    public void user_search_with_tv() {
        
        
    }
    @Then("Verify user is on product listing page")
    public void verify_user_is_on_product_listing_page() {
        
        
    }
    @When("User click on the first product from the list")
    public void user_click_on_the_first_product_from_the_list() {
        
        
    }
    @Then("Verify user is on product detail page")
    public void verify_user_is_on_product_detail_page() {
        
        
    }
    @When("User click on add to cart button")
    public void user_click_on_add_to_cart_button() {
        
        
    }
    @Then("Verify cart page is displayed")
    public void verify_cart_page_is_displayed() {
        
        
    }
    @Then("Verify item on the cart page")
    public void verify_item_on_the_cart_page() {
    }

    @When("User remove item from the cart")
    public void user_remove_item_from_the_cart() {

    }
    @Then("Verify no item present in the cart")
    public void verify_no_item_present_in_the_cart() {

    }
    @When("User change quantity of the item")
    public void user_change_quantity_of_the_item() {

    }
    @Then("Verify total quantity updated on the cart")
    public void verify_total_quantity_on_the_cart() {

    }
}
