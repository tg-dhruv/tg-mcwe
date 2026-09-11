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
public class Step1_Update_Attributes_Manager_4a153ae5 extends tc_Step1_1480d125 {

	@Test
	public void step1_update_attributes_manager_4a153ae5() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.type("ele_IchEmployeeIdFKempId_3a11539e", "PDTS1Manager0021");
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
	}
}
