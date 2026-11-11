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


class fnemptimecardfrompeopleinfo {

	public static void fnemptimecardfrompeopleinfo() {
			// [DISABLED] tg.testFunction("fnValidationScreenshot");
			// [DISABLED] tg.testFunction("fnValidationScreenshot");
			if (tg.performAssert("ele_UsernameH2_3a185d77", ComparisonType.IS_VISIBLE)) {
								tg.check.isVisible("ele_UsernameH2_3a185d77");
								if (tg.performAssert("ele_EmployeeRole_3a07b02d", ComparisonType.IS_VISIBLE)) {
														tg.wait(4);
														tg.check.isVisible("ele_EmployeeRole_3a07b02d");
														tg.check.isVisible("ele_EmployeeRole_3a07b02d");
															tg.wait(2);
															tg.click("ele_EmployeeRole_3a07b02d", 1);
															if (tg.performAssert("ele_EmployeeRoleTable_3a07b17c", ComparisonType.IS_VISIBLE)) {
																							tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																							tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																							// [DISABLED] tg.check.isVisible("ele_Search_3a02ccf7");
																							// [DISABLED] tg.check.isVisible("ele_UL_3a03b254");
																							// [DISABLED] tg.click("ele_Search_3a02ccf7", 1);
																								tg.check.isVisible("ele_QuickFindButton_3a072c99");
																								tg.type("ele_SearchByEmployeeNameOrID_3a072c99", var_Process_Employee_ID);
																								tg.click("ele_SearchBtn_3a072c99", 1);
																								tg.check.isVisible("ele_SearchResult_3a072c99");
																								tg.click("ele_SelectEmpID_3a072c99", 1);
																								tg.click("ele_Goto_3a072c99", 1);
																							tg.wait(3);
																							tg.click("ele_EmployeeRole_3a07b02d", 1);
															}
															// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
															// [DISABLED] while (tg.verify.isInvisible("ele_EmployeeRoleTable_3a07b17c")) {
																// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
															// [DISABLED] }
															// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
															tg.click("ele_EmployeeRole_3a07b02d", 1);
								}
								if (tg.performAssert("ele_AccessProfiles_3a08bc88", ComparisonType.IS_VISIBLE)) {
														tg.check.isVisible("ele_TimekeepingPlugin_3a076df4");
														tg.check.isVisible("ele_TimekeepingPlugin_3a076df4");
														// [DISABLED] tg.wait(1);
														// [DISABLED] tg.testFunction("fnValidationScreenshot");
														tg.check.isVisible("ele_AccessProfiles_3a08bc88");
														tg.click("ele_AccessProfiles_3a08bc88", 1);
														// [DISABLED] tg.wait(1);
														// [DISABLED] tg.testFunction("fnValidationScreenshot");
								}
								tg.click("ele_ClickGoTo_3a03b254", 1);
								tg.click("ele_ClickTimecard_3a03b254", 1);
			} else {
								// [DISABLED] var_menuName = "People Information";
								// [DISABLED] tg.testFunction("fnSelectMenuOption");
								// [DISABLED] tg.wait(3);
								// [DISABLED] tg.check.isVisible("ele_Search_3a02ccf7");
								// [DISABLED] tg.check.isVisible("ele_UL_3a03b254");
								// [DISABLED] tg.click("ele_Search_3a02ccf7", 1);
								tg.testFunction("fnSearchEmployeeIdWithLense");
								if (tg.performAssert("ele_EmploymentStatus_3a07febe", ComparisonType.IS_VISIBLE)) {
														tg.check.isVisible("ele_EmploymentStatus_3a07febe");
														tg.check.isVisible("ele_EmploymentStatus_3a07febe");
														tg.testFunction("fnValidationScreenshot");
														if (tg.performAssert("ele_EmployeeRole_3a07b02d", ComparisonType.IS_VISIBLE)) {
																					tg.wait(4);
																					tg.check.isVisible("ele_EmployeeRole_3a07b02d");
																					tg.check.isVisible("ele_EmployeeRole_3a07b02d");
																						tg.wait(2);
																						tg.check.isVisible("ele_EmployeeRole_3a07b02d");
																						tg.click("ele_EmployeeRole_3a07b02d", 1);
																						if (tg.performAssert("ele_EmployeeRoleTable_3a07b17c", ComparisonType.IS_VISIBLE)) {
																															tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															// [DISABLED] tg.check.isVisible("ele_Search_3a02ccf7");
																															// [DISABLED] tg.check.isVisible("ele_UL_3a03b254");
																															// [DISABLED] tg.click("ele_Search_3a02ccf7", 1);
																																tg.check.isVisible("ele_QuickFindButton_3a072c99");
																																tg.type("ele_SearchByEmployeeNameOrID_3a072c99", var_Process_Employee_ID);
																																tg.click("ele_SearchBtn_3a072c99", 1);
																																tg.check.isVisible("ele_SearchResult_3a072c99");
																																tg.click("ele_SelectEmpID_3a072c99", 1);
																																tg.click("ele_Goto_3a072c99", 1);
																															tg.wait(3);
																															tg.click("ele_EmployeeRole_3a07b02d", 1);
																						}
																						tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																						while (tg.verify.isInvisible("ele_EmployeeRoleTable_3a07b17c")) {
																							tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																						}
																						tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																						if (tg.performAssert("ele_SearchBox_3a076345", ComparisonType.IS_VISIBLE)) {
																															tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															tg.wait(11012);
																															tg.click("ele_SearchBtn_3a076345", 1);
																															tg.check.isVisible("ele_SearchBox_3a076345");
																															tg.check.isVisible("ele_SearchTable_3a076345");
																															tg.click("ele_OKTimecardView_3a07b047", 1);
																															tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																															tg.check.isVisible("ele_Save_3a0701cb");
																						}
														}
														tg.click("ele_ClickGoTo_3a03b254", 1);
														tg.click("ele_ClickTimecard_3a03b254", 1);
								} else {
														// [DISABLED] if (true) {
															// [DISABLED] tg.check.isVisible("ele_EmployeeRole_3a07b02d");
															// [DISABLED] tg.check.isVisible("ele_EmployeeRole_3a07b02d");
																// [DISABLED] tg.wait(2);
																// [DISABLED] tg.check.isVisible("ele_EmployeeRole_3a07b02d");
																// [DISABLED] tg.click("ele_EmployeeRole_3a07b02d", 1);
																// [DISABLED] if (true) {
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.check.isVisible("ele_Search_3a02ccf7");
																	// [DISABLED] tg.check.isVisible("ele_UL_3a03b254");
																	// [DISABLED] tg.click("ele_Search_3a02ccf7", 1);
																	// [DISABLED] tg.wait(3);
																	// [DISABLED] tg.click("ele_EmployeeRole_3a07b02d", 1);
																// [DISABLED] }
																// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																// [DISABLED] while (tg.verify.isInvisible("ele_EmployeeRoleTable_3a07b17c")) {
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																// [DISABLED] }
																// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																// [DISABLED] if (true) {
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.wait(11012);
																	// [DISABLED] tg.click("ele_SearchBtn_3a076345", 1);
																	// [DISABLED] tg.check.isVisible("ele_SearchBox_3a076345");
																	// [DISABLED] tg.check.isVisible("ele_SearchTable_3a076345");
																	// [DISABLED] tg.click("ele_OKTimecardView_3a07b047", 1);
																	// [DISABLED] tg.check.isVisible("ele_EmployeeRoleTable_3a07b17c");
																	// [DISABLED] tg.check.isVisible("ele_Save_3a0701cb");
																// [DISABLED] }
														// [DISABLED] }
														if (tg.performAssert("ele_AccessProfiles_3a08bc88", ComparisonType.IS_VISIBLE)) {
																					tg.check.isVisible("ele_TimekeepingPlugin_3a076df4");
																					tg.check.isVisible("ele_TimekeepingPlugin_3a076df4");
																					// [DISABLED] tg.wait(1);
																					tg.testFunction("fnValidationScreenshot");
																					tg.check.isVisible("ele_AccessProfiles_3a08bc88");
																					tg.click("ele_AccessProfiles_3a08bc88", 1);
																					// [DISABLED] tg.wait(1);
																					tg.testFunction("fnValidationScreenshot");
														}
														tg.click("ele_ClickGoTo_3a03b254", 1);
														tg.click("ele_ClickTimecard_3a03b254", 1);
								}
			}
	}
}
