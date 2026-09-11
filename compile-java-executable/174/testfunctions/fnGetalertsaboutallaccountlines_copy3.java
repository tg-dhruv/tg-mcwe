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

class fngetalertsaboutallaccountlines_copy3 {

	public static void fngetalertsaboutallaccountlines_copy3() {
		tg.switchToTab(1);
		// ===== Custom: Turn ON "Get alerts about all account lines" if OFF =====
		START_CUSTOM_SCRIPT;
		        try {
		END_CUSTOM_SCRIPT;
		// Locate the toggle INPUT element
		START_CUSTOM_SCRIPT;
		            org.openqa.selenium.By toggleInputBy =
		                org.openqa.selenium.By.id("mat-slide-toggle-1-input");
		            org.openqa.selenium.WebElement toggleInput =
		                driver.findElement(toggleInputBy);
		END_CUSTOM_SCRIPT;
		// Read current state from aria-checked
		START_CUSTOM_SCRIPT;
		            String currentState = toggleInput.getAttribute("aria-checked");
		            boolean isOn = "true".equalsIgnoreCase(currentState);
		            System.out.println("[Alerts Toggle] Initial state: " + currentState);
		END_CUSTOM_SCRIPT;
		// If OFF → turn ON
		START_CUSTOM_SCRIPT;
		            if (!isOn) {
		END_CUSTOM_SCRIPT;
		// Scroll into view
		START_CUSTOM_SCRIPT;
		                ((org.openqa.selenium.JavascriptExecutor) driver)
		                    .executeScript(
		                        "arguments[0].scrollIntoView({block:'center'});",
		                        toggleInput
		                    );
		END_CUSTOM_SCRIPT;
		// Click using JS (more reliable for hidden inputs)
		START_CUSTOM_SCRIPT;
		                ((org.openqa.selenium.JavascriptExecutor) driver)
		                    .executeScript("arguments[0].click();", toggleInput);
		END_CUSTOM_SCRIPT;
		// Small wait (~200 ms) to allow UI update
		START_CUSTOM_SCRIPT;
		                long start = System.nanoTime();
		                while (System.nanoTime() - start < 200_000_000L) { }
		END_CUSTOM_SCRIPT;
		// Re-validate state
		START_CUSTOM_SCRIPT;
		                String updatedState = toggleInput.getAttribute("aria-checked");
		                System.out.println("[Alerts Toggle] After click state: " + updatedState);
		                if (!"true".equalsIgnoreCase(updatedState)) {
		                    throw new AssertionError(
		                        "Toggle was OFF and clicked, but did not turn ON."
		                    );
		                }
		END_CUSTOM_SCRIPT;
		} else {
		START_CUSTOM_SCRIPT;
		((org.openqa.selenium.JavascriptExecutor) driver)
		        .executeScript("arguments[0].click();", toggleInput);
		        long pauseOff = System.nanoTime();
		        while (System.nanoTime() - pauseOff < 300_000_000L) { } // 300ms
		        ((org.openqa.selenium.JavascriptExecutor) driver)
		        .executeScript("arguments[0].click();", toggleInput);
		        long pauseOn = System.nanoTime();
		        while (System.nanoTime() - pauseOn < 300_000_000L) { } // 300ms
		        } }catch (Exception e) {
		            throw new RuntimeException(
		                "Failed to ensure 'Get alerts about all account lines' toggle is ON.",
		                e
		            );
		        }
		END_CUSTOM_SCRIPT;
		// ===== End custom =====
		// ===== Custom: Validate alert confirmation message is displayed =====
		START_CUSTOM_SCRIPT;
		try {
		    org.openqa.selenium.By alertMsgBy =
		        org.openqa.selenium.By.xpath(
		            "//span[contains(text(),'Alerts set to on')]"
		        );
		    org.openqa.selenium.WebElement alertMessage =
		        driver.findElement(alertMsgBy);
		    if (!alertMessage.isDisplayed()) {
		        throw new AssertionError(
		            "Alert confirmation message is not displayed"
		        );
		    }
		    System.out.println(
		        "[Assertion Passed] Alert confirmation message is displayed: "
		        + alertMessage.getText()
		    );
		} catch (Exception e) {
		    throw new RuntimeException(
		        "Failed to verify alert confirmation message for 'Get alerts about all account lines'",
		        e
		    );
		}
		END_CUSTOM_SCRIPT;
		// ===== End Custom =====
		tg.printLogs("Alert message is getting displayed");
	}
}