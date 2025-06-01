package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SandboxPage;

public class SandboxSteps {
    SandboxPage sandboxPage = new SandboxPage();

    @Given("I navigate to Free Range Testers Sandbox")
    public void iNavigateToFRTSandbox() {
        sandboxPage.navigateToFRTSandbox();
    }

    @When("I click on generate ID and show hidden element")
    public void iClickOnGenerateAndShow() {
        sandboxPage.clickGenerateIdButton();
    }

    @Then("I can see the hidden element with its ID")
    public void iCanSeeHiddenElement() {
        String hiddenText = sandboxPage.getHiddenElementText();
        Assert.assertEquals(hiddenText, "OMG, aparezco después de 3 segundos de haber hecho click en el botón 👻.");
    }
}
