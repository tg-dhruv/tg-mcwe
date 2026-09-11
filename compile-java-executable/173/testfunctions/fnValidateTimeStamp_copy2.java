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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class fnvalidatetimestamp_copy2 {

	public static void fnvalidatetimestamp_copy2() {
		tg.wait("ele_accountHistory", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_accountHistory");
		tg.wait("ele_accountSummaryHistoryTable", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_accountSummaryHistoryTable");
		try {
		   
    WebElement numberChangeRow = null;
    List<WebElement> rows = driver.findElements(By.cssSelector(".accountMgmt-historyTable__body-row"));
    for (WebElement row : rows) {
        try {
            if (row.findElement(By.cssSelector(".accountMgmt-historyTable-eventActivity"))
                    .getText().trim().equalsIgnoreCase("Number change")) {
                numberChangeRow = row;
                break;
            }
        } 
        catch (Exception Ex)
        {
    System.out.println("Exception caught "+ Ex);
        }
    }

    
    if (numberChangeRow == null) {
        throw new AssertionError("Number change log entry should be present in the account history table");
    }
    System.out.println("✓ Scenario 1 Passed: Number change log entry is present in the account history table");

    String activityText = numberChangeRow.findElement(By.cssSelector(".accountMgmt-historyTable-eventActivity")).getText().trim();
    if (!activityText.equalsIgnoreCase("Number change")) {
        throw new AssertionError("Activity label should be 'Number change' but found: " + activityText);
    }
    System.out.println("✓ Scenario 1 Passed: Activity label verified as: " + activityText);

    
    String descriptionText = numberChangeRow
            .findElement(By.cssSelector(".accountMgmt-historyTable-eventDescription span:first-child"))
            .getText().trim();

    if (descriptionText.isEmpty()) {
        throw new AssertionError("Description text should not be empty in the Number change log entry");
    }
    System.out.println("✓ Description text found: " + descriptionText);

    
    Pattern phonePattern = Pattern.compile("(\\(?\\d{3}\\)?[\\s\\-]?\\d{3}[\\s\\-]?\\d{4})");
    Matcher matcher = phonePattern.matcher(descriptionText);

    String oldNumber = null;
    String newNumber = null;

    if (matcher.find()) {
        oldNumber = matcher.group(1).trim();
    }
    if (matcher.find()) {
        newNumber = matcher.group(1).trim();
    }

    if (oldNumber == null || oldNumber.isEmpty()) {
        throw new AssertionError("Old phone number should be present in the description. Actual: " + descriptionText);
    }
    System.out.println("✓ Scenario 2 Passed: Old phone number found in description: " + oldNumber);

    if (newNumber == null || newNumber.isEmpty()) {
        throw new AssertionError("New phone number should be present in the description. Actual: " + descriptionText);
    }
    System.out.println("✓ Scenario 2 Passed: New phone number found in description: " + newNumber);

    if (!descriptionText.contains("was changed to")) {
        throw new AssertionError("Description should contain 'was changed to' to indicate number change. Actual: " + descriptionText);
    }
    System.out.println("✓ Scenario 2 Passed: 'was changed to' keyword verified in description");

    System.out.println("✓ Scenario 2 Passed: Number change from [" + oldNumber + "] to [" + newNumber + "] verified successfully");

    
    String eventDate = numberChangeRow.findElement(By.cssSelector(".accountMgmt-historyTable-eventDate")).getText().trim();
    String eventTime = numberChangeRow.findElement(By.cssSelector(".accountMgmt-historyTable-eventTime")).getText().trim();

    if (eventDate.isEmpty()) {
        throw new AssertionError("Event date should not be empty in the Number change log entry");
    }
    System.out.println("✓ Scenario 3 Passed: Event date is present: " + eventDate);

    if (eventTime.isEmpty()) {
        throw new AssertionError("Event time should not be empty in the Number change log entry");
    }
    System.out.println("✓ Scenario 3 Passed: Event time is present: " + eventTime);

    
    Pattern datePattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{2}$");
    if (!datePattern.matcher(eventDate).matches()) {
        throw new AssertionError("Event date format should be MM/dd/yy but found: " + eventDate);
    }
    System.out.println("✓ Scenario 3 Passed: Event date format (MM/dd/yy) verified: " + eventDate);

    
    Pattern timePattern = Pattern.compile("^\\d{1,2}:\\d{2}\\s?(AM|PM)$");
    if (!timePattern.matcher(eventTime).matches()) {
        throw new AssertionError("Event time format should be HH:mm AM/PM but found: " + eventTime);
    }
    System.out.println("✓ Scenario 3 Passed: Event time format (HH:mm AM/PM) verified: " + eventTime);

    
    if (!descriptionText.contains("via Store Representative")) {
        throw new AssertionError("Description should contain 'via Store Representative'. Actual: " + descriptionText);
    }
    System.out.println("✓ Scenario 3 Passed: Change initiator 'via Store Representative' verified in description");

    System.out.println("\n✓ All Scenarios Passed Successfully");
    System.out.println("  → Number Change Entry : Present");
    System.out.println("  → Old Number          : " + oldNumber);
    System.out.println("  → New Number          : " + newNumber);
    System.out.println("  → Event Date          : " + eventDate);
    System.out.println("  → Event Time          : " + eventTime);
}
catch (Exception Ex)
{
    System.out.println("Exception caught "+ Ex);
}
}
}