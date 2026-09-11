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

class fncheckrateplanchange_copy {

	public static void fncheckrateplanchange_copy() {
		tg.wait("ele_ManagePlan", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_ManagePlan");
		tg.click("ele_ManagePlan", 1);
		tg.wait("ele_currentPlanCardDetails", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_currentPlanCardDetails");
		tg.wait("ele_selectYourNewPlan", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_selectYourNewPlan");
		tg.wait("ele_comparePlanButton", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_comparePlanButton");
		tg.wait("ele_selectPlanButton", ComparisonType.IS_VISIBLE, 10);
		tg.check.isEnabled("ele_selectPlanButton");
		tg.takeFullScreenshot();
	}
}