package git2Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Git2Test {

	@Test
	public void loginTest() throws IOException
	{
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.sendKeys(Keys.ENTER);
        File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\91944\\Desktop\\eclipse\\seliniumworkspace\\JenkinsGit\\Screenshot\\bing.jpg"));
	}
}
