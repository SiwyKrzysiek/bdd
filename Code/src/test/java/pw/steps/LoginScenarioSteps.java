package pw.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pw.models.UserDatabase;

public class LoginScenarioSteps {

    private UserDatabase userDatabase;
    private String login;
    private String password;

    @Given("User being on the login screen")
    public void connectToDataBase() {
        this.userDatabase = UserDatabase.getInstance();
    }

    @When("user enters existing <login>")
    public void enterLogin(@Named("login") String login) {
        this.login = login;
    }

    @When("user enters valid <password>")
    public void enterPassword(@Named("password") String password) {
        this.password = password;
    }

    @When("user presses login button")
    public void pressLoginButton() {}

    @Then("login is validated correctly")
    public void validateLogin() {
//        WHY THERE IS NO JUNIT HERE?!!!
    }
}
