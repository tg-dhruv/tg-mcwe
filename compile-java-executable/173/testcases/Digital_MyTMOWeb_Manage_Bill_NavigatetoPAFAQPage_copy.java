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
public class digital_mytmoweb_manage_bill_navigatetopafaqpage_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_manage_bill_navigatetopafaqpage_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy", new Object[]{});
		tg.wait(20);
		tg_int var_PAThere = 0;
		if(tg.performAssert("ele_SeeAllScheduledPA", ComparisonType.IS_VISIBLE)){
		var_PAThere = tg.saveToVariable(1, var_PAThere);
		}
		tg.testFunction("fnClickViewBill_copy", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy", new Object[]{});
		if(tg.performAssert(var_PAThere, ComparisonType.EQUAL_TO, 1)){
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		} else {
		tg.testFunction("fnSetupaPaymentArrangement_copy", new Object[]{});
		tg.testFunction("fnCheckAndAddTheCreditCardInPaymentArrangementPage_copy", new Object[]{});
		tg.wait(20);
		tg.click("ele_TlogoHomeNavigator", 1);
		tg.wait(10);
		tg.testFunction("fnClickViewBill_copy", new Object[]{});
		}
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.wait(20);
		// [DISABLED] tg.scrollToElement("ele_paymentArrangementFAQLink", Direction.DOWN);
		// [DISABLED] tg.wait("ele_paymentArrangementFAQLink", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_paymentArrangementFAQLink", 1);
		tg.testFunction("fnValidatePAFAQPage_copy", new Object[]{});
		tg.testFunction("fnClickBackButton_copy", new Object[]{});
		tg.testFunction("fnClickBackButton_copy", new Object[]{});
		tg.wait("ele_TlogoHomeNavigator", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_TlogoHomeNavigator", 1);
		tg.testFunction("fnRemovePaymentArrangement_copy", new Object[]{});
		tg.close();
	}
}