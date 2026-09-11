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

class fnfraudandidentitytheftprotection_copy3 {

	public static void fnfraudandidentitytheftprotection_copy3() {
		tg.switchToTab(1);
		// ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
		if(tg.performAssert("ele_Fraudandidentifytheftprotection", ComparisonType.IS_SELECTED)){
		tg.printLogs("Toggle already selected");
		} else {
		tg.click("ele_Fraudandidentifytheftprotection", 1);
		}
		// Locator changes and the custom expression written was complication so simplified it using testgrid actions
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] try {
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 1) Indicator span you provided
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] By indicatorBy = By.xpath("(//div/form/fieldset/div/div[1]/label/span[2])[1]");
		// [DISABLED] WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		// [DISABLED] WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 2) Resolve the
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
		// [DISABLED] String inputId = label.getAttribute("for");
		// [DISABLED] if (inputId == null || inputId.isEmpty()) {
		// [DISABLED] throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 3) Get the input element and state
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] By inputBy = By.id(inputId);
		// [DISABLED] WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
		// [DISABLED] boolean isOn = input.isSelected(); // true => ON, false => OFF
		// [DISABLED] String ariaChecked  = input.getAttribute("aria-checked");   // may be null
		// [DISABLED] String disabledAttr = input.getAttribute("disabled");       // may be null
		// [DISABLED] String ariaDisabled = input.getAttribute("aria-disabled");  // may be null
		// [DISABLED] boolean isDisabled  = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
		// [DISABLED] System.out.println("[ToggleEnsureON] Input id        : " + inputId);
		// [DISABLED] System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
		// [DISABLED] System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
		// [DISABLED] System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 4) If OFF and not disabled, click label to turn ON
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] if (!isOn) {
		// [DISABLED] if (isDisabled) {
		// [DISABLED] throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Bring into view and click label (more reliable than input.click() in reactive UIs)
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", label);
		// [DISABLED] WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
		// [DISABLED] clickableLabel.click();
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 5) Re-verify turned ON (allow UI to update)
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8))
		// [DISABLED] .until(drv -> drv.findElement(inputBy).isSelected());
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // Fallback: try JS click on the input if label click didn't flip it
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] if (!turnedOn) {
		// [DISABLED] try {
		// [DISABLED] WebElement inputAgain = driver.findElement(inputBy);
		// [DISABLED] ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
		// [DISABLED] turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5))
		// [DISABLED] .until(drv -> drv.findElement(inputBy).isSelected());
		// [DISABLED] } catch (Exception ignore) { /* best effort */ }
		// [DISABLED] }
		// [DISABLED] System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
		// [DISABLED] if (!turnedOn) {
		// [DISABLED] throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] } else {
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] // 6) Final assertion: ensure it is ON
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] String.valueOf(driver.findElement(inputBy).isSelected()),
		// [DISABLED] io.testgrid.enums.ComparisonType.EQUAL_TO,
		// [DISABLED] "true"
		// [DISABLED] );
		// [DISABLED] } catch (Exception e) {
		// [DISABLED] throw new RuntimeException("Failed to ensure toggle is ON via label flow.", e);
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// [DISABLED] END_CUSTOM_SCRIPT;
		// ===== End custom =====
		tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
	}
}