import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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

class fnnavigatetosecuritydashboard_copy2 {

	public static void fnnavigatetosecuritydashboard_copy2() {
		tg.check.isVisible("ele_Security");
		if(tg.performAssert("ele_Security", ComparisonType.IS_VISIBLE)){
		tg.click("ele_Security", 1);
		}
		tg.check.isVisible("ele_securityDashboard");
		if(tg.performAssert("ele_securityDashboard", ComparisonType.IS_VISIBLE)){
		tg.click("ele_securityDashboard", 1);
		}
		tg.check.isVisible("ele_securityDashboardHeader1");
		if(tg.performAssert("ele_securityDashboardHeader1", ComparisonType.IS_VISIBLE)){
		tg.printLogs("Navigated successfully to Security Dashboard");
		}
	}
}