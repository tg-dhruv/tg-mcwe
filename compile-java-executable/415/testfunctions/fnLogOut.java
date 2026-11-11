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


class fnlogout {

	public static void fnlogout() {
		if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
						tg.swipe("ele_MainMenuOption_3a03871b", Direction.UP);
						tg.check.isVisible("ele_MainMenuOption_3a03871b");
						tg.click("ele_SignOut_3a02637f", 1);
						if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_Yes_3a0705a6");
											tg.click("ele_Yes_3a0705a6", 1);
											// [DISABLED] tg.type("ele_Label_39e706aa", "Leave Site?");
											// [DISABLED] tg.type("ele_Button_39e706aa", "Leave");
						} else {
											tg.pressKey(ESCAPE, 1);
						}
						tg.wait(2);
		} else {
						if (tg.performAssert("ele_SignOut_3a02637f", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_SignOut_3a02637f");
											tg.click("ele_SignOut_3a02637f", 1);
											if (tg.performAssert("ele_Yes_3a0705a6", ComparisonType.IS_VISIBLE)) {
																	tg.check.isVisible("ele_Yes_3a0705a6");
																	tg.click("ele_Yes_3a0705a6", 1);
																	// [DISABLED] tg.type("ele_Label_39e706aa", "Leave Site?");
																	// [DISABLED] tg.type("ele_Button_39e706aa", "Leave");
											} else {
																	tg.pressKey(ESCAPE, 1);
											}
											tg.wait(2);
						} else {
												tg.wait(1);
												// [DISABLED] tg.pressKey(ENTER, 1);
						}
		}
	}
}
