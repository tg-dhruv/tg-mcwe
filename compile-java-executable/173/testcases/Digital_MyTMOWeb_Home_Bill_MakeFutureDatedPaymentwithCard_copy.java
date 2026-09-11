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
public class digital_mytmoweb_home_bill_makefuturedatedpaymentwithcard_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_makefuturedatedpaymentwithcard_copy() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebPAUserNoPaymentMethod_Hermes, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPAPassNoPaymentMethod_Hermes, var_Password);
		tg.testFunction("fnDigitalWebLoginPRODPastDueAccount_copy");
		tg.testFunction("fnAcceptCookies_copy");
		tg.testFunction("fnAssertBillAmountisGreaterthanZero_copy");
		tg.testFunction("fnClickViewBill_copy");
		tg.testFunction("fnOtherAmount_copy");
		tg.testFunction("fnEnterCardDetails_copy");
		tg.close();
	}
}