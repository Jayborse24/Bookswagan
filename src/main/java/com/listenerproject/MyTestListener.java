package com.listenerproject;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Base_Classes.Test_Base;
public class MyTestListener extends Test_Base implements ITestListener{
	
	
		
		@Override
		public void onTestStart(ITestResult result) {
			System.out.println(result.getMethod().getMethodName()+" :onTestStart");
			extent.attachReporter(spark);
			extent.flush();
		}
			
		
		@Override
		public void onTestSuccess(ITestResult result) {
			System.out.println("My test case passed... Name of test case: "+ result.getName());
			extent.flush();
		}
		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("My test case failed... Name of test case: "+ result.getName());
			extent.flush();
		}

	}
