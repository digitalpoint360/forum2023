package forum2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_homepgae {

	// importing selenium 
	
	public static WebDriver driver; 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("T01 Testing");

//Opening the Browser 

System.setProperty("webdriver.chrome.driver", "C:\\Automation\\forum2023\\forum2023\\drivers\\chromedriver.exe");

driver = new ChromeDriver();


// maxime the window 

driver.manage().window().maximize();

//delete the cookies 

driver.manage().deleteAllCookies();


//Load the application 


driver.get("https://forum.digitalpoint.tech/user/index.php/login");



	}

}
