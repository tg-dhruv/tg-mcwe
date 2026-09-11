import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
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


@Listeners(TestListener.class)
public class Step1_Verify_EmployeeDetails_4b51fd39 extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_employeedetails_4b51fd39() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.swipe("ele_IchDTSDirectToSite_3a12b1ce", Direction.UP);
		// [DISABLED] tg.check.isVisible("ele_True_3a12b1d0");
		// [DISABLED] tg.check.isVisible("ele_False_3a12b1d0");
	}
}
