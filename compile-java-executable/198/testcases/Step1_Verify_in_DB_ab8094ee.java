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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@Listeners(TestListener.class)
public class Step1_Verify_in_DB_ab8094ee extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_in_db_ab8094ee() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			Connection VERINTQLABConn_18 = null;
			Statement VERINTQLABStmt_18 = null;
			ResultSet VERINTQLABRs_18 = null;
			try {
				VERINTQLABConn_18 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_18 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_18 = VERINTQLABConn_18.createStatement();
				if (VERINTQLABRs_18 != null) { try { VERINTQLABRs_18.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_18 = null; }
				VERINTQLABRs_18 = VERINTQLABStmt_18.executeQuery("Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCCH0021';");
				StringBuilder _dbOut_18_1 = new StringBuilder();
				boolean _dbHasRow_18_1 = false;
				if (VERINTQLABRs_18.next()) {
					_dbHasRow_18_1 = true;
					java.sql.ResultSetMetaData _dbMeta_18_1 = VERINTQLABRs_18.getMetaData();
					int _dbCols_18_1 = _dbMeta_18_1.getColumnCount();
					var_P_1 = VERINTQLABRs_18.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCCH0021';");
					}
					for (int _c = 1; _c <= _dbCols_18_1; _c++) {
						if (_c > 1) _dbOut_18_1.append(",");
						_dbOut_18_1.append(_dbMeta_18_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_18.getString(_c));
					}
					while (VERINTQLABRs_18.next()) {
						_dbOut_18_1.append(" | ");
						for (int _c = 1; _c <= _dbCols_18_1; _c++) {
							if (_c > 1) _dbOut_18_1.append(",");
							_dbOut_18_1.append(_dbMeta_18_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_18.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCCH0021';" + " = " + (_dbHasRow_18_1 ? _dbOut_18_1.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_18 != null) { try { VERINTQLABRs_18.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_18 = null; }
				VERINTQLABRs_18 = VERINTQLABStmt_18.executeQuery("select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCCH0021' and role = 'COACH' and title = 'ASSOCIATE COACH' and  organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname ='N/A' and startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';");
				StringBuilder _dbOut_18_2 = new StringBuilder();
				boolean _dbHasRow_18_2 = false;
				if (VERINTQLABRs_18.next()) {
					_dbHasRow_18_2 = true;
					java.sql.ResultSetMetaData _dbMeta_18_2 = VERINTQLABRs_18.getMetaData();
					int _dbCols_18_2 = _dbMeta_18_2.getColumnCount();
					var_P_1 = VERINTQLABRs_18.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCCH0021' and role = 'COACH' and title = 'ASSOCIATE COACH' and organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname ='N/A' and startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';");
					}
					for (int _c = 1; _c <= _dbCols_18_2; _c++) {
						if (_c > 1) _dbOut_18_2.append(",");
						_dbOut_18_2.append(_dbMeta_18_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_18.getString(_c));
					}
					while (VERINTQLABRs_18.next()) {
						_dbOut_18_2.append(" | ");
						for (int _c = 1; _c <= _dbCols_18_2; _c++) {
							if (_c > 1) _dbOut_18_2.append(",");
							_dbOut_18_2.append(_dbMeta_18_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_18.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCCH0021' and role = 'COACH' and title = 'ASSOCIATE COACH' and organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname ='N/A' and startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';" + " = " + (_dbHasRow_18_2 ? _dbOut_18_2.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_18 != null) try { VERINTQLABRs_18.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_18 != null) try { VERINTQLABStmt_18.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_18 != null) try { VERINTQLABConn_18.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
