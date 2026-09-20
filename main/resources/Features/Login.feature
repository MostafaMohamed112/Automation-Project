Feature: Login feature
    @Scenario2
  Scenario: User can login and buy products

    Given  user open homepage and click on login link
    When user enters "Mo96afa" and "Mo96afa" and press login
    And user select one product
    And user select second product
    And check the availability of products
    Then user request order by insert "Mostafa"and"Egypt"and"City"and"Card"and"Month"and"Year" and appear success message