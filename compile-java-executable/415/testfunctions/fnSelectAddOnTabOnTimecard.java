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


class fnselectaddontabontimecard {

	public static void fnselectaddontabontimecard() {
		if (tg.performAssert("ele_Accruals_3a0e8301", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_Accruals_3a0e8301");
						tg.click("ele_Accruals_3a0e8301", 1);
		} else {
						if (tg.performAssert("ele_Totals_3a0e8301", ComparisonType.IS_VISIBLE)) {
											tg.click("ele_DayDate_3a0705a6", 1);
											tg.wait(2);
											tg.check.isVisible("ele_Totals_3a0e8301");
											tg.click("ele_Totals_3a0e8301", 1);
						} else {
												if (tg.performAssert("ele_Audits_3a0e8301", ComparisonType.IS_VISIBLE)) {
																			tg.check.isVisible("ele_Audits_3a0e8301");
																			tg.click("ele_Audits_3a0e8301", 1);
												} else {
																			tg.check.isVisible("ele_TargetHours_3a07305f");
																			tg.click("ele_TargetHours_3a07305f", 1);
												}
						}
		}
	}
}
