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
@Listeners(TestListener.class)
public class Digital_MyTMOWeb_Shop {

    public static String var_HSI_PW = "Tmobile@2145";

    public static String var_HSI_UN = "2033587123";

    public static String var_TMOWebTSATPassword = "Tmobile@2143";

    public static String var_TMOWebTSATUserName = "3472033809";

    public static String var_TSalellitePW = "Tmobile@2144";

    public static String var_TSalelliteUN = "9132603071";

    public static String var_MyTMOWebPTNChangePassword = "Tmobile@2143";

    public static String var_MyTMOWebPTNChangeUsername = "9132074509";

    public static String var_TMOWebsuspenduserpwd = "Tmobile@2143";

    public static String var_TMOWebsuspendusername = "4046494099";

    public static String var_GetText = "NULL";

    public static String var_TMOWebPwdSuspendeSY = "Test@DataPlatform9Team!";

    public static String var_TMOWebUserSuspendeSY = "4255367959";

    public static String var_TMOWebPwdforIM = "Tmobile@2143";

    public static String var_TMOWebUserforIM = "4047068726";

    public static String var_TMOWebPwdMultiline = "Tmobile@2143";

    public static String var_PWSuspenedPAAccount = "Tmobile@2143";

    public static String var_UNSuspenedPAAccount = "4702636289";

    public static String var_PWTwoInstallments = "Tmobile@2134";

    public static String var_UNTwoInstallments = "2149371817";

    public static String var_PWInstallmentDate = "Tmobile@2143";

    public static String var_UNInstallmentDate = "4042031288";

    public static String var_TMOPAPassword = "Tmobile@2134";

    public static String var_TMOPAUsername = "2149371817";

    public static String var_TMOWebMissedPaymentPassword = "Tmobile@2143";

    public static String var_TMOWebMissedPaymentUserName = "9132725093";

    public static String var_TMOWebPAPassword = "Tmobile@2143";

    public static String var_TMOWebPAUsername = "9132725093";

    public static String var_PWDateCantExceedCurrentBillDueDate = "Tmobile@2143";

    public static String var_UNDateCantExceedCurrentBillDueDate = "4694031697";

    public static String var_MyTMOWebMultipleInstallmentPassword = "Tmobile@2134";

    public static String var_MyTMOWebMultipleInstallmentUserName = "2149371817";

    public static String var_TMOWebPwdforSplitPA = "Tmobile@2143";

    public static String var_TMOWebUserforSplitPA = "4042471003";

    public static String var_TMOWebAutopayPassword_Hermes = "Tmobile@2143";

    public static String var_TMOWebAutopayUsername_Hermes = "4255020556";

    public static String var_TMOWebPaymentPassword1_Hermes = "Test@DataPlatform9Team!";

    public static String var_TMOWebPaymentUsername1_Hermes = "9132020954";

    public static String var_TMOWebPAPassNoPaymentMethod_Hermes = "Tmobile@2143";

    public static String var_TMOWebPAUserNoPaymentMethod_Hermes = "9012409774";

    public static String var_PasswordPA_Hermes = "Tm0b1le@2143";

    public static String var_UsernamePA_Hermes = "3854577031";

    public static String var_TMOWebBankPassword = "Tmobile@2143";

    public static String var_TMOWebBankUserName = "4706853877";

    public static String var_TMOWebPassword4 = "Tmobile@2145";

    public static String var_TMOWebUserName4 = "4045993259";

    public static String var_PasswordBillChangeWithdrawalDate = "Tmobile@2145";

    public static String var_UserNameBillChangeWithdrawalDate = "4042030423";

    public static String var_PaymentMethods_BillingPreferences = "//span[text()=\'Payment methods\']/parent::a";

    public static String var_PasswordSavedPaymentMethod = "Tmobile@2143";

    public static String var_UserNameSavedPaymentMethod = "9134436226";

    public static String var_TMOWebE911Password = "Tmobile@2144";

    public static String var_TMOWebE911UserName = "4706624138";

    public static String var_TMoWebPassword_Onlyfor460 = "Tmobile@2145";

