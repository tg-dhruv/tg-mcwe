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

class fnbankaccountdetails_copy2 {

	public static void fnbankaccountdetails_copy2() {
		tg.wait("ele_nameOnAccountField", ComparisonType.IS_VISIBLE, 10);
		if(tg.performAssert("ele_nameOnAccountField", ComparisonType.IS_VISIBLE)){
		tg.type("ele_nameOnAccountField", var_AccountName);
		tg.wait("ele_routingNumberField", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_routingNumberField", var_RoutingNumber);
		tg.wait("ele_accountNumberField1", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_accountNumberField1", var_AccountNumber);
		tg.wait("ele_reEnterAccountNumber", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_reEnterAccountNumber", var_AccountNumber);
		START_CUSTOM_SCRIPT;
		try {
		END_CUSTOM_SCRIPT;
		// Scroll dropdown into view
		START_CUSTOM_SCRIPT;
		    WebElement dd = driver.findElement(By.xpath("//*[@id='lbx-formEcheck-selectaccountType']"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dd);
		END_CUSTOM_SCRIPT;
		// Try native
		START_CUSTOM_SCRIPT;
		    if ("select".equalsIgnoreCase(dd.getTagName())) {
		        new org.openqa.selenium.support.ui.Select(dd).selectByVisibleText("Personal - Checking");
		        System.out.println("Selected 'Personal - Checking' via native <select>.");
		END_CUSTOM_SCRIPT;
		} else {
		// Custom dropdown fallback: click to open, then click option by text
		START_CUSTOM_SCRIPT;
		        dd.click();
		END_CUSTOM_SCRIPT;
		// Wait for option to be clickable and click it
		START_CUSTOM_SCRIPT;
		        org.openqa.selenium.support.ui.WebDriverWait wait =
		            new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		        By option = By.xpath("//*[normalize-space(.)='Personal - Checking']");
		        WebElement opt = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(option));
		        opt.click();
		        System.out.println("Selected 'Personal - Checking' via custom dropdown.");
		    }
		} catch (Exception ex) {
		    System.out.println("Account Type selection failed: " + ex.getMessage());
		    throw ex; // rethrow to ensure TestGrid marks the step/test as failed
		}
		try {
		    By submitBy = By.xpath("//*[@id='lbx-formEcheck-submit']");
		END_CUSTOM_SCRIPT;
		// Wait for presence/visibility and clickability
		START_CUSTOM_SCRIPT;
		    org.openqa.selenium.support.ui.WebDriverWait wait =
		        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		    WebElement submit = wait.until(
		        org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(submitBy)
		    );
		END_CUSTOM_SCRIPT;
		// Scroll into view (center) to avoid overlay/viewport issues
		START_CUSTOM_SCRIPT;
		    ((org.openqa.selenium.JavascriptExecutor)driver)
		        .executeScript("arguments[0].scrollIntoView({block:'center'});", submit);
		END_CUSTOM_SCRIPT;
		// Wait until clickable and click
		START_CUSTOM_SCRIPT;
		    submit = wait.until(
		        org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(submitBy)
		    );
		    submit.click();
		    System.out.println("Clicked Submit (id=lbx-formEcheck-submit).");
		} catch (Exception ex) {
		    System.out.println("Submit click failed: " + ex.getMessage());
		    throw ex; // rethrow to ensure TestGrid marks the step as failed
		}
		END_CUSTOM_SCRIPT;
		}
		START_CUSTOM_SCRIPT;
try {
    By agreeBy = By.xpath("//*[@id='lbx-echeckConfirmationPage-submit']");

    // Build a wait
    org.openqa.selenium.support.ui.WebDriverWait wait =
        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(15));

    // Wait for visibility
    WebElement agreeBtn = wait.until(
        org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(agreeBy)
    );

    // Scroll into view to avoid intercept/viewport issues
    ((org.openqa.selenium.JavascriptExecutor)driver)
        .executeScript("arguments[0].scrollIntoView({block:'center'});", agreeBtn);

    // Wait until clickable and click
    agreeBtn = wait.until(
        org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(agreeBy)
    );
    agreeBtn.click();

    System.out.println("Clicked 'Agree & Continue' (id=lbx-echeckConfirmationPage-submit).");
} catch (Exception ex) {
    System.out.println("'Agree & Continue' click failed: " + ex.getMessage());
    throw ex; // rethrow so TestGrid marks the step as failed
}
END_CUSTOM_SCRIPT;
	}
}