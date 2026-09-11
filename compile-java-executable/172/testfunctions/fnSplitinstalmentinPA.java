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

class fnsplitinstalmentinpa {

	public static void fnsplitinstalmentinpa() {
		tg.wait("ele_EditPASchedul", ComparisonType.IS_VISIBLE);
		tg.click("ele_EditPASchedul", 1);
		tg.wait("ele_AddPayment2", ComparisonType.IS_VISIBLE);
		tg.click("ele_AddPayment2", 1);
		tg.wait("ele_ContinueinEditPaymentschedule", ComparisonType.IS_VISIBLE);
		tg.click("ele_ContinueinEditPaymentschedule", 1);
		tg.wait("ele_Payment2", ComparisonType.IS_VISIBLE);
		tg.check.isVisible("ele_Payment2");
		tg.check.isVisible("ele_Payement1PAPage");
		tg.check.isVisible("ele_Payment2PAPage");
		tg_String var_Pay2 = "";
		var_Pay2 = tg.saveToVariable("ele_Payment2PAPage", var_Pay2);
		tg.check.isEqualTo("ele_Payement1PAPage",var_Pay2);
		// [DISABLED] START_CUSTOM_SCRIPT;
		// [DISABLED] String textA = driver.findElement(By.cssSelector("#column-49ffa6bb90 > div.payment-schedule-card > div > ul > li:nth-child(2) > div > div > div.phx\\:ta-right.phx\\:display-flex.phx\\:direction-column > div.tdds\\:text-subhead-2.phx\\:mb-h")).getText();
		// [DISABLED] String textB = driver.findElement(By.cssSelector("#column-49ffa6bb90 > div.payment-schedule-card > div > ul > li:nth-child(3) > div > div > div.phx\\:ta-right.phx\\:display-flex.phx\\:direction-column > div")).getText();
		// [DISABLED] String textC = driver.findElement(By.cssSelector("#text-3ba86e317f > div > p > span")).getText();
		// [DISABLED] double a = Double.parseDouble(textA.replace("$", "").replace(",", "").trim());
		// [DISABLED] double b = Double.parseDouble(textB.replace("$", "").replace(",", "").trim());
		// [DISABLED] double c = Double.parseDouble(textC.replace("$", "").replace(",", "").trim());
		// [DISABLED] double expected = a + b;
		// [DISABLED] if (Math.abs(expected - c) < 0.01) {
		// [DISABLED]     System.out.println("PASS: " + a + " + " + b + " = " + c);
		// [DISABLED] } else {
		// [DISABLED]     throw new RuntimeException(
		// [DISABLED]         "FAIL: Expected " + expected + " but got " + c
		// [DISABLED]     );
		// [DISABLED] }
		// [DISABLED] END_CUSTOM_SCRIPT;
		tg.printLogs("Total balance is equally splitted into 2 payments");
		START_CUSTOM_SCRIPT;
		WebElement locator = driver.findElement(By.xpath("//li[1]/div/div/div/div[@x-text='installment.dueDate']"));
		String inputDate = locator.getText().split(",")[1].trim();
		        int daysToAdd = 14;
		        String[] months = {"January", "February", "March", "April", "May", "June",
		                           "July", "August", "September", "October", "November", "December"};
		        String[] parts = inputDate.trim().split("\\s+");
		        int monthIndex = Arrays.asList(months).indexOf(parts[0]);
		        int day = Integer.parseInt(parts[1]);
		        Calendar cal = Calendar.getInstance();
		        cal.set(cal.get(Calendar.YEAR), monthIndex, day);
		        cal.add(Calendar.DAY_OF_MONTH, daysToAdd);
		        String result = months[cal.get(Calendar.MONTH)] + " " + cal.get(Calendar.DAY_OF_MONTH);
		        System.out.println("*********************************************");
		        System.out.println("First Payment date " + inputDate);
		        System.out.println("First Payment date + 14 days" + result);
		END_CUSTOM_SCRIPT;
		tg.printLogs("Payment 2 is scheduled 14 days after Payment 1.");
	}
}