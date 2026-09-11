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
public class Step1_Search_Employee_59ba4ddf extends tc_Step1_1480d125 {

	@Test
	public void step1_search_employee_59ba4ddf() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.type("ele_IchEmployeeIdFKempId_3a11539e", "POHS1Manager0024");
		// [DISABLED] tg.click("ele_IchGoButton_3a11539e", 1);
		// [DISABLED] tg.wait(15);
		tg.type("ele_Search_3a2161be", "POHS1Manager0024");
		tg.pressKey(ENTER, 1);
		tg.wait(15);
	}
}
