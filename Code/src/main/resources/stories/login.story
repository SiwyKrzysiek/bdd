Narrative:
As a user
I want to login to my banking account
So that I can do my banking

Scenario: Login with correct credencials
Meta:
@skip

Given I am on the login screen
When I enter correct credencials
And Press login button
Then I am shown my banking profile

Scenario: An unknown user cannot be logged
Meta:
@skip

Given i am the user with nickname: "weird"
When i try to login using the password "soweird"
Then i get an error message of type Wrong Credentials