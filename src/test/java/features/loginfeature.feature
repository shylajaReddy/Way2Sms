  
  Feature:Login
Scenario : Validate site Launching
Given launch site using chrome
then title contains "freeSms"
and close site

Scenario Outline: validate login operation 
Given Launch site using chrome
When user name is "<x>"
And pwd is "<y>"
And click login
Then validate output for criteria "<z>"
And close site

Examples: 

|x									|y									|								z|

|9490010786					|Sudhesh						|  Send Free SMS|
