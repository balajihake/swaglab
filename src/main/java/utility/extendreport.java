package utility;

import com.relevantcodes.extentreports.ExtentReports;

public class extendreport {
public static ExtentReports getReports() {
	ExtentSparkReporter SparkReporter=new ExtentSparkReporter("ExtentReport.html");
	ExtantReport Extent=new ExtentReports();
	extent.attachReporter(sparkReporter);
	extent.setSystemInfo("")
}
}
