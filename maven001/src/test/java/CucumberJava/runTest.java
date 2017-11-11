package CucumberJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import org.junit.runner.RunWith; 
//import cucumber.junit.Cucumber; 
//
//@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
//
//public class runTest { }
//package CucumberJava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import org.junit.runner.RunWith; 
//import cucumber.junit.Cucumber; 
//
//@RunWith(Cucumber.class) 
//@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-htmlreport"},
  features = {"src/test/java/CucumberJava"},
  monochrome=true
  ) 


public class runTest { }