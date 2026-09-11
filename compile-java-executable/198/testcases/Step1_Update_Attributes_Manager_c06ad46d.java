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
public class Step1_Update_Attributes_Manager_c06ad46d extends tc_Step1_1480d125 {

	@Test
	public void step1_update_attributes_manager_c06ad46d() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.type("ele_IchEmployeeIdFKempId_3a11539e", "PDTS1Manager0022");
		// [DISABLED] tg.click("ele_IchGoButton_3a11539e", 1);
		// [DISABLED] tg.wait(15);
		// [DISABLED] tg.type("ele_IchEFJobTitle_3a11640e", "Cre Manager");
		// [DISABLED] tg.type("ele_IchOrganization_3a12a8c5", "Consumer Group");
		// [DISABLED] tg.type("ele_IchLineOfBusiness_3a12a8c5", "Closed Loop");
		// [DISABLED] tg.type("ele_IchDepartment_3a12a8c5", "Closed Loop Outbound");
		// [DISABLED] tg.type("ele_IchEFTeamName_3a11640e", "Colorado Springs_1");
		// [DISABLED] tg_String var_date = "";
		// [DISABLED] var_date = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		// [DISABLED] tg.type("ele_IchEFEffectiveStartDate_3a11640e", var_date);
		// [DISABLED] tg.type("ele_IchEFDirector_3a116d54", "SUK Director01");
		// [DISABLED] tg.type("ele_IchSrManager_3a11ddc8", "SUK SrManager01");
		// [DISABLED] // Tosca: Caption | Global Hierarchy Management Tool | (ActionMode 1)
		// [DISABLED] tg.check.isVisible("ele_X_39f9bc92");
		// [DISABLED] tg.check.isVisible("ele_Y_39f9bc92");
		// [DISABLED] tg.click("ele_IchEFSubmit_3a11640e", 1);
		// [DISABLED] tg.wait(15);
		tg.type("ele_Search_3a2161be", "PDTS1Manager0022");
		tg.pressKey(ENTER, 1);
		tg.wait(15);
		tg.click("ele_JobTitle_3a2194b9", 1);
		tg.type("ele_JobTitleOptions_3a2194b9", "CRE MANAGER");
		tg.click("ele_Organization_3a2194bf", 1);
		tg.type("ele_OrganizationOptions_3a2194bf", "Consumer Group");
		tg.click("ele_LineOfBusiness_3a2194c2", 1);
		tg.type("ele_LineOfBusinessOptions_3a2194c2", "Closed Loop");
		tg.click("ele_Department_3a2194c4", 1);
		tg.type("ele_DepartmentOptions_3a2194c4", "Closed Loop Outbound");
		tg.click("ele_TeamName_3a2194c5", 1);
		tg.type("ele_TeamNameOptions_3a2194c5", "Colorado Springs_1");
		tg.click("ele_Director_3a2194c7", 1);
		tg.type("ele_DirectorOptions_3a2194c7", "SUK Director01");
		tg.click("ele_SeniorManager_3a2194c8", 1);
		tg.type("ele_SeniorManagerOptions_3a2194c8", "SUK SrManager01");
		tg_String var_date1 = "";
		var_date1 = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		tg.type("ele_EffectiveStartDate_3a2194cb", var_date1);
		tg.click("ele_Submit_3a2194cb", 1);
		tg.wait(15);
	}
}
