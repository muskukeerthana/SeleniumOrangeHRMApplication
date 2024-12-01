package TestRun;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
         (
         features= "C://seleniumstructureproject//cucumber//LoginFile.feature",
         glue= "stepDefinitionPack")
public class TestRun {

	
	
}

