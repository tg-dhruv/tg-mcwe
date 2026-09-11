import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import java.time.Duration;
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

class fnmanageaddons_copy3 {

	public static void fnmanageaddons_copy3() {
		tg.wait("ele_Manageaddonsandbenefits", ComparisonType.IS_VISIBLE);
		tg.click("ele_Manageaddonsandbenefits", 1);
		tg.wait(15);
		tg.scrollToElement("ele_FamilyAllowances2", Direction.DOWN);
		// [DISABLED] tg.scrollToElement("ele_FamilyAllowances", Direction.DOWN);
		tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE);
		tg.click("ele_FamilyAllowances", 1);
		tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
		tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinAddONs", 1);
		tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE);
		tg.click("ele_AgreeSubmitinAddONs", 1);
		tg.check.isVisible("ele_NewAddOns");
		tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_ManageAddONs", 1);
		tg.wait(15);
		// [DISABLED] tg.scrollToElement("ele_FamilyAllowances", Direction.DOWN);
		tg.wait("ele_FamilyAllowances", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_FamilyAllowances", 1);
		tg.wait("ele_SPANENTIPMessagingFr1", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_SPANENTIPMessagingFr1", 1);
		tg.wait("ele_AgreetoRemoveAddONs", ComparisonType.IS_VISIBLE);
		tg.click("ele_AgreetoRemoveAddONs", 1);
		tg.wait("ele_ContinueinAddONs", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinAddONs", 1);
		tg.wait("ele_AgreeSubmitinAddONs", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_AgreeSubmitinAddONs", 1);
		tg.check.isVisible("ele_RemovedAddOns");
		tg.wait("ele_ManageAddONs", ComparisonType.IS_VISIBLE, 20);
	}
}