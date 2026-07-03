package pages;
import org.openqa.selenium.*;import org.openqa.selenium.support.ui.*;
import java.time.Duration;
public class LoginPage{
WebDriver driver;
By user=By.name("username");
By pass=By.name("password");
By login=By.xpath("//button[@type='submit']");
public LoginPage(WebDriver d){driver=d;}
public void login(String u,String p){
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(user)).sendKeys(u);
driver.findElement(pass).sendKeys(p);
driver.findElement(login).click();
}
}