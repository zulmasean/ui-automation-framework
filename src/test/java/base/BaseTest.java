package base;
import org.testng.annotations.*;import org.openqa.selenium.WebDriver;
import config.ConfigReader;import drivers.DriverManager;
public class BaseTest{
protected WebDriver driver; protected ConfigReader config;
@BeforeMethod
public void setup(){
config=new ConfigReader();
driver=DriverManager.getDriver();
driver.get(config.get("baseUrl"));
}
@AfterMethod
public void teardown(){DriverManager.quitDriver();}
}