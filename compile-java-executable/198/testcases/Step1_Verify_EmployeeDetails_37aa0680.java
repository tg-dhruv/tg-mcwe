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
public class Step1_Verify_EmployeeDetails_37aa0680 extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_employeedetails_37aa0680() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		tg.type("ele_Search_3a2161be", "PRHCMR0020");
		tg.pressKey(ENTER, 1);
		tg.wait(15);
		tg.click("ele_EmployeeInfo_3a2161d2", 1);
		tg.click("ele_EmployeeInfo_3a2161d2", 1);
		tg.click("ele_Hierarchy_3a2161d3", 1);
		tg.wait(2);
		tg.click("ele_Hierarchy_3a2161d3", 1);
	}
}
