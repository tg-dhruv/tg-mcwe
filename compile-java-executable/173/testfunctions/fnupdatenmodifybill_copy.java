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

class fnupdatenmodifybill_copy {

	public static void fnupdatenmodifybill_copy() {
		START_CUSTOM_SCRIPT;
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
		            // Address Line 1
		            By addressBy = By.xpath("//input[@name='street1' and @data-xpr-field-label='Address']");
		            WebElement address = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(addressBy)
		            );
		            address.clear();
		            address.sendKeys("3618 FACTORIA BLVD SE");
		            System.out.println("Updated Address Line 1");
		            // Apt / Suite (optional)
		            List<WebElement> aptFields = driver.findElements(
		                By.xpath("//input[contains(@name,'street2') or contains(@data-xpr-field-label,'Apt')]")
		            );
		            if (!aptFields.isEmpty()) {
		                WebElement apt = aptFields.get(0);
		                apt.clear();
		                apt.sendKeys("SZMIHWDADRIKSARATMKH");
		                System.out.println("Updated Apt/Suite");
		            }
		            // City
		            By cityBy = By.xpath("//input[@name='city' and @data-xpr-field-label='City']");
		            WebElement city = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(cityBy)
		            );
		            city.clear();
		            city.sendKeys("BELLEVUE");
		            System.out.println("Updated City");
		            // State dropdown
		            By stateBy = By.xpath("//select[@name='state']");
		            WebElement stateDropdown = wait.until(
		                ExpectedConditions.elementToBeClickable(stateBy)
		            );
		            Select state = new Select(stateDropdown);
		            state.selectByVisibleText("Washington");
		            System.out.println("Selected State");
		            // Zip code
		           By zipBy = By.xpath("//input[@name='zipCode']");
		            WebElement zip = wait.until(
		               ExpectedConditions.visibilityOfElementLocated(zipBy)
		            );
		            zip.clear();
		            zip.sendKeys("98006");
		            System.out.println("Updated Zip Code");
		            // Save button
		            By saveBy = By.xpath("//button[normalize-space()='Save']");
		            WebElement saveBtn = wait.until(
		                ExpectedConditions.elementToBeClickable(saveBy)
		            );
		            saveBtn.click();
		            System.out.println("Clicked Save");
		            // Validation
		            By successMsgBy = By.xpath("//span[contains(text(),'Billing address successfully saved')]");
		            wait.until(
		                ExpectedConditions.visibilityOfElementLocated(successMsgBy)
		            );
		            System.out.println("Billing address updated successfully");
		        } catch (Exception ex) {
		            System.out.println("Billing address update failed: " + ex.getMessage());
		            throw ex; // Properly fail TestGrid test
		        }
		END_CUSTOM_SCRIPT;
	}
}