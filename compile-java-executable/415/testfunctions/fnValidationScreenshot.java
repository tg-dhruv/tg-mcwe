import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import static io.testgrid.enums.KeyboardKeys.*;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import org.openqa.selenium.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static io.testgrid.baseClass.driver;


class fnvalidationscreenshot {

	public static void fnvalidationscreenshot() {
		tg.type("ele_Environment_3a1c9843", "Desktop");
		tg.type("ele_Directory_3a1c9843", "C:\\Tosca_Projects\\ToscaCommander\\ScreenShots\\TMO\\{Date}\\");
		tg.type("ele_SelectScreen_3a1c9843", "Active Window");
	}
}
