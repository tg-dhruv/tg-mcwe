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
public class digital_mytmoweb_home_bill_navigatetopaymentarrangementpageviabillpaycard {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_navigatetopaymentarrangementpageviabillpaycard() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD");
		tg.testFunction("fnAcceptCookies");
		tg.testFunction("fnClickViewBill");
		tg.testFunction("fnDontAllowNotificationPopUp");
		tg.testFunction("fnSetupaPaymentArrangement");
		tg.wait("ele_AddCard", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_AddCard", 1);
		tg.testFunction("fnCCDetails");
		tg.wait("ele_AgreeandsubmitforPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_AgreeandsubmitforPA", 1);
		tg.wait("ele_DoneforPA", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_DoneforPA", 1);
		tg.testFunction("fnRemovePaymentArrangement");
		tg.click("ele_backButton", 1);
		tg.click("ele_backButton", 1);
		tg.testFunction("fnlogoutRestored");
		tg.close();
	}
}