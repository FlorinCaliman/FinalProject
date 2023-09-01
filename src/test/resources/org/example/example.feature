Feature: An example

  Scenario:1 Valid email US
    Given I am on the main page
    When the email value of "papabear@gmail.com" is input
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario:2 Valid email RO
    Given I am on the main page
    When the email value of "papabear@gmail.ro" is input
    And the submit button is clicked
    Then the newsletter confirmation pop-up appears

  Scenario:3 Negative over character limit
   Given I am on the main page
    When the email value of "dasmdaslkcmlaskmclaskmclsakmclkasmclkas" is input
    And the submit button is clicked
    Then the newsletter confirmation pop-up is not appears


  Scenario:4 Click Start the Enrollment button
    Given I am on the main page
    When I click the Start the enrollment button
    Then the "Software Testing | Enrollment" page is open

  Scenario:5 Click read more on the virtual case
    Given I am on the main page
    When I click the read more button on the virtual case
    Then the "Virtual" page opens

  Scenario:6 Click read more on the hybrid case
    Given I am on the main page
    When I click the read more button on the hybrid case
    Then the "Hybrid" page opens

  Scenario:7 Click read more on the in person case
    Given I am on the main page
    When I click the read more button on the in person case
    Then the "In Person" page opens

  Scenario:8 Click read more on the fundamental page
    Given I am on the main page
    When I click the read more button on the fundamental page
    Then the "Fundamentals" page opens

  Scenario:9 Click read more on the learn selenium
    Given I am on the main page
    When I click the read more button on the learn selenium page
    Then the "Learn Selenium" page is not open

  Scenario:10 Expend Frequently asked questions
    Given I am on the main page
    When I click on expand the button
    Then the question is expand

  Scenario:11 John Doe LinkedIn icon
    Given I am on the main page
    When I click the LinkedIn button
    Then the "LinkedIn" page is opened

  Scenario:12 Click on the return mainpage
    Given I am on the fundamental page
    When I click to return button from fundamental page
    Then It's return to main page

  Scenario:13 write in personal information
    Given I am on the main page
    When I click to the start enrollment
    And the first name value of "Florin" is inputted
        * the last name value of "Piersic" is inputted
        * the username value of "piersicutamea" is inputted
        * the password value of "12si3de0" is inputted
        * the confirm password value of "12si3de0" is inputted
        * we push the next button
    Then the contact information is apear

  Scenario:14 write in  contact information page
    Given I am on the contact information page
    When the email value of "papabear@yahoo.com" is inputted
    And  the phone value of "0745515424" is inputted
         * the country value of "Tunisia" is inputted
         * the city value of "Guvu" is inputted
         * the post code value of "5451321" is inputted
         * we go to the next page
    Then the course option is apear

  Scenario:15 course option page
    Given I am on the course option page
    When I selected one option
    And I clicked the next button
    Then the payment information page is apear

  Scenario:16 Payment information page
    Given I am on the Payment Information page
    When the Card Holder name is "John" fields
    And the card number value of "44444" is inputted
       * the cvc value of "356" is inputted
       * I clicked to drop the select month
       * I selected the May
       * I clicked to drop the select year
       * I selected the 2025
       * I click to the next button
    Then we go to the final registration page

  Scenario:17 Payment information page
    Given I am on the Payment Information page
    When the Card Holder name is "MIMI" fields
    And the card number value of "44444" is inputted
    * the cvc value of "555" is inputted
    * the expire month value "June" card is selected
    * the expire year value "2028" card is selected
    * I click to the next button
    Then we go to the final registration page

  Scenario:18 Comeback to the main page
    Given I am on the final page registration
    When I clicked the return homepage button
    Then the mainpage is open

  Scenario:19 click what you learn
    Given I am on the main page
    When I clicked the what you'll learn button
    Then the mainpage is scrolling down to the Learn The Fundamental

  Scenario:20 Click the social media icons on the Our Instructor
    Given I am on the main page our instructor
    When I click the instagram icon
    Then the Instagram page is open












