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

class fnentercarddetails_1 {

	public static void fnentercarddetails_1() {
		tg.wait("ele_nameOnCardField", ComparisonType.IS_VISIBLE, 10);
		tg.type("ele_nameOnCardField", "TestUser");
		tg.wait("ele_cardNumberField", ComparisonType.IS_VISIBLE, 5);
		tg.type("ele_cardNumberField", "4046653400000000");
		tg.wait("ele_expirationDateField", ComparisonType.IS_VISIBLE, 5);
		tg.type("ele_expirationDateField", "04/29");
		tg.wait("ele_cvvField", ComparisonType.IS_VISIBLE, 5);
		tg.type("ele_cvvField", "444");
		tg.wait("ele_zipCodeField", ComparisonType.IS_VISIBLE, 5);
		tg.type("ele_zipCodeField", "98006");
		tg.wait("ele_continueButtonForCard", ComparisonType.IS_VISIBLE, 5);
		tg.click("ele_continueButtonForCard", 1);
	}
}