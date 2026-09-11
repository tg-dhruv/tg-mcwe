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

class step1_1_dbconnection {

	public static void step1_1_dbconnection() {
		tg.testFunction("login_tg_global_functions");
		// [DISABLED] // Tosca: Connection name | VERINT QLAB | (ActionMode 37)
		// [DISABLED] // Tosca: DSN | (ActionMode 37)
		// [DISABLED] // Tosca: User ID | root | (ActionMode 37)
		// [DISABLED] // Tosca: Password | 21489a0b-c163-4a62-b61e-501090c9506aMgAxADQAOAA5AGEAMABiAC0AYwAxADYAMwAtADQAYQA2ADIALQBiADYAMQBlAC0ANQAwADEAMAA5ADAAYwA5ADUAMAA2AGEAiY8ZBX0w1H0Nupgol2vU1qOLW0qX1CEqv+VvTDSIQ2f/YiDJSl8fcJCyL7ewgGRi | (ActionMode 37)
		// [DISABLED] // Tosca: Connection string | {CP[ICHConnectionString]} | (ActionMode 37)
		// [DISABLED] // Tosca: Driver | Generic ODBC | (ActionMode 37)
	}
}
