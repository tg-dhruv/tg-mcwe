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
public class digital_mytmoweb_home_bill_updateinstallmentsdatesofpatoincludeadditionaloffereddate_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_updateinstallmentsdatesofpatoincludeadditionaloffereddate_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_UNInstallmentDate, var_Username);
		var_Password = tg.saveToVariable(var_PWInstallmentDate, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2");
		tg.testFunction("fnAcceptCookies_copy2");
		tg.wait(20);
		tg_int var_PAThere = 0;
		if(tg.performAssert("ele_SeeAllScheduledPA", ComparisonType.IS_VISIBLE)){
		var_PAThere = tg.saveToVariable(1, var_PAThere);
		}
		tg.testFunction("fnClickViewBill_copy2");
		tg.testFunction("fnDontAllowNotificationPopUp_copy2");
		if(tg.performAssert(var_PAThere, ComparisonType.EQUAL_TO, 1)){
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		} else {
		tg.testFunction("fnSetupaPaymentArrangement_copy2");
		tg.testFunction("fnCheckAndAddTheCreditCardInPaymentArrangementPage_copy2");
		tg.wait(20);
		tg.click("ele_TlogoHomeNavigator", 1);
		tg.wait(10);
		tg.testFunction("fnClickViewBill_copy2");
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.wait(20);
		}
		tg.check.isVisible("ele_TotalBalancetoggle");
		tg.click("ele_TotalBalancetoggle", 1);
		tg.wait("ele_EditButtonPaymentArrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_EditButtonPaymentArrangement", 1);
		tg.wait("ele_CalenderIcon", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_CalenderIcon", 1);
		tg.wait("ele_CurrentBillDueDate", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_ValidCalenderDueDate");
		tg.check.isVisible("ele_InvalidDueDate");
		tg.click("ele_ValidCalenderDueDate", 1);
		tg.wait(5);
		tg.click("ele_backButton", 1);
		tg.click("ele_backButton", 1);
		tg.click("ele_TlogoHomeNavigator", 1);
		tg.wait(15);
		tg.testFunction("fnRemovePaymentArrangement_copy2");
		tg.close();
	}
}