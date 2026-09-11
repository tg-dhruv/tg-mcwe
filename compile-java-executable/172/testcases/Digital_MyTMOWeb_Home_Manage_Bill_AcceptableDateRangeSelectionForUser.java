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
public class digital_mytmoweb_home_manage_bill_acceptabledaterangeselectionforuser {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_manage_bill_acceptabledaterangeselectionforuser() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4706624138", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD");
		tg.testFunction("fnAcceptCookies");
		tg.testFunction("fnClickViewBill");
		tg.testFunction("fnDontAllowNotificationPopUp");
		tg.testFunction("fnCheckAutoPayAndClick");
		// [DISABLED] tg.testFunction("fnSelectDateRangeInManageAutopay");
		tg.testFunction("fnValidatePayementDateDropDownAndSelectADifferentDate");
		tg.wait("ele_savechange307", ComparisonType.IS_VISIBLE);
		tg.click("ele_savechange307", 1);
		tg.wait("ele_DoneOnAutopayUpdated", ComparisonType.IS_VISIBLE);
		tg.click("ele_DoneOnAutopayUpdated", 1);
		tg.printLogs("EX-1724 MyTMO Web_Manage_Bill_Acceptable date range selection for user - PASSED");
		tg.close();
	}
}