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

class fnsetauthorizedrole_copy2 {

	public static void fnsetauthorizedrole_copy2() {
		START_CUSTOM_SCRIPT;
		try 
		{
		END_CUSTOM_SCRIPT;
		// Wait for page to load
		START_CUSTOM_SCRIPT;
		            Thread.sleep(3000);
		END_CUSTOM_SCRIPT;
		// Get all user list items (all different user roles)
		START_CUSTOM_SCRIPT;
		            String allUsersXPath = "//li[contains(@class,'tdds-list__item')][@data-type='link']";
		            List<WebElement> allUserRoles = driver.findElements(By.xpath(allUsersXPath));
		            System.out.println("Total user roles found: " + allUserRoles.size());
		END_CUSTOM_SCRIPT;
		// Create a list to store only user role texts
		START_CUSTOM_SCRIPT;
		            List<String> userRoleTextsList = new ArrayList<>();
		END_CUSTOM_SCRIPT;
		// Get all user role texts into the list
		START_CUSTOM_SCRIPT;
		            for (WebElement userRole : allUserRoles) {
		                try {
		                    WebElement bodySpan = userRole.findElement(
		                        By.xpath(".//span[contains(@class,'tdds-list__item-body')]"));
		                    String fullBodyText = bodySpan.getText();
		END_CUSTOM_SCRIPT;
		// Split by line break and get the last part (user role)
		START_CUSTOM_SCRIPT;
		                    String[] parts = fullBodyText.split("\n");
		                    String userRoleText = parts[parts.length - 1].trim();
		                    userRoleTextsList.add(userRoleText);
		                } catch (Exception e) {
		                    System.out.println("Error getting user role text: " + e.getMessage());
		                }
		            }
		END_CUSTOM_SCRIPT;
		// Print all user role texts
		START_CUSTOM_SCRIPT;
		            System.out.println("User role texts list: " + userRoleTextsList);
		END_CUSTOM_SCRIPT;
		// Flag to track if edit button was clicked
		START_CUSTOM_SCRIPT;
		            boolean editButtonClicked = false;
		END_CUSTOM_SCRIPT;
		// Now loop through the list and check for Standard User or Restricted User
		START_CUSTOM_SCRIPT;
		            for (int i = 0; i < userRoleTextsList.size(); i++) {
		                String roleText = userRoleTextsList.get(i);
		                System.out.println("Checking role text: " + roleText);
		END_CUSTOM_SCRIPT;
		// Check if text is Standard User or Restricted User
		START_CUSTOM_SCRIPT;
		                if (roleText.equals("Standard User") || roleText.equals("Restricted User")) {
		                    System.out.println("Found editable user: " + roleText);
		END_CUSTOM_SCRIPT;
		// Get the corresponding user role element by index
		START_CUSTOM_SCRIPT;
		                    WebElement targetUserRole = allUserRoles.get(i);
		END_CUSTOM_SCRIPT;
		// Find the Edit button for this user role
		START_CUSTOM_SCRIPT;
		                    WebElement editButton = targetUserRole.findElement(
		                        By.xpath(".//button[@data-analytics-click='Link Click|Edit User Role']"));
		END_CUSTOM_SCRIPT;
		// Scroll into view
		START_CUSTOM_SCRIPT;
		                    JavascriptExecutor js = (JavascriptExecutor) driver;
		                    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", editButton);
		                    Thread.sleep(500);
		END_CUSTOM_SCRIPT;
		// Click the Edit button
		START_CUSTOM_SCRIPT;
		                    js.executeScript("arguments[0].click();", editButton);
		                    System.out.println("Clicked Edit button for: " + roleText);
		                    editButtonClicked = true;
		                    break; // Exit after clicking first match
		                } else if (roleText.equals("Authorized User")) {
		                    System.out.println("Skipping Authorized User");
		                }
		            }
		END_CUSTOM_SCRIPT;
		// If no edit button was clicked, all users are Authorized Users
		START_CUSTOM_SCRIPT;
		            if (!editButtonClicked) {
		                System.out.println("All the users are Authorized Users hence not eligible to change the role");
		            }
		            System.out.println("Finished processing all user roles");
		}
		catch(Exception e) 
		{
		    e.printStackTrace();
		}
		END_CUSTOM_SCRIPT;
		tg.wait("ele_selectAuthorizedUser", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_selectAuthorizedUser");
		tg.click("ele_selectAuthorizedUser", 1);
		tg.wait("ele_saveChange", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_saveChange");
		tg.click("ele_saveChange", 1);
		tg.wait("ele_ackCheckBox", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_ackCheckBox");
		tg.click("ele_ackCheckBox", 1);
		tg.wait("ele_continueAuthButton", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_continueAuthButton");
		tg.click("ele_continueAuthButton", 1);
		tg.wait("ele_authorizedUserConfrmMsg", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_authorizedUserConfrmMsg");
		tg.check.isVisible("ele_authDoneButton");
		tg.click("ele_authDoneButton", 1);
	}
}