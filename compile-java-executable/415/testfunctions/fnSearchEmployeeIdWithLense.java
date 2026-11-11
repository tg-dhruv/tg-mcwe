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


class fnsearchemployeeidwithlense {

	public static void fnsearchemployeeidwithlense() {
		tg.check.isVisible("ele_QuickFindButton_3a072c99");
		tg.wait(5);
		if (tg.performAssert("ele_EmbeddedContent_3a0903b4", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						if (tg.performAssert("ele_EmbeddedContent_3a0903b4", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
											tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						}
						tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						tg.check.isVisible("ele_EmbeddedContent_3a0903b4");
						tg.wait(3);
		} else {
						tg.check.isVisible("ele_AdvancedSettings_3a0903b4");
						tg.click("ele_AdvancedSettings_3a0903b4", 1);
						if (tg.performAssert("ele_AllEmployees_3a0903b4", ComparisonType.IS_VISIBLE)) {
											tg.check.isVisible("ele_AllEmployees_3a0903b4");
											tg.check.isVisible("ele_AllEmployees_3a0903b4");
											tg.click("ele_AllEmployees_3a0903b4", 1);
						}
						tg.type("ele_SearchByEmployeeNameOrID_3a072c99", "Employee id");
						tg.click("ele_SearchBtn_3a072c99", 1);
						tg.check.isVisible("ele_SearchResult_3a072c99");
						tg.check.isVisible("ele_DIV_3a0a595a");
						tg.click("ele_Goto_3a072c99", 1);
						tg.wait(3);
		}
	}
}
