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
import java.time.Duration;
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
public class digital_mytmoweb_home_bill_updatenumberofpaymentsasperpaterms {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_bill_updatenumberofpaymentsasperpaterms() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_TMOWebUserforSplitPA, var_Username);
		var_Password = tg.saveToVariable(var_TMOWebPwdforSplitPA, var_Password);
		// [DISABLED] var_Username = tg.saveToVariable("4042471003", var_Username);
		// [DISABLED] var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD", new Object[]{});
		tg.testFunction("fnClickViewBill", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp", new Object[]{});
		tg.wait("ele_Managepaymentarrangement", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_Managepaymentarrangement", 1);
		tg.check.isVisible("ele_PaymentArrangementPage");
		tg.testFunction("fnSplitinstalmentinPA", new Object[]{});
		tg.close();
	}
}