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
public class digital_mytmoweb_home_account_canceltsatplan_verifyeffectivedate_endofbillcycle_shouldntbetodaydate_copy2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_canceltsatplan_verifyeffectivedate_endofbillcycle_shouldntbetodaydate_copy2() {
		tg.openBrowser();
		var_Username = tg.saveToVariable("9297427969", var_Username);
		var_Password = tg.saveToVariable("Tmobile@2143", var_Password);
		tg.testFunction("fnDigitalWebLoginPROD_copy2", new Object[]{});
		tg.testFunction("fnAcceptCookies_copy2", new Object[]{});
		tg.testFunction("fnDontAllowNotificationPopUp_copy2", new Object[]{});
		tg.check.isVisible("ele_Tsatelliteplan");
		tg.wait(10);
		tg.click("ele_CancelTsatelliteservicebtn", 1);
		tg.wait(10);
		tg.testFunction("fnDontAllowNotificationPopUp_copy2", new Object[]{});
		tg.check.isVisible("ele_CancelTSatelliteservicereviewpage");
		tg.check.isVisible("ele_BANnumber");
		tg.check.isVisible("ele_tsatelliteplaName");
		tg.check.isVisible("ele_plannameasTSatelliteandpriceas10dollar");
		tg.check.isVisible("ele_Effectivedateforcancellation");
		tg.check.isVisible("ele_gobackBtn");
		tg.click("ele_gobackBtn", 1);
		tg.check.isVisible("ele_Welcomepage");
		tg.check.isVisible("ele_Yourbill");
		tg.click("ele_viewBillLink", 1);
		tg.wait(20);
		tg.check.isVisible("ele_VerifyBillingservicessection");
		tg.click("ele_ViewthismonthsusagedetailsLink", 1);
		tg.wait(10);
		tg.check.isVisible("ele_UsageOverviewPage");
		tg.check.isVisible("ele_BillingCyclePeriodandLeftOverDayss");
		tg_String var_addeddate = "";
		var_addeddate = tg.saveToVariable("ele_Billingperiod", var_addeddate);
		tg_String var_endDate = "";
		START_CUSTOM_SCRIPT;
		var_endDate = var_addeddate.split("-")[1].trim();
		String todayDate = java.time.LocalDate.now()
		                .format(java.time.format.DateTimeFormatter.ofPattern("MMM dd", java.util.Locale.ENGLISH));
		System.out.println("End Date   : " + var_endDate);
		System.out.println("Today's Date: " + todayDate);
		        if (!var_endDate.equals(todayDate)) {
		            System.out.println("PASS");
		        } else {
		            throw new AssertionError("Billing period end date should not be today's date.");
		        }
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}