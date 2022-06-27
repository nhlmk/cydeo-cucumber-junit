Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "mastercard"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table



  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples: Famous female scientists
      | productType | quantity | customerName       | street    | city   | state   | zipcode | cardType         | cardNumber     | expDate | expectedName       |
      | MoneyCog    | 2        | Marie Curie        | London St | London | England | 5050    | Visa             | 11122233344455 | 12/24   | Marie Curie        |
      | Familybea   | 2        | Rosalind Franklin  | London St | London | England | 5050    | MasterCard       | 11122233344455 | 12/24   | Rosalind Franklin  |
      | Screenable  | 2        | List Meither       | London St | London | England | 5050    | Visa             | 11122233344455 | 12/24   | List Meither       |
      | MoneyCog    | 2        | Barbara McClintock | London St | London | England | 5050    | American Express | 11122233344455 | 12/24   | Barbara McClintock |

@maleScientist
    Examples: Famous male scientists
      | productType | quantity | customerName | street    | city   | state   | zipcode | cardType         | cardNumber     | expDate | expectedName |
      | MoneyCog    | 2        | Bill Gates   | London St | London | England | 5050    | Visa             | 11122233344455 | 12/24   | Bill Gates   |
      | Familybea  | 2        | Elon Musk    | London St | London | England | 5050    | MasterCard       | 11122233344455 | 12/24   | Elon Musk    |
      | Screenable  | 2        | Terminator   | London St | London | England | 5050    | Visa             | 11122233344455 | 12/24   | Terminator   |
      | MoneyCog    | 2        | Rick Sanchez | London St | London | England | 5050    | American Express | 11122233344455 | 12/24   | Rick Sanchez |