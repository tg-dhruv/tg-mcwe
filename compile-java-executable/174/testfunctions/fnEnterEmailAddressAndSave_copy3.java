import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
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

class fnenteremailaddressandsave_copy3 {

	public static void fnenteremailaddressandsave_copy3() {
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.wait("ele_Email", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.check.isVisible("ele_Email");
		// [DISABLED] tg.type("ele_Email", "test@gmail.com");
		// [DISABLED] tg.check.isVisible("ele_reenterema253");
		// [DISABLED] tg.click("ele_ConfirmEmailAddress", 1);
		// [DISABLED] tg.type("ele_reenterema253", "test@gmail.com");
		// [DISABLED] tg.check.isVisible("ele_SaveBtn");
		// [DISABLED] tg.click("ele_SaveBtn", 1);
		tg.printLogs("NEW");
		tg.wait("ele_emailaddre776", ComparisonType.IS_VISIBLE);
		tg.click("ele_emailaddre776", 1);
		tg.wait("ele_fieldemail372", ComparisonType.IS_VISIBLE);
		tg.click("ele_fieldemail372", 1);
		tg.wait("ele_fieldemail372", ComparisonType.IS_VISIBLE);
		tg.type("ele_fieldemail372", "test@gmail.com");
		tg.wait("ele_confirmema442", ComparisonType.IS_VISIBLE);
		tg.click("ele_confirmema442", 1);
		tg.wait("ele_confirmema704", ComparisonType.IS_VISIBLE);
		tg.click("ele_confirmema704", 1);
		tg.type("ele_confirmema704", "test@gmail.com");
		tg.wait("ele_save828", ComparisonType.IS_VISIBLE);
		tg.click("ele_save828", 1);
	}
}