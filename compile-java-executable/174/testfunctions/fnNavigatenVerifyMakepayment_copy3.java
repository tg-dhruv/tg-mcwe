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

class fnnavigatenverifymakepayment_copy3 {

	public static void fnnavigatenverifymakepayment_copy3() {
		tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_makeAPaymentHeader", 1);
		tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
		tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addPaymentMethod", 1);
		tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_backButton", 1);
		START_CUSTOM_SCRIPT;
		        int waitSeconds = 15;
		END_CUSTOM_SCRIPT;
		// ---------- Check 1: Pay Now button ----------
		START_CUSTOM_SCRIPT;
		        {
		            By by = By.xpath("//button[@aria-label='Pay Now']");
		            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
		            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
		            boolean clickable = el.isDisplayed() && el.isEnabled();
		            System.out.println("Pay Now clickable: " + clickable);
		            if (!clickable) {
		                throw new AssertionError("Pay Now is NOT clickable");
		            }
		        }
		END_CUSTOM_SCRIPT;
		// ---------- Check 2: Total balance radio (use clickable container, not inner
		START_CUSTOM_SCRIPT;
		        {
		END_CUSTOM_SCRIPT;
		// Move up to the nearest clickable container; spans are often not 'enabled'
		START_CUSTOM_SCRIPT;
		            By by = By.xpath("//span[text()='Total balance']/ancestor::*[self::label or self::div][1]");
		            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
		            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
		            boolean clickable = el.isDisplayed() && el.isEnabled();
		            System.out.println("Total balance (container) clickable: " + clickable);
		            if (!clickable) {
		                throw new AssertionError("Total balance container is NOT clickable");
		            }
		        }
		END_CUSTOM_SCRIPT;
		if(tg.performAssert("ele_addpayment", ComparisonType.IS_VISIBLE)){
		// ---------- Check 3: Add Payment Method button ----------
		START_CUSTOM_SCRIPT;
		        {
		            By by = By.xpath("//*[@id='addPaymentMethod-btn']/span");
		            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
		            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
		            boolean clickable = el.isDisplayed() && el.isEnabled();
		            System.out.println("Add Payment Method clickable: " + clickable);
		            if (!clickable) {
		                throw new AssertionError("Add Payment Method is NOT clickable");
		            }
		        }
		END_CUSTOM_SCRIPT;
		} else {
		tg.check.isVisible("ele_SavedCard");
		}
		// ---------- Check 4: Date picker button ----------
		START_CUSTOM_SCRIPT;
		        {
		            By by = By.xpath("//*[@class='duet-date__toggle-icon']");
		            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(waitSeconds));
		            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
		            boolean clickable = el.isDisplayed() && el.isEnabled();
		            System.out.println("Date picker clickable: " + clickable);
		            if (!clickable) {
		                throw new AssertionError("Date picker is NOT clickable");
		            }
		        }
		END_CUSTOM_SCRIPT;
	}
}