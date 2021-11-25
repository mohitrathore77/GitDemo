Feature: Application Login

Scenario: Home page default login
Given User is on netbanking login page
When User login into the application by "mohit" username and "123"
Then Netbanking home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given User is on netbanking login page
When User login into the application by "john" username and "456"
Then Netbanking home page is populated
And Cards are displayed "false"