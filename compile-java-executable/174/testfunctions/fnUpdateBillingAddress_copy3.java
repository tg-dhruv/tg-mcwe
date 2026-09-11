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

class fnupdatebillingaddress_copy3 {

	public static void fnupdatebillingaddress_copy3() {
		tg.wait("ele_BillPref", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_BillPref", 1);
		tg.wait("ele_Paperless", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_Paperless", 1);
		tg.wait("ele_UpdateBillingAddress", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_UpdateBillingAddress", 1);
		START_CUSTOM_SCRIPT;
		try 
		{
		    WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1"));
		    String addressText = addresselement.getAttribute("value");
		    System.out.println("address text is "+addressText);
		    if (addressText.contains("RAVINIA"))
		    {
		       System.out.println("address text inside if block "+addressText);
		       driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).clear();
		        driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).sendKeys("12920 SE 38th");
		    }
		    else
		    {
		       System.out.println("address text inside else block "+addressText);
		        driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).clear();
		        driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-street1")).sendKeys("1 RAVINIA DR");
		    }
		WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city"));
		String cityText = cityelement.getAttribute("value");
		System.out.println("city text is "+cityText);
		if (cityText.contains("Bellevue"))
		{
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).clear();
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).sendKeys("ATLANTA");
		}
		else
		{
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).clear();
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-city")).sendKeys("Bellevue");
		}
		WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode"));
		String zipCode = zipCodeElement.getAttribute("value");
		if (zipCode.contains("30346"))
		{
		 driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).clear();      
		        driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).sendKeys("98006");
		}
		else
		{
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).clear();
		    driver.findElement(By.id("field-formFieldAddress-fddd5d19ca-zipCode")).sendKeys("30346");
		}
		} 
		catch(Exception e) 
		{
		    System.out.println(e);
		}
		END_CUSTOM_SCRIPT;
		tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_saveButtonAddress");
		tg.click("ele_saveButtonAddress", 1);
		if(tg.performAssert("ele_YesUpdateButton", ComparisonType.IS_VISIBLE)){
		tg.click("ele_YesUpdateButton", 1);
		}
		// [DISABLED] tg.wait("ele_useSuggestedAddress", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.check.isVisible("ele_useSuggestedAddress");
		// [DISABLED] tg.click("ele_useSuggestedAddress", 1);
		// [DISABLED] tg.wait("ele_billingAddressUpdateSuccessMsg", ComparisonType.IS_VISIBLE, 15);
		// [DISABLED] tg.check.isVisible("ele_billingAddressUpdateSuccessMsg");
	}
}