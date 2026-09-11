import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
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

class fnupdateusageaddress_copy2 {

	public static void fnupdateusageaddress_copy2() {
		tg.wait("ele_address1", ComparisonType.IS_VISIBLE, 10);
		START_CUSTOM_SCRIPT;
		try 
		{
		    WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-62108929fc-street1"));
		    String addressText = addresselement.getAttribute("value");
		    System.out.println("address text is "+addressText);
		    if (addressText.contains("RAVINIA"))
		    {
		       System.out.println("address text inside if block "+addressText);
		       driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).clear();
		        driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).sendKeys("12920 SE 38th");
		    }
		    else
		    {
		       System.out.println("address text inside else block "+addressText);
		        driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).clear();
		        driver.findElement(By.id("field-formFieldAddress-62108929fc-street1")).sendKeys("1 RAVINIA DR");
		    }
		WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-62108929fc-city"));
		String cityText = cityelement.getAttribute("value");
		System.out.println("city text is "+cityText);
		if (cityText.contains("Bellevue"))
		{
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).clear();
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).sendKeys("ATLANTA");
		}
		else
		{
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).clear();
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-city")).sendKeys("Bellevue");
		}
		WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode"));
		String zipCode = zipCodeElement.getAttribute("value");
		if (zipCode.contains("30346"))
		{
		 driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).clear();      
		        driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).sendKeys("98006");
		}
		else
		{
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).clear();
		    driver.findElement(By.id("field-formFieldAddress-62108929fc-zipCode")).sendKeys("30346");
		}
		} 
		catch(Exception e) 
		{
		    System.out.println(e);
		}
		END_CUSTOM_SCRIPT;
		tg.wait("ele_addressCheckBox", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_addressCheckBox");
		tg.click("ele_addressCheckBox", 1);
		// [DISABLED] tg.wait("ele_yesContinueAddress", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.check.isVisible("ele_yesContinueAddress");
		// [DISABLED] tg.click("ele_yesContinueAddress", 1);
		tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_saveButtonAddress");
		tg.click("ele_saveButtonAddress", 1);
		// [DISABLED] tg.wait("ele_useSuggestedAddress", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.check.isVisible("ele_useSuggestedAddress");
		// [DISABLED] tg.click("ele_useSuggestedAddress", 1);
		tg.wait("ele_usageaddre835", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_usageaddre835");
	}
}