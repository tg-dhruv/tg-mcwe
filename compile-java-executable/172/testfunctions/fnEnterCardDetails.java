import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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

class fnentercarddetails {

	public static void fnentercarddetails() {
		tg.typeEncrypted("ele_NameonCard", var_CC_Prod_Name);
		tg.wait("ele_CardNumber", ComparisonType.IS_VISIBLE, 10);
		tg.typeEncrypted("ele_CardNumber", var_CC_Prod_Number);
		tg.typeEncrypted("ele_ExpirationDate", var_CC_Prod_Exp);
		tg.typeEncrypted("ele_CVV", var_CC_Prod_CVV);
		tg.typeEncrypted("ele_ZipCode", var_CC_Prod_Zipcode);
		// [DISABLED] tg.click("ele_Continue", 1);
		// [DISABLED] tg.click("ele_clickAgreeAndSubmitButton", 1);
		// [DISABLED] tg.wait("ele_ContinuewNew", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.click("ele_ContinuewNew", 1);
		// [DISABLED] tg.wait("ele_PayNow", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] try {
		// [DISABLED] By payNowBy = By.xpath("//button[@aria-label='Pay Now']");
		// [DISABLED] org.openqa.selenium.support.ui.WebDriverWait wait =
		// [DISABLED] new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(20));
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Ensure overlays (if any) are gone — optional, adjust selectors if you have loaders/backdrops
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] try { wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(
		// [DISABLED] By.cssSelector(".loading,.spinner,.backdrop,.modal-backdrop,.cdk-overlay-backdrop"))); } catch (Exception ignore) {}
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Find and scroll
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] WebElement btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated(payNowBy));
		// [DISABLED] ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", btn);
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Wait for clickability (re-get after scroll)
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] btn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(payNowBy));
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Try normal click → Actions → JS
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] boolean clicked = false;
		// [DISABLED] try { btn.click(); clicked = true; }
		// [DISABLED] catch (Exception e1) {
		// [DISABLED] try { new org.openqa.selenium.interactions.Actions(driver).moveToElement(btn).click().perform(); clicked = true; }
		// [DISABLED] catch (Exception e2) {
		// [DISABLED] ((org.openqa.selenium.JavascriptExecutor)driver).executeScript("arguments[0].click();", btn);
		// [DISABLED] clicked = true;
		// [DISABLED] }
		// [DISABLED] }
		// [DISABLED] if (!clicked) throw new AssertionError("Failed to click Pay Now");
		// [DISABLED] System.out.println("✅ Clicked Pay Now (aria-label).");
		// [DISABLED] } catch (Exception ex) {
		// [DISABLED] System.out.println("❌ Pay Now click failed: " + ex.getMessage());
		// [DISABLED] throw ex; // make TestGrid fail correctly
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
	}
}