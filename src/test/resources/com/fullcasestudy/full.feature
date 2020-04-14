@TestmeApp
Feature: Register


Business rules:
 
 - user should open TestMeApp
 
 Scenario: Valid Registaration condition
 Given  user should open signup page
 When   user enters all details
 Then   click on registaration able to see homepage
 

 Scenario Outline: Valid login condition
 Given  open online testmeapp
 When   lalitha gives valid username and valid password "<uname>" "<pwd>"
 Then   he is able to see his name and title is home page
 
 Examples:
 |uname|pwd|
 |Lalitha|Password123|
 
 
 Scenario Outline:  Valid login condition
 Given  open online testmeapp and login
 When   enter the item "<search>" and click on findDetails
 And    he is able to see his product
 Then   click on cart
 And    Select bank and enter bank details
 And    click on payment
 
 Examples:
 |search|
 |Head|
 
 
Scenario: The one where the users moves to cart without adding any item


 Given  Logininto TestMeapp
 Then    he is search for a product like headphones
 And     Try to proceed to payment without adding any item in the cart
 When    TestMe does not display the icon  
 