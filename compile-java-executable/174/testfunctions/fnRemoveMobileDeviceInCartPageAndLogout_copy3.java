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

class fnremovemobiledeviceincartpageandlogout_copy3 {

	public static void fnremovemobiledeviceincartpageandlogout_copy3() {
		tg.wait("ele_edit3Dots", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_edit3Dots", 1);
		tg.wait("ele_removeDeviceInCart", ComparisonType.IS_INVISIBLE, 10);
		tg.click("ele_removeDeviceInCart", 1);
		tg.wait("ele_CheckRemoveButton", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_CheckRemoveButton", 1);
		tg.wait("ele_clickRemoveCTA", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_clickRemoveCTA", 1);
		tg.wait("ele_click3dotsHomeBAU", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_click3dotsHomeBAU", 1);
		tg.wait("ele_clickMyAccount", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_clickMyAccount", 1);
		tg.wait("ele_clickUserHeader", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_clickUserHeader", 1);
		tg.wait("ele_logout", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_logout", 1);
	}
}