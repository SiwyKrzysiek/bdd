package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pw.models.Exchange;

import static org.junit.Assert.assertEquals;

public class CurrencyChangeSteps {
    private double want_to_change_balance;
    private String currency;
    private double changed_balance;

    @Given("User account having <want_to_change_balance> founds")
    public void setStartingBalance(@Named("want_to_change_balance") double balance) {
        this.want_to_change_balance = balance;
    }

    @When("user picks <currency>")
    public void setCurrency(@Named("currency") String currency) {
        this.currency = currency;
    }

    @Then("show how much <changed_balance> of foreign money user will have")
    public void showMeSomeMoney(@Named("changed_balance") double changed_balance) {
        this.changed_balance = Exchange.exchange(this.want_to_change_balance, this.currency);
        assertEquals(this.changed_balance, changed_balance, 1);
    }
}
