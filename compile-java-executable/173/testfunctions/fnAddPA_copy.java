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

class fnaddpa_copy {

	public static void fnaddpa_copy() {
		tg.wait("ele_addpaymentButton01", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addpaymentButton01", 1);
		tg.wait("ele_providePaymentMethodNextTime", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_providePaymentMethodNextTime", 1);
		tg.wait("ele_continueButtonPaymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continueButtonPaymentMethod", 1);
		tg.wait("ele_agreeaButtonForPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_agreeaButtonForPA", 1);
		tg.wait("ele_doneButtonForPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_doneButtonForPA", 1);
	}
}