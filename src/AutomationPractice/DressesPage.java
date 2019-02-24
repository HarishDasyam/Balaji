package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DressesPage 
{
static WebDriver driver;
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
LoginPage lp = new LoginPage(driver);
lp.elements();
DressesPage dp = new DressesPage();
dp.test();
}
public void test()
{
WebElement dresses = driver.findElement(By.partialLinkText("Contact"));
dresses.click();
}
}