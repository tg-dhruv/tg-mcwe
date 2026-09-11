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
public class Step1_Verify_in_DB_7756d985 extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_in_db_7756d985() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			Connection VERINTQLABConn_20 = null;
			Statement VERINTQLABStmt_20 = null;
			ResultSet VERINTQLABRs_20 = null;
			try {
				VERINTQLABConn_20 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_20 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_20 = VERINTQLABConn_20.createStatement();
				if (VERINTQLABRs_20 != null) { try { VERINTQLABRs_20.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_20 = null; }
				VERINTQLABRs_20 = VERINTQLABStmt_20.executeQuery("select count(*) from ich.ichemployeestatus where employeeid='PHRIDTMANAGER0042';");
				StringBuilder _dbOut_20_1 = new StringBuilder();
				boolean _dbHasRow_20_1 = false;
				if (VERINTQLABRs_20.next()) {
					_dbHasRow_20_1 = true;
					java.sql.ResultSetMetaData _dbMeta_20_1 = VERINTQLABRs_20.getMetaData();
					int _dbCols_20_1 = _dbMeta_20_1.getColumnCount();
					var_P_1 = VERINTQLABRs_20.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "select count(*) from ich.ichemployeestatus where employeeid='PHRIDTMANAGER0042';");
					}
					for (int _c = 1; _c <= _dbCols_20_1; _c++) {
						if (_c > 1) _dbOut_20_1.append(",");
						_dbOut_20_1.append(_dbMeta_20_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
					}
					while (VERINTQLABRs_20.next()) {
						_dbOut_20_1.append(" | ");
						for (int _c = 1; _c <= _dbCols_20_1; _c++) {
							if (_c > 1) _dbOut_20_1.append(",");
							_dbOut_20_1.append(_dbMeta_20_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
						}
					}
				}
				System.out.println("select count(*) from ich.ichemployeestatus where employeeid='PHRIDTMANAGER0042';" + " = " + (_dbHasRow_20_1 ? _dbOut_20_1.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_20 != null) { try { VERINTQLABRs_20.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_20 = null; }
				VERINTQLABRs_20 = VERINTQLABStmt_20.executeQuery("Select count(*) from ich.ichemployeestatus where employeeid ='PHRIDTMANAGER0042' and Status ='Active' and   startdate = NOW()::date -10 and enddate = '2099-12-31' and loa_startdate is null and term_startdate is null and valid_record ='Y';");
				StringBuilder _dbOut_20_2 = new StringBuilder();
				boolean _dbHasRow_20_2 = false;
				if (VERINTQLABRs_20.next()) {
					_dbHasRow_20_2 = true;
					java.sql.ResultSetMetaData _dbMeta_20_2 = VERINTQLABRs_20.getMetaData();
					int _dbCols_20_2 = _dbMeta_20_2.getColumnCount();
					var_P_1 = VERINTQLABRs_20.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployeestatus where employeeid ='PHRIDTMANAGER0042' and Status ='Active' and startdate = NOW()::date -10 and enddate = '2099-12-31' and loa_startdate is null and term_startdate is null and valid_record ='Y';");
					}
					for (int _c = 1; _c <= _dbCols_20_2; _c++) {
						if (_c > 1) _dbOut_20_2.append(",");
						_dbOut_20_2.append(_dbMeta_20_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
					}
					while (VERINTQLABRs_20.next()) {
						_dbOut_20_2.append(" | ");
						for (int _c = 1; _c <= _dbCols_20_2; _c++) {
							if (_c > 1) _dbOut_20_2.append(",");
							_dbOut_20_2.append(_dbMeta_20_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployeestatus where employeeid ='PHRIDTMANAGER0042' and Status ='Active' and startdate = NOW()::date -10 and enddate = '2099-12-31' and loa_startdate is null and term_startdate is null and valid_record ='Y';" + " = " + (_dbHasRow_20_2 ? _dbOut_20_2.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_20 != null) { try { VERINTQLABRs_20.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_20 = null; }
				VERINTQLABRs_20 = VERINTQLABStmt_20.executeQuery("Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042';");
				StringBuilder _dbOut_20_3 = new StringBuilder();
				boolean _dbHasRow_20_3 = false;
				if (VERINTQLABRs_20.next()) {
					_dbHasRow_20_3 = true;
					java.sql.ResultSetMetaData _dbMeta_20_3 = VERINTQLABRs_20.getMetaData();
					int _dbCols_20_3 = _dbMeta_20_3.getColumnCount();
					var_P_1 = VERINTQLABRs_20.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042';");
					}
					for (int _c = 1; _c <= _dbCols_20_3; _c++) {
						if (_c > 1) _dbOut_20_3.append(",");
						_dbOut_20_3.append(_dbMeta_20_3.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
					}
					while (VERINTQLABRs_20.next()) {
						_dbOut_20_3.append(" | ");
						for (int _c = 1; _c <= _dbCols_20_3; _c++) {
							if (_c > 1) _dbOut_20_3.append(",");
							_dbOut_20_3.append(_dbMeta_20_3.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042';" + " = " + (_dbHasRow_20_3 ? _dbOut_20_3.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_20 != null) { try { VERINTQLABRs_20.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_20 = null; }
				VERINTQLABRs_20 = VERINTQLABStmt_20.executeQuery("Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date -10 and valid_record ='Y';");
				StringBuilder _dbOut_20_4 = new StringBuilder();
				boolean _dbHasRow_20_4 = false;
				if (VERINTQLABRs_20.next()) {
					_dbHasRow_20_4 = true;
					java.sql.ResultSetMetaData _dbMeta_20_4 = VERINTQLABRs_20.getMetaData();
					int _dbCols_20_4 = _dbMeta_20_4.getColumnCount();
					var_P_1 = VERINTQLABRs_20.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date -10 and valid_record ='Y';");
					}
					for (int _c = 1; _c <= _dbCols_20_4; _c++) {
						if (_c > 1) _dbOut_20_4.append(",");
						_dbOut_20_4.append(_dbMeta_20_4.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
					}
					while (VERINTQLABRs_20.next()) {
						_dbOut_20_4.append(" | ");
						for (int _c = 1; _c <= _dbCols_20_4; _c++) {
							if (_c > 1) _dbOut_20_4.append(",");
							_dbOut_20_4.append(_dbMeta_20_4.getColumnLabel(_c)).append("=").append(VERINTQLABRs_20.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployee where employeeid ='PHRIDTMANAGER0042' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date -10 and valid_record ='Y';" + " = " + (_dbHasRow_20_4 ? _dbOut_20_4.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_20 != null) try { VERINTQLABRs_20.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_20 != null) try { VERINTQLABStmt_20.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_20 != null) try { VERINTQLABConn_20.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
