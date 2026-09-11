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

class fneditcustomername_copy {

	public static void fneditcustomername_copy() {
		tg.wait("ele_EditProfile", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditProfile", 1);
		tg.wait("ele_EditName", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditName", 1);
		tg.wait("ele_FirstName", ComparisonType.IS_VISIBLE);
		tg.click("ele_FirstName", 1);
		START_CUSTOM_SCRIPT;
		String ALL_LETTERS       = "abcdefghijklmnopqrstuvwxyz";
		int WORD_LENGTH = 3;
		StringBuilder word = new StringBuilder();
		        for (int i = 0; i < WORD_LENGTH; i++) {
		            int index = (int) (Math.random() * ALL_LETTERS.length());
		            word.append(ALL_LETTERS.charAt(index));
		        }
		        String username = word.toString();
		        System.out.println("********************************************");
		        System.out.println(username);
		        WebElement element = driver.findElement(By.xpath("//input[@id='field-formFieldInput-26430e6608-firstName']"));
		                element.clear();
		                element.sendKeys("Test"+username);
		END_CUSTOM_SCRIPT;
		// [DISABLED] tg.wait("ele_LastName", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.type("ele_LastName", "test");
		tg.wait("ele_SaveName", ComparisonType.IS_VISIBLE);
		tg.click("ele_SaveName", 1);
		tg.wait("ele_FirstName", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.wait("ele_Namesuccessfullychanged", ComparisonType.IS_VISIBLE, 5);
		// [DISABLED] tg.check.isVisible("ele_Namesuccessfullychanged");
		tg.printLogs("Name Successfully Changed");
	}
}