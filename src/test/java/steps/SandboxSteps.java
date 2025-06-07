package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
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

    @When("I enter {string} on input")
    public void iEnterMessageOnInput(String message) {
        sandboxPage.writeMessageOnBoringInput(message);
    }

    @And("I wait a few seconds")
    public void iWaitFewSecond() {
        sandboxPage.waitSeconds(2);
    }

    @Then("I can see the hidden element with its ID")
    public void iCanSeeHiddenElement() {
        String hiddenText = sandboxPage.getHiddenElementText();
        Assert.assertEquals(hiddenText, "OMG, aparezco después de 3 segundos de haber hecho click en el botón 👻.");
    }

    @Then("I can see the value of the input element is {string}")
    public void iSeeValueOfInputElement(String message) {
        String inputValue = sandboxPage.getBoringInputValue();
        Assert.assertEquals(inputValue, message);
    }
}
