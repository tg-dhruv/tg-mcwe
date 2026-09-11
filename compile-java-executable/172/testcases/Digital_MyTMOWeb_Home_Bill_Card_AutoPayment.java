import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
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
public class digital_mytmoweb_home_bill_card_autopayment {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_card_autopayment() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebNonAutoPayUserName, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebNonAutoPayPassword, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD", new Object[]{});
		tg.testFunction("fnAcceptCookies", new Object[]{});
		tg.testFunction("fnClickViewBill", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp", new Object[]{});
		tg.testFunction("fnCheckAutoPayAndClick", new Object[]{});
		if(tg.performAssert("ele_editAddressPaymentMethodAutoPay", ComparisonType.IS_VISIBLE)){
		tg.testFunction("fnDeletePaymentMethodAutoPay", new Object[]{});
		tg.testFunction("fnClickViewBill", new Object[]{});
		tg.testFunction("fnCheckAutoPayAndClick", new Object[]{});
		}
		tg.testFunction("fnAddPaymentMethodAutoPayPage", new Object[]{});
		tg.testFunction("fnClickViewBill", new Object[]{});
		tg.testFunction("fnCheckAutoPayAndClick", new Object[]{});
		tg.testFunction("fnEditAutoPaymentMethod", new Object[]{});
		tg.testFunction("fnCheckAutoPayAndClick", new Object[]{});
		tg.testFunction("fnCancelAutoPayInAutoPay", new Object[]{});
		tg.testFunction("fnClickViewBill", new Object[]{});
		tg.testFunction("fnCheckAutoPayAndClick", new Object[]{});
		tg.testFunction("fnDeletePaymentMethodAutoPay", new Object[]{});
		tg.testFunction("fnlogoutRestored", new Object[]{});
		tg.close();
	}
}