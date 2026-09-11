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
public class Step1_Verify_in_DB_cdecea1e extends tc_Step1_1480d125 {

	@Test
	public void step1_verify_in_db_cdecea1e() {
		tg.openBrowser();
		tg.testFunction("login_tg_global_functions");
		// Tosca DB: VERINT QLAB | SELECT | Driver=unknown
		START_CUSTOM_SCRIPT;
			System.setProperty("http.proxyHost", var_Tunnel_Ip);
			System.setProperty("http.proxyPort", var_Tunnel_Port);
			var_P_1 = "";
			Connection VERINTQLABConn_26 = null;
			Statement VERINTQLABStmt_26 = null;
			ResultSet VERINTQLABRs_26 = null;
			try {
				VERINTQLABConn_26 = DriverManager.getConnection(var_Verint_Qlab_Jdbc_Url, var_Verint_Qlab_User, var_Verint_Qlab_Password);
				System.out.println("Connected to database: VERINT QLAB");
				System.out.println("----");
		
				if (VERINTQLABConn_26 == null) {
					throw new SQLException("Database connection failed — configure var_Verint_Qlab_Jdbc_Url in TestGrid globals");
				}
				VERINTQLABStmt_26 = VERINTQLABConn_26.createStatement();
				if (VERINTQLABRs_26 != null) { try { VERINTQLABRs_26.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_26 = null; }
				VERINTQLABRs_26 = VERINTQLABStmt_26.executeQuery("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' ;");
				StringBuilder _dbOut_26_1 = new StringBuilder();
				boolean _dbHasRow_26_1 = false;
				if (VERINTQLABRs_26.next()) {
					_dbHasRow_26_1 = true;
					java.sql.ResultSetMetaData _dbMeta_26_1 = VERINTQLABRs_26.getMetaData();
					int _dbCols_26_1 = _dbMeta_26_1.getColumnCount();
					var_P_1 = VERINTQLABRs_26.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' ;");
					}
					for (int _c = 1; _c <= _dbCols_26_1; _c++) {
						if (_c > 1) _dbOut_26_1.append(",");
						_dbOut_26_1.append(_dbMeta_26_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_26.getString(_c));
					}
					while (VERINTQLABRs_26.next()) {
						_dbOut_26_1.append(" | ");
						for (int _c = 1; _c <= _dbCols_26_1; _c++) {
							if (_c > 1) _dbOut_26_1.append(",");
							_dbOut_26_1.append(_dbMeta_26_1.getColumnLabel(_c)).append("=").append(VERINTQLABRs_26.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' ;" + " = " + (_dbHasRow_26_1 ? _dbOut_26_1.toString() : "(no rows)"));
				System.out.println("----");
		
				if (VERINTQLABRs_26 != null) { try { VERINTQLABRs_26.close(); } catch (SQLException e) { /* ignore */ } VERINTQLABRs_26 = null; }
				VERINTQLABRs_26 = VERINTQLABStmt_26.executeQuery("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' and role = 'MANAGER' and title = 'CRE MANAGER' and   teamname = 'Colorado Springs_1' and lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and   directtosite = false and outofhierarchy = 'false' and director = 'PSUKDirector01' and srmanager = 'PSUKSrManager01'  and   startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10  and valid_record ='Y';");
				StringBuilder _dbOut_26_2 = new StringBuilder();
				boolean _dbHasRow_26_2 = false;
				if (VERINTQLABRs_26.next()) {
					_dbHasRow_26_2 = true;
					java.sql.ResultSetMetaData _dbMeta_26_2 = VERINTQLABRs_26.getMetaData();
					int _dbCols_26_2 = _dbMeta_26_2.getColumnCount();
					var_P_1 = VERINTQLABRs_26.getString(1);
					if (!var_P_1.equals("1")) {
						throw new SQLException("Expected DB cell value 1, got " + var_P_1 + " in query " + "Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' and role = 'MANAGER' and title = 'CRE MANAGER' and teamname = 'Colorado Springs_1' and lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and directtosite = false and outofhierarchy = 'false' and director = 'PSUKDirector01' and srmanager = 'PSUKSrManager01' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10 and valid_record ='Y';");
					}
					for (int _c = 1; _c <= _dbCols_26_2; _c++) {
						if (_c > 1) _dbOut_26_2.append(",");
						_dbOut_26_2.append(_dbMeta_26_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_26.getString(_c));
					}
					while (VERINTQLABRs_26.next()) {
						_dbOut_26_2.append(" | ");
						for (int _c = 1; _c <= _dbCols_26_2; _c++) {
							if (_c > 1) _dbOut_26_2.append(",");
							_dbOut_26_2.append(_dbMeta_26_2.getColumnLabel(_c)).append("=").append(VERINTQLABRs_26.getString(_c));
						}
					}
				}
				System.out.println("Select count(*) from ich.ichemployeeorgrole where employeeid ='POHS1Manager0024' and role = 'MANAGER' and title = 'CRE MANAGER' and teamname = 'Colorado Springs_1' and lineofbusiness = 'Closed Loop' and organization ='Consumer Group' and department ='Closed Loop Outbound' and directtosite = false and outofhierarchy = 'false' and director = 'PSUKDirector01' and srmanager = 'PSUKSrManager01' and startdate = NOW()::date -10 and enddate = '2099-12-31' and effectivedate = NOW()::date - 10 and valid_record ='Y';" + " = " + (_dbHasRow_26_2 ? _dbOut_26_2.toString() : "(no rows)"));
				System.out.println("----");
		
			} catch (SQLException e) {
				System.out.println("Database operation failed: " + e.getMessage());
				System.out.println("----");
		
				e.printStackTrace(new java.io.PrintWriter(System.out, true));
				throw new RuntimeException(e);
			} finally {
				if (VERINTQLABRs_26 != null) try { VERINTQLABRs_26.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABStmt_26 != null) try { VERINTQLABStmt_26.close(); } catch (SQLException e) { /* ignore */ }
				if (VERINTQLABConn_26 != null) try { VERINTQLABConn_26.close(); } catch (SQLException e) { /* ignore */ }
			}
		END_CUSTOM_SCRIPT;
	}
}
