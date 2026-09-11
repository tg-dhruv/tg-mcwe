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

@Listeners(TestListener.class)
public class TMOWebBilling {

    public static String var_TMOWebPassword2 = "Tmobile@2143";

    public static String var_TMOWebUserName2 = "4709238132";

    public static String var_Password = "null";

    public static String var_Username = "null";

    public static String var_TMOWebPassword1 = "Tm0b1le@2143";

    public static String var_TMOWebUserName1 = "4709237688";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitalbillbreakdownbyline() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.testFunction("fnDismissNotificationPopUps_copy");
        tg.testFunction("fnNavigateToBillSummary");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmobillingnavigatetodetailedservicessection() {
        tg.openBrowser();
        tg.wait("ele_myaccount016", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccount016", 1);
        tg.wait("ele_login168", ComparisonType.IS_VISIBLE);
        tg.click("ele_login168", 1);
        tg.wait("ele_emailorpho689", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailorpho689", 1);
        tg.wait("ele_emailorpho689", ComparisonType.IS_VISIBLE);
        tg.type("ele_emailorpho689", "4709237688");
        tg.wait("ele_next862", ComparisonType.IS_VISIBLE);
        tg.click("ele_next862", 1);
        tg.wait("ele_passwordte391", ComparisonType.IS_VISIBLE);
        tg.click("ele_passwordte391", 1);
        tg.wait("ele_passwordte391", ComparisonType.IS_VISIBLE);
        tg.type("ele_passwordte250", "Tm0b1le@2143");
        tg.wait("ele_login984", ComparisonType.IS_VISIBLE);
        tg.click("ele_login984", 1);
        tg.wait("ele_close516", ComparisonType.IS_VISIBLE);
        tg.click("ele_close516", 1);
        tg.wait("ele_viewbill682", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewbill682", 1);
        tg.wait("ele_allownotif430", ComparisonType.IS_VISIBLE);
        tg.click("ele_allownotif430", 1);
        tg.wait("ele_viewservic578", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewservic578", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmowebbillingaccountactivity() {
        tg.openBrowser();
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.wait("ele_viewbill710", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewbill710", 1);
        tg.wait("ele_viewaccoun806", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewaccoun806", 1);
        tg.wait("ele_accountact100", ComparisonType.IS_VISIBLE);
        tg.check.isVisible("ele_history131");
        tg.check.isVisible("ele_date131");
        tg.check.isVisible("ele_activity086");
        tg.check.isVisible("ele_line486");
        tg.check.isVisible("ele_category637");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmowebbillingcheckonetimecharges() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        if (tg.performAssert("ele_acceptButton", ComparisonType.IS_VISIBLE)) {
            tg.wait("ele_acceptButton", ComparisonType.IS_VISIBLE, 20);
            tg.click("ele_acceptButton", 1);
        }
        tg.wait("viewBillLink", ComparisonType.IS_VISIBLE, 20);
        tg.click("viewBillLink", 1);
        if (tg.performAssert("allowNotificationsButton", ComparisonType.IS_VISIBLE)) {
            tg.wait("allowNotificationsButton", ComparisonType.IS_VISIBLE, 20);
            tg.click("allowNotificationsButton", 1);
        }
        tg.wait("billingPanelDiv", ComparisonType.IS_VISIBLE, 20);
        tg.wait("viewOneTimeButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("viewOneTimeButton", 1);
        tg.wait("currentBillChargesSummaryDiv", ComparisonType.IS_VISIBLE, 20);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmowebbillingcheckonetimechargescopy() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.wait("acceptButton", ComparisonType.IS_VISIBLE, 180);
        tg.click("acceptButton", 1);
        tg.wait("viewBillLink", ComparisonType.IS_VISIBLE, 30);
        tg.click("viewBillLink", 1);
        if (tg.performAssert("allowNotificationsButton", ComparisonType.IS_VISIBLE)) {
            tg.wait("allowNotificationsButton", ComparisonType.IS_VISIBLE, 20);
            tg.click("allowNotificationsButton", 1);
        }
        tg.wait("billingPanelDiv", ComparisonType.IS_VISIBLE, 20);
        tg.wait("viewOneTimeButton", ComparisonType.IS_VISIBLE, 20);
        tg.click("viewOneTimeButton", 1);
        tg.wait("currentBillChargesSummaryDiv", ComparisonType.IS_VISIBLE, 20);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmowebbillingcheckonetimechargesv1() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.wait("ele_accept452", ComparisonType.IS_VISIBLE);
        tg.click("ele_accept452", 1);
        tg.wait("ele_viewbillTest", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewbillTest", 1);
        tg.wait("ele_allownotif043", ComparisonType.IS_VISIBLE);
        tg.click("ele_allownotif043", 1);
        tg.wait("ele_viewonetim693", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewonetim693", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void digitaltmowebbillingdownloadsummarybill() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.check.isVisible("ele_close735");
        if (tg.performAssert("ele_close735", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_close735", 1);
        }
        tg.wait("ele_viewbill710", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_viewbill710", 1);
        tg.check.isVisible("ele_dontallow054");
        if (tg.performAssert("ele_dontallow054", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_dontallow054", 1);
        }
        tg.wait("ele_downloadmy887", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_downloadmy887", 1);
        tg.wait("ele_downloadsu531", ComparisonType.IS_VISIBLE, 20);
        tg.click("ele_downloadsu531", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dynamicvariableinfunction() {
        tg.openBrowser();
        var_Username = tg.saveToVariable(var_TMOWebUserName2, var_Username);
        var_Password = tg.saveToVariable(var_TMOWebPassword2, var_Password);
        tg.testFunction("fnDigitalWebLoginPROD_copy_copy_copy");
        tg.close();
    }

    public static void fndigitalweblogin() {
        tg.wait("ele_myaccount235", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccount235", 1);
        tg.wait("ele_login030", ComparisonType.IS_VISIBLE);
        tg.click("ele_login030", 1);
        tg.wait("ele_emailorpho246", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_emailorpho246", 1);
        tg.type("ele_emailorpho246", var_Username);
        tg.wait("ele_next211", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_next211", 1);
        tg.wait("ele_password023", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_password023", 1);
        tg.type("ele_password023", var_Password);
        tg.wait("ele_login573", ComparisonType.IS_VISIBLE);
        tg.click("ele_login573", 1);
    }

    public static void fndigitalwebloginprod_copy_copy_copy() {
        tg.wait("ele_myaccount649", ComparisonType.IS_VISIBLE);
        tg.click("ele_myaccount649", 1);
        tg.wait("ele_login939", ComparisonType.IS_VISIBLE);
        tg.click("ele_login939", 1);
        tg.wait("ele_emailorpho246", ComparisonType.IS_VISIBLE);
        tg.click("ele_emailorpho246", 1);
        tg.type("ele_emailorpho246", var_Username);
        tg.wait("ele_next692", ComparisonType.IS_VISIBLE);
        tg.click("ele_next692", 1);
        tg.wait("ele_passwordte885", ComparisonType.IS_VISIBLE);
        tg.click("ele_passwordte885", 1);
        tg.wait("ele_passwordte885", ComparisonType.IS_VISIBLE);
        tg.type("ele_passwordte511", var_Password);
        tg.wait("ele_login573", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_login573", 1);
        tg.printLogs("Complete Login");
    }

    public static void fndismissnotificationpopups_copy() {
        tg.wait("ele_accept182", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_accept182", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_accept182", 1);
        }
        if (tg.performAssert("ele_allownotif940", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_allownotif940", 1);
        }
    }

    public static void fnnavigatetobillsummary() {
        tg.wait("ele_viewbill762", ComparisonType.IS_VISIBLE);
        tg.click("ele_viewbill762", 1);
    }
}
