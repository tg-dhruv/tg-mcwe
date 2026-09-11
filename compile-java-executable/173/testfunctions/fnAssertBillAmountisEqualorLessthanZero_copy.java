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

class fnassertbillamountisequalorlessthanzero_copy {

	public static void fnassertbillamountisequalorlessthanzero_copy() {
		tg.wait("ele_viewBillLink", ComparisonType.IS_VISIBLE, 10);
		// ===== Custom: assert Amount Due is zero or negative (pre-requisite) =====
START_CUSTOM_SCRIPT;
try {
    // 1) Update this to your Amount Due element locator
    By amountBy = By.xpath("//*[@id='billCard']/div/div[1]/div/p[2]"); // example path

    WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
    WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(amountBy));

    String raw = el.getText();
    if (raw == null) raw = "";
    raw = raw.trim();

    // Normalize: handle $, commas, spaces, unicode minus, accounting negatives "(4.07)"
    String normalized = raw
            .replace("\u2212", "-")   // Unicode minus → hyphen
            .replace("\u2013", "-")   // en dash
            .replace("\u2014", "-")   // em dash
            .replaceAll("[,$\\s]", ""); // drop $, commas, spaces

    if (normalized.matches("^\\(.*\\)$")) {
        // "(4.07)" → "-4.07"
        normalized = "-" + normalized.substring(1, normalized.length() - 1);
    }
    normalized = normalized.replaceAll("^\\$", ""); // leading $ if any

    if (normalized.startsWith("."))   normalized = "0" + normalized;      // ".50"  -> "0.50"
    if (normalized.startsWith("-."))  normalized = "-0" + normalized.substring(1); // "-.50" -> "-0.50"

    if (normalized.isEmpty() || normalized.equals("-") || normalized.equals(".") || normalized.equals("-.")) {
        throw new AssertionError("Amount Due parsing failed. Raw text: '" + raw + "'");
    }

    java.math.BigDecimal value = new java.math.BigDecimal(normalized);

    System.out.println("[Prereq AmountDue] Raw     : " + raw);
    System.out.println("[Prereq AmountDue] Parsed  : " + value.toPlainString());

    boolean isZeroOrNegative = value.compareTo(java.math.BigDecimal.ZERO) <= 0;

    // Assert: pre-requisite met (Amount Due must be 0.00 or negative)
    io.testgrid.tg.performAssert(String.valueOf(isZeroOrNegative),
            io.testgrid.enums.ComparisonType.EQUAL_TO, "true");

    if (!isZeroOrNegative) {
        throw new AssertionError(
            "Pre-requisite failed: Amount Due must be ≤ 0.00. Found: " + value.toPlainString()
        );
    }
} catch (Exception e) {
    throw new RuntimeException("Error while validating Amount Due pre-requisite (≤ 0.00).", e);
}
END_CUSTOM_SCRIPT;
// ===== End custom =====

	}
}