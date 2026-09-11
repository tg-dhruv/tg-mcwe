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
public class Step1_Verify_in_DB extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_in_db() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			Connection VERINTQLABConn_16 = null;
			Statement VERINTQLABStmt_16 = null;
			ResultSet VERINTQLABRs_16 = null;
			try {
				VERINTQLABConn_16 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_16 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_16 = VERINTQLABConn_16.createStatement();
				if (VERINTQLABRs_16 != null) { try { VERINTQLABRs_16.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_16 = null; }
				VERINTQLABRs_16 = VERINTQLABStmt_16.executeQuery("Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCMR0020';");
				StringBuilder _dbOut_16_1 = new StringBuilder();
				boolean _dbHasRow_16_1 = false;
				if (VERINTQLABRs_16.next()) {
					_dbHasRow_16_1 = true;
					java.sql.ResultSetMetaData _dbMeta_16_1 = VERINTQLABRs_16.getMetaData();
					int _dbCols_16_1 = _dbMeta_16_1.getColumnCount();
					var_P_1 = VERINTQLABRs_16.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCMR0020';");
					}
					for (int _c = 1; _c <= _dbCols_16_1; _c++) {
						if (_c > 1) _dbOut_16_1.append(",");
						_dbOut_16_1.append(_dbMeta_16_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_16.getString(_c));
					}
					while (VERINTQLABRs_16.next()) {
						_dbOut_16_1.append(" | ");
						for (int _c = 1; _c <= _dbCols_16_1; _c++) {
							if (_c > 1) _dbOut_16_1.append(",");
							_dbOut_16_1.append(_dbMeta_16_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_16.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ICH.ICHEMPLOYEEORGROLE where employeeid ='PRHCMR0020';" + " = " + (_dbHasRow_16_1 ? _dbOut_16_1.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_16 != null) { try { VERINTQLABRs_16.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_16 = null; }
				VERINTQLABRs_16 = VERINTQLABStmt_16.executeQuery("select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCMR0020' and role = 'MANAGER' and title = 'CRE MANAGER' and   organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname = 'Colorado Springs_1' and  startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';");
				StringBuilder _dbOut_16_2 = new StringBuilder();
				boolean _dbHasRow_16_2 = false;
				if (VERINTQLABRs_16.next()) {
					_dbHasRow_16_2 = true;
					java.sql.ResultSetMetaData _dbMeta_16_2 = VERINTQLABRs_16.getMetaData();
					int _dbCols_16_2 = _dbMeta_16_2.getColumnCount();
					var_P_1 = VERINTQLABRs_16.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCMR0020' and role = 'MANAGER' and title = 'CRE MANAGER' and organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname = 'Colorado Springs_1' and startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';");
					}
					for (int _c = 1; _c <= _dbCols_16_2; _c++) {
						if (_c > 1) _dbOut_16_2.append(",");
						_dbOut_16_2.append(_dbMeta_16_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_16.getString(_c));
					}
					while (VERINTQLABRs_16.next()) {
						_dbOut_16_2.append(" | ");
						for (int _c = 1; _c <= _dbCols_16_2; _c++) {
							if (_c > 1) _dbOut_16_2.append(",");
							_dbOut_16_2.append(_dbMeta_16_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_16.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.ichemployeeorgrole i where employeeid = 'PRHCMR0020' and role = 'MANAGER' and title = 'CRE MANAGER' and organization = 'Consumer Group' and lineofbusiness = 'Closed Loop' and department = 'Closed Loop' and teamname = 'Colorado Springs_1' and startdate = NOW()::date -10 and enddate = '2099-12-31' and valid_record = 'Y';" + " = " + (_dbHasRow_16_2 ? _dbOut_16_2.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_16 != null) try { VERINTQLABRs_16.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_16 != null) try { VERINTQLABStmt_16.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_16 != null) try { VERINTQLABConn_16.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
