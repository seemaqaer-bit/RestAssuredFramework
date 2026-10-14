package com.api.listeners;
import javax.xml.xpath.XPathEvaluationResult.XPathResultType;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.testng.ITestContext;
import org.testng.ITestListener;

public class TestListener implements ITestListener{
	
	private static final Logger Logger = LogManager.getLogger(TestListener.class);
	
	public void onStart(ITestContext context)
	{
		Logger.info("Test Suit Started");
	}
	
	public void onFinished(ITestContext context)
	{
		Logger.info("Test Suit Complited");
	}
	
	public void onTestStart(ITestContext result)
	{
		Logger.info("Passed " +result.getName());
		
	}
	
	
	public void onTestSuccess(ITestContext result)
	{
		Logger.info("Passed " +result.getName());
	}
	
	public void onTestPassed(ITestContext result)
	{
		Logger.info("Passed " +result.getPassedTests());
	}
	
	public void onTestFailure(ITestContext result)
	{
		Logger.error("Failed " +result.getFailedTests());
	}
	
	public void onTestSkipped(ITestContext result)
	{
		Logger.info("Skipped " +result.getSkippedTests());
	}

}
