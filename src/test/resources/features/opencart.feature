Feature: Purchase Flow on OpenCart

  Scenario: Complete a purchase as a guest
    Given the "user" has entered the OpenCart homepage
    When I add products to the shopping cart
      | MacBook |
      | iPhone  |
    And I complete the purchase as a guest
    Then a confirmation message should be displayed
