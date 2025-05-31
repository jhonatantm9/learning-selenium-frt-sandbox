package pages;

public class SandboxPage extends BasePage {

    public SandboxPage() {
        super(driver);
    }

    public void navigateToFRTSandbox() {
        navigateTo("https://thefreerangetester.github.io/sandbox-automation-testing/");
    }
}
