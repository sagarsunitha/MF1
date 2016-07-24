import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by NSAI on 19/05/2016.
 */
public class MyStepdefs {
    @Given("^user should be on Homepage$")
    public void userShouldBeOnHomepage() throws Throwable {
            }

    @When("^user search for the \"([^\"]*)\"$")
    public void userSearchForThe(String arg0) throws Throwable {

    }

    @Then("^user should be able to see the respective\"([^\"]*)\" results$")
    public void userShouldBeAbleToSeeTheRespectiveResults(String arg0) throws Throwable {

    }

    @Given("^user should be on HomePage$")
    public void userShouldBeOnHomePage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user selects the \"([^\"]*)\" from the results$")
    public void userSelectsTheFromTheResults(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user selects the appropriate size$")
    public void userSelectsTheAppropriateSize() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user adds the \"([^\"]*)\" in the Bag$")
    public void userAddsTheInTheBag(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user should be able to see the respective \"([^\"]*)\"in the Bag$")
    public void userShouldBeAbleToSeeTheRespectiveInTheBag(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
