package io.cucumber.avaliacao;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "not @ignore", plugin = {"pretty"})
public class RunCucumberTest {
}
