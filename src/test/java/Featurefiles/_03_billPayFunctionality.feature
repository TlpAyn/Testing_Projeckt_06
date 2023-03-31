Feature: Login MultiScenario

  Background:

    Given Navigate to the ParaBank

  Scenario Outline: Bill Pay Functionality

    When Enter your valid  "Tahsin" and "Yazici"
    When Pay the bills"<name>"and "<price>"
    Then Verify the success



    Examples:
      | name          | price |
      | Elektric Bill | 85$   |
      | Water Bill    | 45$   |
      | Gas Bill      | 120$  |





