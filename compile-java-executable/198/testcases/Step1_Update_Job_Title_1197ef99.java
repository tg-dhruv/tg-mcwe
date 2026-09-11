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
public class Step1_Update_Job_Title_1197ef99 extends tc_Step1_1480d125 {

	@Test
	public void step1_update_job_title_1197ef99() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		tg.click("ele_JobTitle_3a2194b9", 1);
		tg.type("ele_JobTitleOptions_3a2194b9", "CRE MANAGER");
		tg.click("ele_Organization_3a2194bf", 1);
		tg.type("ele_OrganizationOptions_3a2194bf", "Consumer Group");
		tg.click("ele_LineOfBusiness_3a2194c2", 1);
		tg.type("ele_LineOfBusinessOptions_3a2194c2", "Closed Loop");
		tg.click("ele_Department_3a2194c4", 1);
		tg.type("ele_DepartmentOptions_3a2194c4", "Closed Loop");
		tg.click("ele_TeamName_3a2194c5", 1);
		tg.type("ele_TeamNameOptions_3a2194c5", "Colorado Springs_1");
		tg.click("ele_Director_3a2194c7", 1);
		tg.type("ele_DirectorOptions_3a2194c7", "SUK Director01");
		tg.click("ele_SeniorManager_3a2194c8", 1);
		tg.type("ele_SeniorManagerOptions_3a2194c8", "SUK SrManager01");
		tg_String var_date = "";
		var_date = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		tg.type("ele_EffectiveStartDate_3a2194cb", var_date);
		tg.click("ele_Submit_3a2194cb", 1);
		tg.wait(15);
	}
}
