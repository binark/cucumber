Feature: Test controller

  Scenario: Test Hello
    Given A visitor
    When I call test hello controller
    Then I should get Hello text

  Scenario: Test Greeting name
    Given A visitor named Armel
    When I call greeting name controller with my name
    Then I should get Hello Armel response