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

class fnnavigatepayment_copy2 {

	public static void fnnavigatepayment_copy2() {
		tg.wait("ele_makeAPaymentHeader", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_makeAPaymentHeader", 1);
		tg.wait("ele_payYourBillHeader", ComparisonType.IS_VISIBLE);
		tg.wait("ele_addPaymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addPaymentMethod", 1);
		tg.wait("ele_bankpreferred", ComparisonType.IS_VISIBLE, 10);
	}
}