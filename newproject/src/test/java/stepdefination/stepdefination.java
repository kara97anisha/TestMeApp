package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination {

	 @When("^Larry increase the headphone quantity by 2$")
	 public void Larry_Increase_the_headphone_quantity_by_2()
	 {
		 System.out.println("Test is passed");
	 }

		@When("^continue for checkout$")
		public void continue_for_checkout()
		{
			System.out.println("Test is passed");
		}

		@When("^change the shipping address to a new address for Pune$")
		 public void change_the_shipping_address_to_a_new_address_for_Pune()
		 {
			System.out.println("Test is passed");
			
		 }

		@Then("^The product should be delivered to the new address$")
		  public void The_product_should_be_delivered_to_the_new_address()
		  {
			System.out.println("Test is passed");
		  }
}
