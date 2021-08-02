package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;


import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {
    	
    	System.out.println("This is the first line. User is on the login page");
      
    }

    @When("^user clicks on the credentials textfield$")
    public void user_clicks_on_the_credentials_textfield() throws Throwable {
    	System.out.println("This is the Second line. user clicks on the credentials textfield");
        
        
    }

    @Then("^Credentials are entered successfuly$")
    public void credentials_are_entered_successfuly() throws Throwable {
    	System.out.println("This is the Third line. Credentials are entered successfuly");

    }

    @And("^User enters \"([^\"]*)\" as employeeid and \"([^\"]*)\" as stream$")
    public void user_enters_something_as_employeeid_and_something_as_stream(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Emp id: "+strArg1+" Domain: "+strArg2);
    }

    @And("^click on submit$")
    public void click_on_submit() throws Throwable {
    	System.out.println("This is the fifth line. submit button is clicked");

    }
    
    @Given("^User iis on the login page$")
    public void user_iis_on_the_login_page() throws Throwable {
    	System.out.println("This is the sixth line. submit button is clicked");
 
    }

    @When("^uuser clicks on the credentials textfield$")
    public void uuser_clicks_on_the_credentials_textfield() throws Throwable {
    	System.out.println("This is the seventh line. submit button is clicked");

    
    }

    

    @And("^User enters (.+)  (.+)  (.+) (.+) (.+)$")
    public void user_enters(String name, String age, String emailid, String phone, String pincode) throws Throwable {
    	System.out.println("Name:" +name);
    	System.out.println("Age:" +age);
    	System.out.println("Email:" +emailid);
    	System.out.println("Phone:" +phone);
    	System.out.println("Pin:" +pincode);
    }


        
    }


