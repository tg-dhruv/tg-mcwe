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

class fnenablerequirementf2fa_copy3 {

	public static void fnenablerequirementf2fa_copy3() {
		tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditProfile", 1);
		tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE);
		tg.click("ele_Alwaysrequire2FA", 1);
		tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.check.isVisible("ele_Successfullyupdated2FA");
		tg.printLogs("Successfully Updated 2FA");
		tg.wait("ele_Alwaysrequire2FA", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_Alwaysrequire2FA", 1);
		// [DISABLED] tg.check.isVisible("ele_Successfullyupdated2FA");
		tg.printLogs("Successfully Updated 2FA");
	}
}