import java.time.Duration;
import org.openqa.selenium.*;import org.openqa.selenium.support.ui.WebDriverWait;import org.openqa.selenium.support.ui.ExpectedConditions;import static io.testgrid.baseClass.driver;import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.By;import org.testng.Assert;;
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
import static io.testgrid.enums.KeyboardKeys.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_home_account_ir_verifysystemdisplaysupto5available10digitnumbers_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_ir_verifysystemdisplaysupto5available10digitnumbers_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserMultiline, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPwdMultiline, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy");
		tg.wait("ele_Account", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_Account", 1);
		tg.testFunction("fnDontAllowNotificationPopUp_copy");
		tg.wait("ele_SeeDeviceDetails", ComparisonType.IS_VISIBLE);
		tg.click("ele_SeeDeviceDetails", 1);
		tg.wait("ele_ChangePhoneNumber", ComparisonType.IS_VISIBLE);
		tg.scrollToElement("ele_ChangePhoneNumber", Direction.DOWN);
		tg.click("ele_ChangePhoneNumber", 1);
		tg.wait("ele_AcknowledgeandContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_AcknowledgeandContinue", 1);
		tg.wait("ele_ContinueinChangePhonenumber", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinChangePhonenumber", 1);
		tg.wait("ele_EnterZipcode", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterZipcode", "30346");
		tg.wait("ele_SearchNewPhoneNumber", ComparisonType.IS_VISIBLE, 12);
		tg.click("ele_SearchNewPhoneNumber", 1);
		tg.wait("ele_Displaying5NumbersAvailable", ComparisonType.IS_VISIBLE);
		tg.click("ele_Displaying5NumbersAvailable", 1);
		var_GetText = tg.saveToVariable("ele_Displaying5NumbersAvailable", var_GetText);
		tg.printLogs(var_GetText);
		tg.check.isVisible("ele_NewPhoneNumber");
		var_GetText = tg.saveToVariable("ele_NewPhoneNumber", var_GetText);
		var_GetText = tg.stringUtilities("{STRING[LENGTH]["+var_GetText+"][]}");
		tg.printLogs(var_GetText);
		tg.testFunction("fnlogoutRestored_copy");
		tg.close();
	}
}