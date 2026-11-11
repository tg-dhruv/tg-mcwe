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


class fndeleteexistingentryintimecard {

	public static void fndeleteexistingentryintimecard() {
				// [DISABLED] tg.click("ele_DeleteButtonEnabled_3a04da4d", 1);
				// [DISABLED] tg.wait(3);
			while (tg.verify.isInvisible("ele_DeleteButtonEnabled_3a04da4d")) {
				tg.check.isVisible("ele_DeleteButtonEnabled_3a04da4d");
				tg.click("ele_DeleteButtonEnabled_3a04da4d", 1);
				// [DISABLED] tg.wait(1);
			}
				tg.click("ele_SaveButton_3a0306c3", 1);
	}
}
