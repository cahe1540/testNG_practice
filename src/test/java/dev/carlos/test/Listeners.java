package dev.carlos.test;
import org.testng.ITestContext ;
import org.testng.ITestListener ;
import org.testng.ITestResult ;

//ITestListener Interface which implements Testing listeners
public class Listeners implements ITestListener{

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I successfully printed on test success!!");
        System.out.println(iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        // screenshot code
        // response if api fails
        //
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
