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

class fnaddmobiledevicetocartupgwithskiptradeindeclineprotection_copy {

	public static void fnaddmobiledevicetocartupgwithskiptradeindeclineprotection_copy() {
		tg.wait("ele_shopBau", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_shopBau", 1);
		tg.wait("ele_cellphones", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_cellphones", 1);
		tg.wait("ele_upgrade", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_upgrade", 1);
		tg.wait("ele_chooseIPhone", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_chooseIPhone", 1);
		tg.wait("ele_chooseOrangeColor", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_chooseOrangeColor", 1);
		tg.wait("ele_chooseFor24Month", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_chooseFor24Month", 1);
		tg.wait("ele_shipping", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_shipping", 1);
		tg.wait("ele_clickSkipTradeIn", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_clickSkipTradeIn", 1);
		tg.wait("ele_continueSkipTradeIn", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continueSkipTradeIn", 1);
		tg.wait("ele_declineProtection", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_declineProtection", 1);
		tg.wait("ele_yesdecline", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_yesdecline", 1);
		tg.wait("ele_addtocart", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_addtocart", 1);
	}
}