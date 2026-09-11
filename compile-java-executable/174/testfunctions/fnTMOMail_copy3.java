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

class fntmomail_copy3 {

	public static void fntmomail_copy3() {
		tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 35);
		tg.click("ele_TMOMailNet", 1);
		tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 30);
		tg.takeFullScreenshot();
		// [DISABLED] tg.wait("ele_notificationassertion", ComparisonType.IS_VISIBLE, 10);
		// ===== Custom: validate notification message =====
		START_CUSTOM_SCRIPT;
		WebElement notification = driver.findElement(
		        By.cssSelector(".tdds-notice-bar__content"));
		String message = (String) ((JavascriptExecutor) driver)
		        .executeScript("return arguments[0].innerText;", notification);
		System.out.println("User should see message: " + message);
		String expectedMessage =
		        "Settings for \"Block TMOmail.net email\" successfully changed.";
		if (message.trim().equals(expectedMessage)) {
		    System.out.println("Message matched");
		} else {
		    System.out.println("Message did not match");
		    System.out.println("Expected: " + expectedMessage);
		    System.out.println("Actual: " + message);
		}
		END_CUSTOM_SCRIPT;
		tg.wait(10);
		// ===== End custom =====
		tg.printLogs("Toggle on/off TMOMailNet completed");
	}
}