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


class fnverifyingpaycodeamountwages {

	public static void fnverifyingpaycodeamountwages() {
		// [DISABLED] tg.testFunction("fnValidationScreenshot");
		var_Tab_Name = "Totals";
		tg.testFunction("fnSelectAddOnTabOnTimecard");
		if (tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
						tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
						tg.check.isVisible("ele_Daily_3a031a40");
						tg.click("ele_Daily_3a031a40", 1);
		}
		if (tg.performAssert("ele_SpanByDDToggleBtn_3a031a40", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_SpanByDDToggleBtn_3a031a40");
						tg.click("ele_SpanByDDToggleBtn_3a031a40", 1);
						tg.check.isVisible("ele_All_3a1fa027");
		}
		tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_ShowFiltersRow_3a073007", 1);
		tg.click("ele_FilterButton_3a073007", 1);
		tg.click("ele_ExpandAddOns_3a0888f5", 1);
		tg.check.isVisible("ele_FilterButton_3a073007");
		tg.click("ele_FilterButton_3a073007", 1);
			tg.type("ele_SELECT_3a031621", "=");
			tg.type("ele_INPUT_3a030b49", var_Paycode);
			tg.check.isVisible("ele_PayCodeHeader_3a03161f");
			tg.check.isVisible("ele_Paycode_3a03ba2a");
			tg.testFunction("fnValidationScreenshot");
			tg.check.isVisible("ele_ExpandAddOns_3a0888f5");
			tg.click("ele_ExpandAddOns_3a0888f5", 1);
		var_Tab_Name = "Totals";
		tg.testFunction("fnSelectAddOnTabOnTimecard");
	}
}
