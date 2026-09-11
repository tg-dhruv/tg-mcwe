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

class fnvalidatemultilinebillbreakdown_copy {

	public static void fnvalidatemultilinebillbreakdown_copy() {
		tg.wait("ele_ByLineButton", ComparisonType.IS_VISIBLE, 10);
		START_CUSTOM_SCRIPT;
		try {
		END_CUSTOM_SCRIPT;
		tg.click("ele_ByLineButton");
		START_CUSTOM_SCRIPT;
		  } catch (Exception e) {
		    throw new RuntimeException("no multiline break downs. Use correct ban");
		}
		END_CUSTOM_SCRIPT;
	}
}