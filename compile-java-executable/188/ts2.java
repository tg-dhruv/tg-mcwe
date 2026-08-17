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
public class ts2 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_01_copy() {
        tg.openBrowser();
        int var_total = 0;
        var_total = ((Number) tg.testFunction("tf_03", new Object[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 })).intValue();
        tg.printLogs(var_total);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_02_copy() {
        tg.openBrowser();
        int var_total = 0;
        var_total = ((Number) tg.testFunction("tf_01", new Object[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 })).intValue();
        tg.printLogs(var_total);
        tg.testFunction("tf_02", new Object[] {});
        tg.close();
    }

    public static Object tf_01(Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = num1 + num2;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        return var_TGReturn;
    }

    public static Object tf_01(Integer num1, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = num1 + num2;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        return var_TGReturn;
    }

    public static void tf_02() {
        tg.wait(2);
    }

    public static void tf_02_copy() {
        tg.wait(2);
    }

    public static Object tf_03(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g, Integer h, Integer i, Integer j) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf_03(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g, Integer h, Integer i, Integer j) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        return var_TGReturn;
    }
}
