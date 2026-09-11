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
public class digital_mytmoweb_shop_aal_hsi_onlyoneinternetplan_allowed {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_shop_aal_hsi_onlyoneinternetplan_allowed() {
		tg.openBrowser();
		var_Username = tg.saveToVariable(var_HSI_UN, var_Username);
		var_Password = tg.saveToVariable(var_HSI_PW, var_Password);
		tg.testFunction("fnDigitalWebLoginPROD", new Object[]{});
		tg.testFunction("fnAcceptCookies", new Object[]{});
		tg.testFunction("fnAddAHomeInternetToTheCart", new Object[]{});
		tg.testFunction("fnNavigateFromCartToHSIPlanPageSelectADifferentPlan", new Object[]{});
		tg.testFunction("fnVerifyTheOSMessageContain2CTAContinueAndCancel", new Object[]{});
		tg.click("ele_CancelButtonContinueAndReplacePopUp", 1);
		tg.wait(10);
		tg.click("ele_Away200GbSelectButton", 1);
		tg.wait("ele_shipping", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_shipping", 1);
		tg.wait("ele_PlanContinueButton", ComparisonType.IS_VISIBLE, 15);
		tg.click("ele_PlanContinueButton", 1);
		tg.wait(10);
		tg.click("ele_ContinueButtonContinueAndReplacePopUp", 1);
		tg.wait("ele_Away200gbText", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_Away200gbText");
		tg.check.isInvisible("ele_AwayUnlimtedText");
		tg.testFunction("fnRemoveTheLineFromTheCart", new Object[]{});
		// [DISABLED] tg.testFunction("fnNavigateFromCartToHSIPlanPageSelectADifferentPlan", new Object[]{});
		// [DISABLED] tg.wait(15);
		// [DISABLED] tg.click("ele_CancelButtonContinueAndReplacePopUp", 1);
		// [DISABLED] tg.wait(5);
		// [DISABLED] tg.click("ele_AwayUnlimitedPlanSelectButton");
		// [DISABLED] tg.wait("ele_shipping", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.click("ele_shipping", 1);
		// [DISABLED] tg.click("ele_PlanContinueButton", 1);
		// [DISABLED] tg.wait(10);
		// [DISABLED] tg.click("ele_ContinueButtonContinueAndReplacePopUp", 1);
		tg.close();
	}
}