package ru.drip;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by apodoplelov on 28.06.17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:."},
        format = {"pretty", "json:target/report.json"},
        plugin = "json:target/report.json"
)
public class CucumberRunner {
}
