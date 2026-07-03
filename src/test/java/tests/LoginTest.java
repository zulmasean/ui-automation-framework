package tests;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
public class LoginTest extends BaseTest{
@Test
public void loginSuccess(){
LoginPage login=new LoginPage(driver);
login.login(config.get("username"),config.get("password"));
}
}