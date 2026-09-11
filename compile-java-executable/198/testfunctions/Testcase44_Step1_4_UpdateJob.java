import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

class testcase44_step1_4_updatejob {

	public static void testcase44_step1_4_updatejob() {
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.type("ele_IchDTSJobTitle_3a12b1ce", "Tcc Street To Seat");
		// [DISABLED] tg.type("ele_IchDTSOrganization_3a12b1ce", "Consumer Group");
		// [DISABLED] tg.type("ele_IchDTSLineOfBusiness_3a12b1ce", "Closed Loop");
		// [DISABLED] tg.type("ele_IchDTSDepartment_3a12b1ce", "Closed Loop");
		// [DISABLED] tg.type("ele_IchDTSTeamName_3a12b1ce", "Colorado Springs_2");
		// [DISABLED] tg_String var_date = "";
		// [DISABLED] var_date = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		// [DISABLED] tg.type("ele_IchDTSEffectiveStartDate_3a12b1ce", var_date);
		// [DISABLED] // Tosca: Caption | Global Hierarchy Management Tool | (ActionMode 1)
		// [DISABLED] tg.check.isVisible("ele_X_39f9bc92");
		// [DISABLED] tg.check.isVisible("ele_Y_39f9bc92");
		// [DISABLED] tg.click("ele_IchEFSubmit_3a11640e", 1);
		// [DISABLED] tg.wait(15);
		tg.click("ele_JobTitle_3a219534", 1);
		tg.type("ele_JobTitleOption_3a219534", "TCC STREET TO SEAT");
		tg.click("ele_Organization_3a219535", 1);
		tg.type("ele_OrganizationOption_3a219535", "Consumer Group");
		tg.click("ele_LineOfBusiness_3a219536", 1);
		tg.type("ele_LineOfBusinessOption_3a219536", "Closed Loop");
		tg.click("ele_Department_3a219539", 1);
		tg.type("ele_DepartmentOption_3a219539", "Closed Loop");
		tg_String var_date1 = "";
		var_date1 = tg.dateUtilities("{DATE[][-10d][MM/dd/yyyy]}");
		tg.type("ele_EffectiveStartDate_3a219539", var_date1);
		tg.click("ele_Submit_3a219539", 1);
	}
}
