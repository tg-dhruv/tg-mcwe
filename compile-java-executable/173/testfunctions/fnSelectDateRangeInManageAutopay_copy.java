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

class fnselectdaterangeinmanageautopay_copy {

	public static void fnselectdaterangeinmanageautopay_copy() {
		tg.wait("ele_DateSelectionDropdown", ComparisonType.IS_VISIBLE);
		tg.click("ele_DateSelectionDropdown", 1);
		tg.wait("ele_litgwebcom953", ComparisonType.IS_VISIBLE);
		tg.click("ele_litgwebcom953", 1);
		tg.wait("ele_autopayfaq352", ComparisonType.IS_VISIBLE);
		tg.click("ele_autopayfaq352", 1);
		tg.wait("ele_buttontgwe885", ComparisonType.IS_VISIBLE);
		tg.wait("ele_savechange307", ComparisonType.IS_VISIBLE);
		tg.click("ele_savechange307", 1);
	}
}