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
public class TestSuite1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void mtc_new_int() {
        tg.openBrowser();
        int var_total = 0;
        var_total = (int) tg.testFunction("wtf_new", new Object[] { 1, 1, 1, "3", "3", "3", "2" });
        tg.printLogs(var_total);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void mtc_new_string() {
        tg.openBrowser();
        String var_result = "null";
        var_result = (String) tg.testFunction("wtf_new_string", new Object[] { "a", "b", "c", "d", "e", "f", "g", "h", "i" });
        tg.printLogs(var_result);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void mtc_old_string() {
        tg.openBrowser();
        String var_result = "null";
        var_result = (String) tg.testFunction("wtf_old_string", new Object[] { "dhruv", "dhameliya", "007" });
        tg.printLogs(var_result);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void r_tc_new_name() {
        tg.openBrowser();
        int var_total = 0;
        var_total = (int) tg.testFunction("r_tf_new", new Object[] { 1, 1, 1, 1 });
        tg.printLogs(var_total);
        tg.type("ele_testError", var_total);
        if (tg.performAssert(var_total, ComparisonType.EQUAL_TO, var_total)) {
            tg.printLogs("test");
        }
        while (tg.verify.isEqualTo(var_total, var_total) && tg.verify.isNotEqualTo(var_total, var_total)) {
            tg.printLogs("test");
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_01() {
        tg.openBrowser();
        tg.wait(3);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_01_copy() {
        tg.openBrowser();
        tg.wait(3);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void ttc_old() {
        tg.openBrowser();
        int var_total = 0;
        var_total = (int) tg.testFunction("wtf_old", new Object[] { 1, 1, 1, 3 });
        tg.printLogs(var_total);
        tg.close();
    }

    public static Object r_tf_new(Integer a, Integer b, Integer c, Integer d) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        tg.wait(1);
        return var_TGReturn;
    }

    public static Object wtf_new(Integer a, Integer b, Integer c, String e, String f, String g, String H) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object wtf_new_string(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        String var_TGReturn = "";
        tg.customScriptStart();
        var_TGReturn = a + b + c + d + e + f + g + h + i;
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object wtf_old(Integer a, Integer b, Integer c, Integer d) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object wtf_old_string(String a, String b, String c) {
        String var_TGReturn = "";
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        return var_TGReturn;
    }
}
