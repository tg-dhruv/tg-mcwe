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
public class digital_mytmoweb_home_bill_daterangeremainconsistentforainvoluntarilysuspendedpaaccount {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_daterangeremainconsistentforainvoluntarilysuspendedpaaccount() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_UNSuspenedPAAccount, var_Username);
		var_Password = tg.saveToVariable(var_PWSuspenedPAAccount, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD");
		tg.testFunction("fnAcceptCookies");
		tg.testFunction("fnClickViewBill");
		tg.testFunction("fnDontAllowNotificationPopUp");
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.wait(20);
		tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditButtonPaymentArrangement", 1);
		tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
		tg_String var_dateValueBeforeSelect = "";
		var_dateValueBeforeSelect = tg.getElementAttribute("ele_calenderSelectedValue", "value", var_dateValueBeforeSelect);
		tg.click("ele_CalenderIcon", 1);
		tg.wait("ele_ValidCalenderDueDate", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_ValidCalenderDueDate", 1);
		tg_String var_dateValueAfterSelect = "";
		var_dateValueAfterSelect = tg.getElementAttribute("ele_calenderSelectedValue", "value", var_dateValueAfterSelect);
		tg.check.isNotEqualTo(var_dateValueBeforeSelect,var_dateValueAfterSelect);
		tg.close();
	}
}