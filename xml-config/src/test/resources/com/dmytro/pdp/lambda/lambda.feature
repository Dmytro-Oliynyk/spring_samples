Feature: PDP

  Scenario: Lambda samples
    Given I initiated reference on constructor and sad Hello and repeated it 99 times.
    When  I call functions with parameters Baby, 100 and 500.
    Then  Results: Hello - Baby, 9900, 500.
