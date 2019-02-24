package Learning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenWebSite 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Web Drivers jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/search?q=lord+balaji&rlz=1C1DFOC_enIN591IN591&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi28cjfx4fdAhUQXisKHUuLAAEQ_AUICigB&biw=1366&bih=662#imgrc=lrakGMjYcB2LaM:");
}
}