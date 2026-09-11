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

class testcase44_step1_5_verifyemployee {

	public static void testcase44_step1_5_verifyemployee() {
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] tg.type("ele_IchEmployeeIdFKempId_3a11539e", "PHS1REP0044");
		// [DISABLED] tg.click("ele_IchGoButton_3a11539e", 1);
		// [DISABLED] tg.wait(15);
		tg.type("ele_Search_3a2161be", "PHS1REP0044");
		tg.pressKey(ENTER, 1);
		tg.wait(15);
		tg.click("ele_EmployeeInfo_3a2161d2", 1);
		tg.wait(2);
		tg.click("ele_EmployeeInfo_3a2161d2", 1);
		tg.wait(2);
		tg.click("ele_Hierarchy_3a2161d3", 1);
		tg.wait(2);
		tg.click("ele_Hierarchy_3a2161d3", 1);
	}
}
