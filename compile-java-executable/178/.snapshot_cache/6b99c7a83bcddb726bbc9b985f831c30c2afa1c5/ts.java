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
public class ts {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_001() {
        tg.openBrowser();
        tg.wait("ele_r1h6kqsqpp808", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1h6kqsqpp808", 1);
        tg.wait("ele_r1h6kqsqpp808", ComparisonType.IS_VISIBLE);
        tg.type("ele_r1h6kqsqpp808", "teest");
        tg.wait("ele_r1hmkqsqpp940", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp940", 1);
        tg.wait("ele_r1hmkqsqpp272", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp272", 1);
        tg.wait("ele_r1hmkqsqpp272", ComparisonType.IS_VISIBLE);
        tg.typeEncrypted("ele_r1hmkqsqpp272", "VpgCryssotg9DoeEeY28tQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.wait("ele_login166", ComparisonType.IS_VISIBLE);
        tg.click("ele_login166", 1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_new() {
        tg.openBrowser();
        String var_name = "dhruv";
        var_name = (String) tg.testFunction("tf_new_v01", new Object[] { "a", "a", "a", "a", "a", "a" });
        tg.printLogs(var_name);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_old() {
        tg.openBrowser();
        String var_name = "dhruv";
        int var_res = 0;
        var_res = (int) tg.testFunction("tf_old", new Object[] { 1, 1, 1, 1, 1, 1, 1, 1 });
        tg.printLogs(var_res);
        tg.close();
    }

    public static Object tf_new_1(String a, String b, String c, String d, String e, String f) {
        String var_TGReturn = "";
        tg.customScriptStart();
        var_TGReturn = a + b + c + d + e + f;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        return var_TGReturn;
    }

    public static Object tf_old(String a, String b, String c, String d, String e, String f, String g, String h) {
        String var_TGReturn = "";
        tg.customScriptStart();
        var_TGReturn = a + b + c + d + e + f + g + h;
        tg.customScriptEnd();
        return var_TGReturn;
    }
}
