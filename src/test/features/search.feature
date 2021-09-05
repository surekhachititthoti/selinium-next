Feature: Verify search feature with product search

  As a user i should be able to verify search feature with search product

 @Search
  Scenario: Verify search feature with product search
   Given  I open home page "http://www.next.co.uk"
   When I enter search product name "tops"
   And I click search button
   Then I should be able to be  redirected to relevant search results page heading"tops"
  Then i should see list of relevant results

   Scenario:
    Given  I open home page "http://www.next.co.uk"
    When I enter brand name "nike"
    And I click search icon
    Then I should be able to be redirected to selected brand page"nike"


    Scenario:
    Given  I open  home page "http://www.next.co.uk"
    When I enter invalid product name "xyz"
    And I click search icon
    Then I should be able to be redirected to page with error message "no results matching to your search"









