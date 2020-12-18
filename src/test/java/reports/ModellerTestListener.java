package reports;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestBase;
import utilities.testmodeller.TestModellerLogger;

public class ModellerTestListener  extends TestBase implements ITestListener {
    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        TestModellerLogger.PassStep( "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        TestModellerLogger.FailStep( "Test Failed", iTestResult.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
}
