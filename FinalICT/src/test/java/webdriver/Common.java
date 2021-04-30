package webdriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Common implements ITestListener {


    static ExtentReports reports;
    static ExtentSparkReporter extentSparkReporter;
    static ExtentTest extentTest;
    @BeforeSuite
    public void InitalExtendReport() throws IOException {
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"//report//report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
    }


    public static WebDriver driver = null;

    @BeforeMethod
    public static WebDriver openbrowser() {

        String url = "https://www.amazon.in";
        String browser = "chrome";


        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "src/test/Driver//IEDriverServer.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                InternetExplorerOptions ieoptions = new InternetExplorerOptions(capabilities);
                driver = new InternetExplorerDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }


    public static String takeScreenshot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File screenshot = scrShot.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String file = "ss" + random.nextInt(1000) + ".png";
        System.out.println(System.getProperty("user.dir"));
        String fileName = System.getProperty("user.dir") + "//report//" + file;
        //String fileName="C:\\Users\\Public\\testing\\report//test.png";
        File destinationFile = new File(fileName);
        FileUtils.copyFile(screenshot, destinationFile);
        return file;
    }




    @AfterMethod
    public static void Closebrowser(ITestResult result) throws IOException {
        Common.takeScreenshot();
        driver.quit();

    }
    public void onTestSuccess(ITestResult result){
        extentTest=reports.createTest(result.getName());
        extentTest.log(Status.PASS, result.getName());
        try{
            extentTest.addScreenCaptureFromPath(Common.takeScreenshot());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void onTestFailure(ITestResult result){
        extentTest=reports.createTest(result.getName());
        extentTest.log(Status.FAIL, result.getName());
        try{
            extentTest.addScreenCaptureFromPath(Common.takeScreenshot());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void onTestSkipped(ITestResult result)
    {
        extentTest=reports.createTest(result.getName());
        extentTest.log(Status.SKIP, result.getName());
    }
    public void onFinish(ITestContext context)
    {
        reports.flush();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
