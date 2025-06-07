package pages;

public class SandboxPage extends BasePage {

    private String sandboxUrl = "https://thefreerangetester.github.io/sandbox-automation-testing/";

    private String generateIdButton = "//button[normalize-space()='Hacé click para generar un ID dinámico y mostrar el elemento oculto']";
    private String hiddenElement = "//p[@id='hidden-element']";
    private String boringInput = "//input[@id='formBasicText']";

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

    public void writeMessageOnBoringInput(String message) {
        write(boringInput, message);
    }

    public void waitSeconds(int seconds) {
        pause(seconds);
    }

    public String getBoringInputValue() {
        return getValueFromElement(boringInput);
    }
}