    public static String var_TMOWebUsernameRolePassword = "Tmobile@2146";

    public static String var_Username = "null";

    public static String var_TMOWebUserforSIMProtection = "4254695461";

    public static String var_TMOWebPasswordPaymentArrangement = "Tmobile@2142";

    public static String var_TMOWebPasswordToggleSwitch = "Tmobile@2145";

    public static String var_actualText = "null";

    public static String var_expectedText = "null";

    public static String var_TMOWebMultilinePassword1 = "Tmobile@2134";

    public static String var_TMOWebMultilineUser1 = "4043973475";

    public static String var_TMOWebProfilePassword = "Tmobile@2144";

    public static String var_TMOWebProfileUsername = "4708479631";

    public static String var_TMOWebPwdforMYWallet = "Tmobile@2143";

    public static String var_Password_1036 = "Tmobile@2143";

    public static String var_Username_1036 = "4255159761";

    public static String var_TMOWebUsernameRole = "4043973475";

    public static String var_Username_1035 = "4255159761";

    public static String var_TMOWebUsernameToggleSwitch = "4706624138";

    public static String var_TMOWebUserMultiline = "9297427969";

    public static String var_TMOWebUsername_PositiveData = "4046428727";

    public static String var_TMOWebPassword_PositiveData = "Tmobile@2134";

    public static String var_TMoWebUserName_Onlyfor460 = "4047176471";

    public static String var_TMOWebUserforMYWallet = "9132601726";

    public static String var_Amount_1 = "1.02";

    public static int var_Amount_100 = 100;

    public static String var_TMOWebUsernamePaymentArrangement = "4045784015";

    public static String var_TMOWebEIPPassword = "Tmobile@2146";

    public static String var_TMOWebEIPUsername = "9132424633";

    public static String var_TMOWebPwdforPA = "Tmobile@2133";

    public static String var_TMOWebUserforPA = "9132382926";

    public static String var_TMOWebNonAutoPayPassword = "Tmobile@2145";

    public static String var_TMOWebNonAutoPayUserName = "4045993259";

    public static String var_AccountNumber = "4353434455";

    public static String var_RoutingNumber = "125000105";

    public static String var_AccountName = "TestUser";

    public static String var_AutoPayText = "on";

    public static String var_TMOTotalBalancePassword = "Tmobile@2143";

    public static String var_TMOTotalBalanceUsername = "4047168561";

    public static int var_Amount = 10;

    public static String var_TMOWebUsername3 = "5014997134";

    public static String var_TMOWebPassword3 = "Tmob1le@2143";

    public static String var_TestReusableVariable = "null";

    public static String var_TMOWebPwdforSavings = "Tmobile@2143";

    public static String var_TMOWebUserforSavings = "4706623489";

    public static String var_TMOWebPwdforViewServices = "Tmobile@2143";

    public static String var_TMOWebUserforViewServices = "4709237688";

    public static String var_TMOWebAutopayPassword = "Tmobile@2144";

    public static String var_TMOWebAutopayUsername = "9132844201";

    public static String var_TMOMultiLinePassword = "Tmobile@2143";

    public static String var_TMOMultiLineUsername = "2819674851";

    public static String var_CC_Prod_Zipcode = "3fkdqo8zA8jWUTRp8jvN/A==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_CVV = "e32PkIF1vJKRdjlEfJt31g==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Exp = "vE70OZVYgwPXlm1szEm04Q==:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Number = "Vwb+o1AxvPj5Epm8kXeQU2WjcjlW2JkMb2NXuZ2tfPY=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_CC_Prod_Name = "W2bnNIX3yy9u4wBjFAGVTEl/me0QmkVBfzMnmGylutc=:MTIzNDU2Nzg5MTAxMTEyMQ==";

    public static String var_TMOWebPassword2 = "Tmobile@2142";

    public static String var_TMOWebUserName2 = "4709238132";

    public static String var_Password = "null";

    public static String var_TMOWebPassword1 = "Tm0b1le@2143";

    public static String var_TMOWebUserName1 = "4709237688";
}
