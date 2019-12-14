package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import pw.models.Account;

public class MoneyWithdrawSteps {

    private Account account;

    @Given("User account having <balance> founds")
    public void initializeAccount(@Named("balance") Integer balance) {
        account = new Account(balance);
    }

    @When("user withdraws <take> money")
    public void withdrawMoney(@Named("take") Double take) {
        account.withdraw(take);
    }

    @Then("account balance is <final_balance>")
    public void checkFinalBalance(@Named("final_balance") Double finalBalance) {
        Assert.assertEquals(finalBalance, account.getBalance(), 1.0);
    }
}
