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
    public void tc_old() {
        tg.openDevice();
        tg.printLogs("start tc");
        int var_dhruv = 1;
        var_dhruv = (int) tg.testFunction("tf_old", new Object[] { 2, 3, 4 });
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

    public static Object tf_old(Integer a, Integer b, Integer c) {
        int var_TGReturn = 0;
        tg.wait(1);
        tg.customScriptStart();
        var_TGReturn = a + b + c;
        tg.customScriptEnd();
        tg.printLogs(var_TGReturn);
        return var_TGReturn;
    }
}
