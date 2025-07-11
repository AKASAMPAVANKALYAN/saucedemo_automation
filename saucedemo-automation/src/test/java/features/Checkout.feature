Feature: SauceDemo checkout functionality

  Scenario: Complete purchase with valid credentials and form data
    Given User launches the browser and opens SauceDemo site
    When User logs in with valid credentials
    And User selects product number "5"
    And User fills in checkout details from Excel
    Then User should see the thank you message and logout
