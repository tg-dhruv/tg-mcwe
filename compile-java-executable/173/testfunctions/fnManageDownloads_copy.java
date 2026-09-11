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

class fnmanagedownloads_copy {

	public static void fnmanagedownloads_copy() {
		tg.openNewTab();
		tg.navigateToUrl("chrome://downloads");
		START_CUSTOM_SCRIPT;
		String browserName = ((RemoteWebDriver) driver).getCapabilities().getBrowserName().toLowerCase();
		String downloadsUrl = browserName.contains("edge") 
		        ? "edge://downloads" 
		        : "chrome://downloads";
		driver.navigate().to(downloadsUrl);
		String filePrefix = "file:///home/seluser/Downloads/";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(d -> {
		    Object result = js.executeScript(
		        "const mgr = document.querySelector('downloads-manager');" +
		        "if (!mgr || !mgr.shadowRoot) return null;" +
		        "const list = mgr.shadowRoot.querySelector('#downloadsList');" +
		        "if (!list || !list.items) return null;" +
		        "return list.items.length;"
		    );
		    return result != null && ((Long) result) > 0;
		});
		String fileName = (String) js.executeScript(
		    "return document.querySelector('downloads-manager')" +
		    ".shadowRoot.querySelector('#downloadsList')" +
		    ".items[0].fileName;"
		);
		String fileLocation = filePrefix + fileName;
		driver.navigate().to(fileLocation);
		END_CUSTOM_SCRIPT;
	}
}