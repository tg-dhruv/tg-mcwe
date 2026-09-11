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

class fnblockchargeablecontent {

	public static void fnblockchargeablecontent() {
		tg.wait("ele_BlockChargeableContent", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_BlockChargeableContent", 1);
		tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 30);
		tg.click("ele_TMOMailNet", 1);
		tg.wait("ele_TMOMailNet", ComparisonType.IS_VISIBLE, 20);
		tg.takeFullScreenshot();
		tg.printLogs("Toggle on/off TMOMailNet");
	}
}