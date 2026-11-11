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


class fngotopeopleinfoandverifypayrule {

	public static void fngotopeopleinfoandverifypayrule() {
		if (tg.performAssert("ele_EditLicenses_3a1f1726", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_EditLicenses_3a1f1726");
						tg.check.isVisible("ele_More_3a1f9c87");
						tg.click("ele_More_3a1f9c87", 1);
						tg.check.isVisible("ele_PayRuleLabel_3a1f9c89");
						tg.check.isVisible("ele_PayRuleValue_3a1f9c89");
						// [DISABLED] tg.wait(1);
						tg.testFunction("fnValidationScreenshot");
		} else {
						tg.testFunction("fnSearchEmployeeIdWithLense");
						tg.check.isVisible("ele_More_3a1f9c87");
						tg.click("ele_More_3a1f9c87", 1);
						tg.check.isVisible("ele_PayRuleLabel_3a1f9c89");
						tg.check.isVisible("ele_PayRuleValue_3a1f9c89");
						// [DISABLED] tg.wait(1);
						tg.testFunction("fnValidationScreenshot");
		}
	}
}
