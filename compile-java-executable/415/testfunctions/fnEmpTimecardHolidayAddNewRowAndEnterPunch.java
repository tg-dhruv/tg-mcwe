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


class fnemptimecardholidayaddnewrowandenterpunch {

	public static void fnemptimecardholidayaddnewrowandenterpunch() {
		tg.click("ele_DayDate_3a0705a6", 1);
		if (tg.performAssert("ele_AddRow_3a0759c2", ComparisonType.IS_VISIBLE)) {
						tg.check.isVisible("ele_AddRow_3a0759c2");
						tg.click("ele_AddRow_3a0759c2", 1);
		}
		tg.performRightClick("ele_ColumnNameSpecificID_3a0759c2");
		tg.check.isVisible("ele_EditPunch_3a02d461");
		tg.check.isVisible("ele_Time_3a02d463");
		tg.click("ele_Apply_3a02d463", 1);
		tg.type("ele_Time_3a02d463", var_Process_In_Punch);
		tg.check.isVisible("ele_Apply_3a02d463");
		tg.performRightClick("ele_ColumnNameSpecificID_3a0759c2");
		tg.check.isVisible("ele_EditPunch_3a02d461");
		tg.check.isVisible("ele_Time_3a02d463");
		tg.click("ele_Apply_3a02d463", 1);
		tg.type("ele_Time_3a02d463", var_Process_Out_Punch);
		tg.check.isVisible("ele_Apply_3a02d463");
		tg.click("ele_SaveButton_3a0306c3", 1);
	}
}
