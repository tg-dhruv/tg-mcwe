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

class fndonotsellorsharedata {

	public static void fndonotsellorsharedata() {
		tg.switchToTab(1);
		// ===== Custom: Ensure "We may sell or share..." toggle is ON if currently OFF (no WebDriverWait) =====
		START_CUSTOM_SCRIPT;
		try {
		END_CUSTOM_SCRIPT;
		// 1) Locate the label by its exact visible text
		START_CUSTOM_SCRIPT;
		    org.openqa.selenium.By labelBy = org.openqa.selenium.By.xpath(
		        "//label[normalize-space()='We may sell or share your personal information on this website or app']"
		    );
		END_CUSTOM_SCRIPT;
		// Try to get the label (simple direct find; if not present, throw)
		START_CUSTOM_SCRIPT;
		    org.openqa.selenium.WebElement label = driver.findElement(labelBy);
		END_CUSTOM_SCRIPT;
		// 2) Resolve the associated input via the label's 'for' attribute
		START_CUSTOM_SCRIPT;
		    String inputId = label.getAttribute("for");
		    if (inputId == null || inputId.trim().isEmpty()) {
		        throw new AssertionError("Unable to resolve input id from label 'for'.");
		    }
		    org.openqa.selenium.By inputBy = org.openqa.selenium.By.id(inputId);
		    org.openqa.selenium.WebElement input = driver.findElement(inputBy);
		    boolean isOn = input.isSelected();
		    boolean isDisabled =
		        "true".equalsIgnoreCase(String.valueOf(input.getAttribute("aria-disabled"))) ||
		        input.getAttribute("disabled") != null;
		    System.out.println("[DNS Toggle - NoWait] Input id        : " + inputId);
		    System.out.println("[DNS Toggle - NoWait] Initial selected: " + isOn);
		    System.out.println("[DNS Toggle - NoWait] Disabled        : " + isDisabled);
		END_CUSTOM_SCRIPT;
		// 3) If OFF and not disabled, click the label to turn it ON
		START_CUSTOM_SCRIPT;
		    if (!isOn) {
		        if (isDisabled) {
		            throw new AssertionError("Toggle is disabled; cannot enable.");
		        }
		END_CUSTOM_SCRIPT;
		// Bring into view (use JS) and click label
		START_CUSTOM_SCRIPT;
		        ((org.openqa.selenium.JavascriptExecutor) driver)
		            .executeScript("arguments[0].scrollIntoView({block:'center'});", label);
		END_CUSTOM_SCRIPT;
		// Attempt click on label
		START_CUSTOM_SCRIPT;
		        label.click();
		END_CUSTOM_SCRIPT;
		// 4) Re-verify ON with a tiny manual retry (no WebDriverWait)
		START_CUSTOM_SCRIPT;
		        boolean turnedOn = false;
		        for (int i = 0; i < 5; i++) { // retry a few times to allow the UI to reflect the change
		            try {
		END_CUSTOM_SCRIPT;
		// small, inline pause without Thread.sleep (busy-wait micro-delay)
		START_CUSTOM_SCRIPT;
		                long start = System.nanoTime();
		                while (System.nanoTime() - start < 150_000_000L) { /* ~150ms */ }
		                org.openqa.selenium.WebElement check = driver.findElement(inputBy);
		                if (check.isSelected()) {
		                    turnedOn = true;
		                    break;
		                }
		            } catch (Exception ignore) { /* element may be refreshing; ignore and retry */ }
		        }
		END_CUSTOM_SCRIPT;
		// Fallback: JS click the input if label click didn't work
		START_CUSTOM_SCRIPT;
		        if (!turnedOn) {
		            try {
		                org.openqa.selenium.WebElement inputAgain = driver.findElement(inputBy);
		                ((org.openqa.selenium.JavascriptExecutor) driver)
		                    .executeScript("arguments[0].click();", inputAgain);
		END_CUSTOM_SCRIPT;
		// One more simple re-check
		START_CUSTOM_SCRIPT;
		                long start = System.nanoTime();
		                while (System.nanoTime() - start < 200_000_000L) { /* ~200ms */ }
		                turnedOn = driver.findElement(inputBy).isSelected();
		            } catch (Exception ignore) { /* best effort */ }
		        }
		        System.out.println("[DNS Toggle - NoWait] After click, isSelected: " + driver.findElement(inputBy).isSelected());
		        if (!turnedOn) {
		            throw new AssertionError("Expected toggle to turn ON after clicks, but it remained OFF.");
		        }
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		        System.out.println("[DNS Toggle - NoWait] Toggle already ON; no click performed.");
		    }
		END_CUSTOM_SCRIPT;
		// NOTE: No final hard assertion here (per your request).
		// If you want to fail the step when not ON, keep the AssertionError above; otherwise just log.
		START_CUSTOM_SCRIPT;
		} catch (Exception e) {
		    throw new RuntimeException("DNS toggle handling failed (no-wait variant).", e);
		}
		END_CUSTOM_SCRIPT;
		// ===== End custom =====
	}
}