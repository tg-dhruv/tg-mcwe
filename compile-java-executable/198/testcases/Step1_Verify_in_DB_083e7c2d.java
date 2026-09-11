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
public class Step1_Verify_in_DB_083e7c2d extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_in_db_083e7c2d() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			Connection VERINTQLABConn_28 = null;
			Statement VERINTQLABStmt_28 = null;
			ResultSet VERINTQLABRs_28 = null;
			try {
				VERINTQLABConn_28 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_28 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_28 = VERINTQLABConn_28.createStatement();
				if (VERINTQLABRs_28 != null) { try { VERINTQLABRs_28.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_28 = null; }
				VERINTQLABRs_28 = VERINTQLABStmt_28.executeQuery("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' ;");
				StringBuilder _dbOut_28_1 = new StringBuilder();
				boolean _dbHasRow_28_1 = false;
				if (VERINTQLABRs_28.next()) {
					_dbHasRow_28_1 = true;
					java.sql.ResultSetMetaData _dbMeta_28_1 = VERINTQLABRs_28.getMetaData();
					int _dbCols_28_1 = _dbMeta_28_1.getColumnCount();
					var_P_1 = VERINTQLABRs_28.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' ;");
					}
					for (int _c = 1; _c <= _dbCols_28_1; _c++) {
						if (_c > 1) _dbOut_28_1.append(",");
						_dbOut_28_1.append(_dbMeta_28_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_28.getString(_c));
					}
					while (VERINTQLABRs_28.next()) {
						_dbOut_28_1.append(" | ");
						for (int _c = 1; _c <= _dbCols_28_1; _c++) {
							if (_c > 1) _dbOut_28_1.append(",");
							_dbOut_28_1.append(_dbMeta_28_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_28.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' ;" + " = " + (_dbHasRow_28_1 ? _dbOut_28_1.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_28 != null) { try { VERINTQLABRs_28.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_28 = null; }
				VERINTQLABRs_28 = VERINTQLABStmt_28.executeQuery("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' and role ='REP' and title = 'RP A'  and    lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and   directtosite = false and outofhierarchy = 'false' and   startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10  and valid_record ='Y';");
				StringBuilder _dbOut_28_2 = new StringBuilder();
				boolean _dbHasRow_28_2 = false;
				if (VERINTQLABRs_28.next()) {
					_dbHasRow_28_2 = true;
					java.sql.ResultSetMetaData _dbMeta_28_2 = VERINTQLABRs_28.getMetaData();
					int _dbCols_28_2 = _dbMeta_28_2.getColumnCount();
					var_P_1 = VERINTQLABRs_28.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' and role ='REP' and title = 'RP A' and lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and directtosite = false and outofhierarchy = 'false' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10 and valid_record ='Y';");
					}
					for (int _c = 1; _c <= _dbCols_28_2; _c++) {
						if (_c > 1) _dbOut_28_2.append(",");
						_dbOut_28_2.append(_dbMeta_28_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_28.getString(_c));
					}
					while (VERINTQLABRs_28.next()) {
						_dbOut_28_2.append(" | ");
						for (int _c = 1; _c <= _dbCols_28_2; _c++) {
							if (_c > 1) _dbOut_28_2.append(",");
							_dbOut_28_2.append(_dbMeta_28_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_28.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1REP0025' and role ='REP' and title = 'RP A' and lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and directtosite = false and outofhierarchy = 'false' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10 and valid_record ='Y';" + " = " + (_dbHasRow_28_2 ? _dbOut_28_2.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_28 != null) try { VERINTQLABRs_28.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_28 != null) try { VERINTQLABStmt_28.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_28 != null) try { VERINTQLABConn_28.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
