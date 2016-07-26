package com.automation.webRunners;

import com.automation.BasicTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features = "src/test/resources/features/SearchFlight.feature",
        glue = "com.automation.stepDefinitions",
        plugin = {"html:build/cucumber-report", "pretty"},
        strict = true,
        snippets = SnippetType.CAMELCASE)
public class TestSearchFlightRunner extends BasicTest {
}