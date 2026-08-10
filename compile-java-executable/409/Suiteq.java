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
public class Suiteq {

    public static String var_ra_Demo = "true";

    public static int var_isFalse = 1;

    public static int var_GF = 0;

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc001() {
        tg.openBrowser();
        tg.wait("ele_r1h6kqsqpp108", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1h6kqsqpp108", 1);
        tg.wait("ele_r1h6kqsqpp108", ComparisonType.IS_VISIBLE);
        tg.type("ele_r1h6kqsqpp108", "fgdfgfdg");
        tg.wait("ele_r1hmkqsqpp053", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp053", 1);
        tg.wait("ele_r1hmkqsqpp578", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp578", 1);
        tg.wait("ele_r1hmkqsqpp578", ComparisonType.IS_VISIBLE);
        tg.typeEncrypted("ele_r1hmkqsqpp578", "r7eOPz7sz6SHaFI3K9lieg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.wait("ele_login305", ComparisonType.IS_VISIBLE);
        tg.click("ele_login305", 1);
        tg.wait("ele_forgotpass112", ComparisonType.IS_VISIBLE);
        // [DISABLED] tg.click("ele_forgotpass112", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc01() {
        tg.openBrowser();
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
        tg.testFunction("TF01", new Object[] {});
        tg.customScriptStart();
        StringBuilder str = new StringBuilder("ABC");
        tg.customScriptEnd();
        tg.wait("ele_Submit656", ComparisonType.IS_VISIBLE);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc02() {
        tg.openBrowser();
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
        tg.testFunction("TF01", new Object[] {});
        tg.customScriptStart();
        StringBuilder str = new StringBuilder("ABC");
        tg.customScriptEnd();
        tg.wait("ele_Submit656", ComparisonType.IS_VISIBLE);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tcfortf() {
        tg.openBrowser();
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tgsurat() {
        tg.openBrowser();
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
        tg.close();
    }

    public static void tf001() {
        tg.wait("ele_r1h6kqsqpp142", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1h6kqsqpp142", 1);
        tg.wait("ele_r1h6kqsqpp142", ComparisonType.IS_VISIBLE);
        tg.type("ele_r1h6kqsqpp142", "fbgfghfghgfhg");
        tg.wait("ele_r1hmkqsqpp826", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp826", 1);
        tg.wait("ele_r1hmkqsqpp172", ComparisonType.IS_VISIBLE);
        tg.performDoubleClick("ele_r1hmkqsqpp172");
        tg.wait("ele_login038", ComparisonType.IS_VISIBLE);
        tg.click("ele_login038", 1);
    }

    public static void tf01() {
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
    }

    public static void tf1() {
        String var_tgd = "Hello";
        tg.printLogs(var_tgd);
    }
}
