#Sample comment
#Author: Anton Naidonov

@Tag1 @Tag2 @Tag3
Feature: Sample feature file
  As a Cucumber user
  I want any UTF-8 feature file to be parsed normally
  So that I can use any features-files UTF-8 encoding regardless to BOM presence

  @ScenarioTag1 @ScenarioTag2
  Scenario: Pass UTF-8-BOM file
    Given that I created UTF-8-BOM encoded feature-file
    When I pass it to cucumber-jvm
    Then it gets parsed normally
