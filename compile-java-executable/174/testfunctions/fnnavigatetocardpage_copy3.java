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

class fnnavigatetocardpage_copy3 {

	public static void fnnavigatetocardpage_copy3() {
		tg.wait("ele_mainprofile", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_mainprofile", 1);
		// [DISABLED] tg.wait("ele_Profile", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_profileneww", 1);
		tg.wait("ele_BillPref", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_BillPref", 1);
		tg.wait("ele_Paperless", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_Paperless", 1);
		tg.wait("ele_UpdateBillingAddress", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_UpdateBillingAddress", 1);
	}
}