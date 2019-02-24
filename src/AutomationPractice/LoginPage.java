package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage 
{
WebDriver driver;
WebElement un,pwd,submit;
public LoginPage(WebDriver driver)
{
this.driver = driver;
System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
driver.get("http://automationpractice.com/index.php?controller=authentication&back=identity");
un=driver.findElement(By.xpath(".//*[@id='email']"));
pwd=driver.findElement(By.xpath(".//*[@id='passwd']"));
submit=driver.findElement(By.xpath(".//*[@id='SubmitLogin']"));
}
public void elements()
{
un.sendKeys("learning@gmail.com");
pwd.sendKeys("newpassuu");
submit.click();
}
}