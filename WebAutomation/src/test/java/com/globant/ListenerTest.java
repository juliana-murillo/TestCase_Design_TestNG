package com.globant;
import org.testng.*;

public class ListenerTest implements ITestListener{

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("starting test"+ result.getName());
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("the succesful test case was" + result.getName());
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("the dailed test case was" + result.getName());
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("the skipped test case was" + result.getName());
        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        
        
    }

    @Override
    public void onStart(ITestContext context) {
        
        
    }

    @Override
    public void onFinish(ITestContext context) {
    
        
    }
    
}
