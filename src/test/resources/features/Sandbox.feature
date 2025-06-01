Feature: Test different web elements

    This feature aims to test the combination of Selenium, Cucumber to interact with different web elements

    Background: I am on the Free Range Testers Sandbox
        Given I navigate to Free Range Testers Sandbox

    Scenario: View the hidden element
        When I click on generate ID and show hidden element
        Then I can see the hidden element with its ID