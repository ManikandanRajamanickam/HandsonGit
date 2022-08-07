package learnFromInterview;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLCert {
	
	@Test
     void sslHandld() {
     	
     	DesiredCapabilities capabilities = new  DesiredCapabilities();
     	capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
     	WebDriver driver = new ChromeDriver ();
     
     }
	
}
