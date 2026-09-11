import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import static io.testgrid.enums.KeyboardKeys.*;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import org.openqa.selenium.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import static io.testgrid.baseClass.driver;


@Listeners(TestListener.class)
public class Step1_TBox_DB_Open_Connection_d81acfd0 extends tc_Step1_1480d125 {

	@Test
	public void step1_tbox_db_open_connection_d81acfd0() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] // Tosca: Connection name | VERINT QLAB | (ActionMode 37)
		// [DISABLED] // Tosca: DSN | (ActionMode 37)
		// [DISABLED] // Tosca: User ID | root | (ActionMode 37)
		// [DISABLED] // Tosca: Password | 21489a0b-c163-4a62-b61e-501090c9506aMgAxADQAOAA5AGEAMABiAC0AYwAxADYAMwAtADQAYQA2ADIALQBiADYAMQBlAC0ANQAwADEAMAA5ADAAYwA5ADUAMAA2AGEAiY8ZBX0w1H0Nupgol2vU1qOLW0qX1CEqv+VvTDSIQ2f/YiDJSl8fcJCyL7ewgGRi | (ActionMode 37)
		// [DISABLED] // Tosca: Connection string | {CP[ICHConnectionString]} | (ActionMode 37)
		// [DISABLED] // Tosca: Driver | Generic ODBC | (ActionMode 37)
	}
}
