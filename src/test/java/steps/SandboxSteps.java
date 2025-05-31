package steps;

import io.cucumber.java.en.Given;
import pages.SandboxPage;

public class SandboxSteps {
    SandboxPage sandboxPage = new SandboxPage();

    @Given("I navigate to Free Range Testers Sandbox")
    public void iNavigateToFRTSandbox() {
        sandboxPage.navigateToFRTSandbox();
    }
}
