import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.testgrid.baseClass.driver;
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

class fnchangepassword {

	public static void fnchangepassword() {
		tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_EditProfile", 1);
		tg.wait("ele_editAddressPassword01", ComparisonType.IS_VISIBLE, 20);
		START_CUSTOM_SCRIPT;
		driver.get("https://www.t-mobile.com/my-account/profile/tmobile-id/password");
		END_CUSTOM_SCRIPT;
		tg.wait("ele_oldPasswordField", ComparisonType.IS_VISIBLE, 10);
		START_CUSTOM_SCRIPT;
		System.out.println("********************************************************************************");
		WebElement shadowHost = driver.findElement(By.cssSelector("xpr-npi-content"));
		        SearchContext shadowRoot = shadowHost.getShadowRoot();
		        WebElement iframeElement = shadowRoot.findElement(By.cssSelector("iframe"));
		        driver.switchTo().frame(iframeElement);
		        WebElement oldPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-3e36ece686-oldPassword']"));
		        WebElement newPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-6f0c226d32-newPassword']"));
		        WebElement confrimPassword = driver.findElement(By.xpath("//input[@id='field-formFieldInput-5ea8cc6c20-confirm-newPassword']"));
		        oldPassword.sendKeys("Tmobile@2143");
		        newPassword.sendKeys("Tmobile@2142");
		        confrimPassword.sendKeys("Tmobile@2142");
		        driver.switchTo().defaultContent();
		END_CUSTOM_SCRIPT;
	}
}