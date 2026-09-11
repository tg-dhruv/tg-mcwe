import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.interactions.Actions;
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

class fnaddmobiletocart_copy {

	public static void fnaddmobiletocart_copy() {
		tg.wait("ele_cellphones729", ComparisonType.IS_VISIBLE);
		tg.click("ele_cellphones729", 1);
		tg.wait("ele_buttonclos835", ComparisonType.IS_VISIBLE);
		tg.click("ele_buttonclos835", 1);
		tg.wait("ele_divtgwebcomma115", ComparisonType.IS_VISIBLE);
		tg.click("ele_divtgwebcomma115", 1);
		tg.wait("ele_getanewnum934", ComparisonType.IS_VISIBLE);
		tg.click("ele_getanewnum934", 1);
		tg.wait("ele_skipTradein", ComparisonType.IS_VISIBLE);
		tg.click("ele_skipTradein", 1);
		tg.wait("ele_addtocart000", ComparisonType.IS_VISIBLE);
		tg.click("ele_addtocart000", 1);
	}
}