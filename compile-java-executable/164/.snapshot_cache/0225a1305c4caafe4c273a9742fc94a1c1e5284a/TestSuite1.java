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
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class TestSuite1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_new() {
        tg.openDevice();
        tg.printLogs("START");
        int var_dhruv = 0;
        var_dhruv = (int) tg.testFunction("tf_new", new Object[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        tg.printLogs(var_dhruv);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_old() {
        tg.openDevice();
        tg.printLogs("start tc");
        int var_dhruv = 1;
        var_dhruv = (int) tg.testFunction("tf_old", new Object[] { 2, 3, 4, 5 });
        tg.printLogs(var_dhruv);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void test_01() {
        tg.openDevice();
        tg.wait("ele_WondersoftheworldTextView1785340538413", ComparisonType.IS_VISIBLE);
        tg.click("ele_WondersoftheworldTextView1785340538413", 1);
        tg.close();
    }

    public static Object tf_new(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f, Integer g, Integer h) {
        int var_TGReturn = 0;
        tg.customScriptStart();
        var_TGReturn = a + b + c + d + e + f + g + h;
        tg.customScriptEnd();
        return var_TGReturn;
    }

    public static Object tf_old(Integer a, Integer b, Integer c, Integer d) {
        int var_TGReturn = 0;
        tg.wait(1);
        tg.customScriptStart();
        var_TGReturn = a + b + c - d;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        return var_TGReturn;
    }
}
