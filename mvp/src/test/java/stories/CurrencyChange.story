Narrative:
As a user
I want to change my currency to a foreign one
In order to buy something abroad

Scenario: Pick the foreign currency and change local money to foreign one
Given User account having <want_to_change_balance> founds
When user picks <currency>
Then show how much <changed_balance> of foreign money user will have

Examples:
|want_to_change_balance|currency|changed_balance|
|100                   |USD     |26.05          |
|1500                  |EUR     |351.40         |