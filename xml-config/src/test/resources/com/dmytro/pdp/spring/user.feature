Feature: User manager

  Scenario:  User manager flow
    Given I init spring context from spring-config.xml
    When I get usersSet
    Then My user Jon Dou is in set
