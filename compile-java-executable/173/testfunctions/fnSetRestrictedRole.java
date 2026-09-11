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

class fnsetrestrictedrole {

	public static void fnsetrestrictedrole() {
		START_CUSTOM_SCRIPT;
		try 
		{
		            Thread.sleep(3000);
		            String allUsersXPath = "//li[contains(@class,'tdds-list__item')][@data-type='link']";
		            List<WebElement> allUserRoles = driver.findElements(By.xpath(allUsersXPath));
		            System.out.println("Total user roles found: " + allUserRoles.size());
		            List<String> userRoleTextsList = new ArrayList<>();
		            for (WebElement userRole : allUserRoles) {
		                try {
		                    WebElement bodySpan = userRole.findElement(
		                        By.xpath(".//span[contains(@class,'tdds-list__item-body')]"));
		                    String fullBodyText = bodySpan.getText();
		                    String[] parts = fullBodyText.split("\n");
		                    String userRoleText = parts[parts.length - 1].trim();
		                    userRoleTextsList.add(userRoleText);
		                } catch (Exception e) {
		                    System.out.println("Error getting user role text: " + e.getMessage());
		                }
		            }
		            System.out.println("User role texts list: " + userRoleTextsList);
		            boolean editButtonClicked = false;
		            for (int i = 0; i < userRoleTextsList.size(); i++) {
		                String roleText = userRoleTextsList.get(i);
		                System.out.println("Checking role text: " + roleText);
		                if (roleText.equals("Standard User") || roleText.equals("Authorized User")) {
		                    System.out.println("Found editable user: " + roleText);
		                    WebElement targetUserRole = allUserRoles.get(i);
		                    WebElement editButton = targetUserRole.findElement(
		                        By.xpath(".//button[@data-analytics-click='Link Click|Edit User Role']"));
		                    JavascriptExecutor js = (JavascriptExecutor) driver;
		                    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", editButton);
		                    Thread.sleep(500);
		                    js.executeScript("arguments[0].click();", editButton);
		                    System.out.println("Clicked Edit button for: " + roleText);
		                    editButtonClicked = true;
		                    break; // Exit after clicking first match
		                } else if (roleText.equals("Restricted User")) {
		                    System.out.println("Skipping Restricted User");
		                }
		            }
		            if (!editButtonClicked) {
		                System.out.println("All the users are Restricted Users hence not eligible to change the role");
		            }
		            System.out.println("Finished processing all user roles");
		}
		catch(Exception e) 
		{
		    e.printStackTrace();
		}
		END_CUSTOM_SCRIPT;
		tg.wait("ele_restrictedUser", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_restrictedUser");
		tg.click("ele_restrictedUser", 1);
		tg.wait("ele_saveChange", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_saveChange");
		tg.click("ele_saveChange", 1);
		tg.wait(10);
		if(tg.performAssert("ele_roleChangeSuccessfull", ComparisonType.IS_VISIBLE)){
		START_CUSTOM_SCRIPT;
		{
		END_CUSTOM_SCRIPT;
		tg.check.isVisible("ele_roleChangeSuccessfull");
		}
		START_CUSTOM_SCRIPT;
		}
		else 
		{
		END_CUSTOM_SCRIPT;
		tg.wait("ele_checkroles002", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_checkroles002");
		tg.click("ele_checkroles002", 1);
		START_CUSTOM_SCRIPT;
		}
		END_CUSTOM_SCRIPT;
	}
}