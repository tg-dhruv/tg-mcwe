import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.time.Duration;
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

class fnupdatee911address_copy2 {

	public static void fnupdatee911address_copy2() {
		// [DISABLED] tg.wait("ele_e911Addressline1", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] try
		// [DISABLED] {
		// [DISABLED] WebElement addresselement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1"));
		// [DISABLED] String addressText = addresselement.getAttribute("value");
		// [DISABLED] System.out.println("address text is "+addressText);
		// [DISABLED] if (addressText.contains("RAVINIA"))
		// [DISABLED] {
		// [DISABLED] System.out.println("address text inside if block "+addressText);
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).sendKeys("12920 SE 38th");
		// [DISABLED] }
		// [DISABLED] else
		// [DISABLED] {
		// [DISABLED] System.out.println("address text inside else block "+addressText);
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-street1")).sendKeys("1 RAVINIA DR");
		// [DISABLED] }
		// [DISABLED] WebElement cityelement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city"));
		// [DISABLED] String cityText = cityelement.getAttribute("value");
		// [DISABLED] System.out.println("city text is "+cityText);
		// [DISABLED] if (cityText.contains("Bellevue"))
		// [DISABLED] {
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).sendKeys("ATLANTA");
		// [DISABLED] }
		// [DISABLED] else
		// [DISABLED] {
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-city")).sendKeys("Bellevue");
		// [DISABLED] }
		// [DISABLED] WebElement zipCodeElement = driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode"));
		// [DISABLED] String zipCode = zipCodeElement.getAttribute("value");
		// [DISABLED] if (zipCode.contains("30346"))
		// [DISABLED] {
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).sendKeys("98006");
		// [DISABLED] }
		// [DISABLED] else
		// [DISABLED] {
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).clear();
		// [DISABLED] driver.findElement(By.id("field-formFieldAddress-ff86e4b2da-zipCode")).sendKeys("30346");
		// [DISABLED] }
		// [DISABLED] }
		// [DISABLED] catch(Exception e)
		// [DISABLED] {
		// [DISABLED] System.out.println(e);
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] tg.wait("ele_e911AddressCheckbox", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.check.isVisible("ele_e911AddressCheckbox");
		// [DISABLED] tg.click("ele_e911AddressCheckbox", 1);
		tg.wait("ele_E911AddressSuccessfullySavedMessage", ComparisonType.IS_VISIBLE, 15);
		tg.check.isVisible("ele_E911AddressSuccessfullySavedMessage");
		tg.wait("ele_fieldformf928", ComparisonType.IS_VISIBLE);
		tg.click("ele_fieldformf928", 1);
		tg.type("ele_fieldformf928", "1771 CALLE SAN ALEJANDRO SAN JUAN PR 00927");
		tg.wait("ele_litgwebcom293", ComparisonType.IS_VISIBLE);
		tg.click("ele_litgwebcom293", 1);
		tg.wait("ele_applythise879", ComparisonType.IS_VISIBLE);
		tg.click("ele_applythise879", 1);
		tg.wait("ele_e911YesContinue", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_e911YesContinue");
		tg.click("ele_e911YesContinue", 1);
		tg.wait("ele_saveButtonAddress", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_saveButtonAddress");
		tg.click("ele_saveButtonAddress", 1);
		// [DISABLED] tg.click("ele_useSuggestedAddress", 1);
		// [DISABLED] tg.wait("ele_fieldformf928", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.wait("ele_applythise947", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_applythise947", 1);
	}
}