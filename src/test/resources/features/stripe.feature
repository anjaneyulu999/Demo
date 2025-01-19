Feature: Create a multiple customers

  Scenario Outline: Customer Creation
    Given open "chrome" browser
    And launch "https://www.gmail.com" site
    When do login using "<uid>" and "<pwd>" credentials
      | bn     | uid                     | pwd           |
      | chrome | anjaneyulu9c9@gmail.com | Anji@gmail999 |
    Then compose is displayed
    When click on compose
    When fill fields with"<to>", "<subject>", "<body>"
    When do logout
    When close site

    Examples: 
      | to                 | subject | body   |
      | anji2695@gmail.com | wishes  | hi bro |
