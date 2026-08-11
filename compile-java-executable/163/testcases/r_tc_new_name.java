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

@Listeners(TestListener.class);
public class r_tc_new_name {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void r_tc_new_name() {
		tg.openBrowser();
		tg_int var_total = 0;
		var_total = (int) tg.testFunction("r_tf_new", new Object[]{2, 2, 2});
		tg.printLogs(var_total);
		if(tg.performAssert(var_total, ComparisonType.EQUAL_TO, var_total)){
		tg.printLogs("test");
		}
		tg.printLogs("test");
		tg.check.isVisible("ele_LogintoFacebookele3103733812555");
		tg.check.isVisible("ele_Emailaddressormobilenumberele5103733812555");
		tg.check.isVisible("ele_Passwordele7103733812555");
		tg.type("ele_emailele4103733812555", "testuser@example.com");
		tg.type("ele_passele6103733812555", "TestPassword123");
		tg.click("ele_Loginele8103733812555", 1);
		tg.check.isVisible("ele_Masukkankodekonfirmasiele2104223977831");
		tg.check.isVisible("ele_Kodekonfirmasiele6104223977831");
		tg.type("ele_ele5104223977831", "12345");
		tg.click("ele_Lanjutkanele9104223977831", 1);
		tg.check.isVisible("ele_Explorethethingsele1130305839194");
		tg.check.isVisible("ele_youloveele2130305839194");
		tg.close();
	}
}