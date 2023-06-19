package program2;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSecondResolution {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Dimension size = new Dimension(1366,768);
		driver.manage().window().setSize(size);
		TakesScreenshot ts=(TakesScreenshot)driver;	                       		
		
	File temproryFile=ts.getScreenshotAs(OutputType.FILE);
	String timestamp=LocalDateTime.now().toString().replace(':','-');
	System.out.println(timestamp);
	String name="windows-1366-768"+timestamp;
	System.out.println(name);
	String path="./SecondresolutionforChrome/"+name+".png";
	File parmentFile = new File(path);
	FileUtils.copyFile(temproryFile,parmentFile);
	
	driver.close();
	
	
	}



	}


