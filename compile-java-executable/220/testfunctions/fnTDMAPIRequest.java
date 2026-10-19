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

class fntdmapirequest {

	public static void fntdmapirequest() {
		tg_String var_tdmapistatusCode = "0";
		tg.testFunction("fnDigitalWebTdmApiAuthTokenGeneration", new Object[]{});
		START_CUSTOM_SCRIPT;
		try {
		    TrustManager[] trustAllCerts = new TrustManager[]{
		        new X509TrustManager() {
		            public void checkClientTrusted(X509Certificate[] chain, String authType) {}
		            public void checkServerTrusted(X509Certificate[] chain, String authType) {}
		            public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
		        }
		    };
		    SSLContext sslContext = SSLContext.getInstance("TLS");
		    sslContext.init(null, trustAllCerts, new SecureRandom());
		    HostnameVerifier allowAllHosts = new HostnameVerifier() {
		        public boolean verify(String hostname, SSLSession session) {
		            return true;
		        }
		    };
		    InetSocketAddress sa = new InetSocketAddress("10.0.136.5", 40003);
		    java.net.Proxy proxy = new java.net.Proxy(java.net.Proxy.Type.HTTP, sa);
		    OkHttpClient client = new OkHttpClient.Builder()
		        .proxy(proxy)
		        .connectTimeout(2, TimeUnit.MINUTES)
		        .writeTimeout(2, TimeUnit.MINUTES)
		        .readTimeout(2, TimeUnit.MINUTES)
		        .callTimeout(2, TimeUnit.MINUTES)
		        .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustAllCerts[0])
		        .hostnameVerifier(allowAllHosts)
		        .build();
		    // ---- Request body (JSON) ----
		    String env = var_env.toUpperCase();
		    String testDataLabel = var_testDataLabel;   // pass per test case
		    String jsonBody = "{"
		        + "\"env\":\"" + env + "\","
		        + "\"count\":1,"
		        + "\"ntid\":\"mmedam3\","
		        + "\"testDataLabel\":\"" + var_testDataLabel + "\""
		        + "}";
		    MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
		    RequestBody body = RequestBody.create(mediaType, jsonBody);
		    Request request = new Request.Builder()
		        .url("https://tdp-data-service.px-npe2201.tke.t-mobile.com/regressionData")
		        .post(body)
		        .addHeader("x-auth-originator", var_tdmAccessToken)
		        .addHeader("Authorization", "Bearer " + var_tdmAccessToken)
		        .addHeader("Content-Type", "application/json")
		        .build();
		    Response response = client.newCall(request).execute();
		    String responseTxt = response.body().string();
		    System.out.println(responseTxt);
		    ObjectMapper objectMapper = new ObjectMapper();
		    JsonNode rootNode = objectMapper.readTree(responseTxt);
		    JsonNode record = rootNode
		        .path("dataset")
		        .path("data")
		        .path(0);
		    var_ban         = record.path("BAN").asText();
		    var_mobileNumber= record.path("MSISDN").asText();
		    var_password = record.path("IAM_PASSWORD").asText();
		    var_tdmapistatusCode = String.valueOf(response.code());
		    response.close();
		    tg.check.isEqualTo(var_tdmapistatusCode, "200");
		} catch (Exception e) {
		    e.printStackTrace();
		}
		END_CUSTOM_SCRIPT;
	}
}