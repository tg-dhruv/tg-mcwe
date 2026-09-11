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

class fnsharedataforpublicandscientificresearch_copy2 {

	public static void fnsharedataforpublicandscientificresearch_copy2() {
		tg.switchToTab(1);
		// ===== Custom: If toggle is OFF, turn it ON; then assert it is ON =====
		// 1) Indicator span you provided
		START_CUSTOM_SCRIPT;
		    By indicatorBy = By.xpath("(//div/form/fieldset/div/div[1]/label/span[2])[2]");
		    WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		    WebElement indicatorSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(indicatorBy));
		END_CUSTOM_SCRIPT;
		// 2) Resolve the
		START_CUSTOM_SCRIPT;
		    WebElement label = indicatorSpan.findElement(By.xpath("./ancestor::label[1]"));
		    String inputId = label.getAttribute("for");
		    if (inputId == null || inputId.isEmpty()) {
		        throw new AssertionError("Could not resolve input id from the label's 'for' attribute.");
		    }
		END_CUSTOM_SCRIPT;
		// 3) Get the input element and state
		START_CUSTOM_SCRIPT;
		    By inputBy = By.id(inputId);
		    WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(inputBy));
		    boolean isOn = input.isSelected(); // true => ON, false => OFF
		    String ariaChecked  = input.getAttribute("aria-checked");   // may be null
		    String disabledAttr = input.getAttribute("disabled");       // may be null
		    String ariaDisabled = input.getAttribute("aria-disabled");  // may be null
		    boolean isDisabled  = (disabledAttr != null) || "true".equalsIgnoreCase(String.valueOf(ariaDisabled));
		    System.out.println("[ToggleEnsureON] Input id        : " + inputId);
		    System.out.println("[ToggleEnsureON] Initial selected: " + isOn);
		    System.out.println("[ToggleEnsureON] aria-checked    : " + ariaChecked);
		    System.out.println("[ToggleEnsureON] disabled/aria   : " + disabledAttr + " / " + ariaDisabled);
		END_CUSTOM_SCRIPT;
		// 4) If OFF and not disabled, click label to turn ON
		START_CUSTOM_SCRIPT;
		    if (!isOn) {
		        if (isDisabled) {
		            throw new AssertionError("Cannot toggle ON: control is disabled (disabled=" + disabledAttr + ", aria-disabled=" + ariaDisabled + ").");
		        }
		END_CUSTOM_SCRIPT;
		// Bring into view and click label (more reliable than input.click() in reactive UIs)
		START_CUSTOM_SCRIPT;
		((JavascriptExecutor) driver).executeScript(
		    "arguments[0].scrollIntoView({block:'center'});",
		    label
		);
		
		try {
		    Thread.sleep(500);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		}
		
		WebElement clickableLabel = wait.until(ExpectedConditions.elementToBeClickable(label));
		
		try {
		    clickableLabel.click();
		} catch (ElementClickInterceptedException e) {
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickableLabel);
		}
		END_CUSTOM_SCRIPT;
		// 5) Re-verify turned ON (allow UI to update)
		START_CUSTOM_SCRIPT;
		        boolean turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(8))
		                .until(drv -> drv.findElement(inputBy).isSelected());
		END_CUSTOM_SCRIPT;
		// Fallback: try JS click on the input if label click didn't flip it
		START_CUSTOM_SCRIPT;
		        if (!turnedOn) {
		            try {
		                WebElement inputAgain = driver.findElement(inputBy);
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", inputAgain);
		                turnedOn = new WebDriverWait(driver, java.time.Duration.ofSeconds(5))
		                        .until(drv -> drv.findElement(inputBy).isSelected());
		            } catch (Exception ignore) { /* best effort */ }
		        }
		        System.out.println("[ToggleEnsureON] After click, selected: " + driver.findElement(inputBy).isSelected());
		        if (!turnedOn) {
		            throw new AssertionError("Expected toggle to turn ON after click(s), but it remained OFF.");
		        }
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		        System.out.println("[ToggleEnsureON] Toggle already ON; no click performed.");
		    }
		END_CUSTOM_SCRIPT;
		// ===== End custom =====
		tg.wait("ele_ChangedSaved", ComparisonType.IS_VISIBLE, 10);
	}
}