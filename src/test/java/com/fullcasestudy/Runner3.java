package com.fullcasestudy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:F:\\selenium\\reports\\cucumber.json"},tags= {"@Payment"})
public class Runner3 {

} 
