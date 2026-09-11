import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
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

class fnaddbankaccount_copy {

	public static void fnaddbankaccount_copy() {
		tg.wait("ele_BillingPreferences", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_BillingPreferences");
		tg.click("ele_BillingPreferences", 1);
		tg.wait("ele_paymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_paymentMethod");
		tg.click("ele_paymentMethod", 1);
		tg.wait("ele_bankMethod", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_bankMethod");
		tg.click("ele_bankMethod", 1);
		tg.wait("ele_orenteracc479", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_orenteracc479");
		tg.click("ele_orenteracc479", 1);
	}
}