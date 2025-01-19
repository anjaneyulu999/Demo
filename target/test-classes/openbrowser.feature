Feature: open chrome

  Scenario Outline: open a site using url
    Given open "<title>" browser
    When launch "<url>" site

    Examples: 
      | url          title |                         |
      | chrome             | http://www.google.co.in |
