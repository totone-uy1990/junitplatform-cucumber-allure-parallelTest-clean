package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.example.*;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();

    @Given("I navigate to www.freerangetesters.com")
    public void InavifateToFRT() {
        landingPage.navigateToFreeRange();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUser(String section) {
        landingPage.clicklOnSectionNavigationBar(section);
    }

    @And("select Introducción al Testing")
    public void navigateToIntro() {
        cursosPage.clickOnFundamentosDelTestingLink();
       }
}
