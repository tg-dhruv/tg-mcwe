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
public class digital_mytmoweb_account_tmo_prospect_shopflow_tsat_evergreenlanding_entrypointclickflow {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void digital_mytmoweb_account_tmo_prospect_shopflow_tsat_evergreenlanding_entrypointclickflow() {
		tg.openBrowser();
		tg.wait("ele_GetTSatellite", ComparisonType.IS_VISIBLE);
		tg.click("ele_GetTSatellite", 1);
		tg.check.isVisible("ele_JoinTMobileonanExperienceBeyondplan");
		tg.check.isVisible("ele_AddTSatellitetoyourcurrentcarriersplan");
		tg.check.isVisible("ele_Getemergency911accessforfree");
		tg.wait("ele_AddittoyourExistingPlan", ComparisonType.IS_VISIBLE);
		tg.click("ele_AddittoyourExistingPlan", 1);
		tg.check.isVisible("ele_TSatellitewithStarlink");
		tg.check.isVisible("ele_Stayconnectedbeyondtowers");
		tg.check.isVisible("ele_GetTSatelliteButton");
		tg.close();
	}
}