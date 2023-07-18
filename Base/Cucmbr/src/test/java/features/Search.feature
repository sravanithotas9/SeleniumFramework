Feature: Search of various product categories should be possible along with product search

  It is good to provide an option to our end users where they can search for the products based on their category,
  rather than only searching a product.This will increase our business and make end users happy.

  Scenario: User Should be able to search for the products under books category
    Given I visit the website as guest user
    When  I select the books option from the search dropdown
    And   I Click on search icon option
    Then  I should see the page having headings as Amazon Best Reads is getting displayed
    But   I should not see the other category products

  Scenario: User Should be able to search for the products under baby category
    Given I visit the website as guest user
    When  I select the baby option from the search dropdown
    And   I Click on search icon option
    Then  I should see the page having headings as Offers on Baby products is getting displayed
    But   I should not see the other category products


