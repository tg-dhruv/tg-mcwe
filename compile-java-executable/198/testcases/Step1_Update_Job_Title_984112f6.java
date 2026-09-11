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
public class Step1_Update_Job_Title_984112f6 extends tc_Step1_1480d125 {

	@Test
	public void step1_update_job_title_984112f6() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		tg.click("ele_JobTitle_3a219534", 1);
		tg.type("ele_JobTitleOption_3a219534", "ASSOCIATE COACH");
		tg.click("ele_Organization_3a219535", 1);
		tg.type("ele_OrganizationOption_3a219535", "Consumer Group");
		tg.click("ele_LineOfBusiness_3a219536", 1);
		tg.type("ele_LineOfBusinessOption_3a219536", "Closed Loop");
		tg.click("ele_Department_3a219539", 1);
		tg.type("ele_DepartmentOption_3a219539", "Closed Loop");
		tg_String var_date = "";
		var_date = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		tg.type("ele_EffectiveStartDate_3a219539", var_date);
		tg.click("ele_Submit_3a219539", 1);
		tg.wait(25);
	}
}
