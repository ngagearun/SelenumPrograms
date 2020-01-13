import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath(".//*[@id='sbox']/div[1]")).isDisplayed();
		if(status=true){
			System.out.println("Element is Displayed");
		}else{
			System.out.println("Not Preseent");
		}
		driver.close();

	}

}
