Feature: To validate the login functionality of LearnMore

    @lm
      #before
  Scenario: Login Functionality
   # Given User navigates to LearnMore LoginPage
    When Enter the credentials
      #afterstep
    And Click on Login button
      #afterstep
    Then User validates error message
      #afterstep
     #after
    @MouseHover
      #before
    Scenario: Title validation
      #Given User navigates to Amazon homepage
      When user clicks on baby wishlist
      Then Validate the title
      #after

      @Dropdown
  Scenario: Static dropdown handling
    Given user navigates to Amazon homepage
    When user selects value from Category dropdown
    And user extracts values from Category dropdown

        @DragAndDrop
        Scenario: Drag and Drop
          Given Navigate to jquery webpage
          When user performs drag and drop action
          Then dkdjsdkcjdkjkd
