package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pw.models.Currencies;

public class CurrencyChangeSteps {
    private double want_to_change_balance;
    private String currency;
    private double changed_balance;

    @Given("User account having <want_to_change_balance> founds")
    public void setStartingBalance(double balance) {
        this.want_to_change_balance = balance;
    }

    @When("user picks <currency>")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Then("show how much <changed_balance> of foreign money user will have")
    public void showMeSomeMoney() {
        double money = 0;
        switch (currency) {
            case "USD":
                money = want_to_change_balance * Currencies.USD.getVal();
                break;

            case "EUR":
                money = want_to_change_balance * Currencies.EUR.getVal();
                break;

            case "GPB":
                money = want_to_change_balance * Currencies.GPB.getVal();
                break;

            case "CHF":
                money = want_to_change_balance * Currencies.CHF.getVal();
                break;

            case "BTC":
                money = want_to_change_balance * Currencies.BTC.getVal();
                break;
        }
        this.changed_balance = money;
    }
}
