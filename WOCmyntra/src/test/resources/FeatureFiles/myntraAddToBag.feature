Feature: myntra select brand and add to bag feature

Scenario: myntra user able to select brand and size of choice and add item to bag

Given user is on Myntra T-shirts page
When user hover over to men
And user select T-shirts
And user select brand name check box
And user click add to bag
And user select medium size
And user click bag
Then user should be able to see item added to bag