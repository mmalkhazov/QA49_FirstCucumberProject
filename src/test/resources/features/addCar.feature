Feature:AddCar

@addCar
Scenario: Add Car for renting
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Ok button
    And User clicks on Let the car work link
    And User enters car valid data
    Then User verifies Car added message is displayed