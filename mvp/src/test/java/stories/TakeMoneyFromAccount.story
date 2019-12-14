Narrative:
As a user
I want to take money from my account
In order to buy tickets for Star Wars: The Rise of Skywalker

Scenario: Have enough many to withdraw and make withdraw
Given User account having <balance> founds
When user withdraws <take> money
Then account balance is <final_balance>

Examples:
|balance  |take|final_balance|
|500      |20  |480          |
|350      |80  |270          |