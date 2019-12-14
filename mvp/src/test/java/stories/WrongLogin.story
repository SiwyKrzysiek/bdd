Narrative:
As a user
I want to see error screen
While trying to log in with wrong data

Scenario: Trying to log in with wrong login
Given User being on the login screen
When user enters not existing <login> and <password>
Then login is not validated

Examples:
|login             |password|
|jestemSobieMalyMis|sdkl    |