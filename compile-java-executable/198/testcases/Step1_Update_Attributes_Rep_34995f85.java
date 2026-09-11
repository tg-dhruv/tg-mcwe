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
public class Step1_Update_Attributes_Rep_34995f85 extends tc_Step1_1480d125 {

	@Test
	public void step1_update_attributes_rep_34995f85() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.type("ele_IchEmployeeIdFKempId_3a11539e", "PDTS1Rep0021");
		// [DISABLED] tg.click("ele_IchGoButton_3a11539e", 1);
		// [DISABLED] tg.wait(15);
		// [DISABLED] tg.type("ele_IchDTSJobTitle_3a12b1ce", "Elite Expert");
		// [DISABLED] tg.type("ele_IchDTSOrganization_3a12b1ce", "Consumer Group");
		// [DISABLED] tg.type("ele_IchDTSLineOfBusiness_3a12b1ce", "Closed Loop");
		// [DISABLED] tg.type("ele_IchDTSDepartment_3a12b1ce", "Closed Loop Outbound");
		// [DISABLED] tg.type("ele_IchDTSTeamName_3a12b1ce", "Colorado Springs_1");
		// [DISABLED] tg_String var_date = "";
		// [DISABLED] var_date = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		// [DISABLED] tg.type("ele_IchDTSEffectiveStartDate_3a12b1ce", var_date);
		// [DISABLED] // Tosca: Caption | Global Hierarchy Management Tool | (ActionMode 1)
		// [DISABLED] tg.check.isVisible("ele_X_39f9bc92");
		// [DISABLED] tg.check.isVisible("ele_Y_39f9bc92");
		// [DISABLED] tg.click("ele_IchEFSubmit_3a11640e", 1);
		// [DISABLED] tg.wait(15);
	}
}
