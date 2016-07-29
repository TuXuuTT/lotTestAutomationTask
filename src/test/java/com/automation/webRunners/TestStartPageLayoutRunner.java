package com.automation.webRunners;

import com.automation.BasicTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features = "src/test/resources/features/StartPageLayout.feature",
        glue = "com.automation.stepDefinitions",
        plugin = {"html:build/reports/cucumber-report", "pretty"},
        strict = true,
        snippets = SnippetType.CAMELCASE,
        tags = {/*"@DEV"*/}) //TODO Remove tags before release, its for dev purposes only
public class TestStartPageLayoutRunner extends BasicTest {
}