Feature: As a user,
  I want to be able to see the list of products by Dolce and Gabbana


  Scenario: Dolce and Gabbana
    Given I am on the homepage
    When I select brand category from the header
    Then I should see the list of brands
    And I select DOLCE and GABBANA brand from the list
    Then I should see the list of products from DOLCE & GABBANA

