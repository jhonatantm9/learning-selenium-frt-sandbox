package pages;

public class SandboxPage extends BasePage {

    private String sandboxUrl = "https://thefreerangetester.github.io/sandbox-automation-testing/";

    private String generateIdButton = "//button[normalize-space()='Hacé click para generar un ID dinámico y mostrar el elemento oculto']";
    private String hiddenElement = "//p[@id='hidden-element']";

    public SandboxPage() {
        super(driver);
    }

    public void navigateToFRTSandbox() {
        navigateTo(sandboxUrl);
    }

    public void clickGenerateIdButton() {
        clickElement(generateIdButton);
    }

    public String getHiddenElementText() {
        return getTextFromElement(hiddenElement);
    }
}
