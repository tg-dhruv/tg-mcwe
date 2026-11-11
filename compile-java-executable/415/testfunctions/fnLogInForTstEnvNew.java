import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
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


class fnloginfortstenvnew {

	public static void fnloginfortstenvnew() {
			tg.wait(1);
		tg.navigateToUrl("https://tmobileusainc-tst.npr.mykronos.com/");
		tg.wait(5);
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.check.isVisible("ele_UsernameOrEmail_3a1d367c");
		tg.type("ele_UsernameOrEmail_3a1d367c", var_Precondition_Login_UserName);
		tg.check.isVisible("ele_Password_3a1d367c");
		tg.type("ele_Password_3a1d367c", var_Precondition_Login_PassWord);
		tg.wait(2);
		tg.check.isVisible("ele_SignIn_3a1d367c");
		tg.click("ele_SignIn_3a1d367c", 1);
		if (tg.performAssert("ele_YourOrganizationUsesMultifactorAuthenticationAndYouMustEnterAAccessCodeSelectTheMethodToReceiveThisPassword_3a138a63", ComparisonType.IS_VISIBLE)) {
						tg.wait(3);
						// [DISABLED] tg.check.isVisible("ele_YourOrganizationUsesMultifactorAuthenticationAndYouMustEnterAAccessCodeSelectTheMethodToReceiveThisPassword_3a138a63");
						tg.check.isVisible("ele_TroubleScanning_3a1f3eda");
						// [DISABLED] tg.type("ele_Dropdown_3a138b1e", "Token");
						// [DISABLED] tg.check.isVisible("ele_SignIn_3a138b1e");
						// [DISABLED] tg.click("ele_SignIn_3a138b1e", 1);
						while (tg.verify.isInvisible("ele_TryAgain_3a138a68")) {
							tg.wait(3);
							// [DISABLED] tg.check.isVisible("ele_TryAgain_3a138a68");
							// [DISABLED] tg.click("ele_TryAgain_3a138a68", 1);
							tg.check.isVisible("ele_TroubleScanning_3a1f3eda");
							tg.type("ele_SecretKey_3a0f7987", var_Precondition_Login_Secret_Key);
							// [DISABLED] tg.type("ele_VerificationCode_3a138a66", "TOTPValue");
							// [DISABLED] tg.click("ele_Submit_3a138a66", 1);
							tg.type("ele_EnterYourOneTimeCode_3a1f3ed6", "TOTPValue");
							tg.click("ele_Continue_3a1f3ed6", 1);
						}
		}
		tg.wait(3);
		tg.check.isVisible("ele_MainMenuOption_3a03871b");
		tg.testFunction("fnValidationScreenshot");
	}
}
