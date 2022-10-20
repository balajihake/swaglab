package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
public static void takescreenshot(WebDriver driver,String name) throws IOException {
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\HP\\eclipse-workspace\\swaglab\\screenshot"+ name +".png");
	FileHandler.copy(source, destination);
}
}
