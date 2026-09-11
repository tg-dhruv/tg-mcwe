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

class fnfullplandetails_copy3 {

	public static void fnfullplandetails_copy3() {
		tg.wait("ele_ViewPalnDetails", ComparisonType.IS_VISIBLE, 10);
		tg.click("ele_ViewPalnDetails", 1);
		tg.wait("ele_FullPlanDetails", ComparisonType.IS_VISIBLE, 20);
		tg.click("ele_FullPlanDetails", 1);
		// =========================================================
		// Custom: Assert URL, Breadcrumbs, and Plan Name
		// =========================================================
		START_CUSTOM_SCRIPT;
		        try {
		END_CUSTOM_SCRIPT;
		// URL assertion
		START_CUSTOM_SCRIPT;
		            String currentUrl = driver.getCurrentUrl();
		            String expectedUrl =
		                "https://www.t-mobile.com/my-account/plan-details/full-plan-details";
		            if (!currentUrl.equals(expectedUrl)) {
		                throw new AssertionError(
		                    "URL mismatch\nActual: " + currentUrl +
		                    "\nExpected: " + expectedUrl
		                );
		            }
		END_CUSTOM_SCRIPT;
		// Breadcrumb assertion
		START_CUSTOM_SCRIPT;
		            List<WebElement> breadcrumbs = driver.findElements(
		                By.xpath("//ol[contains(@class,'xpr-breadcrumbs__list')]//li")
		            );
		            if (breadcrumbs.size() < 3) {
		                throw new AssertionError("Breadcrumb list incomplete");
		            }
		            if (!breadcrumbs.get(0).getText().contains("My account")) {
		                throw new AssertionError("Breadcrumb 'My account' missing");
		            }
		            if (!breadcrumbs.get(1).getText().contains("Plan details")) {
		                throw new AssertionError("Breadcrumb 'Plan details' missing");
		            }
		            if (!breadcrumbs.get(2).getText().contains("Full Plan Details")) {
		                throw new AssertionError("Breadcrumb 'Full Plan Details' missing");
		            }
		END_CUSTOM_SCRIPT;
		// Plan name assertion
		START_CUSTOM_SCRIPT;
		            String planName = driver.findElement(
		                By.xpath("//span[contains(@class,'rte-dialog--dynamicData')]")
		            ).getText().trim();
		            if (planName.isEmpty()) {
		                throw new AssertionError("Plan name is empty");
		            }
		END_CUSTOM_SCRIPT;
		tg.printLogs("URL, breadcrumbs, and plan name validated successfully");
		START_CUSTOM_SCRIPT;
		        } catch (Exception e) {
		END_CUSTOM_SCRIPT;
		tg.takeFullScreenshot();
		START_CUSTOM_SCRIPT;
		            throw new RuntimeException(
		                "URL/Breadcrumb/Plan Name validation FAILED", e
		            );
		        }
		END_CUSTOM_SCRIPT;
		// ================== End Custom ============================
		// =========================================================
		// Custom: Assert Dynamic Cards PARAGRAPH CONTENT
		// ===== Custom: Assert Dynamic Cards exact content =====
START_CUSTOM_SCRIPT;
try {

    Map<String, String> expectedContent = new LinkedHashMap<>();

    expectedContent.put(
        "Premium Data",
        "Most unlimited plans give you an amount of data at the start of your bill cycle where you are prioritized higher than customers who are heavy data users."
    );

    expectedContent.put(
        "Netflix™",
        "Receive Netflix Standard with ads while you maintain 1 qualifying Experience Beyond"
    );

    expectedContent.put(
        "Apple TV",
        "Apple TV is a streaming service featuring Apple Originals"
    );

    expectedContent.put(
        "Mobile hotspot",
        "No Wi-Fi available? No worries. Use your device as a mobile hotspot"
    );

    expectedContent.put(
        "Canada & Mexico included",
        "Call, text, and browse in Canada & Mexico. No setup. No roaming charges."
    );

    expectedContent.put(
        "Data and texting while abroad",
        "Stay connected with unlimited text and data at up to 256Kbps speeds"
    );

    expectedContent.put(
        "Unlimited international texting from home",
        "Stay in touch with friends and family around the world from here at home."
    );

    expectedContent.put(
        "1-Year AAA membership on us",
        "roadside assistance for one year at no extra cost"
    );

    expectedContent.put(
        "T-Mobile TRAVEL",
        "Save up to 40% on select hotels and rental cars"
    );

    expectedContent.put(
        "Low flat-rate calling while abroad",
        "Calls from 215+ countries and destinations"
    );

    // ✅ Special case: NO paragraph expected
    expectedContent.put(
        "Talk & text",
        ""   // intentionally empty
    );

    expectedContent.put(
        "High-speed data",
        "With T-Mobile, you get high-speed data on our nationwide 5G"
    );

    expectedContent.put(
        "5G access at no extra cost",
        "A 5G capable device is required to receive 5G network access"
    );

    expectedContent.put(
        "Wi-Fi calling",
        "With Wi-Fi Calling, you can make and receive calls and messages over Wi-Fi"
    );

    expectedContent.put(
        "Scam Shield™ Premium",
        "With Scam Shield™ Premium, you can optimize and organize your mobile life"
    );

    expectedContent.put(
        "Voicemail to Text",
        "Read voicemails on the go with Voicemail to Text"
    );

    expectedContent.put(
        "Video Streaming Quality",
        "Video typically streams in SD as default."
    );

    expectedContent.put(
        "AutoPay monthly discount",
        "AutoPay discount requires bank account or debit card"
    );

    List<WebElement> cards = driver.findElements(
        By.xpath("//div[contains(@class,'xpr-dynamicCards__item')]")
    );

    if (cards.isEmpty()) {
        throw new AssertionError("No Dynamic Cards found on page");
    }

    for (WebElement card : cards) {

        String title = card.findElement(By.xpath(".//h2//span"))
                           .getText()
                           .replace("&amp;", "&")
                           .trim();

        String paragraph = "";
        try {
            paragraph = card.findElement(By.xpath(".//p//span"))
                            .getText()
                            .replace("\u00A0", " ")
                            .replace("&amp;", "&")
                            .trim();
        } catch (Exception ignore) {
            // paragraph missing is allowed for "Talk & text"
        }

        if (!expectedContent.containsKey(title)) {
            throw new AssertionError("Unexpected card found: " + title);
        }

        String expectedSnippet = expectedContent.get(title);

        // ✅ Allow empty paragraph ONLY where expected
        if (!expectedSnippet.isEmpty()) {
            if (!paragraph.contains(expectedSnippet)) {
                throw new AssertionError(
                    "Content mismatch for card: " + title +
                    "\nExpected to contain: " + expectedSnippet +
                    "\nActual: " + paragraph
                );
            }
        }
    }

    tg.printLogs("All Dynamic Cards content validated successfully");

} catch (Exception e) {
    tg.takeFullScreenshot();
    throw new RuntimeException(
        "Dynamic Cards content validation FAILED", e
    );
}
END_CUSTOM_SCRIPT;
// ===== End Custom =====
		// ================== End Custom ============================
		tg.takeFullScreenshot();
		tg.printLogs("Full Plan Details page validations completed");
	}
}