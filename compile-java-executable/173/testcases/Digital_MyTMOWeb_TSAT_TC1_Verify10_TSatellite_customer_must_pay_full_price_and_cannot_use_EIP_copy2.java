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
public class digital_mytmoweb_tsat_tc1_verify10_tsatellite_customer_must_pay_full_price_and_cannot_use_eip_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_tsat_tc1_verify10_tsatellite_customer_must_pay_full_price_and_cannot_use_eip_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9132603071", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2144", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		tg.testFunction("fnDontAllowNotificationPopUp_copy2");
		tg.wait("ele_UpgradeOnShopDeeplink", ComparisonType.IS_VISIBLE);
		tg.click("ele_UpgradeOnShopDeeplink", 1);
		tg.wait("ele_buttonclos764", ComparisonType.IS_VISIBLE);
		tg.click("ele_buttonclos764", 1);
		tg.wait("ele_razrfold917", ComparisonType.IS_VISIBLE);
		tg.click("ele_razrfold917", 1);
		tg.wait("ele_editAddress847", ComparisonType.IS_VISIBLE);
		tg.click("ele_editAddress847", 1);
		tg.wait("ele_skiptradei214", ComparisonType.IS_VISIBLE);
		tg.click("ele_skiptradei214", 1);
		tg.wait("ele_continue488", ComparisonType.IS_VISIBLE);
		tg.click("ele_continue488", 1);
		tg.wait("ele_decline933", ComparisonType.IS_VISIBLE);
		tg.click("ele_decline933", 1);
		tg.wait("ele_yesdecline451", ComparisonType.IS_VISIBLE);
		tg.click("ele_yesdecline451", 1);
		tg.wait("ele_addtocart811", ComparisonType.IS_VISIBLE);
		tg.click("ele_addtocart811", 1);
		tg.wait("ele_ConfirmButtonAddNewDeviceToExistingLine", ComparisonType.IS_VISIBLE);
		tg.click("ele_ConfirmButtonAddNewDeviceToExistingLine", 1);
		tg.wait(5);
		tg.wait("ele_EIPDueMonthly", ComparisonType.IS_VISIBLE, 10);
		tg.wait(5);
		tg.check.contains("ele_EIPDueMonthly","$0.00");
		tg.printLogs("There is no Equipment Installment Plan (EIP) is available");
		tg.printLogs("ele_EIPDueMonthly");
		tg.check.isVisible("ele_EIPDueMonthly");
		tg.wait("ele_spantgwebc928", ComparisonType.IS_VISIBLE);
		tg.click("ele_spantgwebc928", 1);
		tg.wait("ele_viewpurcha280", ComparisonType.IS_VISIBLE);
		tg.click("ele_viewpurcha280", 1);
		tg.wait("ele_spantgwebc513", ComparisonType.IS_VISIBLE);
		tg.click("ele_spantgwebc513", 1);
		tg.check.contains("ele_spantgwebc928","$0.00");
		tg.printLogs("PASSED - [Auto] MyTMO Web_T-SAT_TC1 - Verify $10 T‑Satellite customer must pay full price and cannot use EIP for hardgoods on web for upgrade.");
		tg.close();
	}
}