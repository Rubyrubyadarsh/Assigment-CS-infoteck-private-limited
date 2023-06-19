package program2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestcaseSecondOne {
	
		public static void main(String[] args) throws IOException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.getcalley.com/page-sitemap.xml");
			Dimension size = new Dimension(1920,1080);
			driver.manage().window().setSize(size);
			TakesScreenshot ts=(TakesScreenshot)driver;	                       		
			
		File temproryFile=ts.getScreenshotAs(OutputType.FILE);
		String timestamp=LocalDateTime.now().toString().replace(':','-');
		System.out.println(timestamp);
		String name="windows-1920-1080"+timestamp;
		System.out.println(name);
		String path="./seondscreenshot/"+name+".png";
		File parmentFile = new File(path);
		FileUtils.copyFile(temproryFile,parmentFile);
		String Url = driver.getCurrentUrl();
		if(Url.equals("https://www.getcalley.com/page-sitemap.xml")) {
			System.out.println("TestCase is Passed");
		}
		else
		{
			System.out.println("TestCase is Failed");
		}
		
		driver.close();
		
		
			
			
			
		}

	}

	


