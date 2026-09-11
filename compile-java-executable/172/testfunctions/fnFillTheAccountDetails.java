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

class fnfilltheaccountdetails {

	public static void fnfilltheaccountdetails() {
		tg.wait("ele_nameOnAccountField", ComparisonType.IS_VISIBLE, 10);
		if(tg.performAssert("ele_nameOnAccountField", ComparisonType.IS_VISIBLE)){
		tg.type("ele_nameOnAccountField", var_AccountName);
		tg.wait("ele_routingNumberField", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_routingNumberField", var_RoutingNumber);
		tg.wait("ele_accountNumberField1", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_accountNumberField1", var_AccountNumber);
		tg.wait("ele_reEnterAccountNumber", ComparisonType.IS_VISIBLE, 2);
		tg.type("ele_reEnterAccountNumber", var_AccountNumber);
		START_CUSTOM_SCRIPT;
		WebElement dd = driver.findElement(By.xpath("//*[@id='lbx-formEcheck-selectaccountType']"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", dd);
		END_CUSTOM_SCRIPT;
		START_CUSTOM_SCRIPT;
		WebElement dropdownElement = driver.findElement(By.id("lbx-formEcheck-selectaccountType"));
		        Select select = new Select(dropdownElement);
		        select.selectByVisibleText("Personal - Checking");
		END_CUSTOM_SCRIPT;
		tg.click("ele_continueButton", 1);
		}
	}
}