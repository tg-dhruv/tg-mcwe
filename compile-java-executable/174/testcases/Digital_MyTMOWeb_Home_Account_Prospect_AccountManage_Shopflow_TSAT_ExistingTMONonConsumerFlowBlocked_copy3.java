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
public class digital_mytmoweb_home_account_prospect_accountmanage_shopflow_tsat_existingtmononconsumerflowblocked_copy3 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_home_account_prospect_accountmanage_shopflow_tsat_existingtmononconsumerflowblocked_copy3() {
		tg.openBrowser();
				tg.check.isVisible("ele_CoverageBtn");
				tg.click("ele_CoverageDropDown", 1);
				tg.click("ele_Statilitephonesservicesop", 1);
				tg.check.isVisible("ele_GetTSatellite");
				tg.click("ele_GetTSatellite", 1);
				tg.check.isVisible("ele_AddTSatellite10dollar");
				tg.click("ele_Addittoyourexistingplan10dollar", 1);
				tg.check.isVisible("ele_StatellitewithSTARLINKLogo");
		tg.close();
	}
}