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
public class digital_mytmoweb_home_bill_user_switch_payment_from_secure_to_unsecure_and_viceversa_before_1st_in_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_user_switch_payment_from_secure_to_unsecure_and_viceversa_before_1st_in_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("4042038148", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		tg.testFunction("fnClickSeeAllScheduledArrangements_copy2");
		tg.testFunction("fnDontAllowNotificationPopUp_copy2");
		tg.testFunction("fnCloseSomethingBehindPopup_copy2");
		// [DISABLED] tg.testFunction("fnEditAutoPaymentMethod_copy2");
		tg.testFunction("fnClickOnEditPaymentMethod_copy2");
		tg.wait(15);
		if(tg.performAssert("ele_AddCard", ComparisonType.IS_VISIBLE)){
		tg.click("ele_AddCard", 1);
		tg.testFunction("fnCCDetails_copy2");
		tg.wait("ele_AgreeandsubmitforPA", ComparisonType.IS_VISIBLE, 20);
		// [DISABLED] tg.click("ele_AgreeandsubmitforPA", 1);
		}
		// [DISABLED] tg.wait("ele_EditOnPaymentMethodNotProvide", ComparisonType.IS_VISIBLE, 10404204040);
		// [DISABLED] tg.click("ele_EditOnPaymentMethodNotProvide", 1);
		tg.wait("ele_PaymentArrangementPageHeader", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_PaymentArrangementPageHeader", 1);
		tg.printLogs("User navigated back to payment arrangement page");
		tg.testFunction("fnClickUnsecurePayment_copy2");
		tg.wait("ele_amountcurr573", ComparisonType.IS_VISIBLE, 1);
		tg.click("ele_amountcurr573", 1);
		tg.wait("ele_savechange832", ComparisonType.IS_VISIBLE);
		tg.click("ele_savechange832", 1);
		tg.wait("ele_done873", ComparisonType.IS_VISIBLE);
		tg.click("ele_done873", 1);
		tg.testFunction("fnClickSeeAllScheduledArrangements_copy2");
		tg.wait("ele_UnsecurePaymentMethod", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_UnsecurePaymentMethod");
		tg.printLogs("Unsecure Payment method persists");
		tg.printLogs("EX-1742  MyTMO Web_Home_Bill_User switch payment from secure to unsecure and vice versa before 1st installment   - PASSED");
		// [DISABLED] tg.wait("ele_continue243", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_continue243", 1);
		// [DISABLED] tg.testFunction("fnRemovePaymentArrangement_copy2");
		tg.close();
	}
}