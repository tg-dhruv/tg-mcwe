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

class fnclickprivacynotice_copy2 {

    public static void fnclickprivacynotice_copy2() {

        // Navigate to Privacy Notice
        tg.wait("ele_PrivacyNotice", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_PrivacyNotice", 1);
        tg.switchToTab(1);

        // ===== Custom: Assert Privacy Notice URL =====
        START_CUSTOM_SCRIPT;
        try {

            String expectedUrl = "https://www.t-mobile.com/privacy-center/privacy-notices";
            String actualUrl = driver.getCurrentUrl();

            System.out.println("[Privacy Notice] Expected URL: " + expectedUrl);
            System.out.println("[Privacy Notice] Actual URL  : " + actualUrl);

            if (!actualUrl.equals(expectedUrl)) {
                throw new AssertionError(
                    "Privacy Notice URL assertion failed. Expected: "
                    + expectedUrl + " but Found: " + actualUrl
                );
            }

            System.out.println("[Privacy Notice] URL assertion passed.");

        } catch (Exception e) {
            throw new RuntimeException("Privacy Notice URL validation failed.", e);
        }
        END_CUSTOM_SCRIPT;
        // ===== End custom =====

        // Capture screenshot for evidence
        tg.takeFullScreenshot();
    }
}