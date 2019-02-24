package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetOpen 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.ie.driver", "F:\\Softwares\\Selenium Learning\\IE Driver 64 bit\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
DesiredCapabilities dc =new DesiredCapabilities();
dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
dc.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
dc.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
dc.setCapability("nativeEvents", false);
dc.setCapability(InternetExplorerDriver.IE_USE_PRE_PROCESS_PROXY,true);
WebDriver driver = new InternetExplorerDriver(dc);
driver.get("https://www.google.com/");
}
}