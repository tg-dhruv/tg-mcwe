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

class fnvalidateallowroamingoption_copy3 {

	public static void fnvalidateallowroamingoption_copy3() {
		START_CUSTOM_SCRIPT;
		WebElement parent = driver.findElement(By.xpath("//input[@type='radio' and @id='picker-formFieldSelector-985b225d68-all-roaming']"));
		  System.out.println("***************************************************************");
		  boolean flag = parent.isSelected();
		  if(flag){
		      System.out.println("radio button is enabled");
		  }
		else{
		      System.out.println("radio button is disabled");
		      driver.findElement(By.xpath("//label[contains(text(), 'Allow all')]")).click();
		  }
		END_CUSTOM_SCRIPT;
		tg.wait("ele_submitButtonRoaming", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_submitButtonRoaming", 1);
		tg.wait("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE, 10);
		if(tg.performAssert("ele_settingsSavedMessage", ComparisonType.IS_VISIBLE)){
		tg.check.isVisible("ele_settingsSavedMessage");
		tg.printLogs("Roam enabled");
		}
	}
}