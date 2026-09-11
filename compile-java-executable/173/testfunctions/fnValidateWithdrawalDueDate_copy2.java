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

class fnvalidatewithdrawalduedate_copy2 {

	public static void fnvalidatewithdrawalduedate_copy2() {
		tg.wait("ele_paymentScheduleDropDown", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_paymentScheduleDropDown");
		START_CUSTOM_SCRIPT;
		String dueDateText = driver.findElement(org.openqa.selenium.By.xpath("//p[@id='autopay-billduedate-text']")).getText();
		String withdrawalText = driver.findElement(org.openqa.selenium.By.xpath("//button[@id='autopay-payment-date-menu-id-selection-trigger']//span")).getText();
		int dueDay = Integer.parseInt(dueDateText.replaceAll("\\D+", ""));
		int withdrawalDay = Integer.parseInt(withdrawalText.replaceAll("\\D+", ""));
		if (withdrawalDay <= (dueDay - 2)) {
		    System.out.println("PASS: Withdrawal date follows Due Date - 2 logic");
		} else {
		    throw new AssertionError("FAIL: Withdrawal date logic mismatch");
		}
		END_CUSTOM_SCRIPT;
	}
}