package com.esports;

import org.junit.platform.suite.api.*;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/esports")
@ConfigurationParameter(key = "cucumber.glue", value = "com.esports")
public class RunCucumberTest {
}