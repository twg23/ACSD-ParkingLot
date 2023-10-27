Feature:  Testing the Parking Lots

  Scenario Outline:  Long Term Lot
    Given I am staying in the "Long Term" parking lot
    When I enter on <entry date>
    And I exit on <exit date>
    Then my fee is <fee>

    Examples:
    |entry date | exit date | fee |
    |"2023-10-26 01:30" | "2023-10-26 02:30" | 2 |
    |"2023-10-26 01:30" | "2023-10-27 01:30" | 15 |

  Scenario Outline:  Long Term Lot
    Given I am staying in the "Premium" parking lot
    When I enter on <entry date>
    And I exit on <exit date>
    Then my fee is <fee>

    Examples:
      |entry date | exit date | fee |
      |"2023-10-26 01:30" | "2023-10-26 02:30" | 4 |
      |"2023-10-26 01:30" | "2023-10-27 01:30" | 27 |
