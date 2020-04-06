#Author: heriberto-hg@hotmail.com
#Keywords Summary : 

@SoppingCart
Feature: add product to shopping cart
  I want to add a product to the shopping cart

  @AddProduct
  Scenario: Add product to shopping cart
    Given looking for the "PLATANO" product
    When purchase 2 of the first product found
    Then it must be added to the shopping cart