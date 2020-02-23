@ProductsPurchaseTransaction
Feature: Products purchase in Swag Labs web page
  A user can access to the Swag Labs Website and purchase the products selected.

  @PurchaseOfTwoProductsSelected
  Scenario: Successful purchase of two products into the Swag Labs web page
    Given the winner client has the access credentials to login into application
      | user              | password     |
      | standard_user     | secret_sauce |
    When he selects two articles of product list
    Then he can finish the checkout seeing the successful purchase status