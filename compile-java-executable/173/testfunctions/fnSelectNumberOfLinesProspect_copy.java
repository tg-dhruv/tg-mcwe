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

class fnselectnumberoflinesprospect_copy {

	public static void fnselectnumberoflinesprospect_copy() {
		tg.wait("ele_continue829", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continue829", 1);
		tg.wait("ele_DecrementButtonsvg", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_DecrementButtonsvg", 1);
		tg.wait("ele_DecrementButtonsvg", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_DecrementButtonsvg", 1);
		tg.wait("ele_continue454", ComparisonType.IS_VISIBLE);
		tg.click("ele_continue454", 1);
		if(tg.performAssert("ele_creditRangeDropDown", ComparisonType.IS_VISIBLE)){
		tg.click("ele_creditRangeDropDown", 1);
		tg.wait(3);
		tg.selectDropdownByValue("ele_creditRangeDropDown","Good (661 or higher");
		tg.wait("ele_continue891", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_continue891", 1);
		tg.printLogs("Selected lines and Clicked continue");
		tg.wait("ele_continue239", ComparisonType.IS_VISIBLE);
		tg.click("ele_continue239", 1);
		}
		tg.printLogs("CLICKED CONTINUE ON PICK YOUR PLAN PAGE");
	}
}