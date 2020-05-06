package matha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mundu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver", "C://Users//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

	}

}
