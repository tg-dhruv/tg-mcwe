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

class fnclickonpaybill_copy {

	public static void fnclickonpaybill_copy() {
		tg.wait("ele_denynotification", ComparisonType.IS_VISIBLE);
		tg.click("ele_denynotification", 1);
		tg.wait("ele_otherAmount", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_otherAmount", 1);
		tg.wait("ele_otherAmount", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_Calendar", 1);
		tg.wait("ele_Date", ComparisonType.IS_VISIBLE);
		tg.click("ele_Date", 1);
	}
}