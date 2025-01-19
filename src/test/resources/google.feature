Feature: Open Google

  Scenario Outline: open browser for given version
    Given open "<bn>" browser
    When launch "<url>" site
    Then the title should be "<title>"

    Examples: 
      | bn      | url                     | title  |
      | chrome  | http://www.google.co.in | Google |
      | firefox | http://www.gmail.com    | Gmail  |
