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

class fndeclineprotectionprospect_copy {

	public static void fndeclineprotectionprospect_copy() {
		tg.wait(5);
		tg.wait("ele_DeclineProtectionBTN", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_DeclineProtectionBTN", 1);
		tg.wait("ele_YesDeclineBtn", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_YesDeclineBtn");
		tg.click("ele_YesDeclineBtn", 1);
		tg.printLogs("----Declined protection 360----");
	}
}