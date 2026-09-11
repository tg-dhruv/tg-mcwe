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

class fnenablescamblock_copy {

	public static void fnenablescamblock_copy() {
		tg.wait("ele_blockScamCalls", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_blockScamCalls");
		tg.scrollToElement("ele_blockScamCalls", Direction.DOWN);
		START_CUSTOM_SCRIPT;
		WebElement parent = driver.findElement(By.xpath("//label[contains(text(), 'Block Scam')]"));
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  String script = "return window.getComputedStyle(arguments[0], '::after').getPropertyValue('background-color');";
				  String backgroundValue = (String) js.executeScript(script, parent);
				  boolean value = (backgroundValue.contains("226"))? false : true;
				  if(value){
				      parent.click();
				  }
		END_CUSTOM_SCRIPT;
		tg.check.isVisible("ele_blockScamCalls");
		tg.wait("ele_BlockScamLikelyCallsMessage", ComparisonType.IS_VISIBLE, 20);
		tg.check.isVisible("ele_BlockScamLikelyCallsMessage");
		tg.printLogs("Block Scam Likely Calls Enabled Successfully");
	}
}