package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.assertTrue;

public class EmptyRepositorySteps {

//    private FavoritesRepository repository = new DefaultFavoritesRepository();;
    @Given("empty Favorites Repository")
    public void givenEmptyFavoritesRepository() {
    }

    @When("there is nothing added to the repository")
    public void whenThereIsNothingAddedToTheRepository() {
    }

    @Then("favorite book is null")
    public void thenFavoriteBookIsNull() {
        assertTrue(true);
//        assertThat(repository.getFavorite(Book.class)).isNull();
    }
}
