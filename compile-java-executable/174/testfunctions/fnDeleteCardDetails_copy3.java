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

class fndeletecarddetails_copy3 {

	public static void fndeletecarddetails_copy3() {
		tg.wait("ele_EditCCard", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_EditCCard");
		tg.click("ele_EditCCard", 1);
		tg.wait("ele_DeleteCCButton", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_DeleteCCButton");
		tg.click("ele_DeleteCCButton", 1);
		tg.wait("ele_deleteCreditCardConfirm", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_deleteCreditCardConfirm");
		tg.click("ele_deleteCreditCardConfirm", 1);
		tg.click("ele_backButton", 1);
		tg.click("ele_backButton", 1);
		tg.click("ele_backButton", 1);
	}
}