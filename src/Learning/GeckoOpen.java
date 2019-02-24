package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GeckoOpen 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Selenium Learning\\Gecko Driver Firefox\\geckodriver-v0.21.0-win64\\geckodriver.exe");
DesiredCapabilities dc = DesiredCapabilities.firefox();
dc.setCapability("marionette","true");
WebDriver driver = new FirefoxDriver(dc);
driver.get("https://www.google.com/?gws_rd=ssl");
driver.close();
}
}