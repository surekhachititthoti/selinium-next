Feature: Verify search feature with search product

  As a user i should be able to verify search feature with search product

  Background:search pre-condition
    Given  I open home page "http://www.next.co.uk"

    @Search
  Scenario Outline: Verify search

    When I enter search product name <searchterm>
    And I click search button
    Then I should be able to be  redirected to relevant search results page heading"searchResult"

    Examples:
      | searchTerm | searchResult     |
      | Tops       | Tops             |
      | nike       | nike             |
      | xyz        | no results found |