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
import org.openqa.selenium.interactions.Actions;

class fnvalidatepayementdatedropdownandselectadifferentdate_copy {

	public static void fnvalidatepayementdatedropdownandselectadifferentdate_copy() {
		tg.wait("ele_paymentDateDropDown", ComparisonType.IS_VISIBLE, 25);
		tg.check.isVisible("ele_paymentDateDropDown");
		if(tg.performAssert("ele_paymentDateDropDown", ComparisonType.IS_VISIBLE)){
		START_CUSTOM_SCRIPT;
		WebElement dateDD = driver.findElement(By.xpath("//button[@id='autopay-payment-date-menu-id-selection-trigger']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(dateDD).click().build().perform();
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.click("ele_paymentDateDropDown", 1);
		}
		tg.wait(10);
		tg.check.isVisible("ele_paymentDateDropDown3rdElement");
		if(tg.performAssert("ele_paymentDateDropDown3rdElement", ComparisonType.IS_VISIBLE)){
		tg.click("ele_paymentDateDropDown3rdElement", 1);
		}
	}
}