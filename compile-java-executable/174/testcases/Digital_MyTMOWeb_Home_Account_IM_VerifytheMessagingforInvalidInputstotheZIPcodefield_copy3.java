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
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class digital_mytmoweb_home_account_im_verifythemessagingforinvalidinputstothezipcodefield_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_im_verifythemessagingforinvalidinputstothezipcodefield_copy3() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserforIM, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPwdforIM, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy3");
		tg.wait("ele_Account", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_Account", 1);
		tg.testFunction("fnDontAllowNotificationPopUp_copy3");
		tg.wait("ele_SeeDeviceDetails", ComparisonType.IS_VISIBLE);
		tg.click("ele_SeeDeviceDetails", 1);
		tg.wait(20);
		tg.wait("ele_ChangePhoneNumber", ComparisonType.IS_VISIBLE, 10);
		tg.scrollToElement("ele_ChangePhoneNumber", Direction.DOWN);
		tg.click("ele_ChangePhoneNumber", 1);
		tg.wait("ele_AcknowledgeandContinue", ComparisonType.IS_VISIBLE);
		tg.click("ele_AcknowledgeandContinue", 1);
		tg.wait("ele_ContinueinChangePhonenumber", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinChangePhonenumber", 1);
		tg.wait("ele_EnterZipcode", ComparisonType.IS_VISIBLE);
		tg.type("ele_EnterZipcode", "1234a");
		tg.check.isVisible("ele_EnteraValidareacodeorZipcode");
		tg.testFunction("fnlogoutRestored_copy3");
		tg.close();
	}
}