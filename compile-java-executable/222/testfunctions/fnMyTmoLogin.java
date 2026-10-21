import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.LocalDate;
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

class fnmytmologin {

	public static void fnmytmologin() {
		if(tg.performAssert(var_env, ComparisonType.EQUAL_TO, "Qlab03")){
		tg.navigateToUrl("https://digital-qlab03.t-mobile.com/");
		} else {
		tg.navigateToUrl("https://digital-qlab02.t-mobile.com/");
		}
		tg.wait("ele_digitalMyTMOListMyaccount", ComparisonType.IS_CLICKABLE, 60);
		tg.click("ele_digitalMyTMOListMyaccount", 1);
		tg.wait("ele_digitalwebMytmoLinkLogin", ComparisonType.IS_VISIBLE, 60);
		tg.click("ele_digitalwebMytmoLinkLogin");
		tg.testFunction("fnTMONoticePopup", new Object[]{});
		tg.testFunction("fnEnterCredentials", new Object[]{});
		tg.testFunction("fnTMONoticePopup", new Object[]{});
		tg.testFunction("fnDigitalWebMyTMOWelcomePopups", new Object[]{});
		tg.testFunction("fnTMONoticePopup", new Object[]{});
		tg.wait("ele_digitalwebMytmoHomeBtnUserName", ComparisonType.IS_VISIBLE, 40);
	}
}