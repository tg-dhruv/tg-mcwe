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

class fnaddingaddons_copy {

	public static void fnaddingaddons_copy() {
		tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_FamilyAllowances", 1);
		tg.wait("ele_entMessageAddon3", ComparisonType.IS_VISIBLE, 8);
		tg.click("ele_entMessageAddon3", 1);
		tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ContinueinAddONs", 1);
		tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_AgreeSubmitinAddONs", 1);
		tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 8);
		tg.click("ele_ManageAddONs", 1);
		tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_FamilyAllowances", 1);
		tg.wait("ele_AgreetoRemoveAddONs", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_AgreetoRemoveAddONs", 1);
		tg.wait("ele_entMessageAddon3", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_entMessageAddon3", 1);
		tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ContinueinAddONs", 1);
		tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_AgreeSubmitinAddONs", 1);
		tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
	}
}