Feature: Contact us page feature
  Scenario: User wants to send feedback to us
    Given User can press submit button
    Then Press submit button with following details
      | personOne   | personOne@test.com   | test subject personOne    | Mentoring | this message is for person one   |
      | personTwo   | personTwo@test.com   | test subject person two   | Mentoring | this message is for person two   |
      | personThree | personThree@test.com | test subject person three | Mentoring | this message is for person three |
      | personThree | personThree@test.com | test subject person three | Mentoring | this message is for person three |
      | personOne   | personOne@test.com   | test subject personOne    | Mentoring | this message is for person one   |
      | personTwo   | personTwo@test.com   | test subject person two   | Mentoring | this message is for person two   |
      | personThree | personThree@test.com | test subject person three | Mentoring | this message is for person three |
      | personThree | personThree@test.com | test subject person three | Mentoring | this message is for person three |