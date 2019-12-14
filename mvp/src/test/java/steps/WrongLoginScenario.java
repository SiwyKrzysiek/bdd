package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pw.models.UserDatabase;

import static org.junit.Assert.assertFalse;

public class WrongLoginScenario {
    private UserDatabase userDatabase;
    private String login;
    private String password;

    @Given("User being on the login screen")
    public void connectToDataBase() {
        this.userDatabase = UserDatabase.getInstance();
    }

    @When("user enters not existing <login> and <password>")
    public void enterLogin(@Named("login") String login, @Named("password") String password) {
        this.login = login;
        this.password = password;
    }

    @Then("login is not validated")
    public void validateLogin() {
        assertFalse(userDatabase.isLoginDataValid(login, password));
    }
}
