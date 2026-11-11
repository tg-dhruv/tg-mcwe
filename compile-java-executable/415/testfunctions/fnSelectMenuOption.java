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


class fnselectmenuoption {

	public static void fnselectmenuoption() {
		tg.check.isVisible("ele_MainMenuOption_3a03871b");
		tg.check.isVisible("ele_MainMenuOption_3a03871b");
		tg.check.isVisible("ele_SearchboxHome_3a07bc8a");
		tg.click("ele_SearchboxHome_3a07bc8a", 1);
		tg.type("ele_SearchboxHome_3a07bc8a", "menu");
		tg.check.isVisible("ele_Menu_3a07bc8a");
		tg.click("ele_Menu_3a07bc8a", 1);
	}
}
