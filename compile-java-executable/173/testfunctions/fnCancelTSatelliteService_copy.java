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

class fncanceltsatelliteservice_copy {

	public static void fncanceltsatelliteservice_copy() {
		tg.wait("ele_agreeAndSubmitCancelTSAT", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_agreeAndSubmitCancelTSAT");
		tg.click("ele_agreeAndSubmitCancelTSAT", 1);
		tg.wait("ele_TSATCancelConfMsg", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_TSATCancelConfMsg");
		START_CUSTOM_SCRIPT;
		try {
		    WebElement dateSpan = driver.findElement(
		            By.cssSelector("span.rte-dialog--dynamicData--Editable.rte-dialog--dynamicData")
		        );
		        String actualDate = dateSpan.getText().trim();
		        assert dateSpan.isDisplayed() : "Date element is not visible on the page";
		        assert !actualDate.isEmpty() : "Date text is empty";
		        assert !actualDate.equals("cancelLineEndDate") : "Date is showing fallback placeholder, dynamic data did not load";
		        String datePattern = "^(January|February|March|April|May|June|July|August|September|October|November|December) \\d{1,2}(st|nd|rd|th), \\d{4}$";
		        assert actualDate.matches(datePattern) : "Date format is invalid. Actual value: " + actualDate;
		        System.out.println("Date validated successfully: " + actualDate);
		    }
		 catch(Exception e) {
		    System.out.println("Exception caught "+e);
		}
		tg.wait("ele_returnToAccount", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_returnToAccount");
		tg.click("ele_returnToAccount", 1);
		END_CUSTOM_SCRIPT;
	}
}