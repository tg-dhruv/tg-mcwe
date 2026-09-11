import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class fnverifycancelautopayinautopay_copy3 {

	public static void fnverifycancelautopayinautopay_copy3() {
		START_CUSTOM_SCRIPT;
		    try 
		    {
		        String text = driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).getText();
		        System.out.println("Text availaable is "+text);
		        if (text.contains("Set up AutoPay"))
		        {
		            driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).click();
		            tg.takeFullScreenshot();
		            driver.findElement(By.xpath("//button[text()='Agree and submit']")).click();
		            tg.takeFullScreenshot();
		            driver.findElement(By.id("button-9c3b59304b")).click();
		            tg.takeFullScreenshot();
		            driver.findElement(By.xpath("//button[text()='Done']")).click();
		            tg.takeFullScreenshot();
		        }
		        else if (text.contains("Manage AutoPay"))
		        {
		             driver.findElement(By.xpath("//*[@id='billing-panel']//bb-box//li[2]//bb-shortcut-item//div[@class='bb-shortcut-title']")).click();
		             tg.takeFullScreenshot();
		             driver.findElement(By.xpath("//button[text()='Cancel AutoPay']")).click();
		             tg.takeFullScreenshot();
		             driver.findElement(By.id("button-325012463b")).click();
		             tg.takeFullScreenshot();
		             driver.findElement(By.xpath("//button[text()='Done']")).click();
		             tg.takeFullScreenshot();
		        }
		    } 
		    catch(Exception ex) 
		    {
		        System.out.println("Exception caught "+ex);
		    }
		END_CUSTOM_SCRIPT;
	}
}