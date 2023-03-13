package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReportSetUp implements ITestListener {
	public static ExtentReports extentReport;
	public static ExtentTest extenttest;

	public void onStart(ITestContext context) {
		extentReport = ExtentReportSetUp.extentSetUp(context.getSuite().getName());
	}

	public void onTestStart(ITestResult result) {
		extenttest = extentReport.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, "Test case Pass name is " + result.getMethod().getMethodName());
		
		extenttest.addScreenCaptureFromPath(ExtentReportSetUp.passScreenshot(result.getMethod().getMethodName()));

	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, "Test case fail name is " + result.getMethod().getMethodName());
		extenttest.addScreenCaptureFromPath(ExtentReportSetUp.failScreenshot(result.getMethod().getMethodName()));

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.log(Status.SKIP, "Test case skip name is "+result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

}
