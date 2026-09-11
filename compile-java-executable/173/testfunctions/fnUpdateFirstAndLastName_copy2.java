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

class fnupdatefirstandlastname_copy2 {

	public static void fnupdatefirstandlastname_copy2() {
		tg.wait(10);
		tg.wait("ele_editAddressProfileFirstName", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_editAddressProfileFirstName");
		// [DISABLED] tg.click("ele_editAddressProfileFirstName", 1);
		tg.type("ele_editAddressProfileFirstName", "NICK");
		tg.wait("ele_editAddressProfileLastName", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_editAddressProfileLastName");
		// [DISABLED] tg.click("ele_editAddressProfileLastName", 1);
		tg.type("ele_editAddressProfileLastName", "RONALDO");
		tg.wait("ele_SaveUpdateName", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_SaveUpdateName");
		tg.click("ele_SaveUpdateName", 1);
	}
}