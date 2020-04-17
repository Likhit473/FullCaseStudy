Feature: TestMeApp Login



Background:
Given  open online testmeapp


 Scenario: User without login and search a product and try to add cart
 When   user dooesnot enter details and login
 Then   try to add product
 
 Scenario: Alex, an user logged into TestMeApp and search for  product with full name
 When   user enter valid details and click on login
 And    search a product with full name
 Then   click on payment
 
 
Scenario: Alex, an user logged into TestMeApp and search for  product with single letter

 When   user enter valid details
 And    search a product with single letter
 Then   click on payments
 
 
 Scenario Outline:  Search with single letter
 When   login and enter the item "<search>" and click on findDetails
 And    he is able to see his product
 Then   click on cart
 And    Select bank and enter bank details
 And    click on payment
 
 Examples:
 |search|
 |Head|
 |trav|
 
 