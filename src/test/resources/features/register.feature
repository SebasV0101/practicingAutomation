Feature: Register
  i as service user, i need register in the web pages

  Scenario Outline: register successful
    Given He user is on the page
    When He user enter the data for the register
      | username   | email   | password   |
      | <username> | <email> | <password> |
    Then He could see the name

    Examples:
      | username    | email                 | password     |
      | Alexandra13 | alexandra05@gamil.com | alexa.12345* |
      | Alexandra14 | alexandra06@gamil.com | alexa.12345* |
      | Alexandra15 | alexandra07@gamil.com | alexa.12345* |
      | Alexandra16 | alexandra08@gamil.com | alexa.12345* |
