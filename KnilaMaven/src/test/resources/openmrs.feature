Feature: To Validate The OpenMRS Application Functionalities

  Scenario: To validate the login function of Opemrs application
    Given User should be in the login page
    When User enter valid username and valid password
    And User must Pick any location below and click on Login
    Then User must be in the dashboard page

  Scenario: To validate the Register paitent page
    Given User Cick on Register a patient menu
    When Enter the detail of Demographics Name Gender Birthdate and Contact Info Address Phone number
    Then User must be in the Confirm page verify the given Name Gender Birthdate Address Phone number are populated correctly using Assertion

  Scenario: To validate the patient details page
    Given User Click on Confirm and verify Patient details page is redirected
    When User verify the age is calculated correctly based on the date of birth provided
    Then User Click on Start Visit and Confirm the visit

  Scenario: To validate the upload file functionallity  and end vist
    Given User Click on Attachment and select attachment file
    And User upload the file
    And User Redirect to Patient details screen and verfiy the entry has current date
    Then User Click on the End Visit action

  Scenario: To validate the BMI functionality
    Given User Start Visit again and Click on Capture Vitals menu
    When Enter Height & Weight and Verify displayed BMI is calculated correctly
    Then User navigate back to patient details page

  Scenario: To validate the visits functionality
    Given User Verfiy Recent Visit has one more new entry for current date
    When User Click on Merge Visits, select these 2 visit and click on Merge Selected Visits button
    And User should Redirect to patient details page by clicking on Return button
    Then User should Verfiy Recent Visit has become one entry for current date

  Scenario: To validate the past visit functionality
    Given User Click on Add Past Visit and verify the future date is not clickable in the date picker
    And User should Redirect to patient details page
    When User Click on Delete Patient and provide the reason
    And Click on confirm button and verify the toaster message
    Then It will redirect you to Find Patient Record menu where verify the deleted patient should not listed out in the table using

    
    
 