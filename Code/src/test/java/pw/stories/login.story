Narrative:
As a user
I want to login to my banking account
So that I can do my banking

Scenario: Login with correct credentials
Given User being on the login screen
When user enters existing <login>
And user enters valid <password>
And user presses login button
Then login is validated correctly

Examples:
|login  |password|
|jan    |AAA     |
|gracahm|grrr    |


Scenario: An unknown user cannot be logged
Given i am the user with nickname: "weird"
When i try to login using the password "soweird"
Then i get an error message of type Wrong Credentials